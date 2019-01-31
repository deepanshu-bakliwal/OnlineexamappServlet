package com.lti.training.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.training.exam.servletjsp.Option;
import com.lti.training.exam.servletjsp.Question;

@WebServlet("/CalculateScoreServlet")
public class CalculateScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Question q = (Question) session.getAttribute("currentQs");

		int selectedOptionNo = Integer.parseInt(request.getParameter("op"));
		
		//check the exsisting score of the user
		Integer score = (Integer) session.getAttribute("score");
		if(score == null) //if not
			score = 0;
		Option selecetedOption = q.getOptions().get(selectedOptionNo);
		if (selecetedOption.isRightAnswer())
			score++;
		session.setAttribute("score", score);
		response.sendRedirect("LoadQuestionServlet");
	}

}
