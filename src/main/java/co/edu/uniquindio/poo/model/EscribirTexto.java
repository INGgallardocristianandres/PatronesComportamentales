package co.edu.uniquindio.poo.model;

import java.util.Objects;

public class EscribirTexto implements IComando{
    private EditorTexto editor;
    private final String textoAAgregar;

    public EscribirTexto(EditorTexto editor, String textoAAgregar) {
        this.editor = Objects.requireNonNull(editor, "El editor es obligatorio");
        this.textoAAgregar = Objects.requireNonNull(textoAAgregar, "El texto es obligatorio");
    }

    @Override
    public void ejecutar() {
        editor.escribir(textoAAgregar);
    }

    @Override
    public void deshacer() {
        editor.borrarUltimo(textoAAgregar.length());
    }
}
