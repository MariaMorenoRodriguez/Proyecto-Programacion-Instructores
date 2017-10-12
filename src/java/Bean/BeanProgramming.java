
package Bean;

import Controller.ControlerProgramming;
import Model.Programming;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanProgramming {
    
        private ControlerProgramming controlProgramming;
    private Programming programming;
    private List<Programming> listProgramming = new ArrayList<>();  

    public BeanProgramming() {
    }

    public List<Programming> List() {
        controlProgramming = new ControlerProgramming();
        controlProgramming.List();
        this.listProgramming=controlProgramming.List();
        return listProgramming;
    }

    public String add(){
        controlProgramming =new ControlerProgramming();
        try
        {
         controlProgramming.Add(programming);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
