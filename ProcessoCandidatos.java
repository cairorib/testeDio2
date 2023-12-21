package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoCandidatos {
	public static void main(String[] args) {
		//System.out.println("Processo Selecionando Candidatos");
		//selecaoCandidatos();
		//imprimirSelecionados();
		String [] candidatos = {"Felipe", "Marcia", "Julia"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
		
		
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("contato realizado com sucesso");
			}
		}while(continuarTentando && tentativasRealizadas<3);
		if(atendeu) {
			System.out.println("conseguimos contato "+candidato+ "na tentativa"+tentativasRealizadas);
		}else {
			System.out.println("nao conseguimos contato com o candidato"+candidato+ "em tentativas de contato"+tentativasRealizadas);
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia"};
		System.out.println("Imprimindo lista de candidatos com índice");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("o candidato é: "+ indice + " = " + candidatos[indice]);
		}
		
		//FOREACH
		
		for(String candidato:candidatos) {
			System.out.println("o candidato é>>>: "+candidato);
		}
	}
	
	
	static void selecaoCandidatos() {
		String[] candidatos = {
					"Felipe",
					"Marcia",
					"Julia",
					"AAAFelipe",
					"BBB1Marcia",
					"CCCJulia",
					"DDDFelipe",
					"EEEMarcia",
					"FFFFJulia",
					"GGGSilva"
		};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("candidato: "+ candidato + " salario pretendido: "+ salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("candidato: "+candidato+" selecionado para vaga!");
				candidatosSelecionados++;	
			}
			candidatoAtual++;
			
		}
		 
	}
	//simular um salario pretendido de candidato
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contraproposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
