<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Employee Detail</h2>

<table class="table" border="1" cellpadding="5" cellspacing="5">
	<thead class="thead-light">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Name</th>
			<th scope="col">Date of Birth</th>
			<th scope="col">Address</th>
			<th scope="col">Phone Number</th>
			<th scope="col">Department</th>
			<th scope="col">Remark</th>
			<th scope="col">Gender</th>

		</tr>

	</thead>
	<tbody>

		<tr>
			<td>${employees.employeeId}</td>
			<td>${employees.firstName}${employees.lastName}</td>
			<td>${employees.dateOfBirth}</td>
			<td>${employees.phone}</td>
			<td>${employees.address}</td>
			<td>${employees.departmentName}</td>
			<td>${employees.remark}</td>
			<td>${employees.gender}</td>

		</tr>


	</tbody>

</table>


