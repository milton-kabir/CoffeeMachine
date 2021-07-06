package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Write how many cups of coffee you will need: ");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println("For "+c+" cups of coffee you will need:\n" +
                c*200+" ml of water\n" +
                c*50+" ml of milk\n" +
                c*15+" g of coffee beans");
    }
}
