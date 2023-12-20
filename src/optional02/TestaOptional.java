package optional02;

import java.util.Optional;

public class TestaOptional {

	public static void main(String[] args) {
		// testando a classe colaboradores
		
		//public Colaborador(Long id, String nome, Float salario)
		Colaborador c = new Colaborador(1L, "Jos�", 20000.00f);
		
		//passando o objeto da classe colaborador para o optional
		Optional <Colaborador> colab = Optional.of(c);
		
		//optional. mapeado ( resposta - nome que demos ao colaborador  filter filtrando nome que inicia com J
		String nome = colab.map(resposta -> resposta.getNome())
		.filter(colaboradorNome-> colaboradorNome.startsWith("J"))
		.orElseThrow(()->new RuntimeException("Colaborador n�o encontrado!"));
		
		System.out.println("colaborador encontrado � o: "+ nome);
		

	}

}
