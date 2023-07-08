package horas_teste;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu salario?");
		
		double A = sc.nextDouble();
		double valor;
		
		if (A <= 2000.0) {
			valor =  0.0;
		}
		else if (A <= 3000.0) {
			valor = (A - 2000.0) * 0.08; 
		}
		else if (A <= 4500.0) {
			valor = (A - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			valor = (A - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (valor == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("Valor do imposto de renda: R$ %.2f%n", valor);
		}
	sc.close();
	}
}
