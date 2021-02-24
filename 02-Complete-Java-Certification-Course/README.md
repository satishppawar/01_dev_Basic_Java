## What is a computer program?


A computer program is simply a list of instructions that tell a computer what to do. 

You can't tell it what to do in English or some other spoken language. You need to use a programming language to provide the instructions. 

Computers are capable of understanding programming languages and one of the most popular programming languages in the world is known as Java. 


## Java Tokens:-

Smallest individual part of a java program is called Token. It is possible to provide any number of spaces in between two tokens.

Example:-

```java
class Test {

	public 
	static       void main(String[] args) {
		int a = 10;
		System.out.println("java tokens");
	}
}

```

> Tokens are---------> class,test,{,”,* …………….etc

## Java Identifiers:-

any name in the java program like variable name, classname, methodname, interface name is
called identifier.

```
class Test // Test------>identifier

{ 
	void add() //add------->identifier
		{ 	int a=10; //a---------->identifiers
			int b=20; //b---------->identifiers
		}
};

```

### Rules to declare identifiers:-

1. the java identifiers should not start with numbers, it may start with alphabet symbol and underscore symbol and dollar symbol.

	a. Int abc=10;----->valid

	b. Int 2abc=20;---->not valid

	c. Int _abc=30;---->valid

	d. Int $abc=40;---->valid

	e. Int @abc=50;--->not valid

2. The identifier will not contains symbols like + , - , . , @ , # , *………………….

3. The identifier should not duplicated.

```java

class Test {
	void add(){ 
			int a=10;
			int a=20; \\the identifier should not be duplicated.
	}
}

```

4. In the java applications it is possible to declare all the predefined class names and predefined interfaces names as a identifier. But it is not recommended to use.

```java
class Test {
	public static void main(String[] args) {
		int String = 10; // predefind String class
		int Serializable = 20; // predified Seriaiable Interface
		float Exception = 10.2f; // predefined Exception class
		System.out.println(String);
		System.out.println(Serializable);
		System.out.println(Exception);
	}
}
```
