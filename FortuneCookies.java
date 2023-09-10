package fortuneCookies1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FortuneCookies {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 350, 20);
        
        JButton b = new JButton("Click here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Create a connection to the database
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/northwind", "root", "admin");
                    
                    Statement stmt = con.createStatement();
                    
                    ResultSet rs = stmt.executeQuery("SELECT * FROM cookies");
                    
                    // You can process and display the data here
                    while (rs.next()) {
                        // For example, print the data to the console
                        System.out.println("Cookie ID: " + rs.getInt("cookie_id"));
                        System.out.println("Cookie Name: " + rs.getString("cookie_name"));
                        // Add more columns as needed
                    }
                    
                    // Close the resources
                    rs.close();
                    stmt.close();
                    con.close();
                } catch (Exception ex) {
                	
                    ex.printStackTrace();
                }
            }
        });
        
        
        f.add(tf);
        f.add(b);
        f.setSize(450, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
        
   }
    

        
        