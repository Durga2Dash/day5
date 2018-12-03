package com.mindtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


	
@SpringBootApplication
//@EnableOAuth2Sso
public class BootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcApplication.class, args);
		//EmployeeServiceImpl es = Config.getEmployeeService();
		//Employee e = new Employee();
		//System.out.println( es.getEmployeeByName("ab@abc.com").getName());
		//try(Scanner sc1 = new Scanner(System.in))
		//{
//			System.out.println("Enter emailId for password updation: ");
//			String email = sc1.next();
//			System.out.println("Enter the password: ");
//			String pass = sc1.next();
//			System.out.println(es.UpdatePassword(email, pass));
//			System.out.println("Enter name to be deleted: ");
//			String name = sc1.next();
//			es.deleteEmployee(name);
			
		//}
		
				
		//System.out.println(e.toString());
	}
}