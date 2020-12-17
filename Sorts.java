import java.util.*;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean inOrder = true;
    for (int i = 0; i < data.length && inOrder; i++){
      inOrder = false;
      for (int j = 0; j < data.length - i-1; j++){
        if (data[j] > data[j+1]){
          int holder = data[j+1];
          data[j+1] = data[j];
          data[j] = holder;
          inOrder = true;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      for (int j = i; j < data.length; j++){
        if (data[i] < data[j]){
          int holder = data[i];
          data[i] = data[j];
          data[j] =  holder;
        }
      }
    }
  }
}
