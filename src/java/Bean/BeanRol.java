
package Bean;

import Controller.ControlerRol;
import Model.Rol;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanRol {
    
    private ControlerRol controlRol;
    private Rol rol;
    private List<Rol> listRol = new ArrayList<>();    

    public BeanRol() {
    }


    public List<Rol> List(){
        
        try{
            controlRol = new ControlerRol();
        controlRol.List();
        listRol=controlRol.List();
             
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return listRol;           
    }

    public String add(){
        controlRol =new ControlerRol();
        try
        {
         controlRol.Add(rol);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
