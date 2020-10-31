package employee;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Nome do funcionário: ");
		String name = scan.nextLine();
		System.out.print("Salário Bruto R$: ");
		double grossSalary = scan.nextDouble();
		System.out.print("Imposto R$: ");
		double tax = scan.nextDouble();

		Employee employee = new Employee(name, grossSalary, tax);

		System.out.println(employee);

		System.out.print("Qual porcentagem de aumento do salário do funcionário? ");
		double percentage = scan.nextDouble();

		employee.increaseSalary(percentage);

		System.out.println("Dados atualizados: " + employee);

		scan.close();
	}
}
