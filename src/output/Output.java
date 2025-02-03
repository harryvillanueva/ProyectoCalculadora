package output;


import math.NumeroComplejo;
import math.Vector;

public class Output {

    public void mostrarMenu(){

        System.out.print("""
                Menu de operaciones matematicas
                -------------------------------
                Digite el numero de la opcion que desea operar
                1.Sumar
                2.Restar
                3.Multiplicar
                4.Dividir
                5.sumar dos vectores
                6.sumar numeros complejos
                7.Salir
                """);
    }

    public void pedirOperando(){

        System.out.println("ingrese un operando");
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
        System.out.println("ingrese un componente del vector");
    }

    public void pedirNumReal() {
        System.out.println("ingrese numero real");
    }

    public void pedirNumImaginario() {
        System.out.println("ingrese numero imaginario");
    }
}
