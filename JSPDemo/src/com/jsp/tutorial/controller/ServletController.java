package com.jsp.tutorial.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.tutorial.model.DatosEncuesta;

/**
 * Servlet implementation class ServletController
 */
@WebServlet(name = "encuesta", urlPatterns = { "/encuesta" })
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //los parametros son equivalentes a request y response de jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DatosEncuesta datosEncuesta = new DatosEncuesta();
		datosEncuesta.setNombreCompleto(request.getParameter("nombreCompleto"));
		datosEncuesta.setLenguajes(request.getParameterValues("lenguajes"));
		request.setAttribute("datosEncuesta", datosEncuesta);
		request.getRequestDispatcher("salida.jsp").forward(request, response);
	}

}
