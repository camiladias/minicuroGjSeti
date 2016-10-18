package com.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dao.ContatoDao;
import com.mvc.model.Contato;

public class ListaLogica extends HttpServlet implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//Monta a lista de contatos, literalmente numa lista objetos do tipo contato haha
		List<Contato> contatos = (List<Contato>) new ContatoDao().findAll();
		request.setAttribute("contatos",contatos);
		
		return "lista.jsp";
	}

}