/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author rener
 */
public class empleado {
    private int id;
    private String nombre; 
    private String puesto; 
    
    public empleado(int id, String nombre, String puesto) {
        this.id = id; 
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    public int getid(){
        return id;
    }
    public String getnombre(){
        return nombre;    
    }
    public String getpuesto(){
        return puesto;
    }
    public void setnombre(){
        this.nombre = nombre;
    }
    public void setpuesto(){
        this.puesto = puesto;
    }
    public String Mostrar_iNFO(){
        return "ID" + id
                + "\nnombre: "+ nombre
                + "\npuesto: "+ puesto;
    }
    
}
