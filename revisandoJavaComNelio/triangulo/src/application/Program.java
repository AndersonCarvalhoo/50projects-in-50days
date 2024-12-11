package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Dados do primeiro triangulo: ");

    x.a = scan.nextDouble();
    x.b = scan.nextDouble();
    x.c = scan.nextDouble();

    System.out.println("Dados do segundo triangulo: ");
    y.a = scan.nextDouble();
    y.b = scan.nextDouble();
    y.c = scan.nextDouble();

    Double xArea = x.calcularArea();

    Double yArea = y.calcularArea();

    System.out.println("Area do triangulo X: " + xArea);
    System.out.println("Area do triangulo Y: " + yArea);

    if (xArea > yArea) {
      System.out.println("Maior área é do: X");
    } else {
      System.out.println("Maior área é do: Y");
    }

    scan.close();
  }
}
