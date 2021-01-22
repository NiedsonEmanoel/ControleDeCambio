package view;
import control.API;
import model.dados.bdMoedas;

public class comandos {
    public static void Iniciar() {
        API.RequisitarTODAS_AS_MOEDAS();
        escreverMenu();
    }
    
    public static void escreverMenu(){
        
    }
    
    
    
    
    public static double realpDolar(){
        double real = 1, cotD;
        cotD = real * bdMoedas.DOLAR.getCotacao();
        return cotD;
    }
    public static double realpEuro(){
        double real = 1, cotE;
        cotE = real * bdMoedas.EURO.getCotacao();
        return cotE;
    }
    public static double realpLibra(){
        double real = 1, cotL;
        cotL = real * bdMoedas.LIBRA.getCotacao();
        return cotL;
    }
    public static double realpPeso(){
        double real = 1, cotP;
        cotP = real * bdMoedas.PESO.getCotacao();
        return cotP;
    }
}
