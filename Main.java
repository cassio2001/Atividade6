package Atividade6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);    

        System.out.println("Digite o raio do circulo");
        double raio = sc.nextDouble();
        sc.close();

        int b;
        double area  = Math.PI * Math.pow(raio, b = 2);

        System.out.println("A área do circulo é: " + area);


    }   

}
