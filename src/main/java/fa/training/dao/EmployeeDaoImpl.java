package fa.training.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import fa.training.entities.Employee;
import fa.training.utils.HibernateUtils;

public class EmployeeDaoImpl implements EmployeeDao {
	Session session;
	Transaction transaction;

	@Override
	public List<Employee> getAllEmployee() throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query<Employee> query = session.createQuery("FROM Employee");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public int getTotalRecordEmployee() throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query<Long> query = session.createQuery("SELECT COUNT(*) FROM Employee");
			return query.list().get(0).intValue();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public List<Employee> getEmployeePagination(int form, int to) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);
			Root<Employee> root = criteria.from(Employee.class);
			criteria.select(root);
			Query<Employee> query = session.createQuery(criteria);
			query.setFirstResult(form);
			query.setMaxResults(to);
			return query.getResultList();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public boolean save(Employee emp) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			return true;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployeeByFilter(String filter, String searchKeyword) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query<Employee> query = session.createQuery("FROM Employee e WHERE e."+filter+" LIKE :filter").setParameter("filter", "%" + searchKeyword + "%");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployeeByName(String searchKeyword) throws Exception {
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			Query<Employee> query = session.createQuery("FROM Employee e WHERE e.firstName LIKE :filter1 or e.lastName LIKE :filter2");
			query.setParameter("filter1", "%"+searchKeyword+"%");
			query.setParameter("filter2", "%"+searchKeyword+"%");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}



}
