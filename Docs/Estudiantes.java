/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.edec.s2.taller2.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Estudiantes {
    
  String Nombre;
  int edad;


   public Estudiantes (String Nombre, int edad){
       
   this.Nombre = Nombre;
   this.edad = edad;
       
       
   }
    public static void mostrarStatic (String Nombre , int edad){
        
        System.out.println(Nombre);
        System.out.println(edad);
        
        
    }
            
}
