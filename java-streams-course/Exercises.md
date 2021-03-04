# Excercises

## Exercise1- Imperative Approach Exercise

- Open lectures package
- Complete method bellow
	- Find people aged less or equal 18
	Then change implementation to find first 10 people
```java	
@Test
public void imperativeApproach() throws IOException {
  List<Person> people = MockData.getPeople();
  // 1. Find people aged less or equal 18
  // 2. Then change implementation to find first 10 people
}
```

Implement first step 1 and then change your implementation according to step 2.

-----

## Exercise2 
- Open lectures package
- Open lecture2
- Complete method bellow: loop through people using IntStream  and print the each object.
```java
@Test
public void rangeIteratingLists() throws Exception {
  List<Person> people = MockData.getPeople();
 
}
```

- Think weather you need to use range or range close.

---

## Exercise 3
- Open lectures package
- Open lecture3
- Complete method bellow: find the max number using stream.max 
```java
@Test
public void max() throws Exception {
  final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
  
}
```
---

## Exercise4
- Open lectures package
- Open lecture5
- Complete method bellow: calculate the average car price.
>Hint: Use .mapToDouble(...)  after getting all car prices then use .everage()  to calculate the average price.
```Java
@Test
public void averageCarPrice() throws Exception {
  ImmutableList<Car> cars = MockData.getCars();
  // calculate average of car prices
}
```
----


