/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels;

/**
 *
 * @author Tamu Fahnbulleh
 */
public class Vowels {
    
    private int _totalVowels;
    private char _phraseArray[];
    
    //constructor
    public Vowels(String phrase)
    {
        this._totalVowels = 0;
        this._phraseArray=new char[phrase.length()];
        this._phraseArray=phrase.toCharArray();
    }
    
    //count the number of vowels in the array
    private void count()
    {
            for(char ch : this._phraseArray)
            {
                switch(Character.toLowerCase(ch))
                {
                    case 'a':
                        this._totalVowels+=1;
                        break;
                    case 'e':
                        this._totalVowels+=1;
                        break;
                    case 'i':
                        this._totalVowels+=1;
                        break;                      
                    case 'o':
                        this._totalVowels+=1;
                        break;
                    case 'u':
                        this._totalVowels+=1;
                        break;                   
                }
            }
    }
    
    
    //return the total vowels
    public int getTotalVowels()
    {
        this.count();
        return this._totalVowels;
    }
    
}
