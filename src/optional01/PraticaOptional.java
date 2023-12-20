package optional01;

import java.util.Optional;

public class PraticaOptional {

	public static void main(String[] args) {
		// primeira prática com Classe Optional
		
						//	0			1			2			3
		String[] valores = {"abacaxi", "abacate", "laranja", "acerola"};
		
		//criar estrutura optional vazia
		Optional <String> abacaxi = Optional.empty();
		
		
		//criar estrutura optional com valor
		Optional <String> texto = Optional.of("Olá mundo!");
		
		//criar estrutura optional com valor
		Optional <String> frutas = Optional.of(valores[2]);
		
		System.out.println("Saída do dado do nosso optional fruta: "+frutas);
		
		System.out.println("Agora veremos a fruta escolhida: " + frutas.get());
		
		System.out.println("O optional frutas esta vazio: "+frutas.isEmpty());
		
		System.out.println("O optional abacaxi esta vazio: "+abacaxi.isEmpty());
		
		System.out.println("o optional abacaxi tem informação presente: " + abacaxi.isPresent());
		
		System.out.println("o optional frutas tem informação presente: " + frutas.isPresent());
		
		//lambda

	}

}
