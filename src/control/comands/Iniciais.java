package control.comands;
import control.API;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;
import model.dados.bdMoedas;
import static control.comands.objects.*;
import static control.comands.Calculos.*;

public class Iniciais {
    public final static void Iniciar() throws ParseException {
        API.RequisitarTODAS_AS_MOEDAS();
        escreverMenu();
        programa();
    }
    
    public static void escreverMenu(){
        System.out.print(
        "\n[1] - CONVERTER REAL PARA OUTRA MOEDA\n"+ 
        "[2] - CONVERTER OUTRA MOEDA PARA REAL\n"+
        "[3] - CONVERTER ENTRE OUTRAS MOEDAS\n"+
                "[4] - VER COTAÇÕES \n"+
        "[0] - SAIR\n"
        + "-:"        
        );
    }
    
    public static String returName(int i) {
        switch(i) {
            case 1: {return(bdMoedas.DOLAR.toString());}
            case 2: {return(bdMoedas.LIBRA.toString());}
            case 3: {return(bdMoedas.EURO.toString());}
            case 4: {return(bdMoedas.PESO.toString());}
        }
        return "";
    }
    
    public static String returCode(int i) {
        switch(i) {
            case 1: {return(bdMoedas.DOLAR.getCode());}
            case 2: {return(bdMoedas.LIBRA.getCode());}
            case 3: {return(bdMoedas.EURO.getCode());}
            case 4: {return(bdMoedas.PESO.getCode());}
        }
        return "";
    }
    
    public static double returCot(int i) {
        switch(i) {
            case 1: {return(bdMoedas.DOLAR.getCotacao());}
            case 2: {return(bdMoedas.LIBRA.getCotacao());}
            case 3: {return(bdMoedas.EURO.getCotacao());}
            case 4: {return(bdMoedas.PESO.getCotacao());}
        }
        return 0;
    }
    
    public static String returDat(int i) throws ParseException {
        switch(i) {
            case 1: {return(bdMoedas.DOLAR.getData());}
            case 2: {return(bdMoedas.LIBRA.getData());}
            case 3: {return(bdMoedas.EURO.getData());}
            case 4: {return(bdMoedas.PESO.getData());}
        }
        return "";
    }
    
