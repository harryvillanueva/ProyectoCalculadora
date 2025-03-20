package input;

import output.OutputGui;

import javax.swing.*;



public class InputGui implements InputInterface{

    int numero;
    float numeroFloat;
    public int obtenerOpcionMenu() {
        numero = Integer.parseInt(JOptionPane.showInputDialog(OutputGui.pedirOpcionGui()));
        return numero;
    }

    @Override
    public int obtenerOpcion() {
       numero = Integer.parseInt(JOptionPane.showInputDialog(OutputGui.pedirOpernadogui()));
        return numero;
    }

    @Override
    public float obtenerComponenteDelVector() {
        numeroFloat = Float.parseFloat (JOptionPane.showInputDialog(OutputGui.pedirOpernadogui()));
        return numeroFloat;
    }

    @Override
    public float obtenerNumeroComplejo() {
        numeroFloat = Float.parseFloat (JOptionPane.showInputDialog(OutputGui.pedirOpernadogui()));
        return numeroFloat;
    }
}
