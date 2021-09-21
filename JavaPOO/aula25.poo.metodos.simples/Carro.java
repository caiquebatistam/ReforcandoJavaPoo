package aula25.poo.metodos.simples;

public class Carro {
	
	// atributos da classe
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// criação dos métodos
	
	void exibirAutonomia()
	{
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	}
}
