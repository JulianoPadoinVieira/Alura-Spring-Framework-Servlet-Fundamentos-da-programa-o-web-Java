package br.com.tresemeia.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Configura��o com o nome da url  do cabe�alho
@WebServlet(urlPatterns = "/oi")
//A classe herda do protocolo http servlet
public class OlaMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Ol� mundo!!!!!!!</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

	
}
