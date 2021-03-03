<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>My Home Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form action="submit" method="post" class="form-signin">
			<h1 class="h3 mb-3 font-weight-normal">Register Form</h1>
			<label for="inputName" class="sr-only">Please Input Name</label> 
			<input type="text" id="inputName" name="name" class="form-control" placeholder="Please Input Name" required autofocus> 
			<label for="inputEmail" class="sr-only">Please Input Email</label> 
			<input type="email" id="inputEmail" name="email" class="form-control" placeholder="Please Input Email" required autofocus> 
			<label for="inputPhone" class="sr-only">Please Input phone number</label> 
			<input type="text" id="inputPhone" name="phone" class="form-control" placeholder="Please Input Phone NUmber" required autofocus> 
			<label for="inputPassword" class="sr-only">Please Input Password</label> 
			<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Please Input Password" required>
			<p></p>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>
</body>