
package Controller;

import Model.Typespaceformation;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerTypespaceformation {
    
        private List<Typespaceformation> ListTypespaceformation;
    private Typespaceformation act;
    Session sesion;
    Transaction trs; 

    public ControlerTypespaceformation() {
    }
    
   public List<Typespaceformation> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListTypespaceformation=sesion.createQuery("from Typespaceformation").list();
            for(Typespaceformation team: ListTypespaceformation){
                Hibernate.initialize(team.getIdTypeSpaceFormation());
                Hibernate.initialize(team.getNameSpaceFormation());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListTypespaceformation;
    }
    public String Add(Typespaceformation ac)throws Exception{
       
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
