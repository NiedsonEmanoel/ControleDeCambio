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
    
    public static double ConverterRealParaDolar(double r){
        double real = r, cotD;
        cotD = real / bdMoedas.DOLAR.getCotacao();
        return AdicionarPorcentagem(cotD,4); 
        //4% de ÁGIO EM CIMA DO VALOR ORIGINAL
    }
    
    public static double ConverterRealParaEuro(double r){
        double real = r, cotE;
        cotE = real / bdMoedas.EURO.getCotacao();
        return AdicionarPorcentagem(cotE,4);
    }
    
    public static double ConverterRealParaLibra(double r){
        double real = r, cotL;
        cotL = real / bdMoedas.LIBRA.getCotacao();
        return AdicionarPorcentagem(cotL,4);
    }
    
    public static double ConverterRealParaPeso(double r){
        double real = r, cotP;
        cotP = real / bdMoedas.PESO.getCotacao();
        return AdicionarPorcentagem(cotP,4);
    }
    //------------------------------------------------------------------------//
    public static double ConverterDolarParaReal(double d) {
        double cot = d*bdMoedas.DOLAR.getCotacao();
        return AdicionarPorcentagem(cot,4);
    }
    
    public static double ConverterEuroParaReal(double e) {
        double cot = e*bdMoedas.EURO.getCotacao();
        return AdicionarPorcentagem(cot,4);
    }
    
    public static double ConverterLibraParaReal(double e) {
        double cot = e*bdMoedas.LIBRA.getCotacao();
        return AdicionarPorcentagem(cot,4);
    }
    
     public static double ConverterPesoParaReal(double e) {
        double cot = e*bdMoedas.PESO.getCotacao();
        return AdicionarPorcentagem(cot,4);
    }
}
