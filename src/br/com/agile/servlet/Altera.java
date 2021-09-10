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

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String numero = req.getParameter("numero");
		String senha = req.getParameter("senha");
		String cpf = req.getParameter("cpf");

		Usuario usuario = new Usuario();

		usuario.setId(id);
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setCPF(cpf);
		usuario.setNumero(numero);
		usuario.setSenha(senha);

		if(!AgileDAO.alterarUsuario(id,nome,email,senha,numero,cpf)) {
			req.setAttribute("message", "Insucesso ao Alterar.");
		} else {
			req.setAttribute("message", "Sucesso ao Alterar.");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}
}
