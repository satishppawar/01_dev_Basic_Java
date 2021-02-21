# Java 7 Features

* New features are little simplifications

## 1)Type Inference for Generic Instance Creation (Diamond Operator)

* the diamond operator is used in collections and other data types that can contain other objects to indicate the data types of those objects. In previous versions of Java, you had to declare the data type of the contained objects twice, once in the declaration of the collection

* for example, in this array list, and once in the call to the constructor method. But that was redundant.

    > Before Java 7 

	```
	 ArrayList<String>  list = new  ArrayList<String> ();
	```


* You shouldn't have to do it twice, and in Java 7, you only have to declare the data type of the contained class once. So the new syntax is shown below.
  
   > In Java 7 

	```
	 ArrayList<String>  list = new  ArrayList<> ();
	```

## 2) The try-with-resources Statement

* Prior to Java-7, if you were using an object such as a file stream, you would first declare the object, then you would instantiate and use it within a Try clause, you'd catch an exception, and then you might close it within Finally clause. 


> Before Java 7 

```
private void readFile() {
		FileStream stream; //declare the object
		
		try {
			stream=new FileStream(...);//instantiate
			//Do something
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			stream.close();
		}
}

```
* And the only reasons you have declared it above the Try/catch was so it would be visible within all of those code blocks. In Java 7, there's a new syntax called TryWithResources. You move the declaration and instantiation of the object inside a pair of parentheses right after the Try keyword. 

> In Java 7 

```
private void readFile() {
		//declare the object and instantiate
		try(FileStream stream=new FileStream(...)) {


			//Do something

		} catch (Exception e) {

			// TODO: handle exception
			
		}finally {

			stream.close();

		}
}
```


* And before the Try keywords code block, then you do whatever you need to do and catch any exceptions. And when the entire Try/catch Block is complete, any objects that you declared inside those parentheses will be automatically closed for you. 


## 3) Underscores in Numeric Literals

* Numeric literals can now include underscores to make them easier to read. 

> Before Java 7 
 
``` 
int largeValue=1000000000;
```

> In Java 7 
```
int largeValue=1_000_000_000;
```

## Other features

- Binary Literals
- Strings in switch Statements
- Catching Multiple Exception Types and Rethrowing Exceptions with Improved Type Checking
- Improved Compiler Warnings and Errors When Using Non-Reifiable Formal Parameters with Varargs Methods

# References

1. [jdk7-relnotes](https://www.oracle.com/java/technologies/javase/jdk7-relnotes.html)
