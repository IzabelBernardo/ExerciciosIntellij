
/*Faça um programa que alcule o fatorial de um número inteiro fornecido pelo usuário.
* EX.: 5!= 120 (5 x 4 x 3 x 2 x 1) */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int mutiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for (int i = fatorial; i >= 1; i --){
            mutiplicacao = mutiplicacao * i;
        }
        System.out.println(mutiplicacao);

    }


}
