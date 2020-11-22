import java.io.*;
import java.math.*;
import java.util.*;

/*
A function that tells the least number of steps it takes to get from start to finish of an array
The array is filled with 0's and 1's
Player can step on the 0's but not the 1's
Player can move either two spaces or one space at a time
The fist and last element in the array is always 0 and is where the player starts and finishes

Sample Input

0 0 1 0 0 1 0

The output would be 4 because that is the least amount of steps a player can take
They start at the first 0 and can't move two spaces because they would land on a 1 so they only move one space(their first step)
Next they can move two spaces(second step), then one space because two would land them on the 1(third step)
lastly they move two steps and land on the last 0(fourth step)
*/

public class CloudJumping {

    static int jumpingOnClouds(int[] c) {
        
        int steps = 0;
        for(int i =0; i < c.length-1; i++){
            if(i+1 == c.length-1){
                steps ++;
                i = c.length;
            }
            else if(c[i+2] == 0 ){
                i++;     
                steps ++;           
            }
            else{
                steps ++;
            }
            
        }
        return steps;

    }
}
