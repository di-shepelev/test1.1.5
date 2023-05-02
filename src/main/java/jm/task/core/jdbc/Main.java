package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {

        UserService UserService = new UserServiceImpl();

        UserService.createUsersTable();

        UserService.saveUser("Name1", "LastName1", (byte) 20);
        UserService.saveUser("Name2", "LastName2", (byte) 25);
        UserService.saveUser("Name3", "LastName3", (byte) 31);
        UserService.saveUser("Name4", "LastName4", (byte) 38);

        UserService.getAllUsers();
        UserService.cleanUsersTable();
        UserService.dropUsersTable();

        Util.closeConnection();



    }
}
