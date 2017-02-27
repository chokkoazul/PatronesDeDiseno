package cl.chokkoazul.src.mediator.example1;

/**
 * Created by cristian.osorio on 26-02-17.
 */
public class Test {

    public static void main(String [] args){
        SalonDeChat salonDeChat = new SalonDeChat();


        Usuario usuario = new Usuario(salonDeChat);
        usuario.setNombre("Cristian");
        salonDeChat.registra(usuario);

        Usuario usuario1 = new Usuario(salonDeChat);
        usuario1.setNombre("Carlos");
        salonDeChat.registra(usuario1);

        Usuario usuario2 = new Usuario(salonDeChat);
        usuario2.setNombre("Juan");
        salonDeChat.registra(usuario2);

        usuario.envia("Carlos", "Hola como andas carlos?");
        usuario1.envia("Juan", "Juan estas?");
        usuario2.envia("Cristian", "cris...vamos a comer?");
        usuario2.envia("Pedro", "estas conectado?");

        for(Usuario u:salonDeChat.getParticipantes().values()){
            System.out.println(u.getNombre());
        }


    }



}
