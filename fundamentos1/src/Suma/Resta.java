package Suma;

public class Resta extends Operaciones {

    int resta;

    public Resta(int n1, int n2) {
        super(n1, n2, '-');
        this.resta = n1 + n2;
        this.setResultado(this.resta);
    }
}
