import java.util.Scanner;

public class funcoes_calc {

	private static final Scanner sc = new Scanner(System.in);
	private ComposicaoUtil util;
	private static double resultado_total = 0;
	
	public funcoes_calc() {
		this.util = new ComposicaoUtil();
	}
	public void Soma() {

		System.out.println("Você selecinou a função de SOMA !\n");

		this.util.txt("Digite \n " + " SIM - Para continuar SOMANDO. \n " + " NAO - Para encerrar a calculadora. \n ");
		String opcao_1 = sc.nextLine();

		//
		if (opcao_1.equalsIgnoreCase("SIM")) {
			this.util.txt("Digite o primeiro numero: \n");

			Double primeiro_input = sc.nextDouble();
			this.util.txt("Digite o segundo numero: ");
			Double segundo_input = sc.nextDouble();
			resultado_total = primeiro_input + segundo_input;
			this.util.txt("Resultado da sua SOMA é de : " + resultado_total + "\n");

		} else {
			System.out.println("Você digitou algo errado ! ");
		}
		
		
		this.util.txt("Digite \n " + " SIM - Para continuar SOMANDO. \n " + " NAO - Para encerrar a calculadora. \n ");
		String opcao_2= sc.next();
		
		

		if (opcao_2.equalsIgnoreCase("SIM")) {
			while (opcao_2.equalsIgnoreCase("SIM")) {
				this.util.txt("Digite o novo numero: \n");
				Double n3 = sc.nextDouble();
				double resultado = resultado_total + n3;
				this.util.txt("Seu novo resultado é : " + resultado);
				
				this.util.txt("Digite \n " +
				" SAIR - Para encerrar a calculadora. \n " + "" + " SIM - Para continuar SOMANDO.");
				String opcao_3= sc.next();
				
				
					if(opcao_3.equalsIgnoreCase("SIM")) {
						
						
						} else if(opcao_3.equalsIgnoreCase("SAIR")) {
							System.out.println("Calculadora ENCERRADA !");
							System.exit(0);
						}
							else {
								System.out.println("Você digitou algo errado !");
							}

			}
		} else if (opcao_2.equalsIgnoreCase("NÃO")) {
			System.out.println("Calculadora ENCERRADA !");
			System.exit(0);
		}
		
		
		
		
		
		
	}

	public void Subtracao() {
		this.util.txt("Digite o primeiro numero: ");

		Double primeiro_input = sc.nextDouble();

		this.util.txt("Digite o segundo numero: ");
		Double segundo_input = sc.nextDouble();

		double Resultado = primeiro_input - segundo_input;

		this.util.txt("Resultado da sua SUBTRAÇÃO é de : " + Resultado);
		sc.close();

	}

	public void Divisao() {
		this.util.txt("Digite o primeiro numero: ");

		Double primeiro_input = sc.nextDouble();

		this.util.txt("Digite o segundo numero: ");
		Double segundo_input = sc.nextDouble();

		double Resultado = primeiro_input / segundo_input;

		this.util.txt("Resultado da sua DIVISÃO é de : " + Resultado);
		sc.close();

	}

	public void Multiplicacao() {
		this.util.txt("Digite o primeiro numero: ");

		Double primeiro_input = sc.nextDouble();

		this.util.txt("Digite o segundo numero: ");
		Double segundo_input = sc.nextDouble();

		double Resultado = primeiro_input * segundo_input;

		this.util.txt("Resultado da sua MULTIPLICAÇÃO é de : " + Resultado);
		sc.close();

	}
}
