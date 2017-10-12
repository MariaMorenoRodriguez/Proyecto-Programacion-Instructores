
package Bean;

import Controller.ControlerSpaceformation;
import Model.Spaceformation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanSpaceformation {
    
        private ControlerSpaceformation controlSpaceformation;
    private Spaceformation spaceformation;
    private List<Spaceformation> listSpaceformation = new ArrayList<>();   

    public BeanSpaceformation() {
    }

    public List<Spaceformation> List() {
        controlSpaceformation = new ControlerSpaceformation();
        controlSpaceformation.List();
        this.listSpaceformation=controlSpaceformation.List();
        return listSpaceformation;
    }

    public String add(){
        controlSpaceformation =new ControlerSpaceformation();
        try
        {
         controlSpaceformation.Add(spaceformation);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
