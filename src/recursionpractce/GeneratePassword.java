/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursionpractce;

/**
 *
 * @author jomar9255
 */
public class GeneratePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(genPassword(10));
    }
    
    /**
    * Generates a pseudo-random password based on the n number of characters in
    * the password
    * @param n
    */
    public static String genPassword(int n){
        String ret = "";
        if(n > 0){
       int rand = (int)(Math.random() * 1000);
       char passChar = (char)rand;
       ret = passChar + genPassword(n-1);
       return ret;
        }else{
            return ret;
        }
    }
}
