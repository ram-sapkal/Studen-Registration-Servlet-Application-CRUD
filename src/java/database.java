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
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/database"})
public class database extends HttpServlet {

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
            out.println("<title>Servlet database</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet database at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd;
            
            String name= request.getParameter("Name");
            String email= request.getParameter("myEmail");
            String gender= request.getParameter("myGender");
            String dob= request.getParameter("mydob");
            String phnum= request.getParameter("phone no");
            String pass= request.getParameter("password");
            String s7= request.getParameter("option");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
                      
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>");
            
            try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st = con.createStatement();
            
            //st.executeUpdate("INSERT into Employee_info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
            //out.println("insertion  successful");
            
            
            if(s7.equals("Submit"))
            {
                PreparedStatement pr=con.prepareStatement("insert into STDINFO(phnum,pass,name,email,gender,date) values (?,?,?,?,?,?)");
                pr.setString(1, phnum);
                pr.setString(2, pass);
                pr.setString(3, name);
                pr.setString(4, email);
                pr.setString(5, gender);
                pr.setString(6, dob);
                pr.executeUpdate();
                request.setAttribute("error", "Admin Record Created Successfully..");
                        rd = request.getRequestDispatcher("data_base_jsp.jsp");
                        rd.include(request, response);
            }
            
            else if(s7.equals("Back to Login"))
            { 
                response.sendRedirect("HomePage.jsp");
              
              /*  String q = "update Employee_info set Ename='" + s1 + "', Eemail='" + s2 + "',Egender='" + s3 +"',Edob='" + s4 + "',Eph_no='" + s5 + "' where Ename='" + s1;
                int count = st.executeUpdate(q);
                out.println(count + "Record(s) Updated..");
            */
              
              
            }
            
            con.close();
             
            //out.println("insertion successful"); 
            }
             catch(ClassNotFoundException cnfe)
            {
            out.println("Class Not Found Exception : " + cnfe);
             }
            catch(Exception ex )
            {
            out.println("SQL Exception: " + ex);
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
