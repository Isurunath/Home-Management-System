/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.SalaryDAO;
import model.finance.Salary;
import utility.Validations;
import java.util.List;

/**
 *
 * @author user
 */
public class SalaryService {
    
    public static void addSalary(Salary salary) {
        
    	if(Validations.Validate(salary)){
            SalaryDAO.addSalary(salary);
        } 
    }
    
    public static List<Salary> LoadSalaryTable(){		
	return SalaryDAO.LoadSalaryTable();
    }
    
   /* public static List<Salary> LoadcomboList() {		
	return SalaryDAO.LoadcomboList();	
    }*/
    
    public static void updateSalary(Salary s){
	SalaryDAO.updateSalary(s);
    }
    
    public static void DeleteSalary(String sal){		
	SalaryDAO.DeleteSalary(sal);
    }
           
    public static List<Salary> LoadSearchedSalaryTable(String searchSalary){        
        return SalaryDAO.LoadSearchedSalaryTable(searchSalary);
    }
    
}
