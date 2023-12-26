package jdbc;

import java.sql.*;
import java.util.Scanner;

public class EmpJDBC {
    public static void main(String[] args) {

        //varibles to make connection
        String url="jdbc:mysql://localhost:3306/mysql";
        String name="root";
        String password="pallavi";
        Connection con=null;
        Statement stmt=null;
        String queString=null;
        try {
            con =DriverManager.getConnection(url, name, password);
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
