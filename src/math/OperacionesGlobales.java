package math;

public class OperacionesGlobales {

    public int sumar(int sumando1, int sumando2){
        return sumando1+sumando2;
    }

    public  float sumar(float sumando1, float sumando2){
        return sumando1+sumando2;
    }

    public int restar(int minuendo, int sustraendo){
        return minuendo-sustraendo;
    }

    public int multiplicar(int multiplicando, int multiplicador){

        var producto = 0;

        for (int i = 0 ; i < multiplicador; i++){

            producto+=multiplicando ;

        }

        return producto;
    }
    public int dividir(int dividendo, int divisor){

        var division = dividendo;
        var cociente = 0;



        for (int i = 0 ; i < dividendo ; i++){
            division-=divisor;

            if (division>=0){
                cociente++;


            }

        }
        return cociente;




    }
}
