
package Controller;

import Model.Spaceformation;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerSpaceformation {
    
    private List<Spaceformation> ListSpaceformation;
    private Spaceformation act;
    Session sesion;
    Transaction trs; 


    public ControlerSpaceformation() {
    }

   public List<Spaceformation> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListSpaceformation=sesion.createQuery("from Spaceformation").list();
            for(Spaceformation team: ListSpaceformation){
                Hibernate.initialize(team.getIdSpaceFormation());
                Hibernate.initialize(team.getSpaceFormation());
            }
            trs.commit();
            
        }
          catch(HibernateException e){
          trs.rollback();
        }
        return ListSpaceformation;
    }
    public String Add(Spaceformation ac)throws Exception{
       
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
