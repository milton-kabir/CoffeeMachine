package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int cnt=1123456789;
        Scanner sc= new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int w=sc.nextInt();
        cnt=Math.min(cnt,(w/200));
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int m=sc.nextInt();
        cnt=Math.min(cnt,m/50);
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int g=sc.nextInt();
        cnt=Math.min(cnt,g/15);
        System.out.println("Write how many cups of coffee you will need: ");
        int c=sc.nextInt();
        if(cnt<c){
            System.out.println("No, I can make only "+cnt+" cup(s) of coffee");
        }
        else if(cnt==c){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else{
            System.out.println("Yes, I can make that amount of coffee (and even "+(cnt-c)+" more than that)");
        }

    }
}
