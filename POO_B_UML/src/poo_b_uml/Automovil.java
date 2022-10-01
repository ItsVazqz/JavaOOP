package poo_b_uml;

public class Automovil {

    int velocidad;

    int velocidad() {
        return velocidad;
    }
}

class Coche extends Automovil {

    boolean enMarcha;

    int numRuedas = 4;

    void acelerar(int incremento) {
        velocidad += incremento;
        enMarcha = true;
    }

    void frenar() {
        if (enMarcha)
            velocidad--;
        if (velocidad == 0)
            enMarcha = false;
    }
}
