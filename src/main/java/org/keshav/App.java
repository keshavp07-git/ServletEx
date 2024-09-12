package org.keshav;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("Hello");
        Tomcat tomcat = new Tomcat();
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloService",new HelloService());
        context.addServletMappingDecoded("/hello","HelloService");
        tomcat.start();
        tomcat.getServer().await();
    }
}
