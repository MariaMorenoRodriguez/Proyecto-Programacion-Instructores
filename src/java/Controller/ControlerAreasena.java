
package Controller;

import Model.Areasena;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerAreasena {
    
        private List<Areasena> ListAreasena;
    private Areasena ar;
    Session sesion;
    Transaction trs; 

    public ControlerAreasena() {
    }

   public List<Areasena> List()
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListAreasena=sesion.createQuery("from Areasena").list();
            for(Areasena arse: ListAreasena){
                Hibernate.initialize(arse.getIdAreaSena());
                Hibernate.initialize(arse.getNameArea());
            }
            trs.commit();
            
        }catch(Exception e){
            trs.rollback();
        }
        return ListAreasena;
    }
    public String Add(Areasena a)throws Exception{
       
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
        try
        {
            trs=sesion.beginTransaction();
            sesion.save(a);
            trs.commit();
            sesion.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return "si";
    }  
}
