

/* Generate all the strings of n bits. Assume A[0..n-1] is an array of size n. */

import java.util.*;

public class BinaryStrings{
    int[] A;
    public BinaryStrings(int n){
        A = new int[n];
    }
    public void binary(int n){
        if(n <=0){
            System.out.println(Arrays.toString(A));
        }
        else{
            A[n-1] = 0;
            binary(n-1);
            A[n-1] = 1;
            binary(n-1);
        }
    }
    public static void main(String args[]){
        int n = 4;
        BinaryStrings i = new BinaryStrings(n);
        i.binary(n);
    }
}