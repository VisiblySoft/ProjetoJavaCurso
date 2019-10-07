package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
Scanner sc = new  Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findbyid(2);
		
		System.out.println("=== Teste 1 SELECIONA por ID ===");
		System.out.print(dep);
		
		
System.out.println("\n=== Teste 2 Seleciona todos ===");
		
		List<Department> list = departmentDao.findAll();
		
		for(Department obj: list) {
			System.out.println(obj);
		}
		
System.out.println("\n=== Teste 3 Inserir ===");
		
        Department department = new Department(null, "Desenvolvimento");
	    departmentDao.insert(department);
		System.out.println(department);
	
		
System.out.println("\n=== Teste 4 update ===");
        dep = departmentDao.findbyid(6);
        
        dep.setName("Desennvolvimento  n&a");
        
        departmentDao.update(dep);
        
        System.out.println("Registroo atualizado");
        
 System.out.println("\n=== Teste 5 Delete ===");
        departmentDao.delete(7);
         
        System.out.println("Registroo apagado");  

        sc.close();
	}
	
}
	
