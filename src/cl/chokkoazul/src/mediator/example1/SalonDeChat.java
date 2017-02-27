package cl.chokkoazul.src.mediator.example1;

import java.util.HashMap;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public class SalonDeChat implements ISalonDeChat {

    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario participante) {
        participantes.put(participante.getNombre(), participante);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario inexistente");
        }
    }
}
