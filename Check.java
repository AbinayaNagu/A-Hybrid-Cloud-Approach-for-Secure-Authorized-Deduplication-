/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hybriddeduplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author ETPL10
 */
public class Check {
      public static String vv;
    public static void main(String args[]){
        Connection con=null;
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Deduplication","root","");
             Statement st = (Statement) con.createStatement();
               //st.executeUpdate("Truncate table hashkey");
             String sql = "SELECT * FROM accessprevilege where file='LN.txt'";
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 String v=rs.getString(5);
                 vv=v;
                 System.out.println(v);
             }
       SecretKey key = KeyGenerator.getInstance("DES").generateKey();
    AesEncrypter encrypter = new AesEncrypter(key);
  // String encrypted = encrypter.encrypt(k1);
 //   System.out.println("Original Key"+k1);
    String decrypted = encrypter.decrypt(vv);
  //  System.out.println("Encrypted Key"+encrypted);
    System.out.println("   "+decrypted);
   // System.out.println("Decrypted"+decrypted);
    //String sql="INSERT INTO accessprevilege values('"+email+"',"+"'"+fil+"',"+"'"+k1+"',"+"'"+tg+"',"+"'"+encrypted+"')";
    // st.executeUpdate(sql);
    //jTextField1.setText(encrypted);
        }catch(Exception e){System.out.println(e);}
    }
    
}
