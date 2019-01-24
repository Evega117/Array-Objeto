
package arrayobjeto;

import java.util.ArrayList;
import java.util.Iterator;


public class BaseEmpleado {
    private ArrayList<Empleado>listempleado=new ArrayList<Empleado>();
   
    public void insertarempelado(Empleado empleado)
    {
        listempleado.add(empleado);
    }
    public void impimirempleado()
    {
        Iterator miiterator=listempleado.iterator();//desconpone la listempelados para pasar uno a uno 
        while(miiterator.hasNext())
        {
            Empleado elem     =(Empleado)miiterator.next();
            //clase  variable   clase    
            System.out.println(""+elem.toString());
            
        }
       
    }
    public void eliminarempleado(Empleado em)
     {
        listempleado.remove(em);
     }
    public void buscarempleado(String cedula)
    {
        boolean op=false;
         Iterator miiterator=listempleado.iterator();//desconpone la listempelados para pasar uno a uno 
        while(miiterator.hasNext())
        {
            Empleado elem     =(Empleado)miiterator.next();
            if(elem.getCedula().equals(cedula))
            {
                
            }
        }
    }
}
