package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static  void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findbyid(2);
		
		System.out.println("=== Teste 1 ===");
		System.out.print(seller);
		

	}
}
