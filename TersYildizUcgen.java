import java.util.Scanner;

/**
 * TersYildizUcgen
 */
public class TersYildizUcgen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("basamak sayısı giriniz: ");
        int n = scan.nextInt();
        int k = n;
        for(int i = 0; i < n; i++){
            

            for(int j = 1; j < 2 * k ; j++){
                System.out.print("*");
            }
            k--;
            System.out.println();
            for(int l = 0; l < i+1;l++){
                System.out.print(" ");
            }
            
        }
    }
}