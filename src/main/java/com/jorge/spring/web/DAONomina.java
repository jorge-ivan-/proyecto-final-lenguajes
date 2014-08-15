

package com.jorge.spring.web;

import java.util.ArrayList;
import static com.jorge.spring.web.DAO.close;
import static com.jorge.spring.web.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Criteria;

public class DAONomina {
    

/**
 *
 * @author campitos
 */
public class DAONominaImpl extends DAO{
    public void agregarSaldo(Nomina cliente)  {
    begin();
    getSession().save(cliente);
    commit();
    close();
    
    }
    
     public ArrayList<Nomina> buscarTodosClientes() {
        begin();
      //  Query q = getSession().createQuery("from Usuario");
        Criteria c=getSession().createCriteria(Nomina.class);
        ArrayList<Nomina> clientes = (ArrayList<Nomina>)c.list();
        commit();
        close();
         
return clientes; 
}
}

}
