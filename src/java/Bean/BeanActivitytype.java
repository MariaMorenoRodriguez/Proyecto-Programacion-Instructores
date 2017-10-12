
package Bean;

import Controller.ControlerActivitytype;
import Model.Activitytype;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanActivitytype {
    private ControlerActivitytype controlActivitytype;
    private Activitytype activitytype;
    private List<Activitytype> listActivitytype = new ArrayList<>();

    public BeanActivitytype() {
    }

    public List<Activitytype> List() {
        controlActivitytype = new ControlerActivitytype();
        controlActivitytype.List();
        this.listActivitytype=controlActivitytype.List();
        return listActivitytype;
    }

    public String add(){
        controlActivitytype =new ControlerActivitytype();
        try
        {
         controlActivitytype.Add(activitytype);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }     
}
