package collection.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collection.app.Emp;
import collection.app.EmpApp;
import collection.app.PersonDB;

@WebServlet("/addEmp")
public class AddEmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String pid=req.getParameter("empId");
		int empId = Integer.parseInt(pid);
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String sal = req.getParameter("salary");
		double salay = Integer.parseInt(sal);
		
		
		Emp e = new Emp(empId,name,city,salay);
		
		EmpApp app = new EmpApp();
		String response = app.addEmp(e);
		
		System.out.println(EmpDb.db);
		out.write("<h1>"+response+"</h1>");
	}

}
