# java-streams-Notes


## [What is stream in JAVA?](https://www.geeksforgeeks.org/stream-in-java/)

- Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces and enum to allows functional-style operations on the elements. You can use stream by importing java.util.stream package.

---

#### The features of Java stream are –

- Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.

- Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.

- Stream is lazy and evaluates code only when required.

- The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.


- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

----

#### Different Operations On Streams-

##### A)Intermediate Operations:

1. map: 

- The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.

```java
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
```
2. filter: 

- The filter method is used to select elements as per the Predicate passed as argument.

```java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
```

3. sorted: 

- The sorted method is used to sort the stream.

```java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());
```
----

##### B) Terminal Operations:

1. collect:
- The collect method is used to return the result of the intermediate operations performed on the stream.
```java
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
```
2. forEach: 

- The forEach method is used to iterate through every element of the stream.

```java
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));
```

3. 

- reduce: The reduce method is used to reduce the elements of a stream to a single value.

	The reduce method takes a BinaryOperator as a parameter.

```java
List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
```