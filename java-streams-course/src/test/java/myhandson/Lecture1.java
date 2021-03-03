package myhandson;

import beans.Person;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people
public class Lecture1 {

  // STEP1 -Implementation of the traditional approach
  @Test
  public void imperativeApproach() throws IOException {
    System.out.println("imperativeApproach");
    List<Person> people = MockData.getPeople();
    List<Person> youngPeople = Lists.newArrayList();

    final int limit = 10;
    int counter = 0;

    for (Person person : people) { // use stream()
      if (person.getAge() <= 18) {// use filter()
        youngPeople.add(person);// use collect()
        counter++;
        if (counter == limit) {
          break;
        }
      }
    }

    for (Person young : youngPeople) { // same as forEach
      System.out.println(young);
    }

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();
    // STEP2: Using the stream API
    System.out.println("============================================================================");
    System.out.println("YoungPeople using stream,filter,limit and collect");
    System.out.println("============================================================================");
   
    List<Person> youngPeople = people.stream()
        .filter(person -> person.getAge() <= 18).limit(10)// Returns a stream consisting of the
                                                          // elements of this stream that match the
                                                          // given predicate.
        .collect(Collectors.toList());

    youngPeople.forEach(System.out::println);// forEach
    
    //TODO using stream uncomment
    /*System.out.println("============================================================================");
    System.out.println("myYoungPeople using stream");
    System.out.println("============================================================================");
    //Returns a sequential Stream with this collection as its source.
    Stream<Person> myYoungPeople=(Stream<Person>) people.stream();
    System.out.println("myYoungPeople"+myYoungPeople);
    myYoungPeople.forEach(System.out::println);
    System.out.println("##############################################################################");
   */
    
  //TODO  uncomment
    /*System.out.println("============================================================================");
    System.out.println("myYoungPeople1 using stream and filter");
    System.out.println("============================================================================");
    
    Stream<Person> myYoungPeople1=(Stream<Person>) people.stream().filter(person-> person.getAge()<=18);
    myYoungPeople1.forEach(System.out::println);
    System.out.println("##############################################################################");
    */
    
    
  //TODO  uncomment
    /*System.out.println("============================================================================");
    System.out.println("YoungPeople using stream,filter and limit");
    System.out.println("============================================================================");
   
    Stream<Person> myYoungPeople2=(Stream<Person>) people.stream().filter(person-> person.getAge()<=18).limit(10);
   // myYoungPeople2.forEach(System.out::println);
    
    System.out.println("##############################################################################");
    */
    
  }
}
