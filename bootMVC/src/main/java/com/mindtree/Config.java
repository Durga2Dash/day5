package com.mindtree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.mindtree.daoImpl.EmployeeDaoImplHibTemplate;
import com.mindtree.serviceImpl.EmployeeServiceImpl;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {

	static ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	
	public static EmployeeDaoImplHibTemplate getEmployeeDao()
	{
		return con.getBean("empDao",EmployeeDaoImplHibTemplate.class);
	}
	public static EmployeeServiceImpl getEmployeeService()
	{
		return con.getBean("empService", EmployeeServiceImpl.class);
	}
//	public static LoginValidationDao LoginValidation()
//	{
//		return con.getBean("loginDao",*******.class);
//	}
	/*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                    .disable()
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/index.html")
                    .permitAll()
                .anyRequest()
                    .authenticated();
    }*/
	
}
