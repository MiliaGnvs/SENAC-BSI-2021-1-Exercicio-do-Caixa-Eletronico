/******************************************************************************
Crie um algoritmo de caixa eletrônico que dispense o menor número de notas para um dado valor solicitado.

Notas disponíveis:

R$ 100,00 R$ 50,00 R$ 20,00 R$ 10,00 R$ 5,00 R$ 2,00 R$ 1,00

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    int[] notasDisponiveis = {100, 50, 20, 10, 5, 2, 1};
	    int[] notasUsadas = {0,0,0,0,0,0,0};
	   
		Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor que deseja retirar: ");
        int valor = leitor.nextInt();
        
           for(int i = 0; i < notasDisponiveis.length; i++)
            {
    			if(valor >= notasDisponiveis[i])
    			{
    				System.out.println( valor/notasDisponiveis[i] + " notas de " + notasDisponiveis[i]);
    				valor = valor % notasDisponiveis[i];
    			}
			
		    }
    }
}
