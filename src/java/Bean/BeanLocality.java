
package Bean;

import Controller.ControlerLocality;
import Model.Locality;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanLocality {
    
        private ControlerLocality controlLocality;
    private Locality locality;
    private List<Locality> listLocality = new ArrayList<>(); 

    public BeanLocality() {
    }
    public List<Locality> List() {
        controlLocality = new ControlerLocality();
        listLocality=controlLocality.List();
        return listLocality;
    }

    public String add(){
        controlLocality =new ControlerLocality();
        try
        {
         controlLocality.Add(locality);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
