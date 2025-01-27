package input;

import java.util.Scanner;

public class Input {


    public int obtenerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int obtenerOperando() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public float obtenerComponenteDelVector() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
