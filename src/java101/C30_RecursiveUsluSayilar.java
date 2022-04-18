package java101;
import java.util.Scanner;
public class C30_RecursiveUsluSayilar {/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.

Senaryo
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz:");
        int us = scanner.nextInt();

        System.out.println(usAl(taban, us));
    }




    public static int usAl(int a, int b) {
        int result;
        while (b >= 1) {
            b=b-1;
            result = a * usAl(a, b);
            return result;
        }
        if (b < 1) {
            return 1;
        }
        return -1;
    }
}