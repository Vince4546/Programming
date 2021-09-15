package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int GameNumber = random.nextInt(11);
        System.out.println("The computer has generated a random number between 0 and 10, try and guess the number!");

        int Game = 0;
        while (Game<4){
            int PlayerNumber = input.nextInt();

            if(PlayerNumber==GameNumber) {
                System.out.println("You guessed it");
            }
            else{
                System.out.println("Wrong number noob, try again!");
                Game++;
                System.out.println("You have """)
            }
        }
    }
}
