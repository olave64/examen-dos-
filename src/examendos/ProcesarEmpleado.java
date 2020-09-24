/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendos;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PRUEVA
 */
public class ProcesarEmpleado {
    boolean verificacion = false;
    int idVerificacion;
    int index;
    int cont=0;
    int idBorrar;
    List <Empleado> miEmpleado = new ArrayList<>(); 
    
    public void agregarEmpleado(){
        Empleado nuevo = new Empleado();
        nuevo.obtenerDatos();
        nuevo.establecerSalario();
        idVerificacion = nuevo.mostrarId();
        verificador();
        if(verificacion == true){
            JOptionPane.showMessageDialog(null, "el identificador ya existe");
        }else{
              miEmpleado.add(nuevo);
        }
        
        
    }
   
    public void mostrarLista(){
        System.out.println(miEmpleado);
    }
    public void actualizar(){
      int actualizar = Integer.parseInt(JOptionPane.showInputDialog("dijite el ide a actualizar"));
      miEmpleado.forEach(Empleado->{
          index = index+1;
          if (Empleado.mostrarId()==actualizar){
              Empleado actu = new Empleado();
              actu.obtenerDatos();
              actu.establecerSalario();
              miEmpleado.set(index-1, actu);
          }else{
              JOptionPane.showMessageDialog(null, "id no encontrado");
          }
      });
        
    }
    public void borrar(){
        System.out.println(miEmpleado);
        idBorrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id por favor"));
        miEmpleado.forEach(Empleado->{
            cont = cont+1;
            System.out.println(cont);
            if(Empleado.mostrarId()==idBorrar){
                cont = cont-1;
               
            }
        });
        miEmpleado.remove(cont);
        cont=0;
    }
    public void verificador(){
        miEmpleado.forEach(Empleado->{
            
           if (Empleado.mostrarId()==idVerificacion){ 
               verificacion = true;
           }
           
       });
        
    }
    
    
}
