package java101;

import java.util.Scanner;
public class C21_UsluSayilar {
    /*Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        int sayi1=scanner.nextInt();
        System.out.println("Üs olacak sayı: ");
        int sayi2=scanner.nextInt();
        int toplam=1;
        for (int i = 0; i <sayi2 ; i++) {
            toplam*=sayi1;
        }

        System.out.println("Cevap: "+toplam);

    }
}
