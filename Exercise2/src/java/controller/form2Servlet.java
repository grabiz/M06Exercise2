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
public class form2Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
        StringBuffer html = new StringBuffer();
        String info = req.getParameter("isStyle");
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Information</title>");
        html.append("<link rel=\"stylesheet\" href=\"css/cssresp.css\">").append("</head>");
        html.append("<body>");
        html.append("<table>").append("<tr> <th>Info</th> <th>Result</th> </tr>");
        html.append("<tr><td> Style </td> <td>"+info+"</td></tr></table>");
        out.println(html);
    }
    
    
}
