
package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;
import org.geektimes.projects.user.service.impl.UserServiceImpl;

import org.geektimes.projects.user.domain.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/register")
public class RegisterActionController implements PageController {

    @GET
    @POST
    @Path("/submit") 
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPhoneNumber(phone);
		user.setPassword(password);
		UserServiceImpl userService = new UserServiceImpl();
		boolean ans = userService.register(user);
//		if(ans) {
//			return "success.jsp";
//		}
		return "success.jsp";
    }
}


    
