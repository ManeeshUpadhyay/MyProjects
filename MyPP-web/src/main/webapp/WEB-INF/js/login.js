/* Login Form Validation*/
$(document).ready(function() {
	$('#loginForm').validate({
		// To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
		rules: {
            /*firstname: "required",
            lastname: "required",*/
            emailId: {
                required: true,
                email: true
            },
            password: {
                required: true,
                minlength: 8
            },
            agree: "required"
        },
        
        // Specify the validation error messages
        messages: {
            /*firstname: "Please enter your first name",
            lastname: "Please enter your last name",*/
            password: {
                required: "Please provide a password",
                minlength: "Your password must be at least 8 characters long"
            },
            emailId: "Please enter a valid email address",
            agree: "Please accept our policy"
        },
        
        /*submitHandler: function(form) {
            form.submit();
        }*/
    });

  });
  