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
public class Opciones {
    ProcesarEmpleado escoger = new ProcesarEmpleado();
    public void selecccionar(){
        boolean error = false;
        int numero;
        do{
           try{
            do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("1: agregar \n 2: actualizar \n 3: borrar \n 4: mostrar \n  5: salir"));
            switch(numero){
                case 1:
                    escoger.agregarEmpleado();
                    
                    break;
                case 2:
                    escoger.actualizar();
                    break;
                case 3:
                    escoger.borrar();
                    break;
                case 4:
                    escoger.mostrarLista();
                break;
            }
        }while(numero!=5);
            break;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        
       
    }
}
