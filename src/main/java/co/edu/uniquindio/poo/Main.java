package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.EditorTexto;
import co.edu.uniquindio.poo.model.EscribirTexto;
import co.edu.uniquindio.poo.model.HistorialComandos;
import co.edu.uniquindio.poo.model.IComando;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        HistorialComandos historial = new HistorialComandos();
        System.out.println("PRUEBA SOLUCION PATRON COMMAND EDITOR DE TEXTO");

        IComando cmd1 = new EscribirTexto(editor, "Hola ");
        historial.ejecutarComando(cmd1);
        System.out.println("Texto actual: " + editor.getContenido());

        IComando cmd2 = new EscribirTexto(editor, "Mundo ");
        historial.ejecutarComando(cmd2);
        System.out.println("Texto actual: " + editor.getContenido());

        IComando cmd3 = new EscribirTexto (editor, "Smart!");
        IComando cmd3Real = new EscribirTexto(editor, "Java!");
        historial.ejecutarComando(cmd3Real);
        System.out.println("Texto actual: " + editor.getContenido());


        System.out.println("\n APLICANDO DESHACER ");
        historial.deshacer();
        System.out.println("Texto tras deshacer: " + editor.getContenido());

        historial.deshacer();
        System.out.println("Texto tras segundo deshacer: " + editor.getContenido());

        System.out.println("\n APLICANDO REHACER ");
        historial.rehacer();
        System.out.println("Texto tras rehacer: " + editor.getContenido());
    }
}