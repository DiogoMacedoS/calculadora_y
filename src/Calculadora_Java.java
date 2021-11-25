import java.util.Scanner;

public class Calculadora_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		
		Double primeiro_input = sc.nextDouble();

		System.out.println("Digite o segundo numero: ");
		Double segundo_input = sc.nextDouble();

		double Resultado = primeiro_input + segundo_input;

		System.out.println("Resultado da sua soma é de : " + Resultado);
		sc.close();
	}

}
