package ETA_SB.jntu_calc_application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	double res;
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws IOException, ServletException 
    	{
    		doPost(request, response);
    	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("no1");
		String n2 = request.getParameter("no2");
		int opt = Integer.parseInt(request.getParameter("opt"));
		
		switch(opt) {
		case 1 : 
			res = new Calculator().doAdd(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		case 2 : 
			res = new Calculator().doSub(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		case 3 : 
			res = new Calculator().doMul(Integer.parseInt(n1), Integer.parseInt(n2));
			break;	
		case 4 : 
			res = new Calculator().doDiv(Integer.parseInt(n1), Integer.parseInt(n2));
			break;
		}
		out.println(res);
	}

}
