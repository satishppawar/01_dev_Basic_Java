
public class NumberConversion {
    public static void main(String[] args) {
	Object object=null;
	object=getValue(1.23f);
	System.out.println("Type is "+object.getClass()+" with value "+object);
	System.out.println("-----------------");
	object=getValue(1.99);
	System.out.println("Type is "+object.getClass()+" with value "+object);
	System.out.println("-----------------");
	
	object=getValue(1.10);
	System.out.println("Type is "+object.getClass()+" with value "+object);
	System.out.println("-----------------");
	
	object=getValue(9.0000);
	System.out.println("Type is "+object.getClass()+" with value "+object);
	System.out.println("-----------------");
    }
    static Number getValue(Number prim) {
	Number num = prim;
	    // here you can handle double int/long values
	    // and return any type you want
	    // this solution will transform 3.0 float to long values
	
	    if(Math.ceil(num.doubleValue())  == num.longValue()) {
		System.out.println("Inside if");
		System.out.println(num.doubleValue());
		System.out.println( num.longValue());
		return num.longValue();
	    }
	    else{
	        return num;
	    }

    }
    
}
