import java.io.*;
import java.math.*;
import java.util.*;

/*
This array returns an integer representing the number of matching numbers in an array

A user will enter n which is the number of elements in the array and ar which is the array itself

for example if the user enters 

9
10 20 20 10 10 30 50 10 20

the output will be 3 because there are two pairs of 10's and a pair of 20's

*/

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        int pairs=0;
        Arrays.sort(ar);
        
        for(int i=0; i<n-1; i++){
            if(ar[i]==ar[i+1]){
                pairs ++;
                i++;
            }
        }
        return pairs;
    }

}