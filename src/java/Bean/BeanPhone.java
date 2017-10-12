
package Bean;

import Controller.ControlerPhone;
import Model.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanPhone {
    
    public BeanPhone() {
    }

    private ControlerPhone controlPhone;
    private Phone phone;
    private List<Phone> listPhone = new ArrayList<>();     

    
    public List<Phone> List() {
        try{
            controlPhone = new ControlerPhone();
            listPhone=controlPhone.List();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return listPhone;
    }

    public String add(){
        controlPhone =new ControlerPhone();
        try
        {
         controlPhone.Add(phone);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
