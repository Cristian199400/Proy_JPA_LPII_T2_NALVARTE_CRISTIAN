package Controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;


/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//instanciamos la respectiva clase...
		        ClassProveedorImp crudimp=new ClassProveedorImp();
				//recuperamos el listado de productos de la BD..
				List<TblProveedorcl2> ListadoProveedor=crudimp.ListadoProveedor();
				//enviamos hacia la vista...
				//almacenamos en el respectivo metodo...
				request.setAttribute("listado",ListadoProveedor);
				
				//declaramos una variable de tipo string...
				//recibimos el valor segun la accion..
				String accion=request.getParameter("accion");
				//aplicamos una condicion...
				if(accion!=null) {
				//aplicamos un switch..
				switch(accion) {
				case "Modificar":
				//salimos
				break;
				case "Registrar":
				//redireccionamos hacia la vista(.jsp)
				request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
				//salimos
				break;
				case "Eliminar":
				break;
				case "Listar":
				//redireccionamos hacia la vista(.jsp)
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				//salimos
				break;
				   } //fin del switch.....
				} //fin de la condiccion .
				
			  } //fin del metodo doget..
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los datos del formulario
		String nombre=request.getParameter("nombre");
		String rasonsocial=request.getParameter("rasonsocial");
		String ruc=request.getParameter("ruc");
		String email=request.getParameter("email");
		Date fecha=new Date(0);
		Date fechasql=new Date(fecha.getTime());
		//hacer las respectivas instancias
		TblProveedorcl2 tblprod=new TblProveedorcl2();
		ClassProveedorImp crudimp=new ClassProveedorImp();
		//asignamos los valores
		tblprod.setNomproveecl2(nombre);
		tblprod.setRsocialproveecl2(rasonsocial);
		tblprod.setRucproveecl2(ruc);
		tblprod.setEmailproveecl2(email);
		tblprod.setFeingproveecl2(fechasql);
		//invocamos el metodo registrar
		crudimp.RegistrarProveedor(tblprod);
		//actualizamos el listado
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
		//enviamos el listado
		request.setAttribute("listado",listadoproveedor);
		//redirecionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		
	}//Fin del metodo post

}//Fin del controlador producto
