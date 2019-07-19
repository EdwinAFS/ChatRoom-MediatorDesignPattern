package MediatorApp;

import java.util.ArrayList;

class Mediator implements IMediator{

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void enviar(String mensaje, Usuario u){
        for( Usuario usuario : this.usuarios ) if( usuario != u ) usuario.notificar(mensaje);
    }

    public void addUser(Usuario usuario){
        this.usuarios.add(usuario);
    }
}