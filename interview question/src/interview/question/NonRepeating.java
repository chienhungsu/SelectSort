/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author chienhungsu
 */
public class NonRepeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nonrepeat("abacc"));
    }

    private static char nonrepeat(String strno) {
        char[] inchar=new char[strno.length()];
        char compare=' ';
        // create a table to store the uniqe characters and count the number of characters to store and update the table
        HashMap uniquechar=new HashMap();
        // use the for loop to count and store the characters
        for(int i=0;i<strno.length();i++){
            // if character is not in the table then set the number of count to 1
            if(!uniquechar.containsKey(strno.charAt(i))){
                uniquechar.put(strno.charAt(i), 1);
            // else the number of count +1
            }else{
                uniquechar.put(strno.charAt(i), (int)(uniquechar.get(strno.charAt(i)))+1);
            }
        }
        // search the unique character based on the number of count for character
        for(int i=0;i<strno.length();i++){
            if((int)uniquechar.get(strno.charAt(i))==1){
                compare=strno.charAt(i);
            }
        }
        return compare;
    }
    
}
