package DAO;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main{
    //final static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) throws IllegalAccessException,InvocationTargetException,SQLException{
        Factory factory= new Factory();
        Session session = factory.openSession();
        int res =session.initBD();
        if(res==0) {
            Employee empleado = new Employee("JJ", "Soledispa", 23000);
            session.get(12, empleado.getClass());
            session.delete(12, empleado.getClass());
            session.save(empleado);
            session.update(empleado, 12);
        }
    }
}
