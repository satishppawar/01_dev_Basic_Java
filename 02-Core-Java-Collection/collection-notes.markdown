# Collection framework (java.util)

**Pre-requisite topics for Collections framework:-** 

1. AutoBoxing.
2. toString(. method.
3. type-casting.
4. interfaces.
5. for-each loop.
6. implementation classes.
7. compareTo(. method.
8. Wrapper classes.
9. Marker interfaces advantages.
10. Anonymous inner classes.
## What is Collection framework?

* Collection framework contains group of classes and interfaces which are used for representing group of objects as a single entity.
* Collection is sometimes called a container. And it is object that groups multiple elements into a single unit.
* Collections are used to store, retrieve ,manipulate data.
## The key interfaces of collection framework:-

1. Java.util.Collection
2. Java.util.List
3. Java.util.Set
4. Java.util.SortedSet
5. Java.util.NavigablaSet
6. Java.util.Queue
7. Java.util.Map
8. Java.util.SotedMap
9. Java.util.NavigableMap
10. Map.Entry
11. Java.util.Enumeration
12. Java.util.Iterator
13. Java.util.ListIterator
14. Java.lang.Comparable
15. Java.util.Comparator
## Root Interface --> public interface Collection<E> extends Iterable<E>

*Note :- The root interface of Collection framework is Collection and it contains 15 methods so all implementation classes are able to use that methods.* 

    public abstract int size();
    public abstract boolean isEmpty();
    public abstract boolean contains(java.lang.Object);
    public abstract java/util/Iterator<E> iterator();
    public abstract java.lang.Object[] toArray();
    public abstract <T extends java/lang/Object> T[] toArray(T[]);
    public abstract boolean add(E);
    public abstract boolean remove(java.lang.Object);
    public abstract boolean containsAll(java/util/Collection<?>);
    public abstract boolean addAll(java/util/Collection<? extends E>);
    public abstract boolean removeAll(java/util/Collection<?>);
    public abstract boolean retainAll(java/util/Collection<?>);
    public abstract void clear();
    public abstract boolean equals(java.lang.Object);
    public abstract int hashCode();

### Collection vs Collections:-

* **Collection**  is interface it is used to *represent group of objects as a single entity*.
* **Collections**  is *utility class*  it contains methods to perform operations.
### Characteristics of Collection frame work classes:-

1. The collect ion framework classes are introduced in different Versions.
2. Heterogeneous data allowed or not allowed. All classes allowed heterogeneous data except two classes
   i. TreeSet ii. TreeMap
3. Null insertion is possible or not possible.
4. Insertion order is preserved or not preserved.
   	`Input --->e1 e2 e3 output --->e1 e2 e3 insertion order is preserved`  
    `Input --->e1 e2 e3 output --->e2 e1 e3 insertion order is not-preserved`  

1. Collection classes methods are synchronized or non-synchronized.
2. Duplicate objects are allowed or not allowed.
