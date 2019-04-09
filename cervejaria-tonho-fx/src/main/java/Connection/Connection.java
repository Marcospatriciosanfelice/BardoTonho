
package Connection;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Connection {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tonho";    
    private static final String USER = "root";
    private static final String PASS = "";
    private static Object DriverManager;
     
    
   
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            throw new RunTimeException("Erro de Conexao : ",ex );
            
        }
       
   }
   public static void closeConnection(Connection con){
       try {
           if(con!=null){
               con.close();
       } catch {
           Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
               
         }
           
       
       
       }
    
    }
   
   public static void closeConnection(Connection con, PreparedEstatement stmt){
       
       closeConnection(con);
       
       try {
           if(stmt!=null){
               stmt.close();
       } catch {
           Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
               
         }
       
       }
    
    }
   public static void closeConnection(Connection con, PreparedEstatement stmt,ResutSet rs){
       
       closeConnection(con,stmt);
       
       try {
           if(rs!=null){
               rs.close();
       } catch {
           Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
               
         }
       
       }
    
    }

   
   
}



