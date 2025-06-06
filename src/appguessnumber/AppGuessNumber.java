/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appguessnumber;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 344_09
 */
public class AppGuessNumber {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numRandom ;
        int numGuess;
        int cont  = 0 ;
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        numRandom = ran.nextInt(0-100);
//        System.out.print("Number is : "+ numRandom);
        while(cont<=3){
            System.out.print("Enter yoour guess :");
            numGuess = scan.nextInt();
            if(numGuess==numRandom){
                System.out.println("You win");
                break;
            }else if(numGuess>numRandom){
                System.out.println("<<<< decrement");
                cont++;
            }else if(numGuess<numRandom){
                System.out.println("Incrment >>>>>>");
                cont++;
            }
            if(cont>=3){
                System.out.println("you lose");
            }
            
        }
        
    }     
}
