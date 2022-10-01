package Suma;

public class Operaciones {

    int n1, n2, resultado;

    char operacion;

    public Operaciones(int n1, int n2, char operacion) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
        this.operacion = operacion;
    }

    public void mostrarResultado() {
        System.out.println(this.n1 + " " + this.operacion + " " + this.n2 + " " + "Es igual a: " + this.resultado);
    }

    public double getN1() {
        return n1;
    }
}
