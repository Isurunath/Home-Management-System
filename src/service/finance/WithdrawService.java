
package service.finance;

import dao.finance.WithdrawDAO;
import model.finance.Withdrawal;
import utility.Validations;
import java.util.List;

public class WithdrawService {
    
     public static void addWithdraw(Withdrawal withdraw) {
    	
    	if(Validations.Validate(withdraw)){
    		WithdrawDAO.addWithdraw(withdraw);
    	} 
    }
    
    public static List<Withdrawal> LoadWithdrawTable(){
		
		return WithdrawDAO.LoadWithdrawTable();
	}
    
    public static List<Withdrawal> LoadcomboList() {
		
		return WithdrawDAO.LoadcomboList();
		
	}
    
    public static void updateWithdraw(Withdrawal w){
		WithdrawDAO.updateWithdraw(w);
	}
    
    public static void DeleteWithdraw(String witID){
		
		WithdrawDAO.DeleteWithdraw(witID);
	}
    
    public static List<Withdrawal> LoadSearchedWithdrawTable(String wit){        
        return WithdrawDAO.LoadSearchedWithdrawTable(wit);
    }
    
}
