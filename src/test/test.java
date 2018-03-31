package test;

import java.util.Scanner;

public class test {


    public static void main(String[] args){
        String firstword = "HELLO WORLD!";
        Scanner intinput = new Scanner(System.in);
        System.out.print("---------------");
        System.out.print(intinput.nextInt());
        int tt = intinput.nextInt();
        String[] test = new String[tt];
        System.out.print("---------------");
        for(int i = 0;i<tt;i++) {
            System.out.print("---------------");
            Scanner input = new Scanner(System.in);
            test[i] = input.next();

        }
        for(String t : test) {
            System.out.print(t);
        }
        System.out.print("\n"+firstword);
    }
}

