
package Bean;

import Controller.ControlerPerson;
import Model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanPerson {
    
        private ControlerPerson controlPerson;
    private Person person;
    private List<Person> listPerson = new ArrayList<>();     

    public BeanPerson() {
    }

    public List<Person> List() {
        controlPerson = new ControlerPerson();
        controlPerson.List();
        this.listPerson=controlPerson.List();
        return listPerson;
    }

    public String add(){
        controlPerson =new ControlerPerson();
        try
        {
         controlPerson.Add(person);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
