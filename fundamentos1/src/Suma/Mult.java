package Suma;

public class Mult extends Operaciones {

    int mult;

    public Mult(int n1, int n2) {
        super(n1, n2, '*');
        this.mult = n1 + n2;
        this.setResultado(this.mult);
    }
}