    public static void programa() throws ParseException {
        int condicao = Entrada.nextInt();

        while (condicao != 0) {
            if (condicao == 1) {
                System.out.println("Digite o valor em reais a ser convertido.");
                double reais = Entrada.nextDouble();
                System.out.println("\nVocê quer converter para qual moeda?\n[1]USD\n[2]GBP\n[3]EUR\n[4]ARS");
                int choice = Entrada.nextInt();
                if (choice == 1) {
                    System.out.println("Seu valor em " + returName(choice) + " -4% de taxa ficou: " + DoubleDecimal.format(ConverterRealParaDolar(reais))+"$ USD");
                } else if (choice == 2) {
                    System.out.println("Seu valor em " + returName(choice) + " -4% de taxa ficou: " + DoubleDecimal.format(ConverterRealParaLibra(reais))+"$ GBP");
                } else if (choice == 3) {
                    System.out.println("Seu valor em " + returName(choice) + " -4% de taxa ficou: " + DoubleDecimal.format(ConverterRealParaEuro(reais))+"$ EUR");
                } else if (choice == 4) {
                    System.out.println("Seu valor em " + returName(choice) + " -4% de taxa ficou: " + DoubleDecimal.format(ConverterRealParaPeso(reais))+"$ ARS");
                } else {
                    System.out.println("Opção inválida");
                }
                escreverMenu();
                condicao = Entrada.nextInt();
            }
            
            else if(condicao == 2) {
                System.out.println("\nVocê está com qual moeda?\n[1]USD\n[2]GBP\n[3]EUR\n[4]ARS"); 
                int choice = Entrada.nextInt();
                System.out.println("Quantos "+returCode(choice)+" você vai querer converter para Real(BRL)?");
                double value = Entrada.nextDouble();
                
                if (choice == 1) {
                   System.out.println("Seu valor em reais -4% de taxa ficou: "+DoubleDecimal.format(ConverterDolarParaReal(value))+"R$ BRL");
                } else if (choice == 2) {
                    System.out.println("Seu valor em reais -4% de taxa ficou: "+DoubleDecimal.format(ConverterLibraParaReal(value))+"R$ BRL");
                } else if (choice == 3) {
                    System.out.println("Seu valor em reais -4% de taxa ficou: "+DoubleDecimal.format(ConverterEuroParaReal(value))+"R$ BRL");
                } else if (choice == 4) {
                    System.out.println("Seu valor em reais -4% de taxa ficou: "+DoubleDecimal.format(ConverterPesoParaReal(value))+"R$ BRL");
                } else {
                    System.out.println("Opção inválida");
                }
                escreverMenu();
                condicao = Entrada.nextInt();
            }
            
            else if (condicao == 4) {
                System.out.println("");
                for (int i = 1; i <= 4; i++) {
                    System.out.println("Cotação "+returName(i)+"\n"
                            + "Dia "+returDat(i)+" - "+returCot(i)+" BRL\n"
                    );
                }
                escreverMenu();
                condicao = Entrada.nextInt();
            }
            
            else if (condicao == 3) {
                System.out.println("\nVocê está com qual moeda?\n[1]USD\n[2]GBP\n[3]EUR\n[4]ARS"); 
                int choiceA = Entrada.nextInt();
                System.out.println("\nPara qual você quer converter?\n[1]USD\n[2]GBP\n[3]EUR\n[4]ARS"); 
                int choiceB = Entrada.nextInt();
                System.out.println("Quanto você quer converter?");
                double conv = Entrada.nextDouble();
                
                
                if ((choiceA == 1)&&(choiceB == 1)) {
                    double aux = ConverterDolarParaReal(conv);
                    aux = ConverterRealParaDolar(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 1)&&(choiceB == 2)) {
                    double aux = ConverterDolarParaReal(conv);
                    aux = ConverterRealParaLibra(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 1)&&(choiceB == 3)) {
                    double aux = ConverterDolarParaReal(conv);
                    aux = ConverterRealParaEuro(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 1)&&(choiceB == 4)) {
                    double aux = ConverterDolarParaReal(conv);
                    aux = ConverterRealParaPeso(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                
                if ((choiceA == 2)&&(choiceB == 1)) {
                    double aux = ConverterLibraParaReal(conv);
                    aux = ConverterRealParaDolar(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 2)&&(choiceB == 2)) {
                    double aux = ConverterLibraParaReal(conv);
                    aux = ConverterRealParaLibra(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 2)&&(choiceB == 3)) {
                    double aux = ConverterLibraParaReal(conv);
                    aux = ConverterRealParaEuro(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 2)&&(choiceB == 4)) {
                    double aux = ConverterLibraParaReal(conv);
                    aux = ConverterRealParaPeso(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                
                if ((choiceA == 3)&&(choiceB == 1)) {
                    double aux = ConverterEuroParaReal(conv);
                    aux = ConverterRealParaDolar(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 3)&&(choiceB == 2)) {
                    double aux = ConverterEuroParaReal(conv);
                    aux = ConverterRealParaLibra(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 3)&&(choiceB == 3)) {
                    double aux = ConverterEuroParaReal(conv);
                    aux = ConverterRealParaEuro(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 3)&&(choiceB == 4)) {
                    double aux = ConverterEuroParaReal(conv);
                    aux = ConverterRealParaPeso(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                
                if ((choiceA == 4)&&(choiceB == 1)) {
                    double aux = ConverterPesoParaReal(conv);
                    aux = ConverterRealParaDolar(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 4)&&(choiceB == 2)) {
                    double aux = ConverterPesoParaReal(conv);
                    aux = ConverterRealParaLibra(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 4)&&(choiceB == 3)) {
                    double aux = ConverterPesoParaReal(conv);
                    aux = ConverterRealParaEuro(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                if ((choiceA == 4)&&(choiceB == 4)) {
                    double aux = ConverterPesoParaReal(conv);
                    aux = ConverterRealParaPeso(aux);
                    System.out.println("Seu valor em "+returCode(choiceB)+" -8% de taxa é: "+DoubleDecimal.format(aux));
                }
                
                escreverMenu();
                condicao = Entrada.nextInt();
            }
            
            else {
                condicao = 0;
            }
        }
    }
}

 class objects {
    static Scanner Entrada = new Scanner(System.in);
    static DecimalFormat DoubleDecimal = new DecimalFormat("#,###.00");
}
