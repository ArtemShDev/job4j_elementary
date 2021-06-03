package ru.job4j.array;

import javax.swing.*;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] rsl = new int[length];
        int indexLeft  = 0;
        int indexRight = 0;
        for (int indexMerge = 0; indexMerge < length; indexMerge++) {
            if (indexLeft == left.length || (indexRight < right.length && left[indexLeft] > right[indexRight])) {
                rsl[indexMerge] = right[indexRight];
                indexRight++;
            } else {
                rsl[indexMerge] = left[indexLeft];
                indexLeft++;
            }
        }
        return rsl;
    }
}