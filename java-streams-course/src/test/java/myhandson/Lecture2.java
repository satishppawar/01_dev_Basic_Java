package myhandson;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.Test;
import beans.Person;
import mockdata.MockData;

public class Lecture2 {
  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();

    IntStream.range(0, people.size()).forEach(index -> {
      Person p = people.get(index);
      System.out.println(p);
    });
  };

  // Demo of IntStream.iterate
  /**
   * IntStream java.util.stream.IntStream.iterate(int seed, IntUnaryOperator f)
   * Parameters:
   *    seed the initial element 
   *    f a function to be applied to the previous element to produce a new element
   * 
   * Returns: A new sequential IntStream
   * 
   * @throws Exception
   */
  @Test
  public void intStreamIterate() throws Exception {
    System.out.println("Demo of IntStream.iterate");
    IntStream.iterate(0, operand -> operand + 1).filter(number -> number % 2 == 0).limit(20)
        .forEach(System.out::println);
  }
}
