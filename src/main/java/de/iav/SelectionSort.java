package de.iav;

import java.util.Arrays;

public class SelectionSort {


    public static int[] SelectionSortIncremental(int[] givenArray) {
     //   int tempSmallestElement=0;
        int[] sortedArray= new int[givenArray.length];
        int[] tempArray = givenArray;
        int tempSmallestElement=givenArray[0];

        for (int i=0; i< givenArray.length; i++){

            for (int j=i+1; j< givenArray.length; j++){
                if (tempArray[j]<tempArray[i]) {

                    tempSmallestElement = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = tempSmallestElement;
                }
            }
        }
        sortedArray=tempArray;
        return givenArray;
    }

   public static int[] SelectionSortDecremental(int[] givenArray) {
       int[] sortedArray= new int[givenArray.length];
       int[] tempArray = givenArray;
       int tempLargestElement=givenArray[0];

       for (int i=0; i< givenArray.length; i++){

           for (int j=i+1; j< givenArray.length; j++){
               if (tempArray[j]>tempArray[i]) {

                   tempLargestElement = tempArray[i];
                   tempArray[i] = tempArray[j];
                   tempArray[j] = tempLargestElement;
               }
           }
       }
       sortedArray=tempArray;
       return givenArray;

   }
}
