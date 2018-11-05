/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hybriddeduplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NANA
 */
public class NewClass {
    public static void main(String args[]){
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Deduplication","root","");
       st = (Statement) con.createStatement();
            
            rs=st.executeQuery("select filepath from reg1");
            while(rs.next()){
                String a=rs.getString(1);
                System.out.println(a);
            }
            
            
            
            
        }catch(Exception e){e.printStackTrace();}
    }
    
}
