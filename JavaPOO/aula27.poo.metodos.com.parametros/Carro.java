package aula27.poo.metodos.com.parametros;

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
