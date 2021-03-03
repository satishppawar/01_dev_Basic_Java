package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people
public class Lecture1 {

  // STEP1 -Implementation of the traditional approach
  @Test
  public void imperativeApproach() throws IOException {
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
    List<Person> youngPeople = people.stream()// Returns a sequential Stream with this collection as
                                              // its source.
        .filter(person -> person.getAge() <= 18).limit(10)// Returns a stream consisting of the
                                                          // elements of this stream that match the
                                                          // given predicate.
        .collect(Collectors.toList());

    youngPeople.forEach(System.out::println);// forEach

  }
}
