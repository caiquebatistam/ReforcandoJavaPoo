package aula26.poo.metodos.com.retorno;

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
		System.out.println(" O m�todo exibirAutonomia com void foi chamado. ");
		System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia()
	{
		System.out.println("M�todo obterAutonomia com return foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
	

}
