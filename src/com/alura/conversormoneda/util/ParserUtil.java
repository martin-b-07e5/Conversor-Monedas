package com.alura.conversormoneda.util;

import com.alura.conversormoneda.model.ExchangeRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ParserUtil {

  public static ExchangeRate parseData(String json) {
    Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();

    return gson.fromJson(json, ExchangeRate.class); // Deserialize the JSON to a ExchangeRate object
  }

}
