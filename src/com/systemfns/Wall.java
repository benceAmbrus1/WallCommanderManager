package com.systemfns;

import com.systemfns.*;

public class Wall{

    private String name;
    private String menuName = "Wall menu";
    private String[] options = {"Wall menu1", "Wall menu2", "Wall menu3", "Back"};
    private int menuStop = 0;
    private Printer pr;

    //constructor
    public Wall(){

    }

    public void wallMenu(){
        pr = new Printer();

        while(menuStop != 1){
            pr.printTable(options, menuName);
            wallMenuChoose(Integer.parseInt(pr.printGetInput("Press the number of one of the option: ")));
        }
    }

    public void wallMenuChoose(int number){
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
                System.out.println("4");
                menuStop = 1;
                break;
            default:
                System.out.println("error");;
        }
    }
}