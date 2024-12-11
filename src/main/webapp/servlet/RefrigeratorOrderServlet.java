package servlet;

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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String itemName = request.getParameter("itemName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String orderDate = LocalDate.now().toString(); 

        
        RefrigeratorOrder order = new RefrigeratorOrder(itemName, quantity, orderDate);

        
        request.setAttribute("order", order);

        
        request.getRequestDispatcher("../jsp/refrigeratorOrderDetails.jsp").forward(request, response);
    }
}
