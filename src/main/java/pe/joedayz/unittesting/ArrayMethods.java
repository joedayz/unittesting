package pe.joedayz.unittesting;

import java.util.Arrays;

/**
 * @author josediaz
 **/
public class ArrayMethods {


  int findIndex(int[] array, int number) {
    int index = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        index = i;
      }
    }
    return index;
  }

  void printNumbers(int[] array, int index) {
    System.out.println(array[index]);
  }

  public int[] sortArray(int[] ints) {
    if(ints == null || ints.length == 0){
      return ints;
    }
    int[] sortedArray = Arrays.copyOf(ints, ints.length);
    Arrays.sort(sortedArray);
    return sortedArray;
  }
}
