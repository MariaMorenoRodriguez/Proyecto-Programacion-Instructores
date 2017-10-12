
package Controller;

import Model.Userp;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerUserp {
    
    private List<Userp> ListUserp;
    private Userp act;
    Session sesion;
    Transaction trs; 

    public ControlerUserp() {
    }

   public List<Userp> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListUserp=sesion.createQuery("from Userp").list();
            for(Userp team: ListUserp){
                Hibernate.initialize(team.getIdUser());
                Hibernate.initialize(team.getPasswordU());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListUserp;
    }
    public String Add(Userp ac)throws Exception{
       
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
