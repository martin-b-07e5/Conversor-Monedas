package com.alura.conversormoneda;

import com.alura.conversormoneda.model.ExchangeRate;
import com.alura.conversormoneda.util.FetchUtil;
import com.alura.conversormoneda.util.ParserUtil;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String url = "https://v6.exchangerate-api.com/v6/c514f91e9d52f274a3bc80f8/latest/USD";

    // Llamamos a la API una vez y obtenemos el objeto ExchangeRate
    String json = FetchUtil.fetchExchangeRate(url);
    ExchangeRate exchangeRate = ParserUtil.parseData(json);

    // Iniciamos el bucle while
    int opcion = 0;
    while (opcion != 7) {
      System.out.println("""
          \n****************************************
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
      opcion = scanner.nextInt();

      if (opcion == 7) {
        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
        break;
      }

      System.out.println("Ingrese el valor que deseas convertir: ");
      double valor = scanner.nextDouble();

      switch (opcion) {
        case 1 -> {
          double tasaPesoArgentino = exchangeRate.getConversion_rates().get("ARS");
          double valorConvertido = valor * tasaPesoArgentino;
          System.out.printf("El valor %.2f [U$D] corresponde al valor final de =>>> %.2f [AR$]\n", valor, valorConvertido);
        }
        case 2 -> {
          double tasaRealBrasileno = exchangeRate.getConversion_rates().get("BRL");
          double valorConvertido = valor * tasaRealBrasileno;
          System.out.printf("El valor %.2f [U$D] corresponde al valor final de =>>> %.2f [R$]\n", valor, valorConvertido);
        }
        case 3 -> {
          double tasaPesoColombiano = exchangeRate.getConversion_rates().get("COP");
          double valorConvertido = valor * tasaPesoColombiano;
          System.out.printf("El valor %.2f [U$D] corresponde al valor final de =>>> %.2f [COP]\n", valor, valorConvertido);
        }
        case 4 -> {
          double tasaPesoArgentino = exchangeRate.getConversion_rates().get("ARS");
          double valorConvertido = valor / tasaPesoArgentino;
          System.out.printf("El valor %.2f [AR$] corresponde al valor final de =>>> %.2f [U$D]\n", valor, valorConvertido);
        }
        case 5 -> {
          double tasaRealBrasileno = exchangeRate.getConversion_rates().get("BRL");
          double valorConvertido = valor / tasaRealBrasileno;
          System.out.printf("El valor %.2f [R$] corresponde al valor final de =>>> %.2f [U$D]\n", valor, valorConvertido);
        }
        case 6 -> {
          double tasaPesoColombiano = exchangeRate.getConversion_rates().get("COP");
          double valorConvertido = valor / tasaPesoColombiano;
          System.out.printf("El valor %.2f [COP] corresponde al valor final de =>>> %.2f [U$D]\n", valor, valorConvertido);
        }
        default -> System.out.println("Opción no válida. Intente nuevamente.");
      }

    }

    // Ejemplo de uso: obtener la tasa de cambio para ARS (Peso Argentino)
//    double tasaPesoArgentino = exchangeRate.getConversion_rates().get("ARS");
//    System.out.println("Tasa de cambio Dólar => Peso Argentino: " + tasaPesoArgentino);
  }
}
