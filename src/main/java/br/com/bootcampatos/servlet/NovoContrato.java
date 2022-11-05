package br.com.bootcampatos.servlet;

import br.com.bootcampatos.dao.ClienteDao;
import br.com.bootcampatos.model.Cliente;
import br.com.bootcampatos.model.Contrato;
import br.com.bootcampatos.util.JPAUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/novoContrato")
public class NovoContrato extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDao(JPAUtil.getEntityManager()).getAll();

        request.setAttribute("clientes", clientes);
        request.getRequestDispatcher("/front/orcamento.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long clienteById = Long.parseLong(request.getParameter("clienteById"));
        Boolean isWithDessert = Boolean.valueOf(request.getParameter("isWithDessert"));
        Integer qtdConvidados = Integer.valueOf(request.getParameter("qtdConvidados"));

        Cliente cliente = new ClienteDao(JPAUtil.getEntityManager()).findById(clienteById);
        Contrato contrato = new Contrato(qtdConvidados, isWithDessert, cliente);

        request.setAttribute("contrato", contrato);

        request.getRequestDispatcher("/front/proposta_comercial.jsp")
                .forward(request, response);
    }
}
