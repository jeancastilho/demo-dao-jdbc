package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller insert ===");
		Department newDepartment = new Department(null, "Mobile");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: seller update ===");
		department = departmentDao.findById(7);
		department.setName("Matha Waine");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		departmentDao.deleteById(8);
		System.out.println("Delete completed");
	}
	
	

}
