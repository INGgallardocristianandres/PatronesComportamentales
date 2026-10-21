package co.edu.uniquindio.poo.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditorTextoTest {

    @Test
    public void borrarUltimoDebeConservarElTextoAnterior() {
        EditorTexto editor = new EditorTexto();
        editor.escribir("Hola mundo");

        editor.borrarUltimo(6);

        assertEquals("Hola", editor.getContenido());
    }
}
