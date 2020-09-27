/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imposto;

/**
 *
 * @author rdg
 */
public class Salario {
    
        // aqui nesta classe eu realizo o processamento
    public String calcula(double salario, double minimo){
    String alerta;
    if (salario <= minimo){
    alerta = "Salário Inválido";
    return alerta;
    }
   else if (salario >= minimo && salario <= minimo*2){
       return alerta = "Você ganha de 1 a 2 salários mínimos e está isento do IR";
    }
   else if (salario > minimo*2 && salario <= minimo*3){
        return alerta = "Você ganha mais de 2 e menos que 3 salários mínimos e seu IR será de 15%";
    }
   else if (salario > minimo*3 && salario <= minimo*5){
        return alerta = "Você ganha mais de 3 e menos que 5 salários mínimos e seu IR será de 22,5%";
    }
   else { 
       return alerta = "Você ganha mais que 5 salários mínimos e seu IR será de 27,5%";
   }
    }
   
    }
