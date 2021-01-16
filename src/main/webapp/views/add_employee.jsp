
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" />
<div class="card-body">
	<h2>Add Employee</h2>
	<label style="color: green">${successMessage}</label>
	<form action="#" id="addEmployeeForm" method="post">
		<div class="form-group">
			<label for="firstName">First Name</label> <input type="text"
				class="form-control" id="firstName" name="firstName"
				placeholder="Enter the first name" value="${employee.firstName}">
		</div>
		<div class="form-group">
			<label for="lastName">Last Name</label> <input type="text"
				class="form-control" id="lastName" name="lastName"
				placeholder="Enter the last name" value="${employee.lastName}">
		</div>
		<div class="form-group">
			<label for="phone">Phone number</label> <input type="text"
				class="form-control" id="phone" name="phone"
				placeholder="Enter the phone number" value="${employee.phone}">
		</div>
		<div class="form-group">
			<label for="dateOfBirth">Date of birth</label> <input type="date"
				class="form-control" id="dateOfBirth" name="dateOfBirth"
				placeholder="mm/dd/yyyy"
				value="<fmt:formatDate 
			value='${employee.dateOfBirth}' pattern='yyyy-MM-dd' />">

		</div>
		<label for="gender">Gender:</label>
		<div class="form-check-inline">
			<label class="form-check-label"> <input type="radio"
				class="form-check-input" name="gender" value="1" checked>Male
			</label>
		</div>

		<div class="form-check-inline">
			<label class="form-check-label"> <input type="radio"
				class="form-check-input" name="gender" value="0"
				${employee.gender==0 ? 'checked' : '' }>Female
			</label>
		</div>


		<br> <br>
		<div class="form-group">
			<label for="account">Account</label> <input type="text"
				class="form-control" id="account" name="account"
				placeholder="Enter account" value="${account.account }">
		</div>
		<div class="form-group">
			<label for="email">Email</label> <input type="email"
				class="form-control" id="email" name="email"
				placeholder="Enter email address" value="${account.email }">
		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password"
				class="form-control" id="password" name="password"
				placeholder="Enter password" value="${account.password }"
				pattern="^(?=\\S*[a-z])(?=\\S*[A-Z])\\S{6,}$"
				title="Password must include uppercase lowercase and number.">
		</div>
		<div class="form-group">
			<label for="address">Address</label>
			<textarea type="text" class="form-control" id="address"
				name="address" placeholder="Enter address"
				value="${employee.address}"></textarea>
		</div>
		<div class="form-group">
			<label for="status">Status</label><br> <input type="checkbox"
				name="status" id="status" value="1"
				${account.status==0 ? 'checked' : '' }> Active</input>

		</div>
		<div class="form-group">
			<label for="departmentName">Department</label> <select
				class="form-control" id="departmentName" name="departmentName"
				value="${employee.departmentName}">
				<option value="Fsoft">Fsoft</option>
				<option value="VNPT">VNPT</option>
				<option value="Viettel">Viettel</option>

			</select>
		</div>
		<div class="form-group">
			<label for="remark">Remark</label>
			<textarea type="text" class="form-control" id="remark" name="remark"
				value="${employee.remark}"></textarea>
		</div>
		<button type="button" class="btn btn-success" id="btn-addEmp"
			contextPath="${pageContext.request.contextPath}">Add</button>
		<button type="reset" class="btn btn-danger">Reset</button>
		<button type="button" id="btn-back"
			contextPath="${pageContext.request.contextPath}"
			class="btn btn-warning">Back</button>
	</form>
</div>
<script
	src="${pageContext.request.contextPath}/resources/js/add-employee.js"></script>
