package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i , i + 1);
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void swap(int [] arr, int i, int j){
        if(i == j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}