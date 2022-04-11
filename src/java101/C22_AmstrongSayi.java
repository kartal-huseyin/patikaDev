package java101;
import java.util.Scanner;
public class C22_AmstrongSayi {

    /*Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();


        System.out.println("Is "+sayi+" Amstrong number? "+isAmstrong(sayi,(basamakBul(sayi))));



    }

    public static boolean isAmstrong(int sayi, int basamak) {
        int toplam=0;

        int kontrol=sayi;
        while(sayi!=0){
            int carpim=1;
            for (int i = 0; i <basamak ; i++) {
                carpim*=sayi%10;
            }

           toplam+=carpim;
            sayi/=10;
        }
        if(toplam==kontrol) return true;
        return false;


    }

    public static int basamakBul(int num) {
        if(num==0) return 1;
        int sayac=0;
        while(num!=0){
            sayac++;
            num/=10;
        }
        return sayac;
    }

}

