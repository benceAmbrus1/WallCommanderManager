package com.systemfns;

import java.util.Scanner;

import com.players.*;

public class Printer{

    public void printTable(String[] options){
        int number = 1;
        for(String option : options){
            System.out.println(number + ". " + option);
            number++;
        }
    }

    public int printGetInput(String input){
        System.out.println(input);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }

    public void welcome(Player player){
        System.out.println("Welcome " + player.name() + "." );
    }

}