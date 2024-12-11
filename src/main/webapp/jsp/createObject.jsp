<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Créer un Objet Connecté</title>
</head>
<body>
<h1>Créer un Objet Connecté</h1>
<form action="/app/createObject" method="post">
<label for="type">Type d'objet :</label>
<input type="text" id="type" name="type" required><br><br>
<label for="name">Nom de l'objet :</label>
<input type="text" id="name" name="name" required><br><br>
<label for="features">Fonctionnalités :</label><br>
<textarea id="features" name="features" rows="4" cols="50" required></textarea><br><br>
<input type="submit" value="Créer">
</form>
</body>
</html>