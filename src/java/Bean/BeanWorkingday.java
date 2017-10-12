
package Bean;

import Controller.ControlerWorkingday;
import Model.Workingday;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanWorkingday {
    
    private Long IdWorkingDay;
    private String WorkingDayName;
    private Time StartTime;
    private Time FinishTime;
    
    public Long getIdWorkingDay() {
        return IdWorkingDay;
    }

    public void setIdWorkingDay(Long IdWorkingDay) {
        this.IdWorkingDay = IdWorkingDay;
    }

    public String getWorkingDayName() {
        return WorkingDayName;
    }

    public void setWorkingDayName(String WorkingDayName) {
        this.WorkingDayName = WorkingDayName;
    }

    public Time getStartTime() {
        return StartTime;
    }

    public void setStartTime(Time StartTime) {
        this.StartTime = StartTime;
    }

    public Time getFinishTime() {
        return FinishTime;
    }

    public void setFinishTime(Time FinishTime) {
        this.FinishTime = FinishTime;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    private ControlerWorkingday controlWorkingday;
    private Workingday workingday;
    private List<Workingday> listWorkingday = new ArrayList<>();  

    public BeanWorkingday() {
    }

     public List<Workingday> List() {
        controlWorkingday = new ControlerWorkingday();
        controlWorkingday.List();
        this.listWorkingday=controlWorkingday.List();
        return listWorkingday;
    }

    public String add(){
        controlWorkingday =new ControlerWorkingday();
        try
        {
         controlWorkingday.Add(workingday);  
         return "index";
        }catch(Exception e){
            
        }return "Creado Con Exito"; 
    }     */

}
