package aula25.poo.metodos.simples;

public class Carro {
	
	// atributos da classe
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// cria��o dos m�todos
	
	void exibirAutonomia()
	{
		System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + "km");
	}
}
