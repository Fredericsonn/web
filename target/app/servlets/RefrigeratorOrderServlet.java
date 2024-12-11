package servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.RefrigeratorOrder;

@WebServlet("/createOrder")
public class RefrigeratorOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve data from the form
        String itemName = request.getParameter("itemName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String orderDate = LocalDate.now().toString(); // Automatically set order date

        // Create a RefrigeratorOrder bean
        RefrigeratorOrder order = new RefrigeratorOrder(itemName, quantity, orderDate);

        // Set the bean as a request attribute
        request.setAttribute("order", order);

        // Forward to the JSP to display order details
        request.getRequestDispatcher("/jsp/refrigeratorOrderDetails.jsp").forward(request, response);
    }
}
