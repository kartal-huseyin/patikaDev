package java101;

import java.util.Arrays;

public class C35_MatrisTranspozu {
    /*Senaryo
Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4  */
    public static void main(String[] args) {

        int[][] arr={{2,3,4},{5,6,4}};

        transpozu(arr);

    }

    public static void transpozu(int[][] arr) {
        int[][] tmp=new int[arr[0].length][arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tmp[j][i]=arr[i][j];
            }
        }
        for (int i = 0; i <tmp.length ; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
