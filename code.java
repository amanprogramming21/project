package com.company;
import java.util.Scanner;
import java.util.Random;
public class simple_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for Rock,1 for paper,2 for scissor ");
        int UserInput=sc.nextInt();
        Random random=new Random(3);
        int ComputerInput=random.nextInt();
        if(UserInput==ComputerInput){
            System.out.println("Draw");
        }
        else if (UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 || UserInput==2 && ComputerInput==1){
            System.out.println("You win");
        }
        else {
            System.out.println("computer wins");
        }
      System.out.println("Computer choice:"+ ComputerInput);




    }
}