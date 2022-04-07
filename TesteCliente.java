package POO;

import java.util.Scanner;

public class TesteCliente
{
	public static void main (String args[])
	{	
		int x, primeiroNome, sobrenome, dia, mes, ano;
		
		Scanner in = new Scanner (System.in);
		
		Cliente [] list= new Cliente [3];
		
		System.out.println("\tSeja bem vinde");
		
		for (x=0; x < 3; x++)
{
			System.out.print("\nDigite seu nome: ");
			primeiroNome=in.nextInt(); 
			System.out.print("\nDigite seu sobrenome: ");
			sobrenome=in.nextInt(); 
			System.out.print("\nDigite seu dia de nascimento: ");
			dia=in.nextInt(); 
			System.out.print("\nDigite seu mês de nascimento: ");
			mes=in.nextInt(); 
			System.out.print("\nDigite seu ano de nascimento: ");
			ano=in.nextInt();
			list [x] = new Cliente (nome, sobrenome, dia, mes, ano);
			System.out.println("\n");
		}
		
		for (Cliente wheel:list)
{			
			wheel.imprimir();
			System.out.println("\n");
		}
	}

}
