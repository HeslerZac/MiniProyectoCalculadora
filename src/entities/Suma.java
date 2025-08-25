package entities;

import interfaces.ISuma;

public class Suma implements ISuma {
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
}
