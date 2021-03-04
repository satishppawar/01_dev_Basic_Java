package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

/**
 * 
 * findAny() vs findFirst()
 * 
 * findAny() - is non-deterministic
 * findFirst() - is deterministic
 * @author Satish
 *
 */
public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;


 
  @Test
  public void findAny0() throws Exception {
    System.out.println("Approach 1 :: Demo of filters and findAny");
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int any = Arrays.stream(numbers).
        filter(n -> n > 5 && n < 10).findAny().get();
    System.out.println(any);
  }

  @Test
  public void findAny() throws Exception {
    System.out.println("Approach 2 :: Demo of filters and findAny");
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int any = Arrays.stream(numbers).filter(numbersLessThan10).findAny().get();
    System.out.println(any);
  }

  @Test
  public void findFirst0() throws Exception {
    System.out.println("Approach 1 :: Demo of filters and findFirst");
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int first = Arrays.stream(numbers).filter(n->n<10&&n>5).findFirst().get();
    System.out.println(first);
  }
  
  @Test
  public void findFirst() throws Exception {
    System.out.println("Approach 2 :: Demo of filters and findFirst");
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int first = Arrays.stream(numbers).filter(numbersLessThan10).findFirst().get();
    System.out.println(first);
  }
}

