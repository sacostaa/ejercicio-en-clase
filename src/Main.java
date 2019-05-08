import java.util.*;
public class Main {
    
    public static void main(String[] args) {
       
        Mailbox m1 = new Mailbox();
    
    Persona p1 = new Persona ("Carlos",123);
    Persona p2 = new Persona ("Pedro", 456);
       
        Scanner lect= new Scanner(System.in);
        System.out.println("ingrese contenido del mail 1");
        String c1 = lect.nextLine();
        System.out.println(m1.crearmail(p1, p2, c1));
        
        
        Scanner a = new Scanner (System.in);
        System.out.println("ingrese contenido del mail 2");
        String c2 = a.nextLine();
        System.out.println(m1.crearmail(p2, p1, c2));
           
        
        Scanner b = new Scanner (System.in);
        System.out.println("ingrese contenido del mail 3");
        String c3 = b.nextLine();
        System.out.println(m1.crearmail(p1, p2, c3));
        
        
        Scanner c = new Scanner (System.in);
        System.out.println("ingrese contenido del mail 4");
        String c4 = c.nextLine();
        System.out.println(m1.crearmail(p2, p1, c4));
        
        
        Scanner d = new Scanner (System.in);
        System.out.println("ingrese contenido del mail 5");
        String c5 = d.nextLine();
        System.out.println(m1.crearmail(p1, p2, c5));
        

        System.out.println(m1.consultarmail(p1));
        System.out.println(m1.mascorreosrecibidos(p1, p2));
       
    }
    
    
}   
    

