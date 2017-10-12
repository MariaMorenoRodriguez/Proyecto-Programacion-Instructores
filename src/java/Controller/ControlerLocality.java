
package Controller;

import Model.Locality;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerLocality {
    private List<Locality> ListLocality;
    private Locality loc;
    Session sesion;
    Transaction trs;

    public ControlerLocality() {
    }

    public List<Locality> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListLocality=sesion.createQuery("from Locality").list();
            for(Locality arse: ListLocality){
                Hibernate.initialize(arse.getIdLocality());
                Hibernate.initialize(arse.getNameLocality());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListLocality;
    }
    public String Add(Locality a)throws Exception{
       
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
        try
        {
            trs=sesion.beginTransaction();
            sesion.save(a);
            trs.commit();
            sesion.close();
        }
        catch(HibernateException e){
        }
        
        return "si";
    }     
    
        
    
}
