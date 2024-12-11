<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fiche de l'Objet Connecté</title>
</head>
<body>
    <h1>Détails de l'Objet Connecté</h1>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>Type</th>
            <td>${connectedObject.type}</td>
        </tr>
        <tr>
            <th>Nom</th>
            <td>${connectedObject.name}</td>
        </tr>
        <tr>
            <th>Fonctionnalités</th>
            <td>${connectedObject.features}</td>
        </tr>
    </table>
    <br>
    <a href="index.jsp">Créer un autre objet</a>
</body>
</html>
