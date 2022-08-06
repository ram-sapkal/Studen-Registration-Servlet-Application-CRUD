/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ramja
 */
@WebServlet(urlPatterns = {"/AddNewStudent"})
public class AddNewStudent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddNewStudent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddNewStudent at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
            
            String name= request.getParameter("Name");
            String email= request.getParameter("myEmail");
            String gender= request.getParameter("myGender");
            String dob= request.getParameter("mydob");
            String phnum= request.getParameter("phone no");
            String prn= request.getParameter("prn");
            String s7= request.getParameter("option");
            RequestDispatcher rd;
            
            
            try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st = con.createStatement();
            
                        if(s7.equals("Submit"))
                          {
                PreparedStatement pr=con.prepareStatement("insert into studentinfo2(prn,name,email,gender,dob,phnum) values (?,?,?,?,?,?)");
                pr.setString(1, prn);
                pr.setString(2, name);
                pr.setString(3, email);
                pr.setString(4, gender);
                pr.setString(5, dob);
                pr.setString(6, phnum);
                pr.executeUpdate();
                request.setAttribute("error", "Record(s) Inserted..");
                        rd = request.getRequestDispatcher("addNewStudent.jsp");
                        rd.include(request, response);
                st.close();
            }else if(s7.equals("Back to Home Page")){
                response.sendRedirect("HomePage2.jsp");
            }
            } 
            catch (ClassNotFoundException ex) 
            {
            
                Logger.getLogger(AddNewStudent.class.getName()).log(Level.SEVERE, null, ex);
            
            } catch (SQLException ex) 
            {
            
                Logger.getLogger(AddNewStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
