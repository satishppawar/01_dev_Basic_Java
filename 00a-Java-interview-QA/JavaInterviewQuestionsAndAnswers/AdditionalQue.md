# Additional JAVA Questions

## String 

### [Why are strings immutable in Java?](https://www.educative.io/edpresso/why-are-strings-immutable-in-java)

1. String Pool Requirement
- String pool is a specific storage area for string objects. If a string object is created and that string already exists, then, instead of creating a new object on the heap, the reference of the same object is returned. If string is mutable, then changing one reference will change the value for all the string objects.


2. Caching KEY
- Since a string object is immutable, its hashcode is cached at the time of creation so that it can be used multiple times without calculation. This immutability feature makes it an appropriate choice for a candidate key for HashMaps.

3. Security
- Strings are widely used as parameters in network connections, file-openings, etc. If a string is mutable, then a connection or file would be changed which would lead​ to a serious security threat.

4. Thread-safe

- These immutable string objects are thread-safe as well. Since these objects cannot be changed or modified, they can be shared between threads which eliminates the need for synchronization.


### What are differences between String and StringBuffer?

- Objects of type String are immutable. StringBuffer is used to represent values that can be
modified.
- In situations where values are modified a number to times, StringBuffer yields significant
performance benefits.
- Both String and StringBuffer are thread-safe.
- StringBuffer is implemented by using synchronized keyword on all methods.

### What are differences between StringBuilder and StringBuffer?
- `StringBuilder` is `not thread safe`. So, it performs better in situations where thread safety is not required.

## OOP
### What is a Class?

```java 
public class CricketScorer {
//Instance Variables - constitute the state of an object
private int score;
//Behavior - all the methods that are part of the class
//An object of this type has behavior based on the
//methods four, six and getScore
public void four(){
score = score + 4;
}
public void six(){
score = score + 6;
}
public int getScore() {
return score;
}
public static void main(String[] args) {
CricketScorer scorer = new CricketScorer();
scorer.six();
//State of scorer is (score => 6)
scorer.four();
//State of scorer is (score => 10)
System.out.println(scorer.getScore());
}
}
```
- A class is a Template. In above example, Class CricketScorer is the template for creating multiple objects. A class defines state and behavior that an object can exhibit.

### What is an Object?
- An instance of a class. In the above example, we create an object using new CricketScorer(). The reference of the created object is stored in scorer variable. We can create multiple objects of the same class.

### What is state of an Object?
- Values assigned to instance variables of an object. Consider following code snippets from the above example. The value in score variable is initially 0. It changes to 6 and then 10. State of an object might change with time.

### Can interface implements another interface?
- No.

### Can interface extends another interface?
- An interface can extend another interface. 

- Consider the example below:

```Java interface SubInterface1 extends ExampleInterface1{
void method3();
}
```

- Class implementing SubInterface1 should implement both methods - method3 and method1(from ExampleInterface1)







