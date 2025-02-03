package math;

public class Operaciones extends OperacionesGlobales{


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

}
