import java.util.Scanner;

public class ComposicaoUtil {

	private static final Scanner sc = new Scanner(System.in);
	
	
	
	

	public void txt(String msg) {
		System.out.println(msg);

	}

	public void selecao_txt(String msg) {
		System.out.println("Voc� selecinou a fun��o de " + msg);

	}

	public void selecao_txt_SIM_OU_NAO() {
		System.out.println(
				"Digite \n " + " SIM - Para continuar seus calculos. \n " + " NAO - Para encerrar a calculadora. \n ");

	}

	public void opcoes_input() {
		String input = sc.nextLine();
		
		if (input.equalsIgnoreCase("SIM")) {

			double numeros[] = new double[2];
			for (int i = 0; i < numeros.length; i++) {
				while (true) {
					try {
						txt("Digite o " + (i + 1) + "� valor: ");
						numeros[i] = Double.parseDouble(sc.nextLine());
						break;
					} catch (NumberFormatException e) {
						txt("Voc� n�o digitou um n�mero v�lido");
					}
				}
			}
		}

	}
}
