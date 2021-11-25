import java.util.Scanner;

public class funcoes_calc {

	private static final Scanner sc = new Scanner(System.in);
	private ComposicaoUtil util;

	public funcoes_calc() {
		this.util = new ComposicaoUtil();
	}

	public void Soma() {
		this.util.selecao_txt("SOMA!");
		this.util.selecao_txt_SIM_OU_NAO();
		String opcao_1 = sc.nextLine();

		if (opcao_1.equalsIgnoreCase("SIM")) {

			double numeros[] = new double[2];
			for (int i = 0; i < numeros.length; i++) {
				while (true) {
					try {
						this.util.txt("Digite o " + (i + 1) + "� valor: ");
						numeros[i] = Double.parseDouble(sc.nextLine());
						break;
					} catch (NumberFormatException e) {
						this.util.txt("Voc� n�o digitou um n�mero v�lido");
					}
				}
			}

			double resultado = numeros[0] + numeros[1];

			this.util.txt("A soma � " + resultado);

		} else if (opcao_1.equalsIgnoreCase("NAO")) {
			this.util.txt("Encerrando a calculadora..");
			System.exit(0);
		} else {
			this.util.txt("Voc� digitou algo errado !!! Preste mais aten��o !");
			Soma();
		}

	}

	public void Subtracao() {

		this.util.selecao_txt("SUBTRA��O!");

		this.util.selecao_txt_SIM_OU_NAO();
		String opcao_1 = sc.nextLine();

		if (opcao_1.equalsIgnoreCase("SIM")) {

			double numeros[] = new double[2];
			for (int i = 0; i < numeros.length; i++) {
				while (true) {
					try {
						System.out.println("Digite o " + (i + 1) + "� valor: ");
						numeros[i] = Double.parseDouble(sc.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Voc� n�o digitou um n�mero v�lido");
					}
				}
			}

			double resultado = numeros[0] - numeros[1];

			this.util.txt("A subtracao � " + resultado);

		} else if (opcao_1.equalsIgnoreCase("NAO")) {
			this.util.txt("Encerrando a calculadora..");
			System.exit(0);
		} else {
			this.util.txt("Voc� digitou algo errado !!! Preste mais aten��o !");
			Subtracao();
		}

	}

	public void Divisao() {

		this.util.selecao_txt("DIVIS�O!");

		this.util.selecao_txt_SIM_OU_NAO();
		String opcao_1 = sc.nextLine();

		if (opcao_1.equalsIgnoreCase("SIM")) {

			double numeros[] = new double[2];
			for (int i = 0; i < numeros.length; i++) {
				while (true) {
					try {
						System.out.println("Digite o " + (i + 1) + "� valor: ");
						numeros[i] = Double.parseDouble(sc.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("Voc� n�o digitou um n�mero v�lido");
					}
				}
			}

			double resultado = numeros[0] / numeros[1];

			this.util.txt("A divis�o � " + resultado);

		} else if (opcao_1.equalsIgnoreCase("NAO")) {
			this.util.txt("Encerrando a calculadora..");
			System.exit(0);
		} else {
			this.util.txt("Voc� digitou algo errado !!! Preste mais aten��o !");
			Divisao();
		}

	}

	public void Multiplicacao() {
		this.util.selecao_txt("MULTIPLICAO!");
		this.util.selecao_txt_SIM_OU_NAO();
		String opcao_1 = sc.nextLine();

		if (opcao_1.equalsIgnoreCase("SIM")) {

			double numeros[] = new double[2];
			for (int i = 0; i < numeros.length; i++) {
				while (true) {
					try {
						this.util.txt("Digite o " + (i + 1) + "� valor: ");
						numeros[i] = Double.parseDouble(sc.nextLine());
						break;
					} catch (NumberFormatException e) {
						this.util.txt("Voc� n�o digitou um n�mero v�lido");
					}
				}
			}

			double resultado = numeros[0] - numeros[1];

			this.util.txt("A multiplica��o � " + resultado);

		} else if (opcao_1.equalsIgnoreCase("NAO")) {
			this.util.txt("Encerrando a calculadora..");
			System.exit(0);
		} else {
			this.util.txt("Voc� digitou algo errado !!! Preste mais aten��o !");
			Multiplicacao();
		}

	}
}
