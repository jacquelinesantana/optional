package optional02;

public class Colaborador {

	//classe para criarmos um objeto colaborador
	
	private Long id; 
	//private long id2;//não tem tratamento null
	private String nome;
	private Float salario;
	
	//metodo construtor
	public Colaborador(Long id, String nome, Float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
