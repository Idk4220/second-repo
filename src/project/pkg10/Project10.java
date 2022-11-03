/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pkg10;
 import java.util.Scanner;
/**
 *
 * @author 23350
 */
public class Project10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer:");
        int n = in.nextInt();
        System.out.print("Check whether every digit of the said integer is even or not!\n");
        System.out.print(test(n));
        }

  public static boolean test(int n){
    final int f = 10;
    if (n == 0){
        return false;
    }
    while(n != 0){
        if((n % f) % 2 != 0){
            return false;
        }
        n /= 10;
    }
     return true;
   }
}

    
    
    
    

