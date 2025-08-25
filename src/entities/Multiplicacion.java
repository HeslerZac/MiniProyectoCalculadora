package entities; // Está Clase Petenece al paquete entities.

/**
 *
 * @author cristian
 * Está Clase implementa la interfaz IMultiplicacion.
 * Esta clase se encarga de dar la funcionalidad al método ejecutar(), realizando la operación de multiplicación.
 * 
 */

import interfaces.IMultiplicacion; // Importamos la interfaz que definimos en el paquete "interfaces", así podemos implementar su contrato en esta clase.

public class Multiplicacion implements IMultiplicacion { //Clase pública "Multiplicacion" que implementa la interfaz IMultiplicacion.
    @Override
    public int multiplicar(double a, double b) { 
        return a * b; //Multiplica ambos valores y devuelve el resultado.
    }
}