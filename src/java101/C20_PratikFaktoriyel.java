package java101;

public class C20_PratikFaktoriyel {
    /*Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/

    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 3;

        System.out.println(faktoriyelAl(sayi1)/(faktoriyelAl(sayi2) * (faktoriyelAl(sayi1 - sayi2))));


    }

    public static int faktoriyelAl(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
