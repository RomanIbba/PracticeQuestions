import java.io.*;
import java.math.*;
import java.util.*;

class CountingValleys {

    /*
      Function that keeps track of the number of valleys a hiker travels through on their hike

      The function will be given the number of steps taken and a string will be a combination of "U" and "D"
      which stand for every step taken uphil and every step taken downhill 

      The hiker always starts and ends at sea level and every time the hiker goes down from sea level it is considered a valley

      For example the input

      8
      UDDDUDUU

      Would output 1 because the hiker went up then down then down again so he is now below sea level 
      following the rest of the steps he stays below sea level untill his last step so he only entered 1 valley


     */

    public static int countingValleys(int steps, String path) {
    
    int SeaLevel = 0;
    int Valleys = 0;
    
    for(int i = 0; i < steps; i++){
        if( SeaLevel == 0 && path.charAt(i)== 'D'){
            Valleys++;
            SeaLevel --;
        }
        else if(path.charAt(i) == 'D'){
            SeaLevel --;
        }
        else if(path.charAt(i)== 'U'){
            SeaLevel ++;
        }
    }
    return Valleys; 

    }

}

