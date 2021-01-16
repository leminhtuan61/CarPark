$(document).ready(function() {

	$("#view-employee").click(function() {
		var contextPath = $(this).attr("contextPath");
		$.get({
			url : contextPath + "/FindEmployeeById?employeeId=1",
			success : function(response) {
				$("#context").html(response);

			},
		});
	})
});

$(document).ready(function() {

	$("#addEmployee").click(function() {
		var contextPath = $(this).attr("contextPath");
		$.get({
			url : contextPath + "/add",
			success : function(response) {
				$("#context").html(response);

			},
		});
	})
});
$(document).ready(function() {

	$(".view-employee").click(function() {
		var contextPath = $(this).attr("contextPath");
		var employeeId = $(this).attr("employeeId");

		$.get({
			url : contextPath + "/FindEmployeeById?employeeId=" + employeeId,
			success : function(response) {
				$("#context").html(response);

			},
		});
	})
});
