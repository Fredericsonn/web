package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ConnectedObject;
 
@WebServlet("/createObject")
public class ConnectedObjectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Récupérer les données du formulaire
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String features = request.getParameter("features");
 
        // Créer un objet ConnectedObject et définir ses propriétés
        ConnectedObject connectedObject = new ConnectedObject();
        connectedObject.setType(type);
        connectedObject.setName(name);
        connectedObject.setFeatures(features);
 
        // Ajouter l'objet au contexte de la requête
        request.setAttribute("connectedObject", connectedObject);
 
        // Transmettre les données à la JSP
        request.getRequestDispatcher("../jsp/displayObject.jsp").forward(request, response);
    }
}