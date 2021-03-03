package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import java.sql.*;
import org.geektimes.projects.user.sql.DBConnectionManager;


public class UserServiceImpl implements UserService{
	
	public boolean register(User user) throws Exception{
		
		//maybe check duplicate
        String databaseURL = "jdbc:derby:/db/user-platform;create=true";
        Connection connection = DriverManager.getConnection(databaseURL);
        DBConnectionManager dbManager = new DBConnectionManager();
        dbManager.setConnection(connection);
        DatabaseUserRepository userDAO = new DatabaseUserRepository(dbManager);
        userDAO.save(user);
        connection.close();
		return true;
	}
	
}