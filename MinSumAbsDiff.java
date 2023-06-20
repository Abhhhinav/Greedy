package Greedy;

import java.util.*;

public class MinSumAbsDiff {
    public static void main(String[] args) {
        int A[] = { 1, 2, 8 };
        int B[] = { 22, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff = minDiff + Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Differnce " + minDiff);
    }
}
