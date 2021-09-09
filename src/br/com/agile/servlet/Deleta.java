package br.com.agile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agile.dao.AgileDAO;

@WebServlet("/deleta")
public class Deleta extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String id = req.getParameter("id");

		if(!AgileDAO.deletarUsuario(id)) {
			req.setAttribute("message", "Insucesso ao Deletar.");
		}

		req.setAttribute("message", "Sucesso ao Deletar.");
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}
}
