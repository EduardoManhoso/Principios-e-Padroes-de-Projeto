class Vendedor{
	
	private String nome;
	private String endereco;
	private String email;
	private static Vendedor instancia;
	
	private Vendedor(){
		this.nome = "";
		this.endereco = "";
		this.email = "";
	}
	
	public static Vendedor getInstance(){
		
		if(instancia == null)
			instancia = new Vendedor();
		
		return instancia;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void exibir(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Email: " + this.email);
	}
	
}