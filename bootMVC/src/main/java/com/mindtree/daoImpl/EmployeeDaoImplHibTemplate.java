package com.mindtree.daoImpl;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;

public class EmployeeDaoImplHibTemplate implements EmployeeDao {
	
	HibernateTemplate template;
	
	public EmployeeDaoImplHibTemplate() {
		super();
	}
	public EmployeeDaoImplHibTemplate(HibernateTemplate template)
	{
		super();
		this.template = template;
	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Override
	public String addEmployee(Employee emp) {
		Session s = template.getSessionFactory().openSession();
		s.save(emp);
		s.beginTransaction().commit();
		return "Successfully Added...";
	}

	@Override
	public String deleteEmployee(String name) {
		Session s = template.getSessionFactory().openSession();
		s.delete(template.get(Employee.class, name));
		s.beginTransaction().commit();
		return "Deleted Successfully...";
	}

	@Override
	public List<Employee> getAllEmployee() {
		return template.loadAll(Employee.class);
	}

	@Override
	public Employee getEmployeeByName(String name) 
	{
		//System.out.println("Dao");
		//System.out.println(template.get(Employee.class,name));
		return (Employee) template.get(Employee.class,name);
	}

	@SuppressWarnings("deprecation")
	@Transactional(readOnly=false)
	@Override
	public String UpdatePassword(String email, String password) {
		//template.bulkUpdate("update employee set password=:pass where name=:name");
		//Employee e = getEmployeeByName(email);
		Session s  = template.getSessionFactory().openSession();
		Query q=s.createSQLQuery("update Employee set password='"+password+"' where emailid='"+email+"'");
		//q.executeUpdate();
		s.beginTransaction().commit();
		//Query q=s.createQuery("update Employee set password=:pwd where emailid=:emailId").setParameter("pwd", password).setParameter("emailId", email);
		//int i = q.executeUpdate();
		//System.out.println(i);
		//s.update(template.get(Employee.class, email));
		//s.beginTransaction();
		//System.out.println(e.toString());
		//e.setPassword(password);
		//System.out.println(e.toString());
		//template.update(e);
		//Employee e = getEmployeeByName(name);
		//template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		//template.update(password , e);
		return "Updated successfully...";
	}

}
