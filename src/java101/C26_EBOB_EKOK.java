package java101;

import java.util.ArrayList;
import java.util.List;

public class C26_EBOB_EKOK {
    public static void main(String[] args) {

        int a = 6;
        int b = 8;
        int EBOB=0;
        int EKOK=0;


            for (int i = 2; i <= b; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    EBOB=i;
                }
            }

        for (int i = 1; i <= a*b; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                EKOK=i;
                break;
            }

        }

        System.out.println("EBOB : " + EBOB);
        System.out.println("EKOK : " + EKOK);


    }

}