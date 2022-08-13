
/**
  *Program that solves Tower of Hanoi Problem with any number of disks entered.
  *Muhammed Serhan Genis
  *12.08.2022
  * 
  *
*/

import java.util.Scanner;



public class Main {
    
    private static Scanner scanner =new Scanner(System.in);
    static void towerOfHanoi(int n, char first, char dest, char aux)
    {
        if (n == 1)
        {
            System.out.println("Disk 1: " +  first + " -----> " + dest);
            return;
        }
        
        towerOfHanoi(n-1, first, aux, dest);
        
        System.out.println("Disk " + n + ": "+ first + " -----> " + dest);
        
        towerOfHanoi(n-1, aux, dest, first);
    }

    public static void main(String args[])
    {
        
        int n ;
        System.out.println("   Tower Of Hanoi");
        System.out.println();
        System.out.println(" ||      ||      ||");
        System.out.println(" ||      ||      ||");
        System.out.println("_||_    _||_    _||_");
        System.out.println("A rod   B rod   C rod");
        System.out.println();
        System.out.print("Enter the number of the disks:");
        n=scanner.nextInt();
        Double noOfSteps=(Math.pow(2, n)-1);
                
        towerOfHanoi(n,'A','C', 'B');
        System.out.println("Completed in "+noOfSteps.intValue()+" steps.");
    }
    
    
}
