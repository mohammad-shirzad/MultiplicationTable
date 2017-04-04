package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("jadvale chand dar chand mikhahid?");
            Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            //creating table
            System.out.println("-------------------product table-------------------");
            System.out.print("    ");
            for (int i = 1; i <= size; i++) {
                if (i>=10){
                System.out.print(i + "     ");}
                else System.out.print(i+"      ");
            }
            System.out.println();
            for (int i = 1; i <= size; i++) {
                System.out.print("--------");
            }
            System.out.println();
            for (int i = 1; i <= size; i++) {
                if (i>=10){
                    System.out.print(i+"| ");}
                else {System.out.print(" "+i + "| ");}

                for (int j = 1; j <= size; j++) {
                    int z = i * j;
                    if (z >= 100){
                        System.out.print(z+"    ");
                    }else if (z>=10 && z<100){
                        System.out.print(z+"     ");
                    }else {
                        System.out.print(z+"      ");}
                }
                System.out.println();
            }
            System.out.println("would you like to test another one (yes or no)? ");
            Scanner confirm=new Scanner(System.in);
            String response=confirm.nextLine();
            response=response.trim().toLowerCase();

            switch (response){
                case "yes":
                    flag=true;
                    break;
                case "no":
                    flag=false;
                    break;
                    }
            }
        }
    }

