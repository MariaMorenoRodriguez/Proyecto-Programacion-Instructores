
package Bean;

import Controller.ControlerUserp;
import Model.Userp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanUserP {
            private ControlerUserp controlUserp;
    private Userp userp;
    private List<Userp> listUserp = new ArrayList<>();  

    public BeanUserP() {
    }
    
    public List<Userp> List() {
        controlUserp = new ControlerUserp();
        controlUserp.List();
        this.listUserp=controlUserp.List();
        return listUserp;
    }

    public String add(){
        controlUserp=new ControlerUserp();
        try
        {
         controlUserp.Add(userp);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
