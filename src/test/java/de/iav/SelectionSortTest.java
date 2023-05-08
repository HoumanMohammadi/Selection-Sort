package de.iav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void theArray573190WillBeSortedAs013579(){

        int [] givenArray= new int[]{5, 7, 3, 1, 9, 0};

        int[] expectedArray= new int[]{0, 1, 3, 5, 7, 9};
        int[] resultedArray=SelectionSort.SelectionSortIncremental(givenArray);

        Assertions.assertArrayEquals(expectedArray,resultedArray);

    }

    @Test
    public void theArray573190WillBeSortedAs975310(){

        int [] givenArray= new int[]{9, 7, 5, 3, 1, 0};

        int[] expectedArray= new int[6];
        expectedArray=SelectionSort.SelectionSortDecremental(givenArray);

        Assertions.assertArrayEquals(expectedArray,givenArray);

    }

}