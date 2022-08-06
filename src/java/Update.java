/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
@WebServlet(urlPatterns = {"/Update"})
public class Update extends HttpServlet {

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
            out.println("<title>Servlet Update</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update at " + request.getContextPath() + "</h1>");
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
            
        String value= request.getParameter("val");
        String prnno= request.getParameter("prnno");
        String picker = request.getParameter("field");
        String s7= request.getParameter("option");
        RequestDispatcher rd;
        
        if(s7.equals("Update"))
        {
        //out.write("value = "+value+"    prno="+prnno+"             picker value="+picker);
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st = con.createStatement();
            
        switch(picker){
            
            case "name":st.executeUpdate("update studentinfo2 set name='"+value+"' where prn='"+prnno+"'");
                        //out.write("updatation done");
                        request.setAttribute("error", "Updation done now new name of prn no."+prnno+" is "+value);
                        rd = request.getRequestDispatcher("update.jsp");
                        rd.include(request, response);
                       break;
            case "email":st.executeUpdate("update studentinfo2 set email ='"+value+"' where prn='"+prnno+"'");
                        request.setAttribute("error", "Updation done now new email of prn no."+prnno+" is "+value);
                        rd = request.getRequestDispatcher("update.jsp");
                        rd.include(request, response);
                       break;
            case "gender":st.executeUpdate("update studentinfo2 set gender ='"+value+"' where prn='"+prnno+"'");
                        request.setAttribute("error", "Updation done now new gender of prn no."+prnno+" is "+value);
                        rd = request.getRequestDispatcher("update.jsp");
                        rd.include(request, response);
                       break;
            case "dob":st.executeUpdate("update studentinfo2 set dob ='"+value+"' where prn='"+prnno+"'");
                       request.setAttribute("error", "Updation done now new Date of Birth of prn no."+prnno+" is "+value);
                        rd = request.getRequestDispatcher("update.jsp");
                        rd.include(request, response);
                       break;
            case "phnum":st.executeUpdate("update studentinfo2 set phnum ='"+value+"' where prn='"+prnno+"'");
                         request.setAttribute("error", "Updation done now new Phone Number of prn no."+prnno+" is "+value);
                        rd = request.getRequestDispatcher("update.jsp");
                        rd.include(request, response);
                         
                       break;   
            default:out.write("Sorry failed to update");
                  
                     }
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if(s7.equals("Back to CRUD operation"))
        {
            response.sendRedirect("HomePage2.jsp");
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
