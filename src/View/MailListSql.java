package View;

import Model.Mail;

import java.sql.*;
import java.util.ArrayList;

public class MailListSql {
    public static ArrayList<Mail> readDDBB() throws ClassNotFoundException, SQLException{
        ArrayList<Mail> mailList = new ArrayList<>();

        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT mail FROM MAIL");

        while(rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(new Mail(mail));
        }
        return mailList;
    }
}
