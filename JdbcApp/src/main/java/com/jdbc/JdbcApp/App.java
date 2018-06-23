package com.jdbc.JdbcApp;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/jdbc/jdbcApp/application-context.xml"));
    
        EmployeeDao employeeDao=factory.getBean("employeeDao", EmployeeDao.class);
       Object l =  employeeDao.getAllEmployee();
      System.out.println(l);
      /*for(Employee e : l){
    	  System.out.println(e);
      }*/
     /* int employeeStatus = employeeDao.saveEmployee(new Employee(6, "mayadnkl", 25000)) ;
      System.out.println(employeeStatus);*/
/*      int addressStatus = employeeDao.saveAddress(new Address1(105, "Jaisinghpur", "mau", 6));
      System.out.println(addressStatus);*/
     /* int dept = employeeDao.saveDepartment(new Department(201, "IT", "Hyd", 6));
      System.out.println(dept);*/
        
    }
}
