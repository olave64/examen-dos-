/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendos;

import javax.swing.JOptionPane;



public class Persona {
    private int id;
    private String nombre;
    private String apellido;

    public Persona() {
        id = 0;
        nombre = "";
        apellido = "";
        
    }
    public void obtenerDatos(){
        boolean error = false;
        do{
           try{
            id = Integer.parseInt(JOptionPane.showInputDialog("id"));
            error = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        nombre = JOptionPane.showInputDialog("nombre");
        apellido = JOptionPane.showInputDialog("apellido");
        
    }
    public int mostrarId(){
        return id; 
    }
    
    public String mostrarDatos(){
        return "ID = " + id + " NOMBRE = " + nombre + " APELLIDO = " + apellido;
    }
}
