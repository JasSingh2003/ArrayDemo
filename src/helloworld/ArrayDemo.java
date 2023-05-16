/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author jaske
 */
public class ArrayDemo {
    public static void main(String[] args){
    char[] myLetters = new char[9];
    myLetters[0] = 'J';
    myLetters[1] = 'a';
    myLetters[2] = 's';
    myLetters[3] = 'k';
    myLetters[4] = 'e';
    myLetters[5] = 'e';
    myLetters[6] = 'r';
    myLetters[7] = 'a';
    myLetters[8] = 't';
    
    for(int i = 0;i<myLetters.length;i++){
        System.out.println(myLetters[i]);
    }
    }
}
