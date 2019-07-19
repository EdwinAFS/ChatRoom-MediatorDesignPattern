package MediatorApp;

abstract class IColleague{
    
    private String nombre;
    protected Mediator mediator;
 
    public IColleague(String nombre, Mediator mediator){
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public void enviar(String mensaje){};
    public void notificar(String mensaje){};

    public String getNombre(){
        return nombre;
    }
}