package control;

import model.moedas.USD;
import model.moedas.EUR;
import model.moedas.GBP;
import model.moedas.ARS;
import model.dados.bdMoedas;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import model.*;

public final class API {
    
    public static void RequisitarDADOS_USD() {
        try {
            String url = "https://economia.awesomeapi.com.br/USD-BRL";

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            conn.disconnect();
            String exit = output;
            exit = exit.replace("[{", "{");
            String n = exit.replace("}]", "}");

            Gson gson = new Gson();
            bdMoedas.DOLAR = gson.fromJson(new String(n.getBytes()), USD.class);
        } catch (IOException ex) {
            
        } 
    }
    
    public static void RequisitarDADOS_GBP() {
        try {
            String url = "https://economia.awesomeapi.com.br/GBP-BRL";

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            conn.disconnect();
            String exit = output;
            exit = exit.replace("[{", "{");
            String n = exit.replace("}]", "}");

            Gson gson = new Gson();
            bdMoedas.LIBRA = gson.fromJson(new String(n.getBytes()), GBP.class);
        } catch (IOException ex) {
            
        } 
    }
    
    public static void RequisitarDADOS_EUR() {
        try {
            String url = "https://economia.awesomeapi.com.br/EUR-BRL";

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            conn.disconnect();
            String exit = output;
            exit = exit.replace("[{", "{");
            String n = exit.replace("}]", "}");

            Gson gson = new Gson();
            bdMoedas.EURO = gson.fromJson(new String(n.getBytes()), EUR.class);
        } catch (IOException ex) {
            
        } 
    }
    
    public static void RequisitarDADOS_ARS() {
        try {
            String url = "https://economia.awesomeapi.com.br/EUR-BRL";

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            conn.disconnect();
            String exit = output;
            exit = exit.replace("[{", "{");
            String n = exit.replace("}]", "}");

            Gson gson = new Gson();
            bdMoedas.PESO = gson.fromJson(new String(n.getBytes()), ARS.class);
        } catch (IOException ex) {
            
        } 
    }
    
    public static void RequisitarTODAS_AS_MOEDAS() {
        RequisitarDADOS_USD();
        RequisitarDADOS_GBP();
        RequisitarDADOS_ARS();
        RequisitarDADOS_EUR();
    }
    
}
