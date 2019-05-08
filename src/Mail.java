import java.util.*;
public class Mail {
    
    private String contenido ;
    private Persona sender;
    private Persona addressee;

    public Mail(String contenido, Persona sender, Persona addressee) {
        this.contenido = contenido;
        this.sender = sender;
        this.addressee = addressee;
    }

   
    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Persona getSender() {
        return sender;
    }

    public void setSender(Persona sender) {
        this.sender = sender;
    }

    public Persona getAddressee() {
        return addressee;
    }

    public void setAddressee(Persona addressee) {
        this.addressee = addressee;
    }
    
    
    
    
    
    
    
}
