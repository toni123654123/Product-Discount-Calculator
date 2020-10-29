import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletProductDescription",urlPatterns = "/display")

public class ServletProductDescription extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String description = request.getParameter("description");
        Double price       = Double.parseDouble(request.getParameter("price"));
        Double discount    = Double.parseDouble(request.getParameter("percent"));

        Double discount_price = (price * discount)/100;

        PrintWriter writer = response.getWriter();

        writer.println("<html><head><title>Discount Calculator</title></head>");
        writer.println("Product: " + description);
        writer.println("<br />");
        writer.println("Discount Amount: " + discount_price);
        writer.println("<br />");
        writer.println("Discount Price: "  + (price - discount_price));
        writer.println("<br />");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
