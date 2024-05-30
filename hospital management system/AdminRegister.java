package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 public class AdminRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	
        
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegister frame = new AdminRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1426, 1001);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel user = new JLabel("Username :");
		user.setForeground(new Color(255, 255, 255));
		user.setFont(new Font("Segoe UI Black", Font.ITALIC, 25));
		user.setBounds(487, 274, 177, 29);
		contentPane.add(user);
		
		JLabel pass = new JLabel("password :");
		pass.setForeground(new Color(255, 255, 255));
		pass.setFont(new Font("Segoe UI Black", Font.ITALIC, 25));
		pass.setBounds(487, 343, 177, 37);
		contentPane.add(pass);
		
		JLabel cpass = new JLabel("comfirm password :");
		cpass.setForeground(new Color(255, 255, 255));
		cpass.setFont(new Font("Segoe UI Black", Font.ITALIC, 25));
		cpass.setBounds(378, 416, 250, 38);
		contentPane.add(cpass);
		
		JLabel email = new JLabel("Email :");
		email.setForeground(new Color(255, 255, 255));
		email.setFont(new Font("Segoe UI Black", Font.ITALIC, 25));
		email.setBounds(531, 490, 102, 29);
		contentPane.add(email);
		
		
		
		JLabel nic = new JLabel("Nic :");
		nic.setForeground(new Color(255, 255, 255));
		nic.setFont(new Font("Segoe UI Black", Font.ITALIC, 25));
		nic.setBounds(562, 557, 102, 29);
		contentPane.add(nic);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(641, 274, 310, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(643, 486, 308, 41);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(643, 557, 308, 41);
		contentPane.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(641, 339, 310, 41);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(641, 420, 310, 43);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 0, 153)));
		btnNewButton.setBackground(new Color(255, 0, 204));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(506, 655, 491, 60);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	
		        String username = textField.getText();
		        String password = new String(passwordField.getPassword());
		        String confirmPassword = new String(passwordField_1.getPassword());
		        String email = textField_3.getText();
		        String nic = textField_4.getText();
		        
		        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || email.isEmpty() || nic.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
		            return; // Exit the action if any field is empty
		        }


		        // Check if passwords match
		        if (!password.equals(confirmPassword)) {
		            JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match. Please try again.");
		            return; // Exit the action if passwords don't match
		        }

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");

		            // Ensure that the table structure matches the columns in your SQL query
		            String sql = "INSERT INTO tblogin (username, password, EmailID, Nic) VALUES (?, ?, ?, ?)";
		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, username);
		            stmt.setString(2, password);
		            stmt.setString(3, email);
		            stmt.setString(4, nic);

		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Registration Successful!");
		                setVisible(false);
		                AdminLogin loginFrame = new AdminLogin();
		                loginFrame.setVisible(true);
		            } else {
		                JOptionPane.showMessageDialog(null, "Registration Failed!");
		            }

		            con.close();
		        } catch (Exception ae) {
		            ae.printStackTrace();
		        }
		    }
		});

		
       
		
	    JLabel lblNewLabel_2 = new JLabel("Back");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 10, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Members : Sign in");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(933, 604, 207, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Registration");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(570, 175, 485, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SUVA ARANA ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_1_1.setBounds(61, 0, 747, 90);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("HOSPITALS");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_5.setBounds(291, 100, 530, 90);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
		lblNewLabel_6.setBounds(966, 256, 64, 75);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_6_1.setBounds(961, 332, 64, 59);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_6_1_1.setBounds(961, 408, 82, 59);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("");
		lblNewLabel_6_1_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_6_1_2.setBounds(961, 477, 99, 60);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("");
		lblNewLabel_6_1_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Inipagi-Job-Seeker-Id-card.64.png"));
		lblNewLabel_6_1_3.setBounds(955, 547, 70, 51);
		contentPane.add(lblNewLabel_6_1_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(641, 262, 381, 60);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(641, 331, 381, 60);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(641, 409, 381, 60);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(643, 479, 379, 57);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(641, 547, 381, 60);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Mandala Royal Resort Logo Minimalist (1).png"));
		lblNewLabel_7.setBounds(1260, 10, 187, 180);
		contentPane.add(lblNewLabel_7);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\wooden-background.jpg"));
		lblNewLabel.setBounds(359, 222, 781, 423);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\business-people-meeting.jpg"));
		lblNewLabel_4.setBounds(-11, 0, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
		
		
		
		
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Ah2 adminlogForm = new Ah2();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                AdminLogin adminlogForm = new AdminLogin();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		 
	}
}
