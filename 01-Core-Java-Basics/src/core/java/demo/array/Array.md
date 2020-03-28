
# Arrays 


*   Arrays are used to represent group of elements as a single entity  
* 	elements are homogeneous &fixed size.
*   Array in java is index based first element of the array stored at 0 index


## Advantages of array:-

*   Instead of declaring individual variables we can declare group of elements by using array it
reduces length of the code
*   We can store the group of objects easily & we are able to retrieve the data easily
* 	Random index base access
*  	Array is able to hold reference variables of other types.


## Different ways to declare a Array:-
	int[] values;
	int []values;
	int values[];


### declaration& instantiation & initialization :-

>	Approach 1:- int array1[]={10,20,30,40}; //declaring, instantiation, intialization

> Approach 2:- int[] a=new int[100]; //declaring, instantiation
	a[0]=10; //initialization
	a[1]=20;

### Example
	 // declares an array of integers
	int[] anArray;
	// allocates memory for 10 integers
	anArray = new int[10];
	// initialize first element
	anArray[0] = 10;
	// initialize second element
	anArray[1] = 20;

### declaration of multi dimensional array:-
	int[][] a;
	int [][]a;
	int a[][];
	int []a[];



### Root structure:-
	

	java.lang.Object
	|
	|--java.lang.reflect.Array
	

* _Array is a final class can’t be extended._ 

	


