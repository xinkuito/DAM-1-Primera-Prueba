package modelo;

public class Calculadora {

	private long num1; 
	private long num2;

	public Calculadora (long a, long b){
		num1=a;
		num2=b;
	}
	public long suma() {
		long result = num1 + num2;
		return result;
	}
	public long resta(){
		long result = num1 - num2;
		return result;
	}
	public long multiplica(){
		long result = num1 * num2;
		return result;
	}
	public long divide(){
		long result;
		if (num2 == 0)
			throw new java.lang.ArithmeticException("Divisi�n por cero");
		else
			result = num1 / num2;
		
			return result;
	}
	
	
	
	
	
	
	}

