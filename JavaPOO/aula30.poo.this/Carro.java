package aula30.poo.palavra.chavethis;

public class Carro {

	// atributos da classe
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// construtor
	
	Carro(String marca,String modelo,int numPassageiros, double capCombustivel, double consumoCombustivel)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 par�metros");
	}

	public Carro(String marca, String modelo) 
	{
		this(marca,modelo,10);
		System.out.println("Chamando o construtor com 2 par�metros");
	}
	// cria��o dos m�todos
	void exibirAutonomia()
	{
		System.out.println(" O m�todo exibirAutonomia com void foi chamado. ");
		System.out.println("A autonomia do carro �: "+ this.capCombustivel * this.consumoCombustivel + "km");
	}
	
	double obterAutonomia()
	{
		System.out.println("M�todo obterAutonomia com return foi chamado. ");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km)
	{
		double qtdCombustivel = km/this.consumoCombustivel;
		return qtdCombustivel;
	}
	
	
	
	
}
