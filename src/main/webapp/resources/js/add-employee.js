$(document).ready(function() {
	$("#btn-addEmp").click(function() {
		var firstName = $("#firstName").val();
		var lastName = $("#lastName").val();
		var phone = $("#phone").val();
		var gender = $("input[name=gender]:checked").val();
		var dateOfBirth = $("#dateOfBirth").val();
		var account = $("#account").val();
		var email = $("#email").val();
		var password = $("#password").val();
		var address = $("#address").val();
		var status = $("input[name=status]:checked").val();
		var departmentName = $("#departmentName").val();

		var remark = $("#remark").val();
		var contextPath = $(this).attr("contextPath");

		$.post({
			url : contextPath + "/add",
			data : {
				firstName : firstName,
				lastName : lastName,
				phone : phone,
				gender : gender,
				dateOfBirth : dateOfBirth,
				account : account,
				email : email,
				password : password,
				address : address,
				status : status,
				departmentName : departmentName,
				remark : remark
			},
			success : function(response) {
				$("#context").html(response);
			}
		});
	});
});
$(document).ready(function() {

	$("#btn-back").click(function() {
		var contextPath = $(this).attr("contextPath");
		$.get({
			url : contextPath + "/Home",
			success : function(response) {
				$("#context").html(response);

			},
		});
	})
});
