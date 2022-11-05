package br.com.bootcampatos.servlet;

import br.com.bootcampatos.model.Cliente;
import br.com.bootcampatos.model.Contrato;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/novoContrato")
public class NovoContrato extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/front/orcamento.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Boolean isWithDessert = Boolean.valueOf(request.getParameter("isWithDessert"));
        Integer qtdConvidados = Integer.valueOf(request.getParameter("qtdConvidados"));
        Contrato contrato = new Contrato(qtdConvidados, isWithDessert, new Cliente());
    }
}
