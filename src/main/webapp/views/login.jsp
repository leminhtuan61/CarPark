<!DOCTYPE html>

<html lang="en">

<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/loginStyle.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>


</head>

<body>
	<div class="container">
		<div class="row">
			<div class="card card-login" style="width: 25rem;">
				<div class="header-login">
					<h2 class="text-center mt-3">Member login</h2>
					<label style="color: red">${errorMessage}</label>
				</div>
				<form action="${pageContext.request.contextPath}/AccountController"
					method="post" class="form-login" id="formLogin" name="formLogin">
					<div class="input-icons">
						<i class="fas fa-user icon"></i> <input type="text"
							class="input-field" id="usernameLogin" name="username"
							placeholder="Username" size="50">
					</div>
					<div class="input-icons">
						<i class="fas fa-lock icon"></i> <input type="password"
							class="input-field" id="password" name="password"
							placeholder="Password" size="50">
					</div>
					<button type="submit" class="btn btn-success btn-login">Login</button>
				</form>
				<div class="card-header text-center">
					<a href="">Forgot Password?</a>
				</div>
			</div>
		</div>
	</div>

</body>

</html>