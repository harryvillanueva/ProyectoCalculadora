package math;

public class OperacionesSucesivas extends OperacionesGlobales {
    public Vector sumar(Vector v1, Vector v2){
        Vector resultado;
        float resultadoC1 = sumar(v1.getComponente1(),v2.getComponente1());
        float resultadoC2 = sumar(v1.getComponente2(),v2.getComponente2());

        resultado = new Vector(resultadoC1,resultadoC2);

        return resultado;
    }

    public NumeroComplejo sumar(NumeroComplejo v1, NumeroComplejo v2){
        NumeroComplejo resultado;
        float numCom1 = sumar(v1.getComponente1(),v2.getComponente1());
        float numCom2 = sumar(v1.getComponente2(),v2.getComponente2());

        resultado = new NumeroComplejo(numCom1,numCom2);

        return resultado;
    }

    @Override
    public int multiplicar(int multiplicando, int multiplicador){


        var producto = 0;

        for (int i = 0 ; i < multiplicador; i++){

            producto+=multiplicando ;

        }

        return producto;
    }

    @Override
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
