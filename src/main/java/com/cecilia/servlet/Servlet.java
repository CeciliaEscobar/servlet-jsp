
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    
    private List<String> lista = new ArrayList<>();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
     
       req.setAttribute("nomina" , lista);
        
       req.getServletContext().getRequestDispatcher("/paginainicio.jsp").forward(req,resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String nombre = req.getParameter("nombre");
      this.lista.add(nombre);
      resp.sendRedirect(req.getContextPath() + "/inicio");
    }

}
  