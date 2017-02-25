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
public class form4Servlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        StringBuffer html = new StringBuffer();
        String info1 = req.getParameter("quantity");
        String info2 = req.getParameter("userName");
        String info3 = req.getParameter("password");
        String info4 = req.getParameter("hidden");
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Information</title>");
        html.append("<link rel=\"stylesheet\" href=\"css/cssresp.css\">").append("</head>");
        html.append("<body>");
        html.append("<table>").append("<tr> <th>Info</th> <th>Result</th> </tr>");
        html.append("<tr> <td>Quantity</td> <td>"+info1+"</td></tr>");
        html.append("<tr> <td>Username</td> <td>"+info2+"</td></tr>");
        html.append("<tr> <td>Password</td> <td>"+info3+"</td></tr>");
        html.append("<tr> <td>Hidden</td> <td>"+info4+"</td></tr>");
        html.append("</table>");
        html.append("</body>");
        html.append("</html>");
        out.println(html);
    }
    
}
