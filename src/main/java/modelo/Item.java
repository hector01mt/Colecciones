package modelo;

/**
 *
 * @author Hector
 */
public class Item {
    
    private String idItem; 
    private String nombre; 

    public Item(String idItem, String nombre) {
        this.idItem = idItem;
        this.nombre = nombre;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Item{" + "idItem=" + idItem + ", nombre=" + nombre + '}';
    }
    
    
}
