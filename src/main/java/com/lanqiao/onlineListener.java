package com.lanqiao;


//监听器，统计在线人数
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.stereotype.Component;

import com.lanqiao.model.User;



/**
 * Application Lifecycle Listener implementation class onlineListener
 *
 */
@Component
public class onlineListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

	
	ServletContext application = null;
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//set集合用来存储登录的用户名
		Set<String> set = new HashSet<String>();
		application = arg0.getServletContext();
		application.setAttribute("set", set);
		
	}
	
	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	User user = (User)arg0.getValue();
    	Set<String> set = (Set<String>)application.getAttribute("set");
    	set.add(user.getUsername());
    	System.out.println("将用户"+user.getUsername()+"存入application中");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	User user = (User)arg0.getValue();
    	Set<String> set = (Set<String>)application.getAttribute("set");
    	set.remove(user.getUsername());
    	System.out.println("将用户"+user.getUsername()+"从application中移除");
    }
	
	
    /**
     * Default constructor. 
     */
    public onlineListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	

	
	
}
