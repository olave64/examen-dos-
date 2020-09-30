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
            numero=Integer.parseInt(JOptionPane.showInputDialog(" 1: agregar \n 2: actualizar \n 3: borrar \n 4: mostrar \n 5: mostrar maximo salario \n 6: mostrar salario minimo \n 7: ordenar por nombre \n 8: mostrar mayores a 700000 \n 9: comiencen con a \n 10: cinco mas altos salarios" ));
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
                case 5:
                    escoger.sueldoMax();
                    break;
                case 6:
                    escoger.sueldoMin();
                    break;
                case 7:
                    escoger.ordenarNombre();
                    break;
                case 8:
                    escoger.sumaMoyorSete();
                    break;
                case 9:
                    escoger.comienzaConA();
                    break;
                case 10:
                    escoger.cincoSalarios();
                    break;
            }
        }while(numero!=11);
            break;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        
       
    }
}













