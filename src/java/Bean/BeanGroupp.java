
package Bean;

import Controller.ControlerGroupp;
import Model.Groupp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanGroupp {
    private ControlerGroupp controlGroupp;
    private Groupp groupp;
    private List<Groupp> listGroupp = new ArrayList<>();

    public BeanGroupp() {
    }

    public BeanGroupp(ControlerGroupp controlGroupp, Groupp groupp) {
        this.controlGroupp = controlGroupp;
        this.groupp = groupp;
    }
    public List<Groupp> List() {
        controlGroupp = new ControlerGroupp();
        controlGroupp.List();
        this.listGroupp=controlGroupp.List();
        return listGroupp;
    }

    public String add(){
        controlGroupp =new ControlerGroupp();
        try
        {
         controlGroupp.Add(groupp);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }     
}
