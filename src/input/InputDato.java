package input;

import java.util.Random;
import java.util.Scanner;

public class InputDato implements InputInterface{

    public int obtenerOpcion(){

        Random r = new Random();
        int numeroRandom = r.nextInt(10);
        return numeroRandom ;
    }

    public float obtenerComponenteDelVector() {

        Random r = new Random();
        float numeroRandom = r.nextFloat(100);
        return numeroRandom ;
    }

    public float obtenerNumeroComplejo() {

        Random r = new Random();
        float numeroRandom = r.nextFloat(100);
        return numeroRandom ;
    }
}
