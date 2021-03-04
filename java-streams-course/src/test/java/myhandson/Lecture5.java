package myhandson;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

/**
 * 
 * 
 * 
 * Using Filter method
 *
 *java.util.function.Predicate<Car> </pre>
 *      Represents a predicate (boolean-valued function) of one argument
 *      
 *      <br>
 *  Stream<Car> java.util.stream.Stream.filter(Predicate<? super Car> predicate)<br>
 *  - Returns a stream consisting of the elements of this stream that match the given predicate.This is an intermediate operation.
 *  <br>
 *  Parameters:
 *      predicate a non-interfering, stateless predicate to apply to each element to determine if it should be included
 *  
 *  Returns:
 *      the new stream
 *      
 *      @author Satish <br>
 */

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    System.out.println("#################################");
    System.out.println("Filter cars by price");
    System.out.println("#################################");
    final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;

    List<Car> carsFiltered = cars.stream().filter(carPredicate).collect(Collectors.toList());

    
    carsFiltered.forEach(System.out::println);
    System.out.println(carsFiltered.size());
    System.out.println("#################################");
    System.out.println("Filter cars by Make");
    System.out.println("#################################");
    Predicate<Car> makePredicate=car->car.getMake().equals("Toyota");
    List<Car> carsFilteredByMake =cars.stream().filter(makePredicate).collect(Collectors.toList());
    carsFilteredByMake.forEach(System.out::println);
  }


  /**
   * stream().map() transform from one data type to another
   * 
   */
  //Demo of stream().map()
  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    System.out.println("#################################");
    System.out.println("Approach1:: Demo of stream().map() Complex way ");
    System.out.println("#################################");
    List<PersonDTO> personDto = people.stream().map(person -> {
      PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
      return dto;
    }).limit(10).collect(Collectors.toList());

    personDto.forEach(System.out::println);

    assertThat(personDto).hasSize(10);
    System.out.println(personDto.size());
    
    System.out.println("#################################");
    System.out.println("Approach2::Demo of stream().map() using static method ");
    System.out.println("#################################");
    //PersonDTO::map --> map is static method
    List<PersonDTO> dtos = people.stream().map(PersonDTO::map).limit(10).collect(Collectors.toList());

    dtos.forEach(System.out::println);

    assertThat(dtos).hasSize(10);
    System.out.println(dtos.size());
    
    System.out.println("#################################");
    System.out.println("Approach3::Demo of stream().map() simplified ");
    System.out.println("#################################");
    //PersonDTO::map --> map is static method
    Function<Person, PersonDTO> personToPersonDto=person->new PersonDTO(person.getId(),person.getFirstName(),person.getAge());
    List<PersonDTO> dtos1 = people.stream().map(personToPersonDto).limit(10).collect(Collectors.toList());
    
    dtos1.forEach(System.out::println);

    assertThat(dtos1).hasSize(10);
    System.out.println(dtos1.size());


  }

  //Exercise4 Solution
  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    //Approach 1
    double average1 =MockData.getCars()
        .stream().
        mapToDouble(car -> car.getPrice()).
        average().
        orElse(0);
    System.out.println("average1 car price is ::"+average1);
    
    double average = MockData.getCars().stream().mapToDouble(Car::getPrice).average().orElse(0);
    System.out.println("average car price is ::"+average);
  }

  @Test
  public void test() throws Exception {
    MockData.getCars().forEach(System.out::println);
  }
}


