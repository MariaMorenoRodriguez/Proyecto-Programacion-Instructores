
package Bean;

import Controller.ControlerAreasena;
import Model.Areasena;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanAreasena {
    
    private ControlerAreasena controlAreasena;
    private Areasena areasena;
    private List<Areasena> listAreasena = new ArrayList<>();    

    public BeanAreasena() {
    }

    public List<Areasena> List() {
        controlAreasena = new ControlerAreasena();
        controlAreasena.List();
        this.listAreasena=controlAreasena.List();
        return listAreasena;
    }

    public String add(){
        controlAreasena =new ControlerAreasena();
        try
        {
         controlAreasena.Add(areasena);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    } 
}
