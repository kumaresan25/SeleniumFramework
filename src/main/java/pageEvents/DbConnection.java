package main.java.pageEvents;

import java.sql.*;
import java.util.*;
import java.lang.String;

public class DbConnection {

    public static void main(String[] args) {
        HashMap<String, String> result = new HashMap<>();
        try{
            //Metioning the what type of DB.
            Class.forName("com.mysql.cj.jdbc.Driver");
            //
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","Test123#");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM automationdata.orangehrmlogindata;");
            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            int columncount = resultSetMetaData.getColumnCount();
            List<String> ColumnNames = new LinkedList<>();
            // 2
            List<HashMap<String, Object>> finalTestDataFromDB = new ArrayList();
            HashMap<String, Object> resultSetFromDB = null;
            while (rs.next()) {
                resultSetFromDB = new HashMap();
                for (int i = 1; i <= columncount; i++) {
                    ColumnNames.add(resultSetMetaData.getColumnName(i));
                    resultSetFromDB.put(resultSetMetaData.getColumnName(i),rs.getObject(i) );
                }
                finalTestDataFromDB.add(resultSetFromDB);
            }
            System.out.println(finalTestDataFromDB);
        }catch(Exception e){System.out.println(e);}
    }
}

