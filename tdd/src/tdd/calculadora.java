package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.CubicCurve2D.Double;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


class calculadora {
	float n1;
    float n2;
    String  operacao = "";
// codigo do segundo semestre 
	@Test
	public void test() {
	
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite a operação desejada (+, -, *, /): ");
			operacao = entrada.nextLine();
			
			System.out.println("Digite um valor: ");
			n1 = entrada.nextFloat();
			
			System.out.println("Digite um valor: ");
			n2 = entrada.nextFloat();
			
			int controle = 0;
			float soma = Resultados.soma(n1, n2);
			float divisao= Resultados.divisão(n1, n2);
			float subtracao = Resultados.subtracao(n1, n2);
			float multiplicao = Resultados.multiplicacao(n1, n1);
			
			if(operacao.equals("+")) {
				System.out.println("O resultado da Soma é: " + soma );
				controle ++;			
			}
			
			if(operacao.equals("-")) {
				System.out.println("O resultado da subtração é: " + subtracao);
				controle++;		
			}
			
			if(operacao.equals("*")) {
				System.out.println("O resultado da multiplicação é: " + multiplicao);
				controle++;			
			}
			
			if(operacao.equals("/")) {
				System.out.println("O resultado da divisão é: " + divisao);
				controle++;			
			}
			
			if(controle == 0) {
				System.out.println("Oopração inválida, Tente novamente!");
							
			}		
 }


}
