package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Enumeration;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		Enumeration<String> nomeCabecalhos = request.getHeaderNames();
		String s = "Cabecalhos (solicitacao):\n";
		while (nomeCabecalhos.hasMoreElements()) {
			String cabecalho = nomeCabecalhos.nextElement();
			s += cabecalho + ": ";
			s += request.getHeader(cabecalho) + "\n";
		}
		s += "Protocol: " + request.getProtocol();
		s += "\n\nStatus (resposta): " + response.getStatus() + "\n";
		s += "Usuario: " + request.getParameter("user1") + "\n";
		s += "Senha: " + request.getParameter("pass1") + "\n";
		response.getWriter().append(s);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		Enumeration<String> nomeCabecalhos = request.getHeaderNames();
		String s = "Cabecalhos (solicitacao):\n";
		while (nomeCabecalhos.hasMoreElements()) {
			String cabecalho = nomeCabecalhos.nextElement();
			s += cabecalho + ": ";
			s += request.getHeader(cabecalho) + "\n";
		}
		s += "Protocol: " + request.getProtocol();
		s += "\n\nStatus (resposta): " + response.getStatus() + "\n";
		s += "Usuario: " + request.getParameter("user2") + "\n";
		s += "Senha: " + request.getParameter("pass2") + "\n";
		response.getWriter().append(s);		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
