package main;

import input.Input;
import math.Operaciones;
import math.Vector;
import output.Output;
import validator.Validador;

public class Main {
    final static int SUMAR =1;
    final static int RESTAR =2;
    final static int MULTIPLICAR =3;
    final static int DIVIDIR =4;
    final static int SUMAR_VECTORES =5;
    final static int SALIR =6;
    private static int opcionMenu;
    private static int operando1;
    private static int operando2;

    private static Input input ;
    private static Output output ;
    private static Operaciones operacion ;


    public static void main(String[] args) {

        input = new Input();
        output = new Output();
        operacion = new Operaciones();

        boolean usuarioQuiereQuedarse = true;
        do {
        boolean esValido;
        do {
            mostrarMenu();
            obtenerOpcionMenu();
            esValido = validarOpcionMenu();
        }while(!esValido);

            if (opcionMenu==SALIR){
                usuarioQuiereQuedarse = false;

            }
            else {
                ejecutarOperacion();
            }

        }while (usuarioQuiereQuedarse);

    }

    private static void mostrarMenu() {
        Output output = new Output();
        output.mostrarMenu();
    }

    private static void obtenerOpcionMenu() {
        Input input = new Input();
        opcionMenu = input.obtenerOpcionMenu();
    }
    private static boolean validarOpcionMenu() {
        Validador validador = new Validador();
       boolean esValido =  validador.validarOpcionMenu(opcionMenu);
       return esValido;
    }

    private static void agregarVector(){
        Vector v1 = crearVector();
        Vector v2 = crearVector();
        Vector v3 = operacion.sumar(v1,v2);
        output.mostrarVector(v3);

    }

    private static Vector crearVector(){

        output.pedirVector();
        float c1 = input.obtenerComponenteDelVector();
        output.pedirVector();
        float c2 = input.obtenerComponenteDelVector();

        Vector vector = new Vector(c1,c2);
        return vector;

    }


    private static void ejecutarOperacion() {




        switch (opcionMenu){
            case SUMAR ->
            {
                output.pedirOperando();
                operando1=input.obtenerOperando();
                output.pedirOperando();
                operando2 =input.obtenerOperando();
                output.mostrarResultado(operacion.sumar(operando1,operando2));
            }
            case RESTAR -> {
                output.pedirOperando();
                operando1=input.obtenerOperando();
                output.pedirOperando();
                operando2 =input.obtenerOperando();
                output.mostrarResultado(operacion.restar(operando1,operando2));}
            case MULTIPLICAR -> {
                output.pedirOperando();
                operando1=input.obtenerOperando();
                output.pedirOperando();
                operando2 =input.obtenerOperando();
                output.mostrarResultado(operacion.multiplicar(operando1,operando2));}
            case DIVIDIR ->
            {
                output.pedirOperando();
                operando1=input.obtenerOperando();
                output.pedirOperando();
                operando2 =input.obtenerOperando();
                if (operando2 ==0)
                    output.mostrarNoDivisibleCero();
                else
                    output.mostrarResultado(operacion.dividir(operando1,operando2));
            }
            case SUMAR_VECTORES -> {
                agregarVector();
            }




        }

    }
}
