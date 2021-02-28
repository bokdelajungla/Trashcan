package calculadora;

/**
 * Esta clase permite realizar diferentes operaciones de suma:
 * <ul>
 * <li>Suma de dos números reales</li>
 * <li>Suma de dos números enteros</li>
 * <li>Suma de tres números reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * <br>
 * @author Jorge, Alfonso, Estanislao, Rafael
 */

public class Suma {

	//Campos de Clase
	/**
	 * En la variable se almacena el valor del sumatorio de todos los 
	 * números introducidos a través del método sumatorio
	 */
	private double acumulado=0;

	/**
	 * Método que retorna la suma de dos números reales.
	 * <br>Casos especiales:
	 * <ul><li>Si el resultado de la suma excede el valor {@value Double#MAX_VALUE} devolverá
	 * {@value Double#POSITIVE_INFINITY}</li>
	 * <li>Si el resultado de la suma es inferior a {@value Double#MIN_VALUE} devolverá
	 * {@value Double#NEGATIVE_INFINITY}</li>
	 * <li>Si alguno de los parámetros es {@value Double#NaN} el método devolverá
	 * {@value Double#NaN}</li></ul>
	 * 
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 *  
	 */
	public double sumaReales(double sum1, double sum2) {

		return sum1 + sum2;
	}

	/**
	 * Método que retorna la suma de dos números enteros.
	 * <br>Casos especiales:
	 * <ul><li>En el caso en el que la suma sea mayor que {@value Integer#MAX_VALUE} mostrará un 
	 * mensaje de error y devolverá dicho valor.
	 * <ul><li>En el caso en el que la suma sea menor que {@value Integer#MIN_VALUE} mostrará un 
	 * mensaje de error y devolverá dicho valor.
	 * 
	 * @param sum1 Número entero correspondiente con el primer sumando
	 * @param sum2 Número entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 */

	public int sumaEnteros(int sum1, int sum2) {
		//Empleamos un tipo con mayor capacidad para comprobar si hay overflow
		long resultado = (long)sum1 + (long)sum2;
		
		if (resultado > Integer.MAX_VALUE) {
			System.out.println("ERROR: Valor Máximo alcanzado.");
			return Integer.MAX_VALUE;
		}
		else if(resultado < Integer.MIN_VALUE) {
			System.out.println("ERROR: Valor Mínimo alcanzado.");
			return Integer.MIN_VALUE;			
		}
		else {
			return (int)resultado;	
		}
	}

	/**
	 * Método que devuelve la suma de tres números reales.
	 * <br>Casos Especiales:
	 * <ul><li>Si el resultado excediera el valor {@value Double#MAX_VALUE}
	 * devolverá {@value Double#POSITIVE_INFINITY}.</li>
	 * <li>Si el resultado excediera el valor {@value Double#MIN_VALUE}
	 * devolverá {@value Double#NEGATIVE_INFINITY}.</li>
	 * <li>Si alguno de los parámetros es {@value Double#NaN} el método devolverá 
	 * {@value Double#NaN}</li></ul>
	 *  
	 * @param sum1 Número correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @param sum3 Número real correspondiente con el tercer sumando
	 * @return Devuelve la suma de los tres parámetros introducidos.
	 * 
	 */
	public double suma3Reales(double sum1, double sum2, double sum3) {
		return sum1 + sum2 + sum3;
	}
	
	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * <br>Casos Especiales:
	 * <ul><li>Si el resultado excediera el valor {@value Double#MAX_VALUE}
	 * se asignará {@value Double#POSITIVE_INFINITY}.</li>
	 * <li>Si el resultado excediera el valor {@value Double#MIN_VALUE}
	 * se asignará {@value Double#NEGATIVE_INFINITY}.</li>
	 * <li>Si alguno de los parámetros es {@value Double#NaN} el método asignará 
	 * {@value Double#NaN}</li></ul>
	 *  
	 * @param num Número real que se quiere añadir al sumatorio
	 * 
	 */
	public void sumatorio(double num) {
		acumulado += num;
	}
	
	/**
	 * Devuelve el valor actual del campo {@link Suma#acumulado}
	 * @return El valor del campo {@link Suma#acumulado}
	 */
	public double getAcumulado() {
		return acumulado;
	}

	/**
	 * Pone el valor del campo {@link Suma#acumulado} a 0.
	 */
	public void resetAcumulado() {
		acumulado = 0;
	}
}
