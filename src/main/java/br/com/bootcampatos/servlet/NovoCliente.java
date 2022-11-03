package br.com.bootcampatos.servlet;

import java.io.IOException;

import br.com.bootcampatos.dao.ClienteDao;
import br.com.bootcampatos.dao.TelefoneDao;
import br.com.bootcampatos.model.Cliente;
import br.com.bootcampatos.model.Telefone;
import br.com.bootcampatos.util.JPAUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class NovoCliente
 */
@WebServlet("/novoCliente")
public class NovoCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramNome = request.getParameter("nome");
		String paramCpf = request.getParameter("cpf");
		String paramTelefone = request.getParameter("telefone");
		String paramEmail = request.getParameter("email");
		String paramTipoTelefone = request.getParameter("tipoTelefone");
		
		
		Telefone telefone = new Telefone(paramTelefone, paramTipoTelefone);		
		TelefoneDao telefoneDao = new TelefoneDao(JPAUtil.getEntityManager());
		if(telefoneDao.getTelefoneByNumber(telefone.getNumero()) != null) {
			telefoneDao.insert(telefone);			
		}
		else {
			telefone = telefoneDao.getTelefoneByNumber(paramTelefone);
		}
		
		Cliente cliente = new Cliente(paramNome, paramCpf, telefone,paramEmail);
		ClienteDao clienteDao = new ClienteDao(JPAUtil.getEntityManager());
		
		clienteDao.insert(cliente);
		
		
		response.sendRedirect("listaClientes");
	}
}
