
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author escob
 */
@WebServlet(urlPatterns= "/inicio") //localhost:8080/inicio
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
       /* String param = req.getParameter ("nombre");
        if(param == null){
            resp.getWriter().append("Hola, como estas?");
        }else{
            String saludo = "Hola," + param + "!";
            resp.getWriter().append(saludo);
        }*/
       
       req.setAttribute("name", "Cecilia");
        
       req.getServletContext().getRequestDispatcher("/paginainicio.jsp").forward(req,resp);
    }

}
  