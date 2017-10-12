
package Controller;


import Model.State;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerState {
    
    private List<State> ListState;
    Session sesion;
    Transaction trs;
    
   public List<State>List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        trs=sesion.beginTransaction();
        try{
            ListState=sesion.createQuery("from State").list();
        }
        catch(Exception e){
            
        }
        return ListState;
 
    }
    public String Add(State ac)throws Exception{
       
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
        try
        {
            trs=sesion.beginTransaction();
            sesion.save(ac);
            trs.commit();
            sesion.close();
        }
        catch(Exception e){
        }
        
        return "si";
    }      

    
}
