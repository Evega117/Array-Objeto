
package arrayobjeto;


public class Empleado {
    private String cedula;
    private String nombre;
    private int salario;

    public Empleado(String cedula, String nombre, int salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    private String calle;
  private String urbanizacion;
  private int ncasa;
    public void mosempleado()
    {
    Direccion obj1;
    obj1=new Direccion(calle,urbanizacion,ncasa);
    
    }
 @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", salario=" + salario + ", calle=" + calle + ", urbanizacion=" + urbanizacion + ", ncasa=" + ncasa + '}';
    }
   
    }
