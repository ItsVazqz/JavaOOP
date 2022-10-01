package Suma;

public class Division extends Operaciones {

    int division;

    public Division(int n1, int n2) {
        super(n1, n2, '/');
        this.division = n1 + n2;
        this.setResultado(this.division);
    }
}
