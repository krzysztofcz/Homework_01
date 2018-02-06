package pl.coderslab.collection;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_04
 */
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		Writer writer = response.getWriter();
		
		Random rand = new Random();
		int[] randNumbers= new int[10];
		int[] sortNumbers= new int[10];
		for ( int i=0; i<10; i++) {
			randNumbers[i]=(rand.nextInt(100)+1);
			sortNumbers[i]= randNumbers[i];
		}
		Arrays.sort(sortNumbers);
		writer.append(Arrays.toString(randNumbers)).append("<br>").append(Arrays.toString(sortNumbers));
		writer.append("<br><br>");
		for(int i=0;i<randNumbers.length;i++) {
			writer.append(Integer.toString(randNumbers[i])).append(" ").append(Integer.toString(sortNumbers[i]));
			writer.append("<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
