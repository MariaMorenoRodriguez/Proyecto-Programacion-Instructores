
package Bean;

import Controller.ControlerTypespaceformation;
import Model.Typespaceformation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanTypespaceformation {
            private ControlerTypespaceformation controlTypespaceformation;
    private Typespaceformation typespaceformation;
    private List<Typespaceformation> listTypespaceformation = new ArrayList<>();

    public BeanTypespaceformation() {
    }

    public List<Typespaceformation> List() {
        controlTypespaceformation = new ControlerTypespaceformation();
        controlTypespaceformation.List();
        this.listTypespaceformation=controlTypespaceformation.List();
        return listTypespaceformation;
    }

    public String add(){
        controlTypespaceformation =new ControlerTypespaceformation();
        try
        {
         controlTypespaceformation.Add(typespaceformation);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
