
package Controller;

import Model.Activitytype;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerActivitytype {
    
    private List<Activitytype> ListActivitytype;
    private Activitytype act;
    Session sesion;
    Transaction trs; 

    public ControlerActivitytype() {
    }

   public List<Activitytype> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListActivitytype=sesion.createQuery("from Teamformationarea").list();
            for(Activitytype team: ListActivitytype){
                Hibernate.initialize(team.getIdActivityType());
                Hibernate.initialize(team.getNameActivityType());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListActivitytype;
    }
    public String Add(Activitytype ac)throws Exception{
       
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
        try
        {
            trs=sesion.beginTransaction();
            sesion.save(ac);
            trs.commit();
            sesion.close();
        }
        catch(HibernateException e){
        }
        
        return "si";
    }    
}
