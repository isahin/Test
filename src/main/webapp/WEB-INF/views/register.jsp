<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-3"></div>




			<div class="col-sm-6">

				<c:if test="${not empty hata}">


					<div class="alert alert-danger alert-dismissible fade show"
						role="alert">
						<strong>Hata</strong> ${ hata }
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>



				</c:if>

				<form action='<s:url value="register"></s:url>' method="POST">
					<div class="card">
						<div class="card-header" align="left">Account Information</div>

						<div class="card-body">


							<div class="form-group">
								<label for="exampleInputEmail1">User Name:</label> <input
									type="text" class="form-control" id="adi" name="name">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">E-mail:</label> <input
									type="email" class="form-control" id="mail" name="email">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Password:</label> <input
									type="password" class="form-control" id="sifre" name="password">
							</div>
						
							<p align="right">
								<button type="submit" id="btnEkle" class="btn btn-primary">Create User</button>
							</p>

						</div>
				</form>

			</div>



		</div>
		<div class="col-sm-3"></div>
	</div>
	</div>





</body>
</html>