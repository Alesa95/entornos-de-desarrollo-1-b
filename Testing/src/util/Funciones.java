package util;

public abstract class Funciones {

	public static int sumatorio(int num) {
		if(num < 0) 
			throw new IllegalArgumentException("El numero debe ser mayor o igual a 0");
		
		int sumatorio = 0;
		
		for(int i = 1; i <= num; i++) {
			sumatorio += i;
		}
		
		return sumatorio;
	}
}
