import java.sql.*;

class Main{
    public static void main(String arg[]){
        
        /*
        -- JDBC connecting process
        
        * 1. import package
        * 2. load driver
        * 3. register driver
        * 4. create connection
        * 5. create statement
        * 6. execute statement
        * 7. close connection
        
        */
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String passWord = "101010";
        String query = "select * from comments;";
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,userName,passWord);
            System.out.println("Connected to DB");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(query);
            while(res.next()){
                System.out.print(res.getString(1) +"-");
                System.out.print(res.getString(2) +"-");
                System.out.print(res.getString(3) +"-");
                System.out.print(res.getString(4));
                System.out.println();
            }
            con.close();
            System.out.println("Connection closed!");
        }catch(ClassNotFoundException e){
            System.out.println("Unable to load the driver ! : "+e);
        }catch(SQLException e){
            System.out.println("Sql exception occured : "+e);
        }
    }
}
