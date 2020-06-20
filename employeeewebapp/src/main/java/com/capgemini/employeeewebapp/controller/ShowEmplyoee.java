package com.capgemini.employeeewebapp.controller;

public class ShowEmplyoee extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.getRequestDispatcher("seeAllEmployee.html").forward(req, resp);
}

}
