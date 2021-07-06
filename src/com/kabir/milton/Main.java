package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int w=400,m=540, g=120, cp=9,dl=550;
        System.out.println("The coffee machine has:\n" +
                w+" ml of water\n" +
                m+" ml of milk\n" +
                g+" g of coffee beans\n" +
                cp+" disposable cups\n" +
                "$"+dl+" of money");
        System.out.println("Write action (buy, fill, take): ");
        String st=sc.nextLine();
        if(st.equals("buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int cnt=sc.nextInt();
            if(cnt==1){
                w-=250;
                g-=16;
                dl+=4;
            }
            else if(cnt==2){
                w-=350;
                m-=75;
                g-=20;
                dl+=7;
            }
            else{
                w-=200;
                m-=100;
                g-=12;
                dl+=6;
            }
            cp--;
        }
        else if(st.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            w+=sc.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            m+=sc.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            g+=sc.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add: ");
            cp+=sc.nextInt();
        }
        else{
            System.out.println("I gave you $550");
            dl=0;
        }
        System.out.println("The coffee machine has:\n" +
                w+" ml of water\n" +
                m+" ml of milk\n" +
                g+" g of coffee beans\n" +
                cp+" disposable cups\n" +
                "$"+dl+" of money");
    }
}
