package aula27.poo.metodos.com.parametros.labs;

public class Conta {
	
	    String numero;
	    String agencia;
	    boolean especial;
	    double limiteEspecial;
	    double saldo;
	    
	    boolean realizarSaque(double quantiaASacar)
	    {
	        //tem saldo na conta? entao
	        if (saldo >= quantiaASacar)
	        {
	        	// saldo recebe oq ele tem - a quantia a sacar
	            saldo -= quantiaASacar; 
	            return true;
	        } 
	        else 
	        { //não tem saldo na conta? entao
	            if (especial) 
	            {
	                //verificar se o limite especial tem saldo
	                double limite = limiteEspecial + saldo;
	                if (limite >= quantiaASacar)
	                {
	                    saldo -= quantiaASacar;
	                    return true;
	                } 
	                else
	                {
	                    return false;
	                }
	            }
	            else 
	            {
	                return false; //não é especial e não tem saldo suficiente
	            }
	       
	        }    
	    }
	    
	    void depositar(double valorDepositado)
	    {
	        
	        saldo += valorDepositado;
	    }
	    
	    void consultarSaldo()
	    {
	        System.out.println("Saldo atual da conta = " + saldo); 
	    }
	    
	    boolean verificarUsoChequeEspecial()
	    {
	        return saldo < 0;
	    }

}
