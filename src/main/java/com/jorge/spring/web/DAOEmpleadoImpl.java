
package com.jorge.spring.web;
  import static com.jorge.spring.web.DAO.close;
import static com.jorge.spring.web.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import java.util.ArrayList;


public class DAOEmpleadoImpl {
 

/**
 *
 * @author T-10A
 */
public class DAOEmpleadoImpl extends DAO {
    
 public void agregarEmpleado(Empleado Empleado) {
    begin();
    getSession().save(Empleado);
    commit();
    close();
    
    }
 
       
    public ArrayList<Empleado> buscarTodosEmpleado() {
        begin();
        Query q = getSession().createQuery("from Empleado");
      
        ArrayList<Empleados> empleados = (ArrayList<Empleado>)q.list();
        commit();
        close();
         
return empleados; 
        
      
    }
   
 public void borrarAlumno(Empleado p){
            begin();
             getSession().delete(p);
            commit();
            close();
 }   
        
  public Empleado buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Empleado where id = :id");
        q.setInteger("id",id);
        Empleado p = (Empleado)q.uniqueResult();
        commit();
        close();
return p;  
   
  }  }

}
