package fa.training.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee", schema = "dbo")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id", columnDefinition = "INT", unique = true)
	private int employeeId;
	@Column(name="first_name", columnDefinition = "VARCHAR(255)")
	private String firstName;
	@Column(name="last_name", columnDefinition = "VARCHAR(255)")
	private String lastName;
	@Column(name="gender", columnDefinition = "int")
	private int gender;
	@Column(name="date_of_birth", columnDefinition = "date")
	private LocalDate dateOfBirth;
	@Column(name="phone", columnDefinition = "VARCHAR(20)")
	private String phone;
	@Column(name="address", columnDefinition = "VARCHAR(255)", nullable = false)
	private String address;
	@Column(name="department_name", columnDefinition = "VARCHAR(255)")
	private String departmentName;
	@Column(name="remark", columnDefinition = "VARCHAR(1000)",nullable = false)
	private String remark;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Account account;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param phone
	 * @param address
	 * @param departmentName
	 * @param remark
	 */
	public Employee(String firstName, String lastName, int gender, LocalDate dateOfBirth, String phone,
			String address, String departmentName, String remark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.address = address;
		this.departmentName = departmentName;
		this.remark = remark;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", address=" + address
				+ ", departmentName=" + departmentName + ", remark=" + remark + "]";
	}
	
	
	
}
