package myhandson;

import static org.assertj.core.api.Assertions.assertThat;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Lecture3 {

  //Find the minimum 
  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    //Confusing Logic
    //Integer min=numbers.stream().min((number1, number2)-> number1>number2?1:-1).get();
    Integer min=numbers.stream().min(Comparator.naturalOrder()).get();
    System.out.println("min is : "+min);
    assertThat(min).isEqualTo(1);
    
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer max=numbers.stream().max(Comparator.naturalOrder()).get();
    System.out.println("max is : "+max);
    assertThat(max).isEqualTo(100);
  }
}
