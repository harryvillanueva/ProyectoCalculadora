package input;

import java.util.Scanner;

public class Input {

    private int numero;

    public int obtenerOpcion(){
        obtenerOpcionMenu();
        return numero;
    }


    private void obtenerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
         numero =scanner.nextInt();
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
