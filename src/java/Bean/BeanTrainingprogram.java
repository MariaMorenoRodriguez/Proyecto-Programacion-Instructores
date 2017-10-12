
package Bean;

import Controller.ControlerTrainingprogram;
import Model.Trainingprogram;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanTrainingprogram {
    
    private ControlerTrainingprogram controlTrainingprogram;
    private Trainingprogram trainingprogram;
    private List<Trainingprogram> listTrainingprogram = new ArrayList<>();     

    public BeanTrainingprogram() {
    }


    public List<Trainingprogram> List() {
        controlTrainingprogram = new ControlerTrainingprogram();
        controlTrainingprogram.List();
        this.listTrainingprogram=controlTrainingprogram.List();
        return listTrainingprogram;
    }

    public String add(){
        controlTrainingprogram =new ControlerTrainingprogram();
        try
        {
         controlTrainingprogram.Add(trainingprogram);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }      
    
}
