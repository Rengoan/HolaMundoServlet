package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HolaMundo")
public class Servlets extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
        
        response.setContentType("text/html;charset-UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.println("Hola clase de segundo de DAM");
        out.close();
        
    }
    
}
