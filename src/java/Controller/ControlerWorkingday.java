
package Controller;

import Model.Workingday;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerWorkingday {
        private List<Workingday> ListWorkingday;
    private Workingday act;
    Session sesion;
    Transaction trs;

    public ControlerWorkingday() {
    }

   public List<Workingday> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListWorkingday=sesion.createQuery("from Workingday").list();
            for(Workingday team: ListWorkingday){
                Hibernate.initialize(team.getIdWorkingDay());
                Hibernate.initialize(team.getWorkingDayName());
                Hibernate.initialize(team.getStartTime());
                Hibernate.initialize(team.getFinishTime());
                
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListWorkingday;
    }
   
    public void Add (Workingday ac) throws Exception{
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trs=sesion.beginTransaction();
            sesion.save(ac);
            sesion.getTransaction().commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        finally{
           sesion.flush();
           sesion.close();
        }
    }      
}
