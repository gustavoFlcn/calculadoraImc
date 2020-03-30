package be.com.servidor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcularImc")
public class MeuServidor extends HttpServlet{	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String stringAltura = req.getParameter("altura");
		String stringPeso = req.getParameter("peso");
		
		float altura = Float.parseFloat(stringAltura);
		float peso = Float.parseFloat(stringPeso);
		
		float resultado = peso/(altura*altura);
		System.out.println(resultado);
		req.setAttribute("resultado", resultado);
		req.getRequestDispatcher("MostraImc.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.htm");
		super.doGet(req, resp);
	}
}

