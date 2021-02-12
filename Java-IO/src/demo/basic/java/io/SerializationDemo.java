package demo.basic.java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import demo.basic.java.io.model.Emp;

/**
 * Serialization: Serialization is the mechanism of saving the state of the
 * object permanently in the form of a file. </br>
 * 
 * Steps for developing SERIALIZABLE SUB CLASS: A Serializable sub class is one
 * which implements a predefined interface called java.io.Serializable
 * 
 * </br>
 * 1. Choose the appropriate package to keep Serializable sub class.
 * </br>
 * 2. Choose the user defined class whose object participates in Serializable process.
 * </br>
 * 3. Every user defined class must implements a predefined interface called Serializable.
 * </br>
 * 4. Choose the set of data members for Serializable sub class.
 * </br>
 * 5. Develop the set of set methods for each and every data members of the class.
 * </br>
 * 6. Develop the set of get methods for each and every data members of the class.
 * 
 * @author spawar
 *
 */

public class SerializationDemo {
	public static void main(String[] args) throws Exception {

		System.out.println("Demo of serialization");
		Emp eo = new Emp();
		eo.setEmpno(100);
		eo.setEname("Satish");
		eo.setSal(10000.00f);
		FileOutputStream fos = new FileOutputStream("employee");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eo);
		System.out.println("EMPLOYEE OBJECT SAVED SUCCESSFULLY...");
		oos.close();
		fos.close();
	}
}
