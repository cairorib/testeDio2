package candidatura;

 import java.util.Scanner;

public class ProjetoDio {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		validarNumero(sc);
		 
	
		}
	static void validarNumero( Scanner sc) {
		System.out.println("informe dois numeros, mas o primeiro deve ser maior que o segundo\n Informe o primeiro numero:");
		int num1 = sc.nextInt();
		System.out.println("ok, agora informe um numero menor que "+ num1);
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println(num1 + " é menor que "+num2+ "\ncorrija a opção");
			validarNumero(sc);
		}else {
			System.out.println("tudo certo");
		}
	 
		
	}

}
