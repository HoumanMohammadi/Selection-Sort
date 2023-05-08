package de.iav;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Ctrl+R or click the green arrow button in the gutter to run the code.


            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            //System.out.println("i = " + i);
        int[] givenArray = new int[]{5, 7, 3, 1, 9, 0};
        System.out.println(Arrays.toString(SelectionSort.SelectionSortIncremental(givenArray)));
        System.out.println(Arrays.toString(SelectionSort.SelectionSortDecremental(givenArray)));

    }
}