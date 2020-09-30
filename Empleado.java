/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendos;

import javax.swing.JOptionPane;

/**
 *
 * @author PRUEVA
 */

public  class Empleado  extends Persona {
    
    
    private int salario;

    public Empleado() {
        salario=0;
    }
    public void establecerSalario(){
         boolean error = false;
        do{
           try{
            salario = Integer.parseInt(JOptionPane.showInputDialog("salario"));
            error = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        
    }
    public int verSalario(){
        return salario;
    }
    


    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + " " + super.mostrarDatos() +  '}';
    }
    
}






