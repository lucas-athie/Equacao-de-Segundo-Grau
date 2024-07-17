/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equação.de.segundo.grau;
import java.util.Scanner;
/**
 *
 * @author luska
 */
public class EquaçãoDeSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a, b, c, delta, raizD, x1, x2;
        Scanner entrada = new Scanner(System.in);

        //recebendo os valores das entradas
        System.out.println("Entre com o valor do A da equação de segundo grau: ");
        a = entrada.nextFloat();

        System.out.println("Entre com o valor do B da equação de segundo grau: ");
        b = entrada.nextFloat();

        System.out.println("Entre com o valor do C da equação de segundo grau: ");
        c = entrada.nextFloat();

        
        //verificando se a equação é valida
        if (a != 0) {

            delta = b * b - 4 * a * c;

            //verificando se o delta é negativo e fazendo o calculo
            if (delta >= 0) {
                raizD = (float) Math.sqrt(delta);
                x1 = (-b + raizD) / (2 * a);
                x2 = (-b - raizD) / (2 * a);
                System.out.printf("As raízes da sua equação são: %.2f e %.2f", x1, x2);
            } else {
                System.out.println("A equação não possui raízes reais.");
            }

        //caso o A não cumpra a condição de ser diferente de 0, ele sai do código e informa o usuário
        } else {
            System.out.println("Equação inexistente, A não pode ser igual a 0");
        }

        
        
      
        // TODO code application logic here
    }
    
}
