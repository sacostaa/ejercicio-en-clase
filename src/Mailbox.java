import java.util.*;
public class Mailbox {
    
    private ArrayList  <Mail> content;

    public Mailbox() {
      this.content = new ArrayList<>();
    }

  
    
    public String crearmail(Persona p1, Persona p2, String contenido){
        Mail mail = new Mail(contenido, p1, p2);
        content.add(mail);
        return "Correo enviado satisfactoriamente";
    }
    
    public String consultarmail (Persona p1){
        int p = 1;
        System.out.println("");
        System.out.println("lista de correos enviados");
        for (int i = 0; i < content.size(); i++) {
            
            if (p1.equals(content.get(i).getSender())){
                
                System.out.println(p);
                System.out.println("persona a la que se envio");
                System.out.println(content.get(i).getAddressee().getNombre());
                System.out.println("contenido del mail");
                System.out.println(content.get(i).getContenido());
                
                p ++;
               
            }
            
        }
        return "Los anterioires son todos los correos de la persona buscada";
    }
    
    public  String mascorreosrecibidos (Persona p1, Persona p2){
        int p = 0;
            int l = 0;
        for (int i = 0; i < content.size(); i++) {
            
            if (p1.getNombre().equals(content.get(i).getAddressee().getNombre())){
                p = p + 1;
            }
            
            if (p2.getNombre().equals(content.get(i).getAddressee().getNombre())){
                l = l + 1 ;
            }
            
            
            
        }
        if ( p > l){
                System.out.println("la perosna con mas cooreos recividos es");
                System.out.println(p1.getNombre());
                System.out.println("con una cantidad de");
                System.out.println(p);
            }
            
            if (l > p){
                System.out.println("la persona con mas correos recividos es");
                System.out.println(p2.getNombre());
                System.out.println("con una cantidad de");
                System.out.println(l);
            }
        
        return "la operacion se realizo satisfactoriamente";
        
    }
    
}
