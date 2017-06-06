import java.sql.*;
import java.util.Scanner;


public class student{  
    public static void main(String args[]){  
    try{  
    int ID;
    String FName, LName;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the ID");
    ID = input.nextInt();
    System.out.println("Enter First Name");
    FName = input.nextLine();
    input.nextLine();
    System.out.println("Enter Last Name");
    LName = input.nextLine();
    Class.forName("com.mysql.jdbc.Driver");  
	//System.out.println("2");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","password");  
    String query = ("INSERT into `Student`.`StudInfo`(`StudentID`, `First_Name`, `Last_Name`) VALUES (?, ?, ?)");
    PreparedStatement preparedStmt = con.prepareStatement(query);
    preparedStmt.setInt(1, ID);
    preparedStmt.setString(2, FName);
    preparedStmt.setString(3, LName);
   input.close();
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
    }  