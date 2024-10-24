package com.alura.conversormoneda;

import com.alura.conversormoneda.util.FetchUtil;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("""
        ****************************************
        Sea bienvenido al Conversor de Moneda =]
        
        1) Dólar =>> Peso argentino
        2) Dólar =>> Real brasileño
        3) Dólar =>> Peso colombiano
        4) Peso argentino =>> Dólar
        5) Real brasileño =>> Dólar
        6) Peso colombiano =>> Dólar
        7) Salir
        Elija una opción válida
        ****************************************""");
    int opcion = scanner.nextInt();

    String url = "https://v6.exchangerate-api.com/v6/c514f91e9d52f274a3bc80f8/latest/USD";

    // Llamamos a los métodos desde las clases utilitarias
    String json = FetchUtil.fetchExchangeRate(url);


  }
}
