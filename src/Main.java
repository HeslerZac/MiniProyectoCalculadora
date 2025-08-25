import entities.Suma;

public class Main {
    public static void main(String[] args) {
        Suma suma = new Suma();
        int resultado = suma.sumar(10, 5);
        System.out.println("Resultado de la suma: " + resultado);
    }
}