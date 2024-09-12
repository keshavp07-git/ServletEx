package org.keshav;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloService extends HttpServlet {

    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        res.setContentType("text/html");
//        res.getWriter().println("<h1>Hello World</h1>");
//        it is a direct method
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello World</h1>");
    }
}
