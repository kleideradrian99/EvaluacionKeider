package main;
import javax.swing.*;
import mensaje.Mensaje;

public class Main {
    public static void main(String[] args){
        String person = JOptionPane.showInputDialog(null,Mensaje.MENSAJE_INGRESE.getMensajeb());
        JOptionPane.showMessageDialog(null,Mensaje.MENSAJE_DE_BIENVENIDAD.getMensajeb() +" "+ person);
    }
}
