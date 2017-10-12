
package Controller;

import Model.Person;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ControlerPerson {
    
    private List<Person> ListPer;
    private Person per;
    Session sesion;
    Transaction trs;    

    public ControlerPerson() {
    }

    
    public List<Person> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListPer=sesion.createQuery("from Person").list();
            for(Person g: ListPer){
                Hibernate.initialize(g.getIdPerson());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListPer;
    }
    public String Add(Person ac)throws Exception{
       
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
