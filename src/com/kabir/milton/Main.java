package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        CoffeeMachine machine=new CoffeeMachine();
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String st = sc.nextLine();
            st=machine.setOrder(st);
            if(st.equals("exit")){
                break;
            }
        }
    }
}
