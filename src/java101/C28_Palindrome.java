package java101;
import java.util.Scanner;
import static java101.C22_AmstrongSayi.basamakBul;

public class C28_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi =scanner.nextInt();

        int basamak=basamakBul(sayi);

        int count=0;
        int[] arr=new int[basamak];

        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]=sayi%10;
            sayi/=10;

        }

        for (int i = 0; i <=(basamak-1)/2 ; i++) {

            if(arr[i]==arr[arr.length-1-i]){

            }else{
                System.out.println("Sayı palindrome değildir.");
                return;
            }
        }
            System.out.println("Sayı palindrome'dur");

    }
}
