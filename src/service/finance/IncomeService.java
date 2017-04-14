
package service.finance;

import dao.finance.IncomeDAO;
import model.finance.Incomedetails;
import utility.Validations;
import java.util.List;

public class IncomeService {
    
    public static void addIncome(Incomedetails income) {
    	
    	if(Validations.Validate(income)){
    		IncomeDAO.addIncome(income);
    	} 
    }
    
    public static List<Incomedetails> LoadIncomeTable(){
		
		return IncomeDAO.LoadIncomeTable();
	}
    
    public static List<Incomedetails> LoadcomboList() {
		
		return IncomeDAO.LoadcomboList();
		
	}
    
    public static void updateIncome(Incomedetails i){
		IncomeDAO.updateIncome(i);
	}
    
    public static void DeleteIncome(String Iid){
		
		IncomeDAO.DeleteIncome(Iid);
	}
    
    public static List<Incomedetails> LoadSearchedIncomeTable(String inc){        
        return IncomeDAO.LoadSearchedIncomeTable(inc);
    }
}
