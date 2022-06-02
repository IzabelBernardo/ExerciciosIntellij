import java.util.Scanner;

public class Media {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A, B, PROD;
            System.out.println("Digite um número: ");
            A = sc.nextInt();
            System.out.println("Digite outro número: ");
            B = sc.nextInt();

            PROD =  (A + B) / 2 ;

            System.out.println("PROD = " +   PROD  );

            sc.close();

        }
    }
