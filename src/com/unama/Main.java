package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double raio;
        double perimetro;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio");
        raio = sc.nextDouble();
        area = (3.14 * raio * 2);
        System.out.println("O valor da area é igual a" + area);
        perimetro = (3.14 * raio * 2);
        System.out.println("O valor do perimetro é igual a" + perimetro);

    }
}
