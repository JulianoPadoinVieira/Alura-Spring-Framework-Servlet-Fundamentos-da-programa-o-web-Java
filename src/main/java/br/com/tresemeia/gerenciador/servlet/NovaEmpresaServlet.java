package br.com.tresemeia.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//Podemos substituir o "service" por doGet ou doPost para permitir apenas um tipo de requisi��o
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa.");
		
		//"nome" � a vari�vel pega da url(http://localhost:8080/gerenciador/novaEmpresa?nome=Atos)
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			//Formata de string para date
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		/*
		 * Exemplo de c�digo para imprmir diretamente o c�digo, n�o � o recomendado.
		 * PrintWriter out = response.getWriter();
		 * out.println("<html><body><h1>Empresa " + nomeEmpresa +
		 * " cadastrada com sucesso!!!</h1></body><html>");
		 */
		
		//Manda para o navegador o novo endere�o da p�gina, redireciona.
		response.sendRedirect("listaEmpresas");
		
		//Chamar o JSP
		/* RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas"); */
		//"empresa" � o nome que ser� chamado no outro lado
		/* request.setAttribute("empresa", empresa.getNome()); */
		//Envia o request e o response
		/* rd.forward(request, response); */
	}

}
