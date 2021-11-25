import java.util.Scanner;

public class Base_Calculadora extends funcoes_calc {

	private static final Scanner sc = new Scanner(System.in);

	public Base_Calculadora() {
		funcoes_calc funcoes = new funcoes_calc();
		System.out.println("Digite o seu nome: ");
		String nome_user = sc.next();
		System.out.println("Seja bem vindo a calculadora Y : " + nome_user);
		System.out.println("Digite o numero correspondente ao tipo de calculo que deseja ! ");
		System.out.println(" 1 - SOMA");
		System.out.println(" 2 - SUBTRAÇÃO");
		System.out.println(" 3 - DIVISÃO");
		System.out.println(" 4 - MULTIPLICAÇÃO");
		System.out.println(" 5 - ENCERRAR CALCULADORA");
		int num_input = sc.nextInt();
		

		switch (num_input) {
		case 1:

			funcoes.Soma();
			break;
		case 2:

			funcoes.Subtracao();
			break;
		case 3:

			funcoes.Divisao();
			break;
		case 4:

			funcoes.Multiplicacao();
			break;
		case 5:

			System.exit(0);;
			break;
		
			default:	
				System.out.println("Você digitou algo errado ! Tente novamente..");
		}
	}

}
