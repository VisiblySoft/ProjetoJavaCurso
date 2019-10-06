package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static  void main(String[] args) {
		
		
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
	
	}
}
