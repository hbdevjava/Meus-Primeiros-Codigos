package OO.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa( String nome, String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}

	
	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() { // LER
		return idade;
	}

	public void setIdade(int idade) { // ALTERA
		if (idade >= 18 && idade <= 50) {

			this.idade = idade;

		}
	}
		
	
	@Override
	public String toString() {
		
		return "Oi meu nome é " + getNome() + " e tenho " + getIdade() + " anos";
	 
	}

}
