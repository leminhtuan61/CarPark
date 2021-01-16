package fa.training.entities;

import javax.persistence.*;

@Entity
@Table(name="Account", schema = "dbo")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_id", columnDefinition = "INT", unique = true)
	private int accountId;
	@Column(name="account", columnDefinition = "VARCHAR(255)", unique = true)
	private String account;
	@Column(name="email", columnDefinition = "VARCHAR(255)", unique = true)
	private String email;
	@Column(name="password", columnDefinition = "VARCHAR(255)")
	private String password;
	@Column(name="status", columnDefinition = "INT", nullable = false)
	private int status;
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param accountId
	 * @param account
	 * @param email
	 * @param password
	 * @param status
	 * @param employee
	 */
	public Account(String account, String email, String password, int status, Employee employee) {
		this.account = account;
		this.email = email;
		this.password = password;
		this.status = status;
		this.employee = employee;
	}
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", account=" + account + ", email=" + email + ", password="
				+ password + ", status=" + status + "]";
	}
	
	
	
}
