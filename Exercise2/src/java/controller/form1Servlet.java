/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nguyen Euler
 */
public class form1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        StringBuffer html= new StringBuffer();
        String info1 = req.getParameter("addMail");
        String[] info2 = req.getParameterValues("contact");
        String[] info3 = req.getParameterValues("typeOfMusic");
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Information</title>");
        html.append("<link rel=\"stylesheet\" href=\"css/cssresp.css\">").append("</head>");
        html.append("<body>");
        html.append("<table>").append("<tr> <th>Info</th> <th>Result</th> </tr>");
        html.append("<tr> <td>Add me to your email list</td> <td>"+info1+"</td> </tr>");
        html.append("<tr> <td>Contact me by: </td> <td>");
        for (String s: info2)
        {
          html.append("<p>"+s+"</p>");
        }
        html.append("</td> </tr>");
        html.append("<tr> <td>Type of Music</td> <td>");
        for (String s: info3)
        {
          html.append("<p>"+s+"</p>");
        }
        html.append("</td> </tr> </table>");
        html.append("</body>");
        html.append("</html>");
        out.println(html);
    }
    
    
}
