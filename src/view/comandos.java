package view;
import control.API;
import model.dados.bdMoedas;

public class comandos {
    public static void Iniciar() {
        API.RequisitarTODAS_AS_MOEDAS();
        escreverMenu();
    }
    
    public static void escreverMenu(){
        /*ESTOU AQUI ESPERANDO ALGUM BONITO FAZER O MENU*/
    }
}
