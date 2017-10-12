
package Controller;


import Model.Typegroup;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerTypegroup {
    
    private List<Typegroup> ListTypegroup;
    private Typegroup act;
    Session sesion;
    Transaction trs; 

    public ControlerTypegroup() {
    }

   public List<Typegroup> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListTypegroup=sesion.createQuery("from Typegroup").list();
            for(Typegroup team: ListTypegroup){
                Hibernate.initialize(team.getIdTypeGroup());
                Hibernate.initialize(team.getNameTypeGroup());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListTypegroup;
    }
    public String Add(Typegroup ac)throws Exception{
       
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
