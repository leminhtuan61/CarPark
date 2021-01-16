<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
	<nav class="navbar navbar-expand-md navbar-light bg-darklinght">
		<a href="#" class="navbar-brand" style="margin-left: 40px;"><i
			class="fa fa-users" aria-hidden="true"></i> Employee</a>
		<button type="button" class="navbar-toggler" data-toggle="collapse"
			data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<ul class="nav navbar-nav ml-auto">
				<li class="nav-item" style="margin-top: 8px;"><label>Welcome,${account.account}</label></li>
				<li class="nav-item dropdown"><a href="#"
					class="nav-link dropdown-toggle" data-toggle="dropdown"> <i
						class="fa fa-user" aria-hidden="true"></i></a>
					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="#" id="userProfile"><i
							class="fa fa-user mr-2"></i>User Profile</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item"
							href="${pageContext.request.contextPath}/AccountLogout"><i
							class="fa fa-sign-out mr-2"></i> Logout</a>
					</div></li>

			</ul>
		</div>
	</nav>


	<div class="row">
		<div class="col-md-3 ">

			<div class=" bg-darklinght " style="height: 100%;">
				<form class=" form-inline list-group-item bg-darklinght   ">
					<div class="container-fluid input-group ">
						<input class="form-control input-lg" type="text"
							placeholder="Search.." name="search">
						<button type="submit">
							<i class="fa fa-search "></i>
						</button>
					</div>
				</form>
				<a class="list-group-item list-group-item-action nav-link"
					href="${pageContext.request.contextPath}/Home"><i
					class="fa fa-tachometer" aria-hidden="true"></i> DashBoard</a> <a
					class="list-group-item list-group-item-action nav-link"
					contextPath="${pageContext.request.contextPath}" id="listEmployee"
					href="${pageContext.request.contextPath}/list"><i
					class="fa fa-list" aria-hidden="true"></i> Employee list</a> <a
					id="addEmployee"
					class="list-group-item list-group-item-action nav-link"
					contextPath="${pageContext.request.contextPath}"><i
					class="fa fa-plus" aria-hidden="true"></i> Add employee</a>



			</div>
		</div>
		<div class="col-md-9" id="mainContents">

			<div class="card">
				<div class="card-body">
					<div class="row">
						<div class="col-md-12">
							<div class="row" style="margin-top: 30px" id="context"></div>
						</div>

					</div>
				</div>

			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="${pageContext.request.contextPath}/resources/js/home.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/add-employee.js"></script>

</body>

</html>