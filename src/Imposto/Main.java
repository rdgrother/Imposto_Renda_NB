package Imposto;
// Autor Rodrigo Rother
import java.util.Scanner;
public class Main {
    
   public static void main(String[]args){
       
   Scanner ler = new Scanner(System.in); // Entrada de teclado
   System.out.println("\f"); // Usado para limpar o resultado anterior para o próximo teste
   
   Salario S = new Salario();
   
   //Criando atributos
   
   double salario;
   double minimo;
   String resultado;
      
   System.out.println ("Digite o valor do seu salário atual: ");
    salario = ler.nextDouble();
    
   System.out.println ("Digite o valor do salário minimo atual: ");
    minimo = ler.nextDouble();
    
    resultado = S.calcula(salario, minimo);
    
    //Desenvolvimento if e else if
   
   
    System.out.println("Resultado: " + resultado);
    }  
    
}
