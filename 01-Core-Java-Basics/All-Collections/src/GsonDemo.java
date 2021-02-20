import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

public class GsonDemo {
	public static void main(String[] args) {
		String str = new String();// "null";

		Gson gson = new Gson();
		String jsonStr = gson.toJson(str);
		System.out.println("jsonStr is " + jsonStr);

		System.out.println("String is" + gson.fromJson(jsonStr, String.class));

		if (StringUtils.isNotBlank(gson.fromJson(jsonStr, String.class))) {
			System.out.println("String is not blank " + gson.fromJson(jsonStr, String.class));
		}

	}
}
