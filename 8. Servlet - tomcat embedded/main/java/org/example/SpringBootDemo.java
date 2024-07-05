package org.example;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */


public class SpringBootDemo
{
    public static void main( String[] args ) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.start();
        System.out.println("Server Started !");
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"tempName",new HelloWorldServlet());
        context.addServletMappingDecoded("/hello","tempName");
        tomcat.getServer().await();
    }
}
