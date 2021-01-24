package view.comandos;

import model.dados.bdMoedas;

public class Calculos {
    public static double AdicionarPorcentagem(double valor, double adicionar){
        return (
            valor+(
                (valor/100)*adicionar // ADICIONAR -> PORCENTAGEM DEFINIDA PELO USER
            )
        );
    }
    
    public static double RemoverPorcentagem(double valor, double adicionar){
        return (
            valor-(
                (valor/100)*adicionar // ADICIONAR -> PORCENTAGEM DEFINIDA PELO USER
            )
        );
    }
    
    public static double ConverterRealParaDolar(double r){
        double real = r, cotD;
        cotD = real / AdicionarPorcentagem(bdMoedas.DOLAR.getCotacao(),4);
        return cotD;
        //4% de ÁGIO EM CIMA DO VALOR ORIGINAL
    }
    
    public static double ConverterRealParaEuro(double r){
        double real = r, cotE;
        cotE = real / AdicionarPorcentagem(bdMoedas.EURO.getCotacao(),4);
        return cotE;
    }
    
    public static double ConverterRealParaLibra(double r){
        double real = r, cotL;
        cotL = real / AdicionarPorcentagem(bdMoedas.LIBRA.getCotacao(),4);
        return cotL;
    }
    
    public static double ConverterRealParaPeso(double r){
        double real = r, cotP;
        cotP = real / AdicionarPorcentagem(bdMoedas.PESO.getCotacao(),4);
        return cotP;
    }
    //------------------------------------------------------------------------//
    public static double ConverterDolarParaReal(double d) {
        double cot = d*bdMoedas.DOLAR.getCotacao();
        return RemoverPorcentagem(cot,4);
    }
    
    public static double ConverterEuroParaReal(double e) {
        double cot = e*bdMoedas.EURO.getCotacao();
        return RemoverPorcentagem(cot,4);
    }
    
    public static double ConverterLibraParaReal(double e) {
        double cot = e*bdMoedas.LIBRA.getCotacao();
        return RemoverPorcentagem(cot,4);
    }
    
     public static double ConverterPesoParaReal(double e) {
        double cot = e*bdMoedas.PESO.getCotacao();
        return RemoverPorcentagem(cot,4);
    }
}
