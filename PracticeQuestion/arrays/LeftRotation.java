package arrays; 
import java.io.*;
import java.math.*;
import java.util.*;

/*
A function that shifts everything in an array left d number of times
For example the array [1,2,3,4,5] with input d=2 would output [3,4,5,1,2]
Because it shifted every leter to the left 2 times

*/





public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {        
        int size = a.length;
        
        if(d > size){
            d = d% size;
        }        
        if (d == size){
            return a;
        }        
        int[] n = new int[size]; 
               
            for(int i = 0; i < size; i++){  
                if(i + d < size){
                   n[i] = a[i + d]; 
                }              
                else{
                    n[i]= a[i +d -size];
                }               
            }           
        
        return n;

    }

}
