package pe.joedayz.unittesting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * @author josediaz
 **/
public class ArrayMethodsTest {

//  @Test
//  void test(){
//    fail("Not yet implemented");
//  }

  @Test
  public void testFindIndex_numberInArray() {
    //1. create object of the class
    ArrayMethods arrayMethods = new ArrayMethods();

    //2. call method
    int result = arrayMethods.findIndex(new int[] {8,4,5}, 4);

    //3. compare the actual results to the expected
    assertEquals(1, result);
  }

  @Test
  public void testFindIndex_numberNotInArray() {

    ArrayMethods arrayMethods = new ArrayMethods();
    int result = arrayMethods.findIndex(new int[] {8,4,5}, 1);
    assertEquals(-1, result, "The findIndex method return -1");
  }

  @Test
  public void testFindIndex_emptyArray() {
    ArrayMethods arrayMethods = new ArrayMethods();
    int result = arrayMethods.findIndex(new int[]{}, 3);
    assertEquals(-1, result);
  }

  @Test
  public void testCompareTwoArrays() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertArrayEquals(new int[] {0,1,3,7}, arrayMethods.sortArray(new int[] {3,1,7,0}));
  }

  
}
