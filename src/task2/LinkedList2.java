package task2;

import java.util.Arrays;

public class LinkedList2 {
    int[] arr = new int[0];

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    void add (int element){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = element;
        arr = arr2;
    }
    void addFirst (int element){
        int[] arr2 = new int[arr.length+1];
        arr2[0] = element;
        for (int i = 0; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr = arr2;
    }
    void addLast (int element){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = element;
        arr = arr2;
    }
    void removeFirst(){
        int[] arr2 = new int[arr.length-1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i+1];
        }
        arr = arr2;
    }



    void removeLast(){
        int[] arr2 = new int[arr.length-1];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    int getFirst(){
        return arr[0];
    }
    int getLast(){
        return arr[arr.length-1];
    }
    int size(){
        return arr.length;
    }
}
