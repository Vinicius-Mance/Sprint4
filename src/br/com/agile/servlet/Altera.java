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

@WebServlet("/altera")
public class Altera extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String cpf = req.getParameter("cpf");
		String numero = req.getParameter("numero");
		String senha = req.getParameter("senha");

		Usuario usuario = new Usuario();

		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setCPF(cpf);
		usuario.setNumero(numero);
		usuario.setSenha(senha);

		if(!AgileDAO.alterar(usuario)) {
			req.setAttribute("message", "Insucesso ao Alterar.");
		}

		req.setAttribute("message", "Sucesso ao Alterar.");
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}
}
