package comm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SurveyServelet
 */
@WebServlet("/SurveyServelet")
public class SurveyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyServelet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//Reads the form data
		int student_id = Integer.parseInt(request.getParameter("id"));
		String student_name = request.getParameter("name");
		String student_address = request.getParameter("address");
		String student_city = request.getParameter("city");
		String student_state = request.getParameter("state");
		int student_zipcode = Integer.parseInt(request.getParameter("zipcode"));
		String student_phone = request.getParameter("phone");
		String student_email = request.getParameter("email");
		String student_url = request.getParameter("url");
		String student_date = request.getParameter("date");
		String student_grad = request.getParameter("month")+","+request.getParameter("year");
		String student_source = request.getParameter("source");
		String student_recom = request.getParameter("recom");
		String student_comments = request.getParameter("comments");
		String gmu_features = request.getParameter("features");
		
		String data = request.getParameter("data");
		
		//Inserts the student data into the database
		StudentDAO studentDAO = new StudentDAO();
		try {
			studentDAO.addStudent(student_id, student_name, student_address, student_city, student_state, student_zipcode, student_phone, student_email, student_url, student_grad, student_date, student_recom, student_source, gmu_features, student_comments);
		} catch (SQLException e) {
			System.out.println("Insert data error");
			e.printStackTrace();
		}
		
		//Calculates the mean and standard deviation of the data and returns a DataBean object
		DataProcessor dataprocessor = new DataProcessor();
		DataBean cData = dataprocessor.calculate(data);
		//Gets the list of students
		ArrayList<Integer> list = null;
		try {
			list = studentDAO.StudentList();
		} catch (SQLException e) {
			System.out.println("Student list retrive error");
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("cData",cData);
		session.setAttribute("list", list);
		Double mean = cData.getMean();
		RequestDispatcher dispatch;
		//IF mean is greater than 90 then redirect to winner acknowledgement 
		if(mean > 90.00)
		{
			dispatch = request.getRequestDispatcher("WinnerAcknowledgement.jsp");
		}
		else
		{
			dispatch = request.getRequestDispatcher("SimpleAcknowledgement.jsp");
		}
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int student_id = Integer.parseInt(request.getParameter("id"),10);
				
		//Gets the student data in the form of student bean
		StudentDAO studentDAO = new StudentDAO();
		StudentBean sData = null;
		try {
			sData = studentDAO.getStudent(student_id);
		} catch (SQLException e) {
			System.out.println("Student retrive error");
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		
		RequestDispatcher dispatch;
		//IF student exists then display details 
		if(sData != null)
		{
			session.setAttribute("sData",sData);
			dispatch = request.getRequestDispatcher("StudentJSP.jsp");
		}
		else
		{
			dispatch = request.getRequestDispatcher("NoSuchStudent.jsp");
		}
		dispatch.forward(request, response);
		
	}
	
	
	

}
