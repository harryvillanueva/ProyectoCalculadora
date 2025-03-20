package math;

public abstract class OperacionesGlobales {

    public int sumar(int sumando1, int sumando2){
        return sumando1+sumando2;
    }

    public  float sumar(float sumando1, float sumando2){
        return sumando1+sumando2;
    }

    public int restar(int minuendo, int sustraendo){
        return minuendo-sustraendo;
    }


   public abstract NumeroComplejo sumar(NumeroComplejo v1, NumeroComplejo v2);
   public abstract Vector sumar(Vector v1, Vector v2);
   public abstract  int multiplicar(int multiplicando, int multiplicador);
   public abstract  int dividir(int dividendo, int divisor);



}
