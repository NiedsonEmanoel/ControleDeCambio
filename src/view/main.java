package view;
import static view.comandos.Iniciais.*;
import static view.comandos.Calculos.*;

public class Main {
    public static void main(String[] args) {
        Iniciar(); // NÃO REMOVER O MÉTODO INICIAR.
        
        System.out.println(
            "25 Dólares em reais: "+ConverterDolarParaReal(25)+
            "\n60 reais em dólar: "+ConverterRealParaDolar(60)
        );
    }
}
   

