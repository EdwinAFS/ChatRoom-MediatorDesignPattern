package MediatorApp;

class Usuario extends IColleague{

    public Usuario(String nombre, Mediator mediator){
        super(nombre, mediator);
    }

    public void enviar(String mensaje){
        System.out.println( "\n" + this.getNombre() +": " + mensaje+"\n");
        mediator.enviar(mensaje, this);
    }

    public void notificar(String mensaje){
        System.out.println( this.getNombre() + ": recibe: "+ mensaje );
    }

}