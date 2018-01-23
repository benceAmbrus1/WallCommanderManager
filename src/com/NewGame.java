package com;

import com.systemfns.*;
import com.players.*;

public class NewGame{

    static String[] options = {"New Game", "Load Game", "Options", "Exit"};
    static Player player;
    static Printer pr;

    public static void main(String[] args){

        pr = new Printer();
        player = new Player("Bence");

        pr.welcome(player);

        while(true) {
            pr.printTable(options);
            mainMenuChoose(pr.printGetInput("Choose a number."));
        }
        
    }

    public static void mainMenuChoose(int number){
        switch(number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Not invalid option.");;
        }
    }
}