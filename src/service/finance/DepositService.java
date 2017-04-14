
package service.finance;

import dao.finance.DepositDAO;
import model.finance.Deposit;
import utility.Validations;
import java.util.List;

public class DepositService {
    
    public static void addDeposit(Deposit deposits) {
    	
    	if(Validations.Validate(deposits)){
    		DepositDAO.addDeposit(deposits);
    	} 
    }
    
    public static List<Deposit> LoadDepositTable(){
		
		return DepositDAO.LoadDepositTable();
	}
    
    public static List<Deposit> LoadcomboList() {
		
		return DepositDAO.LoadcomboList();
		
	}
    
    public static void updateDeposit(Deposit d){
		DepositDAO.updateDeposit(d);
	}
    
    public static void DeleteDeposit(String depID){
		
		DepositDAO.DeleteDeposit(depID);
	}
    
    public static List<Deposit> LoadSearchedDepositTable(String deposit){        
        return DepositDAO.LoadSearchedDepositTable(deposit);
    }
    
    
}
