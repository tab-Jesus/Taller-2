
package co.edu.edec.s2.taller2.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Estudiante {
 
  String Nombre;
  int edad;


   public Estudiante (String Nombre, int edad){
       
   this.Nombre = Nombre;
   this.edad = edad;
       
       
   }
   

    public Estudiante() {
        
        this("Desconocido", 0);
        
        
    }


    
   public void mostrarInformacion(){
       
       System.out.println("Nombre" + Nombre + "edad" + edad );   
       
       
   }
    
   
   
   
}
