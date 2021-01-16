package fa.training.dao;

import fa.training.entities.Account;

public interface AccountDao {
	Account getAccountByAccount(String account) throws Exception;
	boolean save(Account account) throws Exception;
}
