
package Bean;

import Controller.ControlerTypegroup;
import Model.Typegroup;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanTypegroup {
            private ControlerTypegroup controlTypegroup;
    private Typegroup typegroup;
    private List<Typegroup> listTypegroup = new ArrayList<>();    

    public BeanTypegroup() {
    }

    public BeanTypegroup(ControlerTypegroup controlTypegroup, Typegroup typegroup) {
        this.controlTypegroup = controlTypegroup;
        this.typegroup = typegroup;
    }
    public List<Typegroup> List() {
        controlTypegroup = new ControlerTypegroup();
        controlTypegroup.List();
        this.listTypegroup=controlTypegroup.List();
        return listTypegroup;
    }

    public String add(){
        controlTypegroup =new ControlerTypegroup();
        try
        {
         controlTypegroup.Add(typegroup);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
