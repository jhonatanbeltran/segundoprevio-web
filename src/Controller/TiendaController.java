package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Carrera;
import entities.Tienda;
import services.SeguirDao;
import services.TiendaDao;

/**
 * Servlet implementation class ActualizarCarreraControler
 */
@WebServlet("/ActualizarCarreraControler")
public class TiendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codigo= request.getParameter("codigo");
		SeguirDao cDao = new SeguirDao();
		Carrera c = cDao.find(codigo);
		request.setAttribute("carrera", c);
		request.getRequestDispatcher("actualizar.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			String nombre = request.getParameter("codigo");
			String lema = request.getParameter("lema");
			String descripcion = request.getParameter("descripcion");
			String email = request.getParameter("email");
			String clave = request.getParameter("clave");
			String propietario = request.getParameter("propietario");
			String facebook = request.getParameter("facebook");
			String web = request.getParameter("web");
			String imagen = request.getParameter("imagen");
			
				
			Tienda t = new Tienda();
			TiendaDao tDao = new TiendaDao();
			t.setNombre(nombre);
			t.setLema(lema);
			t.setDescripcion(descripcion);
			t.setEmail(email);
			t.setClave(clave);
			t.setPropietario(propietario);
			t.setFacebook(facebook);
			t.setWeb(web);
			t.setImagen(imagen);
			
			tDao.update(t);
			response.sendRedirect("index.jsp");
		
		}else {
			response.sendRedirect("index.jsp");
		}
			
		
		
	}
	public <T> boolean esValido(T valor) {
		if(valor == null) {
			return false;
		}
		return valor != "";
	
	}

}
