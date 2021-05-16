package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.green.bank.model.AccountModel;
import com.green.bank.model.DepositSchemeModel;
import com.green.bank.model.LoanModel;

public interface BankDAO {
	public boolean insertAccountDetails(AccountModel model);

	public boolean insertLoanDetails(LoanModel model);

	public AccountModel getAccountDetails(String account_no) throws SQLException;

	public boolean insertDepositScheme(DepositSchemeModel model);

	public ArrayList<LoanModel> getLoanList() throws SQLException;

	public void UpdateAmount(String account_no, int loan_amount) throws SQLException;

}
