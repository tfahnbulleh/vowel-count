/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamu Fahnbulleh
 */
public class CountVowels {
    
    private static Vowels vowels;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new instance of Vowel class
        //pass the phrase or sentence you want to count the number of vowels in
        //call the getTotalVowels method on the class instance to get the total vowels
        
        //exampple
        vowels=new Vowels("aa");
        JOptionPane.showMessageDialog(null,vowels.getTotalVowels());
    }
    
}
