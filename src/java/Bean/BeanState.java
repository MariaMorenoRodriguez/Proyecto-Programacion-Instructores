
package Bean;

import Controller.ControlerState;
import Model.State;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanState {

    public BeanState() {
    }
    
    private State statee;
    private List<State> listState = new ArrayList<>();  
    private ControlerState controlState;
    
    public List<State> List(){
        try{
          controlState = new ControlerState();
          this.listState=controlState.List();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listState;           
    }

    public String add(){
        controlState =new ControlerState();
        try
        {
         controlState.Add(statee);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
}
