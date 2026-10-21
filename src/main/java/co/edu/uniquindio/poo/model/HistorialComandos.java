package co.edu.uniquindio.poo.model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class HistorialComandos {
    private final Deque<IComando> pilaDeshacer = new ArrayDeque<>();
    private final Deque<IComando> pilaRehacer = new ArrayDeque<>();

    public void ejecutarComando(IComando comando) {
        Objects.requireNonNull(comando, "El comando es obligatorio");
        comando.ejecutar();
        pilaDeshacer.push(comando);
        pilaRehacer.clear();
    }

    public void deshacer() {
        if (!pilaDeshacer.isEmpty()) {
            IComando comando = pilaDeshacer.pop();
            comando.deshacer();
            pilaRehacer.push(comando);
        }
    }

    public void rehacer() {
        if (!pilaRehacer.isEmpty()) {
            IComando comando = pilaRehacer.pop();
            comando.ejecutar();
            pilaDeshacer.push(comando);
        }
    }
}