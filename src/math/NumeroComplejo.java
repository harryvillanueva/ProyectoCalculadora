package math;

public class NumeroComplejo {

    private float parteReal;
    private float parteImaginaria;

    public NumeroComplejo(){
        parteReal = 0f;
        parteImaginaria = 0f;

    }
    public NumeroComplejo(float parteReal, float parteImaginaria){
        this.parteReal=parteReal;
        this.parteImaginaria=parteImaginaria;

    }

    public float getComponente1() {
        return parteReal;
    }

    public float getComponente2() {
        return parteImaginaria;
    }

    @Override
    public String toString() {
        return "Numero Complejo{" +
                "parte real=" + parteReal +
                ", parte imaginaria=" + parteImaginaria +
                '}';
    }
}
