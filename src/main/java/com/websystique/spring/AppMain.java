package com.websystique.spring;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Caisse;
import com.websystique.spring.model.Employee;
import com.websystique.spring.model.Facture;
import com.websystique.spring.model.Fonctionnaire;
import com.websystique.spring.model.Frais;
import com.websystique.spring.model.Niveau;
import com.websystique.spring.model.Reduction;
import com.websystique.spring.service.EmployeeService;
import com.websystique.spring.service.PaiementService;

public class AppMain {

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//EmployeeService service = (EmployeeService) context.getBean("employeeService");

		
		PaiementService servicePaiement = (PaiementService) context.getBean("PaiementService");
		
		/*Facture facture= new Facture();
		//facture.setPrix(55555);
		//servicePaiement.addFacture(facture, 1, 2);
		
		facture.setAvance(33.33);
		servicePaiement.updateFacture(facture,3);
		
		servicePaiement.deleteFactureByNum(1);*/
		
		/*Frais frais=new Frais("frais scolarité","pas obligatoir!");
		servicePaiement.addFrais(frais);*/
		
		/*Niveau niveau =new Niveau("2eme année bac");
		servicePaiement.addNiveau(niveau);*/
		
		//servicePaiement.setFrais_Niveau(2, 1, 9900000, "5%");

		
		//Reduction red= new Reduction("heho", "1");
		//servicePaiement.addReduction(red);
		
		//Reduction redu = new Reduction("sam","5");
		//servicePaiement.updateReduction(redu,1);
		
		//servicePaiement.deleteReductionByName("sam");
	    
		
		/*Caisse caisse=new Caisse("caisse2");
		servicePaiement.addCaisse(caisse,1);
		servicePaiement.updateCaisse(caisse, 1);
		servicePaiement.deleteCaisseByName("caisse2");*/
		 
		/*Employee employee2 = new Employee();
		employee2.setName("Dan Thomas");
		employee2.setJoiningDate(new LocalDate(2012, 11, 11));
		employee2.setSalary(new BigDecimal(20000));
		employee2.setSsn("ssn000000025487");
             service.saveEmployee(employee2);

		
		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		
		service.deleteEmployeeBySsn("ssn00000001");

		

		Employee employee = service.findBySsn("ssn00000002");
		employee.setSalary(new BigDecimal(50000));
		service.updateEmployee(employee);

		
		List<Employee> employeeList = service.findAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}*/
		
		
		context.close();
	}
}
