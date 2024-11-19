/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.edec.s2.taller2.Docs;

/**
 *
 * @author JESUS DAVID
 */


// Define una clase Producto con los atributos nombre y precio.
 //2. Crea un constructor que reciba los parámetros nombre y precio y utiliza this para diferenciarlos de los atributos.
 //3. Define un método mostrarProducto que imprima los detalles del producto


public class Producto {
    
    String Nombre;
    String Precio;
    
    public Producto (String Nombre, int precio){
        
       this.Nombre = Nombre; 
       this.Precio = Precio; 
    }
    
    public void MostrarProducto (){
        
        System.out.println("Producto"+ this.Nombre + "Precio" + this.Precio);
        
        
        
    }
           
    
    
}
