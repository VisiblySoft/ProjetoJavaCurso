package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static  void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findbyid(2);
		
		System.out.println("=== Teste 1 ===");
		System.out.print(seller);
		
		System.out.println("\n=== Teste 2 ===");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
       System.out.println("\n=== Teste 3 ===");
		
	   list = sellerDao.findAll();
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		 System.out.println("\n=== Teste 4 ===");
		 
		 Seller newseller = new Seller(null, "Renata Carvalho", "renatacarvalho@gmail", new Date(), 4000.0, department);
		
		 sellerDao.insert(newseller);
		 
		 System.out.println("Registro inserido = "+ newseller.getId());
		 
		 
         System.out.println("\n=== Teste 5 update ===");
		 
		 seller = sellerDao.findbyid(12);
		 
		 seller.setBaseSalary(5000.0);
		 
		 sellerDao.update(seller);
		 
	     System.out.println("Registro atualizado!");
	     
	     
         System.out.println("\n=== Teste 6 Delete ===");
         System.out.print("Informe o ID do vendedor para deletar!");
         int id = sc.nextInt();
         
         sellerDao.delete(id);
		
		 
	     System.out.println("Registro deletado!");
	
	
	}
}
