package output;

import math.NumeroComplejo;
import math.Vector;

import javax.swing.*;
import java.time.Year;

public class OutputGui implements OutputInterface{


    public static String pedirOpcionGui(){

        return "ingrese opcion de menu";
    }

    public static String pedirOpernadogui(){

        return "ingrese operando";
    }
    @Override
    public void pedirOperando() {

       JOptionPane.showMessageDialog(null,"ingrese operando");

    }

    public void mostrarMenu(){



        JOptionPane.showMessageDialog(null,"""
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

    @Override
    public void mostrarResultado(int resultado) {

        JOptionPane.showMessageDialog(null,"el resultado es : " +resultado);
    }

    @Override
    public void mostrarNoDivisibleCero() {

    }

    @Override
    public void mostrarVector(Vector v3) {
        JOptionPane.showMessageDialog(null,"el resultado es : " +v3);
    }

    @Override
    public void mostrarNumeroComplejo(NumeroComplejo c3) {
        JOptionPane.showMessageDialog(null,"el resultado es : " +c3);
    }

    @Override
    public void pedirVector() {

    }

    @Override
    public void pedirNumReal() {

    }

    @Override
    public void pedirNumImaginario() {

    }
}
