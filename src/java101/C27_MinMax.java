package java101;
import  java.util.Scanner;
public class C27_MinMax {
    public static void main(String[] args) {
        /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int n=scanner.nextInt();
        System.out.println("Sayıları giriniz:");



        int sayi=scanner.nextInt();
        int enKucuk=sayi;

        for (int i = 0; i <n-1 ; i++) {
             sayi=scanner.nextInt();
            if(sayi<enKucuk){
                enKucuk=sayi;
            }

        }


        System.out.println("En küçük sayı : "+enKucuk);




    }
}
