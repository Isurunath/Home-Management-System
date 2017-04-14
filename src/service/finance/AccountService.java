
package service.finance;

import utility.Validations;
import dao.finance.AccountDAO;
import model.finance.Account;
import java.util.List;

public class AccountService {
    
    public static void addAccount(Account accounts) {
        
    	if(Validations.Validate(accounts)){
            AccountDAO.addAccount(accounts);
        } 
    }
    
    public static List<Account> LoadAccountTable(){		
	return AccountDAO.LoadAccountTable();
    }
    
    public static List<Account> LoadcomboList() {		
	return AccountDAO.LoadcomboList();	
    }
    
    public static void updateAccount(Account a){
	AccountDAO.updateAccount(a);
    }
    
    public static void DeleteAccount(String aNo){		
	AccountDAO.DeleteAccount(aNo);
    }
           
    public static List<Account> LoadSearchedAccountTable(String searchAccount){        
        return AccountDAO.LoadSearchedAccountTable(searchAccount);
    }
    
    public static Long CountAccountNo(String Accid){
		
        Long count = AccountDAO.CountAccountNo(Accid);
        return count;
    }
    
    public static List<Account> LoadAccountNo(String Accid){
		
	return AccountDAO.LoadAccountNo(Accid);
    }
}
