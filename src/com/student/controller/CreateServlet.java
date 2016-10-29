package com.student.controller;

import com.dto.Student;
import com.student.dao.IStudentDao;
import com.student.dao.impl.IStudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AlvinOdins on 10/28/2016.
 */
@WebServlet(name = "CreateServlet")
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String email = null;
        String cno = null;
        String dob = null;
        String gender = null;
        String semType = null;
//        String activity = null;
//        String image = null;

        boolean isExist = false;

        try {
            firstName = request.getParameter("firstName");
            middleName = request.getParameter("middleName");
            lastName = request.getParameter("middleName");
            email = request.getParameter("email");
            cno = request.getParameter("cno");
            dob = request.getParameter("dob");
            gender = request.getParameter("gender");
            semType = request.getParameter("semType");
            //activity = request.getParameterValues("activity");
            //image = request.getPart("image");

            Student studentObj = new Student();

            studentObj.setFirstName(firstName);
            studentObj.setMiddleName(middleName);
            studentObj.setLastName(lastName);
            studentObj.setEmail(email);
            studentObj.setCno(cno);
            studentObj.setDob(dob);
            studentObj.setGender(gender);
            studentObj.setSemType(semType);

            IStudentDao dao = new IStudentDaoImpl();

            isExist = dao.addStudent(studentObj);

            if (isExist) {
                request.getRequestDispatcher("registersuccess.jsp").forward(request, response);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
