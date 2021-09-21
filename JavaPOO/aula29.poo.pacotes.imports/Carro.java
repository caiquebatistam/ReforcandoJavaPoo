package aula29.poo.construtores;

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
		marca = marca;
		modelo = modelo;
		numPassageiros = numPassageiros;
		capCombustivel = consumoCombustivel;
	}
	
	public Carro() 
	{
	
	}


	// criação dos métodos

	void exibirAutonomia()
	{
		System.out.println(" O método exibirAutonomia com void foi chamado. ");
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia()
	{
		System.out.println("Método obterAutonomia com return foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km)
	{
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	
	
	
}
