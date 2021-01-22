package view.comandos;
import control.API;
import model.dados.bdMoedas;

public class Iniciais {
    public final static void Iniciar() {
        API.RequisitarTODAS_AS_MOEDAS();
        escreverMenu();
    }
    
    public static void escreverMenu(){
        
    }
}
