import java.util.Scanner;

public class DoubleHill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; i++) {

            int p = i;   // start number for each row

            // leading spaces
            for(int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // ascending numbers
            for(int j = 1; j < i; j++) {
                System.out.print(p++); 
            }

            // descending numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(p--);
            }

            System.out.println();
        }
    }
}
