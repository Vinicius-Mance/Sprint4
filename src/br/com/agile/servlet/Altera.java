package br.com.agile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agile.dao.AgileDAO;
import br.com.agile.beans.Usuario;

@WebServlet("/altera")
public class Altera extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Usuario usuario = AgileDAO.selecionarUsuario(email);
		
		if (usuario.getEmail() == null) {
			req.setAttribute("message", "Usuário não existe.");
			RequestDispatcher dispatcher = req.getRequestDispatcher("alterar.jsp");
			dispatcher.forward(req, res);
		}

		if(!AgileDAO.alterarUsuario(email,senha)) {
			req.setAttribute("message", "Insucesso ao Alterar.");
		} else {
			req.setAttribute("message", "Sucesso ao Alterar.");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("alterar.jsp");
		dispatcher.forward(req, res);
	}
}
