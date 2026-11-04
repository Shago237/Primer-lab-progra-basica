/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author rener
 */
public class reserva {

    private int id;
    private int idEmpleado;
    private String tipo;
    private String Descripcion;
    private boolean activa; 
    
    public reserva(int id, int idEmpleado, String tipo, String Descripcion) {
      this.id = id;
      this.idEmpleado = idEmpleado;
      this.tipo = tipo;
      this.Descripcion = Descripcion;
      this.activa = true;
    }
    
    public int getid(){
        return id;
    }
    public int getidEmpleado(){
        return idEmpleado;
    }
    public String gettipo(){
        return tipo;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public boolean isActiva(){
        return activa;
    }
    public void cancelar(){
        activa = false;
    }
    
    public String toString(){
        return "reserva #" + id
                + "| empleado: " + idEmpleado
                + "| tipo: " + tipo
                + "| " + Descripcion
                + "| estado: "
                + (activa ? "activa" : "cancelado");
        
    }
}
