package java101;

public class C23_HarmonikSeri {
    public static void main(String[] args) {

        int n=5;
        double sum=0;

        for (double i = 1; i <=n ; i++) {

            sum+=1/i;

        }

        System.out.printf("%.2f",sum);
    }
}
