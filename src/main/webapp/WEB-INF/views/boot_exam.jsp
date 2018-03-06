<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
	div.row{
		margin-top: 5%;
	}
</style>
<body>
	<div class="container">
		<nav class="navbar navbar-inverse navbar-fixed-top">
		  <div class="container-fluid"> <!-- 반응형을 위해 필요한 아이콘 -->
		     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span> 
		      </button>
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">WebSiteName</a>
		    </div>
			<div class="collapse navbar-collapse" id="myNavbar">
			  <ul class="nav navbar-nav navbar-right">
			      <li><a href="#"><span class="glyphicon"></span>Dashboard</a></li>
			      <li><a href="#"><span class="glyphicon"></span>Settings</a></li>
			      <li><a href="#"><span class="glyphicon"></span>Profile</a></li>
			      <li><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon"></span>Login</a></li>
		      </ul>
			    
			    <form class="navbar-form navbar-right" action="/action_page.php">
			      <div class="form-group">
			        <input type="text" class="form-control" placeholder="Search">
			      </div>
			    </form>
		   	</div>
		   </div>
		</nav>
		
		<div class="row">
			<div class="col-sm-7 col-sm-8-offset-5 col-xs-7 col-xs-8-offset-5">
				<table class="table table-hover" id="table">
				  <thead>
				    <tr>
				      <th>#</th>
				      <th>Header</th>
				      <th>Header</th>
				      <th>Header</th>
				      <th>Header</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				   	<tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				    <tr>
				      <td>1001</td>
				      <td>Lorem</td>
				      <td>ipsum</td>
				      <td>dolor</td>
				      <td>sit</td>
				    </tr>
				  </tbody>
				</table>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-7 col-sm-8-offset-5 col-xs-7 col-xs-8-offset-5">
				<form action="/action_page.php">
					<div class="form-group">
					  <label for="email">Email address:</label>
					  <input type="email" class="form-control" id="email">
					</div>
					<div class="form-group">
					  <label for="pwd">Password:</label>
					  <input type="password" class="form-control" id="pwd">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
		
		<div class="modal fade" id="myModal" role="dialog">
		    <div class="modal-dialog modal-sm">
		      <div class="modal-content">
		        <div class="modal-header">
		          <button type="button" class="close" data-dismiss="modal">&times;</button>
		          <h4 class="modal-title">Modal Header</h4>
		        </div>
		        <div class="modal-body">
		          <p>This is a small modal.</p>
		        </div>
		        <div class="modal-footer">
		          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		        </div>
		      </div>
		    </div>
		 </div>
		
	</div>
</body>
</html>