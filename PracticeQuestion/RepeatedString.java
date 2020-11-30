import java.io.*;
import java.math.*;
import java.util.*;

/*
A function that will find the number of a's in a repeated string
The string can repeat multiple times depending on n (total lenght)
For example  if a user enters the string s='abca' and n=10 it will repeat the string untill there n length
So the new string would be s='abcaabcaab' with an output of 5
*/




public class RepeatedString {

    static long repeatedString(String s, long n) {        
        int a = 0;
        int b = 0;
        int l = s.length();
        
        long rem = n % l;
        long rep = n / l;        
        
        for(int i =0; i< s.length() ; i++){  
            if(s.charAt(i) == 'a') {
                a++;
            }                
        }        
        for (int i = 0; i < rem; i++){
            if(s.charAt(i) == 'a'){
                b++;
            }
        }
        return (a * rep) + b;


    }

}
