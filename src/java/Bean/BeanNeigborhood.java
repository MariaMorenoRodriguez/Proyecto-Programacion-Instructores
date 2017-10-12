
package Bean;

import Controller.ControlerNeigborhood;
import Model.Neigborhood;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanNeigborhood {
        private ControlerNeigborhood controlNeigborhood;
    private Neigborhood neigborhood;
    private List<Neigborhood> listNeigborhood = new ArrayList<>();     

    public BeanNeigborhood() {
    }

    public List<Neigborhood> List() {
        controlNeigborhood = new ControlerNeigborhood();
        listNeigborhood=controlNeigborhood.List();
        return listNeigborhood;
    }

    public String add(){
        controlNeigborhood =new ControlerNeigborhood();
        try
        {
         controlNeigborhood.Add(neigborhood);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
}
