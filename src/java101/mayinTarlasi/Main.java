package java101.mayinTarlasi;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        boolean isWin=true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir giriniz: ");
        int satir=scanner.nextInt();
        System.out.print("Sutun giriniz: ");
        int sutun=scanner.nextInt();


        String [][] arr=new String [satir][sutun];
        String [][] arrMayin=new String [satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j <sutun; j++) {

                arr[i][j]="-";
                arrMayin[i][j]="-";
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int mayinAdedi=satir*sutun/4;

        for (int i = 0; i <mayinAdedi ; i++) {

            int sayi1=(int) Math.floor(Math.random()*satir) ;
            int sayi2=(int) Math.floor(Math.random()*sutun) ;

            arrMayin[sayi1][sayi2]="*";
        }

        int hamle=0;

        do {
            System.out.println("Satır/sütün seçiniz: ");
            int s1= s1 = scanner.nextInt();
            int s2=s2=scanner.nextInt();

            try {

            hamle++;
            if(arrMayin[s1][s2].equals("*")){
                System.out.println("KAYBETTİNİZ");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print(arrMayin[i][j] + " ");
                    }
                    System.out.println();
                }

                isWin=false;
            } else if(hamle>=(satir*sutun-mayinAdedi)){
                System.out.println("KAZANDINIZ");
                break;
            }else{
                int count=0;


                try {
                    if(arrMayin[s1][s2+1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1][s2-1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1+1][s2].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1-1][s2].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1+1][s2+1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1-1][s2-1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1-1][s2+1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                try {
                    if(arrMayin[s1+1][s2-1].equals("*")){
                        count++;
                    }
                } catch (Exception e) {

                }
                arr[s1][s2]=String.valueOf(count);
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            } catch (Exception e) {
                System.err.println("Index dışına çıktınız");
            }

        }while(isWin);

    }
}
