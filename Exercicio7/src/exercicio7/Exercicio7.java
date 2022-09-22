
package exercicio7;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

   
    public static void main(String[] args) {
        
        double imc, peso, altura;
        
        Scanner read = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#0.00");
        System.out.printf("Informe seu peso:");
        peso = read.nextDouble();
        System.out.printf("Informe sua altura:");
        altura = read.nextDouble();
        imc = peso / (altura*altura);
        
        System.out.println("Seu IMC é: "+format.format(imc));
        
        if(imc <= 18.5){
            System.out.printf("E sua classificacao eh: MAGREZA!");
        } 
        else if(imc > 18.5 == imc <= 24.9){
            System.out.println("E sua classificacao eh: NORMAL!");
        }
        else if(imc >=25 == imc <= 29.9){
            System.out.println("E sua classificacao eh: SOBREPESO!");
        }
        else if(imc >=30 == imc <= 39.9){
            System.out.println("E sua classificacao eh: OBESIDADE!");
        }
        else{
            System.out.println("E sua classificacao eh: OBESIDADE GRAVE!");
        }
        
    }
    
}
