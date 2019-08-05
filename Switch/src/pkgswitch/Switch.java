
package pkgswitch;

import java.util.Scanner;


public class Switch {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
     System.out.println("Informe a operação:");
     System.out.println ("s - soma");
     System.out.println ("b - subtração");
     System.out.println ("m - multiplicação");
     System.out.println ("d - divisão");
     char opcao = leia.next().charAt(0);
     
     String aux = "";
     System.out.println ("Informe o número");
     aux = leia.next();
     
     double num1 = Double.parseDouble(aux);
     
     System.out.println ("Informe o número 2");
     aux = leia.next();
     double num2 = Double.parseDouble(aux);
        
     double resultado = 0;
    switch (opcao) {    
     case 's':
        System.out.println ("Você escolheu soma");
        resultado = num1 + num2;
        break;
        
     case 'b':
        System.out.println ("Você escolheu subtração");
        resultado = num1 - num2;
        break;
        
     case 'm':
        System.out.println ("Você escolheu multiplicação");
        resultado = num1 * num2;
        break;
        
     case 'd':
        System.out.println ("Você escolheu divisão");
        resultado = num1 / num2;
        break;
     default:
         System.out.println ("Oção Inválida");
       break;
       
      
               
        
    } 
       System.out.println ("O resultado da Operação é: "+resultado); 
    }
    
}
