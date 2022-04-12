package java101;

public class C24_YildizElmas {
    /*
    example of output:
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *

     */

    public static void main(String[] args) {

        String star="*";
        String space=" ";
        int n=5;


        for (int i = 0; i <=n ; i++) {

            for (int j = 0; j <(n-i); j++) {
                System.out.print(space);
            }
            for (int k = 0; k <(2*i+1) ; k++) {
                System.out.print(star);
            }
            System.out.println();
        }

        for (int i = n-1; i>=0 ; i--) {

            for (int j = n-i; j >0; j--) {
                System.out.print(space);
            }
            for (int k = 2*i+1; k >0 ; k--) {
                System.out.print(star);
            }
            System.out.println();
        }





    }
}
