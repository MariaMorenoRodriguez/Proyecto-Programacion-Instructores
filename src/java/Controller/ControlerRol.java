
package Controller;

import Model.Rol;
import Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ControlerRol {
    
    private List<Rol> ListRol;
    private Rol act;
    Session sesion;
    Transaction trs; 

    public ControlerRol() {
    }

   public List<Rol> List(){
       
    {
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        
    try
        {
            trs=sesion.beginTransaction();
            ListRol=sesion.createQuery("from Rol").list();
            for(Rol team: ListRol){
                Hibernate.initialize(team.getIdrol());
                Hibernate.initialize(team.getNameRol());
            }
            trs.commit();
            
        }catch(HibernateException e){
            trs.rollback();
        }
        
        return ListRol;
    }
}
    public String Add(Rol ac)throws Exception{
       
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
