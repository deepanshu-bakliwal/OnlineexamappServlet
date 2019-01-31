package com.lti.training.exam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.training.exam.servletjsp.Option;
import com.lti.training.exam.servletjsp.Question;
import com.lti.training.exam.servletjsp.QuestionBankLoader;


@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
       private static final long serialVersionUID =1L;	

       
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	       QuestionBankLoader loader = new QuestionBankLoader();
           List<Question> questions = loader.loadQuestionsOnJava();
        
           HttpSession session = request.getSession();
           //cheacking if the question is already stored in the session 
           Integer questionNo = (Integer) session.getAttribute("qNo");
           if(questionNo == null) //if not
        	   questionNo= 0; //start from 0
           else if(++questionNo >= questions.size()) {
        		   response.sendRedirect("displayScore.jsp");
        	   return;   
           }
        	  
           session.setAttribute("qNo",questionNo);
           
           Question question = questions. get(questionNo);
         session.setAttribute("currentQs",question);
         response.sendRedirect("showQuestion.jsp"); 
         
           
       }

}
