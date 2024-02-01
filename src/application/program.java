package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Test 1: seller findyById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}
}
