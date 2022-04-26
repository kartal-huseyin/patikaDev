package java101;

import java.util.Arrays;

public class C33_AHarfi {
    public static void main(String[] args) {


        String [][] arr = new String[6][4];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[0][j]="* ";
                arr[2][j]="* ";
                arr[i][0]="* ";
                arr[i][3]="* ";
                if(arr[i][j]==null) arr[i][j]="  ";
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
}
