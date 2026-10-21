package co.edu.uniquindio.poo.model;

public class EditorTexto {
    private StringBuilder contenido;

    public EditorTexto() {
        this.contenido = new StringBuilder();
    }

    public void escribir(String texto) {
        if (texto != null) {
            contenido.append(texto);
        }
    }

    public void borrarUltimo(int longitud) {
        int inicio = contenido.length() - longitud;
        if (inicio >= 0) {
            contenido.delete(inicio, contenido.length());
        }
    }

    public String getContenido() {
        return contenido.toString();
    }
}
