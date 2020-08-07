import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;

/*
 * Reference link --> https://stackoverflow.com/questions/36508323/how-can-i-prevent-gson-from-converting-integers-to-doubles/53781460
 */
public class MapDeserializerDoubleAsIntFix implements JsonDeserializer<Map<String, Object>> {

    @SuppressWarnings("unchecked")
    public Map<String, Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	    throws JsonParseException {
	return (Map<String, Object>) read(json);
    }

    public Object read(JsonElement in) {

	if (in.isJsonArray()) {
	    List<Object> list = new ArrayList<Object>();
	    JsonArray arr = in.getAsJsonArray();
	    for (JsonElement anArr : arr) {
		list.add(read(anArr));
	    }
	    return list;
	} else if (in.isJsonObject()) {
	    Map<String, Object> map = new LinkedTreeMap<String, Object>();
	    JsonObject obj = in.getAsJsonObject();
	    Set<Map.Entry<String, JsonElement>> entitySet = obj.entrySet();
	    for (Map.Entry<String, JsonElement> entry : entitySet) {
		map.put(entry.getKey(), read(entry.getValue()));
	    }
	    return map;
	} else if (in.isJsonPrimitive()) {
	    JsonPrimitive prim = in.getAsJsonPrimitive();
	    if (prim.isBoolean()) {
		return prim.getAsBoolean();
	    } else if (prim.isString()) {
		return prim.getAsString();
	    } else if (prim.isNumber()) {

		Number num = prim.getAsNumber();
		// here you can handle double int/long values
		// and return any type you want
		// this solution will transform 3.0 float to long values
		if (Math.ceil(num.doubleValue()) == num.longValue())
		    return num.longValue();
		else {
		    return num;
		}
	    }
	}
	return null;
    }

    public static Gson createGsonForNumber() {
	GsonBuilder gsonBuilder = new GsonBuilder();

	gsonBuilder.registerTypeAdapter(new TypeToken<Map<String, Object>>() {
	}.getType(), new MapDeserializerDoubleAsIntFix());

	return gsonBuilder.create();

    }

    public static void main(String[] args) {
	String json = "[{\"id\":1,\"quantity\":2,\"name\":\"apple\"}, {\"id\":3,\"quantity\":4,\"name\":\"orange\"}]";
	List<Map<String, Object>> l = createGsonForNumber().fromJson(json, new TypeToken<List<Map<String, Object>>>() {
	}.getType());

	for (Map<String, Object> item : l)
	    System.out.println(item);

	String serialized = createGsonForNumber().toJson(l);
	System.out.println(serialized);
    }

}
