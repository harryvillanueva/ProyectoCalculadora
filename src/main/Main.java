package main;

import input.Input;
import math.NumeroComplejo;
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
    final static int SUMAR_NUMEROS_COMPLEJOS = 6;
    final static int SALIR =7;
    private static int opcionMenu;
    // private static int operando1;
   // private static int operando2;
    private static int[] listaOperandos;
    private static Vector[] listaVector;
    private static NumeroComplejo[] listaNumComplejo;
    private static Float[] listaFloat;
    private static Input input ;
    private static Output output ;
    private static Operaciones operacion ;


    public static void main(String[] args) {

        input = new Input();
        output = new Output();
        operacion = new Operaciones();
        listaOperandos= new int[2];
        listaVector = new Vector[2];
        listaFloat = new Float[2];
        listaNumComplejo = new NumeroComplejo[2];

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
        opcionMenu = input.obtenerOpcion();
    }
    private static boolean validarOpcionMenu() {
        Validador validador = new Validador();
       boolean esValido =  validador.validarOpcionMenu(opcionMenu);
       return esValido;
    }

    private static void agregarVector(){
        listaVector[0] = crearVector();
        listaVector[1] = crearVector();
        Vector v3 = operacion.sumar(listaVector[0],listaVector[1]);
        output.mostrarVector(v3);

    }

    private static Vector crearVector(){

        output.pedirVector();
         listaFloat[0] = input.obtenerComponenteDelVector();
        output.pedirVector();
        listaFloat[1] = input.obtenerComponenteDelVector();

        Vector vector = new Vector(listaFloat[0],listaFloat[1]);
        return vector;

    }

    private static void agregarNumeroComplejo(){
        listaNumComplejo[0] = crearNumComplejo();
        listaNumComplejo[1] = crearNumComplejo();
        NumeroComplejo c3 = operacion.sumar(listaNumComplejo[0],listaNumComplejo[1]);
        output.mostrarNumeroComplejo(c3);

    }

    private static NumeroComplejo crearNumComplejo(){

        output.pedirNumReal();
        listaFloat[0] = input.obtenerNumeroComplejo();
        output.pedirNumImaginario();
        listaFloat[1] = input.obtenerNumeroComplejo();

        NumeroComplejo numComplex = new NumeroComplejo(listaFloat[0],listaFloat[1]);
        return numComplex;

    }

    private static void pedirDatos(){
        output.pedirOperando();
        listaOperandos[0]=input.obtenerOpcion();
        output.pedirOperando();
        listaOperandos[1] =input.obtenerOpcion();
    }


    private static void ejecutarOperacion() {




        switch (opcionMenu){
            case SUMAR ->
            {
                pedirDatos();
                output.mostrarResultado(operacion.sumar(listaOperandos[0],listaOperandos[1]));
            }
            case RESTAR -> {
                pedirDatos();
                output.mostrarResultado(operacion.restar(listaOperandos[0],listaOperandos[1]));}
            case MULTIPLICAR -> {
                pedirDatos();
                output.mostrarResultado(operacion.multiplicar(listaOperandos[0],listaOperandos[1]));}
            case DIVIDIR ->
            {
                pedirDatos();
                if (listaOperandos[1] ==0)
                    output.mostrarNoDivisibleCero();
                else
                    output.mostrarResultado(operacion.dividir(listaOperandos[0],listaOperandos[1]));
            }
            case SUMAR_VECTORES -> {
                agregarVector();
            }

            case SUMAR_NUMEROS_COMPLEJOS -> {
                agregarNumeroComplejo();
            }




        }

    }
}
