/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendos;

import java.util.*;
import java.util.stream.Collectors;
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
    public List <Empleado> miEmpleado = new LinkedList<>(); 
    
    public void agregarEmpleado(){
        Empleado nuevo = new Empleado();
        nuevo.obtenerDatos();
        nuevo.establecerSalario();
        idVerificacion = nuevo.mostrarId();
        verificador();
        if(verificacion == true){
            verificacion=false;
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
           }else{
               verificacion = false;
           }
           
       });
                  
    }
    public void sueldoMax(){
        Optional<Empleado> mostrarMax = miEmpleado.stream()
             .max(Comparator.comparing(empleado->empleado.verSalario()));   
        System.out.println(mostrarMax);
    }
    public void sueldoMin(){
        Optional<Empleado> mostrarMin = miEmpleado.stream()
             .min(Comparator.comparing(empleado->empleado.verSalario()));   
        System.out.println(mostrarMin);
    }
    public void ordenarNombre(){
        List<Empleado> ordenar =  miEmpleado.stream()
                .sorted(Comparator.comparing(empleado->empleado.verNombre()))
                .collect(Collectors.toList());
                ordenar.forEach(System.out::println);
               
                
     
    }
    public void sumaMoyorSete(){
        Integer mSiete =  miEmpleado.stream()
                .filter(empleado->empleado.verSalario()>700000)
                .map(empleado->empleado.verSalario())
                .reduce(0, (acu, salario)->acu + salario);
                
                
                System.out.println(mSiete);
                
    }
    public void comienzaConA(){
        long a = miEmpleado.stream()
                .filter(empleado->empleado.verapellido().indexOf('a')==0 || empleado.verapellido().indexOf('A')==0)
                .count();
        System.out.println(a);
                
    }
    public void cincoSalarios(){
        List<Empleado> ordenarCinco =  miEmpleado.stream()
                .sorted(Comparator.comparing(empleado->empleado.verSalario(),Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
        ordenarCinco.forEach(System.out::println);
        
                
    }
    
}












































































