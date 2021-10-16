import java.util.Scanner;

public class Exercicio_prefeitura {

	public static void main(String[] args) {
		
		double mediaSalario = 0.0;
		double numeroFilhos = 0.0;
		double maiorSalario = 0.0;
		double salario = 0.0;
		double totalSalario = 0.0;
		double totalFilhos = 0.0;
		double salariobaixo = 0.0;
		int pessoas = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			  System.out.println("Digite seu salario: ");
			  salario = entrada.nextDouble();
			  totalSalario += salario;
			  
			  System.out.println("Digite o numero de filhos: ");
			  numeroFilhos = entrada.nextDouble();
			  totalFilhos += numeroFilhos;
			  
			  if(salario > maiorSalario) {
				  maiorSalario += salario;
			  }
			  
			  if(salario <= 100) {
				  pessoas  += 1 ;
			}
		
	}
		
		double percentualSalario = (salariobaixo/20)*100;  
		System.out.println("O percentual de pessoas que recebem abaixo de 100 é : " + (pessoas/20)*100 );
		System.out.println("A média salarial é de :" + (totalSalario/20));
		System.out.println("A media de filhos é " + (totalFilhos/20));
}
}
