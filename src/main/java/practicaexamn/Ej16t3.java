package practicaexamn;

import java.util.Scanner;

public class Ej16t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Introduzca 3 numeros diferentes separados por espacios");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Numeros incorrectos");
        } else if (n1 == n3) {
            System.out.println("Numeros incorrectos");
        } else if (n2 == n3) {
            System.out.println("Numeros incorrectos");
        } else {
            if (n1 > n2) {
                if (n2 > n3) {//caso 123
                    System.out.println(n1 + " " + n2 + " " + n3);
                }
                if (n3 > n2) {
                    if (n1 > n3) {//caso 132
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }
                    if (n3 > n1) {//caso 312
                        System.out.println(n3 + " " + n1 + " " + n2);
                    }
                }
            } else if (n2 > n1) {
                if (n1 > n3) {//caso 213
                    System.out.println(n2 + " " + n1 + " " + n3);
                }
                if (n3 > n1) {
                    if (n2 > n3) {//caso 231
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }
                    if (n3 > n2) {//caso 321
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
            }
        }

    }
}
