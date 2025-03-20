package input;

import java.util.Scanner;

public class InputCli implements InputInterface{

    private int numero;

    public int obtenerOpcion(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public int obtenerOpcionMenu() {
       return obtenerOpcion();
    }


    public float obtenerComponenteDelVector() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    public float obtenerNumeroComplejo() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
