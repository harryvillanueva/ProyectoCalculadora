package output;

import math.NumeroComplejo;
import math.Vector;

public class OutputRandom implements OutputInterface{

    public void pedirOperando(){


    }

    public void mostrarResultado(int resultado){
        System.out.println("El Resultado es :" + resultado);
        System.out.println("");
    }

    public void mostrarNoDivisibleCero(){
        System.out.println("Dividir por el numero 0 no es valido ");
        System.out.println("");

    }

    public void mostrarVector(Vector v3) {
        System.out.println(v3);
    }

    public void mostrarNumeroComplejo(NumeroComplejo c3) {
        System.out.println(c3);
    }

    public void pedirVector() {

    }

    public void pedirNumReal() {

    }

    public void pedirNumImaginario() {

    }

    @Override
    public void mostrarMenu() {

    }
}
