package task1;

import java.util.Arrays;

public class ArrayList2 {
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
    void add (int index, int element){
        if(index>arr.length){
            index = arr.length;
        }
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr2[index] = element;
        arr = arr2;
    }
    int get(int index){
        return arr[index];
    }
    boolean contains(int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }
    void clear (){
        arr = new int[0];
    }
    void remove (int index){
        int[] arr2 = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index; i < arr2.length; i++) {
            arr2[i] = arr[i+1];
        }
        arr = arr2;
    }
    int size(){
        return arr.length;
    }
}
