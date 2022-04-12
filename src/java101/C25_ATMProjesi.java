package java101;

import java.util.Scanner;

public class C25_ATMProjesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X Bankasına Hoşgeldiniz.");
        int secim1 = 0;
        int secim2 = 0;
        int bakiye = 1500;

        do{
            try {
                System.out.println("\n1. Para Yatırma\n2. Para Çekme\n3. Bakiye Sorgula\n4. Çıkış\nYapmak istediğiniz işlemi seçiniz:");
                secim1 = scanner.nextInt();
            } catch (Exception e) {
                String hata=scanner.next();
                if(hata != null){
                    System.out.println("Yanlış seçim yaptınız, yeniden deneyiniz.");
                    continue;
                }
            }
            switch (secim1) {
                case 1 -> {
                    System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                    bakiye += scanner.nextInt();
                    System.out.println("Yeni bakiyeniz : " + bakiye);


                    do {
                        System.out.println("Başka bir işlem yapmak ister misiniz?\n1. Evet\n2. Hayır");
                        try {
                            secim2 = scanner.nextInt();
                        } catch (Exception e) {
                            String hata=scanner.next();
                            if(hata != null){
                                System.out.println("Hatalı giriş. Yeniden deneyiniz: ");
                            }
                        }
                    }while(secim2!=1&&secim2!=2);

                    switch (secim2) {

                        case 1:
                            continue;
                        case 2:
                            System.out.println("Teşekkür ederiz, yine bekleriz.");
                            System.exit(-1);
                    }

                }
                case 2 -> {
                    System.out.println("Çekim yapmak istediğiniz tutarı giriniz: ");
                    bakiye -= scanner.nextInt();
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                    do {
                        System.out.println("Başka bir işlem yapmak ister misiniz?\n1. Evet\n2. Hayır");
                        try {
                            secim2 = scanner.nextInt();
                        } catch (Exception e) {
                            String hata=scanner.next();
                            if(hata != null){
                                System.out.println("Hatalı giriş. Yeniden deneyiniz: ");
                            }
                        }
                    }while(secim2!=1&&secim2!=2);
                    switch (secim2) {

                        case 1:
                            continue;
                        case 2:
                            System.out.println("Teşekkür ederiz, yine bekleriz.");
                            System.exit(-1);
                    }
                }
                case 3 -> {
                    System.out.println("Bakiyeniz : " + bakiye);
                    do {
                        System.out.println("Başka bir işlem yapmak ister misiniz?\n1. Evet\n2. Hayır");
                        try {
                            secim2 = scanner.nextInt();
                        } catch (Exception e) {
                            String hata=scanner.next();
                            if(hata != null){
                                System.out.println("Hatalı giriş. Yeniden deneyiniz: ");
                            }
                        }
                    }while(secim2!=1&&secim2!=2);
                    switch (secim2) {

                        case 1:
                            continue;
                        case 2:
                            System.out.println("Teşekkür ederiz, yine bekleriz.");
                            System.exit(-1);
                    }
                }
                case 4 -> System.out.println("Teşekkür ederiz, yine bekleriz.");

            }
        }while (secim1 != 4);
    }
}
