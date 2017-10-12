
package Controller;

import Model.Groupp;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerGroupp {
    private List<Groupp> ListGroupp;
    private Groupp grp;
    Session sesion;
    Transaction trs;     

    public ControlerGroupp() {
    }

       public List<Groupp> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListGroupp=sesion.createQuery("from Groupp").list();
            for(Groupp g: ListGroupp){
                Hibernate.initialize(g.getIdGroup());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
       return ListGroupp;
    }
    public String Add(Groupp ac)throws Exception{
       
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
