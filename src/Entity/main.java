package Entity;

import java.util.Locale;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
			ContaTerminal contaTerminal = new ContaTerminal();
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Informe o número da conta:");
			contaTerminal.setNumero(scanner.nextInt());
			
			System.out.println("Informe a agência:");
			contaTerminal.setAgencia(scanner.next());
			
			System.out.println("Informe o nome:");
			contaTerminal.setNome(scanner.next());
			
			System.out.println("Informe o sobrenome:");
			contaTerminal.setSobreNome(scanner.next());
			
			System.out.println("Informe o saldo:");
			contaTerminal.setSaldo(scanner.nextDouble());
			
			System.out.println("Olá " + contaTerminal.getNome() + " "+ contaTerminal.getSobreNome() + ", obrigado por criar uma conta em nosso banco, sua agência é "+ contaTerminal.getAgencia() 
										+ ", conta "+  contaTerminal.getNumero() +" e seu saldo "+ contaTerminal.getSaldo()  + " já está disponível para saque");
			
	}

}
