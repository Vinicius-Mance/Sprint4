package br.com.agile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agile.beans.*;
import br.com.agile.dao.AgileDAO;

@WebServlet("/deleta")
public class Deleta extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//Usuario = new Usuario();
		//if (AgileDAO.cadastrar(usuario)) {
		//		request.setAttribute("message", "Usuário cadastrado com sucesso"
		//+ "<a href=index.jsp> Voltar </a>");
						//	} else {
						//		request.setAttribute("message", "Falha no cadastro. Tente novamente");
						//	}
			
						//	RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrar.jsp");
						//	dispatcher.forward(request, response);
			
	}
}
