package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int compcard = ((random.nextInt(21)+1));
        int mycard = ((random.nextInt(21)+1));
        boolean roundplay = true;
        String hitOrMiss ="";
        while (roundplay) {
            while (compcard < 17) {
                compcard = (compcard + ((random.nextInt(10)+1)));
            }
            if (mycard < 21) {
                System.out.println("your number is " + mycard + " hit or pass");
                hitOrMiss = input.next();
                if ((hitOrMiss.contains("h"))||(hitOrMiss.contains("H"))) {
                    mycard = (mycard + ((random.nextInt(10)+1)));
                } else {
                    roundplay = false;
                }
            } else {
                roundplay = false;
            }

        }
        if ((mycard > 21) && (compcard > 21)) {
            System.out.println("you both busted with"+mycard+",TIE");
        } else {
            if (mycard > 21) {
                System.out.println("you busted with " + mycard + " and your oppoment had " + compcard);
            } else {
                if (compcard > 21) {
                    System.out.println("your oppoment busted with " + compcard + " you win with " + mycard);
                } else if (mycard > compcard) {
                    System.out.println("you win with " + mycard + ". your oppoment had " + compcard);
                } else {
                    if (mycard < compcard) {
                        System.out.println("you lose you only had " + mycard + ". your oppoment had " + compcard);
                    } else {
                        System.out.println("you both tied with " + mycard);
                    }
                }
            }

        }
    }
}


