


/* Generate all the strings of length n drawn from 0..k-1. */

import java.util.*;

public class ArrayStrings{
    int[] A;
    public ArrayStrings(int n){
        A = new int[n];
    }
    public void strings(int n, int k){
        //process all kth array strings of length n
        if(n<=0)
        System.out.println(Arrays.toString(A)); // Assume array A is a class variable
        else{
            for(int i=0; i<k; i++){
                A[n-1] = i;
                strings(n-1, k);
            }
        }
    }
    public static void main(String args[]) throws java.lang.Exception{
        int n = 2;
        ArrayStrings arr = new ArrayStrings(n);
        arr.strings(n,3);
    }
}