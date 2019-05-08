import java.util.*;
public class Mailbox {
    
    private ArrayList  <Mail> content;

    public Mailbox() {
      this.content = new ArrayList<>();
    }

  
    
    public boolean crearmail(Persona p1, Persona p2, String contenido){
        Mail mail = new Mail(contenido, p1, p2);
        return this.content.add(mail);
    }
    
    public boolean consultarmail (Persona p1){
        for (int i = 0; i < content.size(); i++) {
            if (p1.equals(content.get(i).getSender())){
                return 
            }
            
        }
    }
    
}
