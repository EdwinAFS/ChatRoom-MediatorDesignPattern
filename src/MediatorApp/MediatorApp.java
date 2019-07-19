package MediatorApp;

public class MediatorApp {
    public static void main(String[] args) {
        Mediator mediador = new Mediator();

        Usuario Sebastian = new Usuario ("Sebastian",mediador);
        Usuario Andros    = new Usuario ("Andros",mediador);
        Usuario Gustavo   = new Usuario ("Gustavo",mediador);
        Usuario Victor    = new Usuario ("Victor",mediador);
        Usuario Andres    = new Usuario ("Andres",mediador);
        Usuario Johan     = new Usuario ("Johan",mediador);

        mediador.addUser(Sebastian);
        mediador.addUser(Andros);
        mediador.addUser(Gustavo);
        mediador.addUser(Victor);
        mediador.addUser(Andres);
        mediador.addUser(Johan);

        Sebastian.enviar("Se hara la asado?");
        Andros.enviar("se debe planear bien");
        Gustavo.enviar("Sera en mi casa?");
        Victor.enviar("Yo solo puedo hasta las 5");
        Andres.enviar("...");
        Johan.enviar("yo no puedo ir");
    }
}