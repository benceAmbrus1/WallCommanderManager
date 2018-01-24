package com;

import com.systemfns.*;
import com.players.*;

public class Game{

    static String menuName = "Main menu";
    static String[] options = {"New Game", "Game menu2", "Game menu3", "Exit"};
    static Player player;
    static Printer pr;

    public static void main(String[] args){

        pr = new Printer();
        player = new Player("Bence");

        pr.welcome(player);

        while(true) {
            pr.printTable(options, menuName);
            mainMenuChoose(Integer.parseInt(pr.printGetInput("Press the number of one of the option: ")));
        }
        
    }

    public static void mainMenuChoose(int number){
        switch(number){
            case 1:
                Wall wall = new Wall();
                wall.wallMenu();
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