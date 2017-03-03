<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="inscription.css" />
		  <!--POLICE UTILISE -->
  <link href='https://fonts.googleapis.com/css?family=Montserrat|Pacifico' rel='stylesheet' type='text/css'>
    </head>
    <body>

		
		 <div align="center">
		 
    <form method="POST" action="" id="formInscription">
      <h2 id="txtInscription">inscription</h2>
    

          <input type="text" placeholder="Votre prenom" id="prenom" name="prenom" value="" /><br>
          <input type="text" placeholder="Votre nom" id="nom" name="nom" value="" /><br>
          <input type="email" placeholder="Votre mail" id="mail" name="mail" value="" /><br>
          <input type="email" placeholder="Confirmez votre mail" id="mail2" name="mail2" value="" /><br>
          <p>Afficher les exigences de mot de passe<span>

            * Au moins 6 caractères<br>
            * Pas de caracteres spéciaux<br>
            * Au moins une lettre et un chiffre<br>
            * Au moins une lettre majuscule<br>

          </span></p>
          <input type="password" placeholder="Votre mot de passe" id="mdp" name="mdp" /><br>
          <input type="password" placeholder="Confirmez votre mot de passe" id="mdp2" name="mdp2" /><br>




          <input type="submit" name="forminscription" value="Je m'inscris" />


        </form>
        <a id="dejaInscrit" href="./index.php">Je suis déjà inscrit</a>

      </div>
    </body>
</html>