<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Login-Form</title>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css'>
  <link rel='stylesheet' href='<?php echo css_url("style.css") ?>'>
  <link rel='stylesheet' href='<?php echo css_url("bootstrap.min.css") ?>'>

</head>
<body>
<!-- partial:index.partial.html -->
<h2></h2>
<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form method="POST" action="<?php echo site_url("welcome/inscrire") ?>" enctype="$HTTP_RAW_POST_DATA">
			<h1>Creation de compte</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<input type="text" placeholder="Name" name="nom" />
			<input type="email" placeholder="Email" name="email"/>
			<span id="first_name_error" class="text-danger"></span>
			<input type="password" placeholder="Password" name="mdp" />
			<hr>
			<?php if(isset($erreur)) { ?> 			
				<div class="alert alert-danger" role="alert">
					<?php echo $erreur['message'];?>
				</div>
			<?php } ?>
			<hr>
			<button type="submit">s'incrire</button>
			<span id="success_message"> </span>
		</form>
	</div>
	<div class="form-container sign-in-container">
		<form action="<?php echo site_url("welcome/log") ?>" method="POST">
			<h1>Connexion</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
					<label class="form-check-label" for="inlineCheckbox1">verificateur</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
					<label class="form-check-label" for="inlineCheckbox2">contribuable</label>
				</div>
			</span>
			<input type="email"   name='email' placeholder="Email" />
			<input type="password" name='mdp' placeholder="Password" />
			<a href="#">mot de passe oublié ?</a>
			<button>Connexion</button>
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Direction Générale des Impôts</h1>
				<button class="ghost" id="signIn">Connexion</button>
			</div>
			<div class="overlay-panel overlay-right ">				
				<h1>Direction Générale des Impôts</h1>
				<button class="ghost" id="signUp">S'incrire</button>
			</div>
		</div>
	</div>
</div>
<!-- partial -->
<script  src="<?php echo js_url("script.js") ?>"></script>

</body>
</html>
