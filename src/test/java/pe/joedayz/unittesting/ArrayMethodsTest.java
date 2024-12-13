package pe.joedayz.unittesting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author josediaz
 **/
public class ArrayMethodsTest {

  private ArrayMethods arrayMethods;

  @BeforeAll
  static void beforeAllTest(){
    System.out.println("Before All");
  }

  @BeforeEach
  void init(){
    System.out.println("Initializing before test");
    arrayMethods = new ArrayMethods();
  }

  @Test
  public void testFindIndex_numberInArray() {
    //1. create object of the class


    //2. call method
    int result = arrayMethods.findIndex(new int[] {8,4,5}, 4);

    //3. compare the actual results to the expected
    assertEquals(1, result);
  }

  @Test
  public void testFindIndex_numberNotInArray() {

    int result = arrayMethods.findIndex(new int[] {8,4,5}, 1);
    assertEquals(-1, result, "The findIndex method return -1");
  }

  @Test
  public void testFindIndex_emptyArray() {

    int result = arrayMethods.findIndex(new int[]{}, 3);
    assertEquals(-1, result);
  }

  @Test
  @Disabled
  public void testCompareTwoArrays() {

    assertArrayEquals(new int[] {0,1,3,7}, arrayMethods.sortArray(new int[] {3,1,7,0}));
  }

  @AfterEach
  void afterEachTest(){
    System.out.println("Clean up after test");
  }

  @AfterAll
  static void afterAllTest(){
    System.out.println("After All");
  }

}
