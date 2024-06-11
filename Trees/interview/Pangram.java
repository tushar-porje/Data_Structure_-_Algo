package Trees.interview;

import java.util.*;
import java.io.*;

public class Pangram {
    
    public static void main (String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this
    
        // you code will be inside this main method
        // to view the output, just print the string
    
        boolean[] alphabetPresent=new boolean[26];
    
        for(int i=0;i<inputLine.length();i++){
    
          char letter=inputLine.charAt(i);
    
          int index=0;
    
          if(letter>='A' && letter<='Z'){
            index=letter - 'A';
          }else if(letter>='a' && letter<='z'){
            index=letter - 'a';
          }else{
            continue;
          }
    
          alphabetPresent[index]=true;
        }
    
        for(int i=0;i<26;i++){
          if(!alphabetPresent[i]){
            System.out.println("false");
            return;
          }
        }
    
        // below is a sample program output
        System.out.println("true");
      }
    
}
