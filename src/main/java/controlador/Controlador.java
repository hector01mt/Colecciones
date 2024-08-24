package controlador;

import modelo.Item;
import java.util.ArrayList;

/**
 *
 * @author Hector
 */
public class Controlador {
    
    
    ArrayList <Item> items;
    public Controlador() {
    }
    
    public void crearArrayList(){
        items = new ArrayList();
    }
    
    public void insertarItem(Item item){
        items.add(item);
    }
    
    public String mostrarItems(){
        String reporte="";
        for (int i = 0; i < items.size(); i++) {
            reporte+=items.get(i).toString();
        }
        return reporte;
    }
    
}
