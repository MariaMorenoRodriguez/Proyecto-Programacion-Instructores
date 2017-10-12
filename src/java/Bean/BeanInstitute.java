
package Bean;

import Controller.ControlerInstitute;
import Model.Institute;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class BeanInstitute {
    private ControlerInstitute controlInstitute;
    private Institute institute;
    private List<Institute> listInstitute = new ArrayList<>();  

    public BeanInstitute() {
    }

    public List<Institute> List() {
        controlInstitute = new ControlerInstitute();
        controlInstitute.List();
        this.listInstitute=controlInstitute.List();
        return listInstitute;
    }

    public String add(){
        controlInstitute =new ControlerInstitute();
        try
        {
         controlInstitute.Add(institute);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
}
