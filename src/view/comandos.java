package view;
import control.API;
import model.dados.bdMoedas;

public class comandos {
    public static void Iniciar() {
        API.RequisitarTODAS_AS_MOEDAS();
        escreverMenu();
        real_p_Dolar();
        real_p_Euro();
        real_p_Libra();
        real_p_Peso();
    }
    
    public static void escreverMenu(){
        
    }
    
    
    
    
    public static double real_p_Dolar(){
        double real = 1, cotD;
        cotD = real * bdMoedas.DOLAR.getCotacao();
        return cotD;
    }
    public static double real_p_Euro(){
        double real = 1, cotE;
        cotE = real * bdMoedas.EURO.getCotacao();
        return cotE;
    }
    public static double real_p_Libra(){
        double real = 1, cotL;
        cotL = real * bdMoedas.LIBRA.getCotacao();
        return cotL;
    }
    public static double real_p_Peso(){
        double real = 1, cotP;
        cotP = real * bdMoedas.PESO.getCotacao();
        return cotP;
    }
}
