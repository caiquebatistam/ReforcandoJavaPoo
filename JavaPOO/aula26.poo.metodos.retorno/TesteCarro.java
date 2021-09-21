package aula26.poo.metodos.com.retorno;


public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
		// modo de m�todo, sempre come�a com verbo, por boas praticas
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: "+autonomia);
		System.out.println("A autonomia do carro �: "+van.obterAutonomia());
		
		
	}

}
