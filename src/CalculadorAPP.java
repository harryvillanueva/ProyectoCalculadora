import input.InputCli;
import input.InputGui;
import main.Calculadora;
import math.Operaciones;
import math.OperacionesSucesivas;
import output.OutputCli;
import output.OutputGui;

public class CalculadorAPP {
    private static Calculadora calculadora;
    public static void main(String[] args) {
        cli();
       // guiSucesivas();


    }

    private static void cli() {
        calculadora = new Calculadora(
                new InputCli(),
                new OutputCli(),
                new Operaciones()
        );

        calculadora.run();
    }

    private static void guiSucesivas() {
        calculadora = new Calculadora(
                new InputGui(),
                new OutputGui(),
                new OperacionesSucesivas()
        );

        calculadora.run();
    }
}
