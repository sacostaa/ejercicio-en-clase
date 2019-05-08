import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner lect= new Scanner(System.in);
        Mailbox m1 = new Mailbox();
    
    Persona p1 = new Persona ("Carlos",123);
    Persona p2 = new Persona ("Pedro", 456);
        System.out.println("Contenido");
        String contenido = lect.next();
        if(m1.crearmail(p1, p2, contenido)){
            System.out.println("mMail registrado satisfactgoriamentyer");
        }
        
        
       
    }
    
    
       
    
}
