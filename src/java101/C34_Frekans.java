package java101;

public class C34_Frekans {/*Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.*/

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        frekans(dizi);

    }

    public static void frekans(int[] dizi) {
        int[] temp = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int count = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    count++;
                }
            }
            System.out.println(dizi[i] + " sayısı " + count + " kere tekrar edildi.");

        }
    }
}
