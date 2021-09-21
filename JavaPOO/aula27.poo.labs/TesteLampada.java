package aula27.poo.metodos.com.parametros.labs;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada lampada = new Lampada();
		
		// se fosse para ligar ou desligar manualmente
		//lampada.ligada = true;
		//lampada.ligada = false;
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
	}

}
