## Array

- An array is a container object that holds a `fixed number` of values of a `single type`. 

- The length of an array is established when the array is created. After creation, its length is fixed.
 

- Each item in an array is called an element, and each element is accessed by its numerical index and numbering begins with 0


- Consider below code

```  
// declares an array of integers
int[] anArray;

 // allocates memory for 10 integers
 anArray = new int[10];
           
// initialize first element
anArray[0] = 100;

System.out.println("Element at index 0: "+ anArray[0]);

```
----

### Declaring a Variable to Refer to an Array

- The preceding program declares an array (named anArray) with the following line of code:

```
// declares an array of integers
int[] anArray;
```

- Like declarations for variables of other types, an array declaration has `two` components: the `array's type` and the `array's name`. 


- An `array's type` is written as `type[]`, where type is the data type of the contained elements; the brackets are special symbols indicating that this variable holds an array. 



- An `array's name` can be anything you want, provided that it follows the rules and conventions 


- As with variables of other types, the declaration does not actually create an array; it simply tells the compiler that this variable will hold an array of the specified type.
Similarly, you can declare arrays of other types:

```
	byte[] anArrayOfBytes;
	short[] anArrayOfShorts;
	long[] anArrayOfLongs;
	float[] anArrayOfFloats;
	double[] anArrayOfDoubles;
	boolean[] anArrayOfBooleans;
	char[] anArrayOfChars;
	String[] anArrayOfStrings;
```

- You can also place the brackets after the array's name:

```
// this form is discouraged
float anArrayOfFloats[];
```
- However, convention discourages this form; the brackets identify the array type and should appear with the type designation.

----

### Creating, Initializing, and Accessing an Array

- One way to <b>create</b> an array is with the `new operator`. 

- The next statement allocates an array with enough memory for 10 integer elements and assigns the array to the anArray variable. 

```
	// create an array of integers
	anArray = new int[10];
```

- If this statement is missing, then the compiler prints an error like the following, and compilation fails: `ArrayDemo.java:4: Variable anArray may not have been initialized.`


- The next few lines <b>assign</b> values to each element of the array:

```
	anArray[0] = 100; // initialize first element
	anArray[1] = 200; // initialize second element
	anArray[2] = 300; // and so forth
```

- Each array element is <b>accessed by its numerical index:</b>

```
	System.out.println("Element 1 at index 0: " + anArray[0]);
	System.out.println("Element 2 at index 1: " + anArray[1]);
	System.out.println("Element 3 at index 2: " + anArray[2]);
```

- <i>Alternatively, you can use the shortcut syntax to create and <b>initialize</b> an array:</i>

```
	int[] anArray = { 
    	100, 200, 300,
   	 400, 500, 600, 
    	700, 800, 900, 1000
	};
```
- Here the length of the array is determined by the number of values provided between braces and separated by commas.

### multidimensional array

-  a multidimensional array is an array whose components are themselves arrays. 

```
class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
```
----

### Copying Arrays

- The System class has an arraycopy method that you can use to efficiently copy data from one array into another:

```
	public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
```

- The following program, ArrayCopyDemo, declares an array of char elements, spelling the word "decaffeinated." It uses the System.arraycopy method to copy a subsequence of array components into a second array:

```
class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
```

----

### Array Manipulations

- For your convenience, Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting and searching arrays) in the `java.util.Arrays` class. 


- For instance, the previous example can be modified to use the copyOfRange method of the java.util.Arrays class, as you can see in the `ArrayCopyOfDemo` example. The difference is that using the `copyOfRange method does not require you to create the destination array before calling the method, because the destination array is returned by the method`:

```
class ArrayCopyOfDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));
    }
}
```

- <i>Note that the second parameter of the `copyOfRange method` is the `initial index` of the range to be copied, `inclusively`, while the `third parameter` is the `final index` of the range to be copied, `exclusively`. In this example, the range to be copied does not include the array element at index 9 (which contains the character a).</i>
                       

- Some other useful operations provided by methods in the java.util.Arrays class, are:

  1.Searching an array for a specific value to get the index at which it is placed (the binarySearch method).

  2.Comparing two arrays to determine if they are equal or not (the equals method).

  3.Filling an array to place a specific value at each index (the fill method).

  4.Sorting an array into ascending order. This can be done either sequentially, using the sort method, or concurrently, using the parallelSort method introduced in Java SE 8. Parallel sorting of large arrays on multiprocessor systems is faster than sequential array sorting.
