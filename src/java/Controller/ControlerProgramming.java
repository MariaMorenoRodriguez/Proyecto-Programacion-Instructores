
package Controller;

import Model.Programming;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ControlerProgramming {
    
    private List<Programming> ListProgramming;
    private Programming pro;
    Session sesion;
    Transaction trs;       

    public ControlerProgramming() {
    }

   public List<Programming>List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListProgramming=sesion.createQuery("from Programming").list();
            for(Programming team: ListProgramming){
                Hibernate.initialize(team.getIdProgramming());
                Hibernate.initialize(team.getHoursToWork());
                Hibernate.initialize(team.getDaysToWork());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListProgramming;
    }
    public String Add(Programming ac)throws Exception{
       
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
