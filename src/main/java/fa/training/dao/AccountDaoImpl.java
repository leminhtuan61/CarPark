package fa.training.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import fa.training.entities.Account;
import fa.training.utils.HibernateUtils;

public class AccountDaoImpl implements AccountDao {
	Session session;
	Transaction transaction;

	@Override
	public Account getAccountByAccount(String account) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query<Account> query = session.createQuery("FROM Account WHERE account=:account").setParameter("account",
					account);
			if (query.list().size() == 0) {
				return null;
			} else {
				return query.list().get(0);
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public boolean save(Account account) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(account);
			transaction.commit();
			return true;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
