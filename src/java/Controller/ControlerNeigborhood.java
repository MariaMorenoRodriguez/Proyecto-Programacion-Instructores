
package Controller;

import Model.Neigborhood;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerNeigborhood {
    private List<Neigborhood> ListNeigborhood;
    private Neigborhood nei;
    Session sesion;
    Transaction trs;       

    public ControlerNeigborhood() {
    }

    public List<Neigborhood> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListNeigborhood=sesion.createQuery("from Neigborhood").list();
            for(Neigborhood arse: ListNeigborhood){
                Hibernate.initialize(arse.getIdNeigBorhood());
                Hibernate.initialize(arse.getNameNeigBorhood());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        return ListNeigborhood;
    }
    public String Add(Neigborhood a)throws Exception{
       
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
