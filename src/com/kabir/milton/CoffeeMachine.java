package com.kabir.milton;

import java.util.Scanner;

class CoffeeMachine {
    int w=400,m=540, g=120, cp=9,dl=550;
    String order;

    public String setOrder(String order) {
        Scanner scanner=new Scanner(System.in);
        this.order = order;
        if(order.equals("buy")){
            while(true){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String ts=scanner.nextLine();
                if(ts.equals("1")){
                    int chk=1;
                    if(w<250){
                        chk=0;
                    }
                    if(g<16){
                        chk=0;
                    }
                    if(cp<1){
                        chk=0;
                    }
                    if(chk==0){
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    w-=250;
                    g-=16;
                    dl+=4;
                    cp--;
                    break;
                }
                else if(ts.equals("2")){
                    int chk=1;
                    if(w<350){
                        chk=0;
                    }
                    if(m<75){
                        chk=0;
                    }
                    if(g<20){
                        chk=0;
                    }
                    if(cp<1){
                        chk=0;
                    }
                    if(chk==0){
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    w-=350;
                    m-=75;
                    g-=20;
                    dl+=7;
                    cp--;
                    break;
                }
                else if(ts.equals("3")){
                    int chk=1;
                    if(w<200){
                        chk=0;
                    }
                    if(m<100){
                        chk=0;
                    }
                    if(g<12){
                        chk=0;
                    }
                    if(cp<1){
                        chk=0;
                    }
                    if(chk==0){
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    System.out.println("I have enough resources, making you a coffee!");
                    w-=200;
                    m-=100;
                    g-=12;
                    dl+=6;
                    cp--;
                    break;
                }
                else{
                    break;
                }
            }
            return "again";
        }
        else if(order.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            String ts=scanner.nextLine();
            w+=Integer.parseInt(ts);
            System.out.println("Write how many ml of milk you want to add: ");
            ts=scanner.nextLine();
            m+=Integer.parseInt(ts);
            System.out.println("Write how many grams of coffee beans you want to add: ");
            ts=scanner.nextLine();
            g+=Integer.parseInt(ts);
            System.out.println("Write how many disposable cups of coffee you want to add: ");
            ts=scanner.nextLine();
            cp+=Integer.parseInt(ts);
            return "again";
        }
        else if(order.equals("take")){
            System.out.println("I gave you $"+dl);
            dl=0;
            return "again";
        }
        else if(order.equals("remaining")){
            System.out.println("The coffee machine has:\n" +
                    w+" ml of water\n" +
                    m+" ml of milk\n" +
                    g+" g of coffee beans\n" +
                    cp+" disposable cups\n" +
                    "$"+dl+" of money");
            return "again";
        }
        else{
            return "exit";
        }
    }
}
