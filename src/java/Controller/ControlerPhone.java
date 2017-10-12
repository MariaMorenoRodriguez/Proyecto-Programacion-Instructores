
package Controller;

import Model.Phone;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ControlerPhone {
    
    private List<Phone> ListPhone;
    private Phone p;
    Session sesion;
    Transaction trs;     

    public ControlerPhone() {
    }

   public List<Phone> List(){
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListPhone=sesion.createQuery("from Phone").list();
            for(Phone i: ListPhone){
                Hibernate.initialize(i.getIdPhone());
                Hibernate.initialize(i.getPhonenumber());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        
        return ListPhone;
    }
 }
    public String Add(Phone ac)throws Exception{
       
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
