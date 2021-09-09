package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Ведите количества: ");
        int days=new Scanner(System.in).nextInt();

        convert(days);

    }
    static void convert(int days){
        if(days<=0) throw new IllegalArgumentException();
        System.out.println("In "+ days+" days: "+ days*24 + " hours, "+ days*1440 +" minutes, "+ days*86400+" seconds.");

    }
}
