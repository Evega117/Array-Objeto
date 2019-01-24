
package arrayobjeto;


public class Direccion {
  private String calle;
  private String urbanizacion;
  private int ncasa;

    public Direccion(String calle, String urbanizacion, int ncasa) {
        this.calle = calle;
        this.urbanizacion = urbanizacion;
        this.ncasa = ncasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public int getNcasa() {
        return ncasa;
    }

    public void setNcasa(int ncasa) {
        this.ncasa = ncasa;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", urbanizacion=" + urbanizacion + ", ncasa=" + ncasa + '}';
    }
    
}
