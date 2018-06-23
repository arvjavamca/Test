package com.jdbc.JdbcApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao {
	//@Autowired
	private JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int saveEmployee(Employee e){
		 final  String SAVE_RECORDS="insert into Employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		 return template.update(SAVE_RECORDS);
		
	}
	public int saveAddress(Address1 adr){
		final String SAVE_ADDRESS="insert into Address1 values('"+adr.getAddrressId()+"','"+adr.getAddress1()+"','"+adr.getAddress2()+"','"+adr.getId()+"')";
		return template.update(SAVE_ADDRESS);
	}
	public int saveDepartment(Department dep){
		final String SAVE_DEPT="insert into Department values('"+dep.getDid()+"','"+dep.getName()+"','"+dep.getLocation()+"','"+dep.getId()+"')";
		return template.update(SAVE_DEPT);
	}
/*	private final static String EMPLOYEE_RECORDS="SELECT e. FROM EMPLOYEE e,ADDRESS a WHERE e.id=a.id ";
*/	
	private final static String EMPLOYEE_RECORDS="select * from employee";
	//private final static String ADDRESS_RECORDS="select * from address1 where id=?";

	public List<Employee> getAllEmployee(){
		
		return (List<Employee>) template.query(EMPLOYEE_RECORDS, new ResultSetExtractor<List<Employee>>(){

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				//List l = new ArrayList<Employee>();
				/*while(rs.next()){
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				l.add(e);
				}*/
				List list = new ArrayList<Employee>();
				Employee emp = new Employee();

				while(rs.next()){
					emp.setId(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setSalary(rs.getFloat(3));
					//emp.setAddress((Address1) getAddress(emp.getId()));
					//emp.setAddress1(List<Address1>)getAddress(emp.getId());
					//emp.setAddress1(getAddress(emp.getId()));
					emp.setAddress1(getAddress(emp.getId()));
					emp.setDept(getDepartment(emp.getId()));

					//emp.setId(deleteAddr(rs.getInt(1)));
					list.add(emp);
					//System.out.println(list);

					
					
					
				}
				return list;
				
			}
			
			
		});
		
	}
	public Department getDepartment(int empId){
		String DEPARTMENT_RECORDS = "select * from department where id="+empId;
		return template.query(DEPARTMENT_RECORDS, new ResultSetExtractor<Department>(){

			public Department extractData(ResultSet rs) throws SQLException, DataAccessException {
				Department dept = new Department();
				while(rs.next()){
					dept.setDid(rs.getInt(1));
					dept.setName(rs.getString(2));
					dept.setLocation(rs.getString(3));
					dept.setId(rs.getInt(4));
				}
				return dept;
			}
			
		});
	}
	
	
public List<Address1> getAddress(int empID){
	
	String ADDRESS_RECORDS="select * from address1 where id= "+empID;
		
		return (List<Address1>) template.query(ADDRESS_RECORDS, new ResultSetExtractor<List<Address1>>(){

			public List<Address1> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<Address1> lt = new ArrayList<Address1>();

				List l = new ArrayList<Address1>();
				//Address1 adr = new Address1();
					Address1 adr1 = new Address1();

				
				while(rs.next()){

					adr1.setAddrressId(rs.getInt(1));
					adr1.setAddress1(rs.getString(2));
					adr1.setAddress2(rs.getString(3));
					adr1.setId(rs.getInt(4));
					//adr1.setId(deleteAddr(rs.getInt(4)));
					l.add(adr1);
					

					
				}
				return l;
				
			}
			
			
		});
		
	}
public int deleteAddr(int id){
	String q = "delete from Employee where id= "+id;
	return template.update(q);
	
}

}
