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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ramja
 */
@WebServlet(urlPatterns = {"/fetch"})
public class fetch extends HttpServlet {

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
            out.println("<title>Servlet fetch</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet fetch at " + request.getContextPath() + "</h1>");
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
       String prn= request.getParameter("prn");
       String s7= request.getParameter("option");
       
                   try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st = con.createStatement();
            
            if(s7.equals("Submit"))
            {
                try {     
                @SuppressWarnings("null")
                ResultSet rs=st.executeQuery("select * from studentinfo2");
                out.write("<h1>Students data</h1>");
                while(rs.next())
                {
                    if(rs.getString(1).equals(prn)){
                    out.write("prn : "+rs.getString(1)+"<br>"+"User Name : "+rs.getString(2)+"<br>"+"Email : "+rs.getString(3)+"<br>gender : "+rs.getString(4)+"<br>dob : "+rs.getString(5)+"<br>phnum : "+rs.getString(6)+"<br><br><br>");
                
                    }
                }    
                } catch (SQLException ex) {
                out.write(ex.toString());
                }
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
