package output;

import math.NumeroComplejo;
import math.Vector;

public interface OutputInterface {
    void pedirOperando();
    void mostrarResultado(int resultado);
    void mostrarNoDivisibleCero();
    void mostrarVector(Vector v3);
    void mostrarNumeroComplejo(NumeroComplejo c3);
    void pedirVector();
    void pedirNumReal();
    void pedirNumImaginario();
}
