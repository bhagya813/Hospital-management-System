package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
public class forgot extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgot frame = new forgot();
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
	public forgot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 10, 1478, 896);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(564, 457, 92, 41);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(712, 461, 366, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("New Password :");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(475, 333, 227, 41);
		contentPane.add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(712, 337, 366, 41);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Comfirm Password :");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1.setBounds(429, 384, 227, 41);
		contentPane.add(lblNewLabel_2_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(712, 398, 366, 41);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Comfirm");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 51, 102));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(690, 573, 520, 96);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
            
    		    @Override
    		    public void mouseClicked(MouseEvent e) {
    		        String email = textField.getText();
    		        String password = new String(passwordField.getPassword());
    		        String confirmPassword = new String(passwordField_1.getPassword());
    		        

    		        // Check if passwords match
    		        if (!password.equals(confirmPassword)) {
    		            JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match. Please try again.");
    		            return; // Exit the action if passwords don't match
    		        }

    		        try {
    		            Class.forName("com.mysql.cj.jdbc.Driver");
    		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");

    		            // Ensure that the table structure matches the columns in your SQL query
    		            String sql = "UPDATE tblogin SET password = ? WHERE EmailID = ?";


    		            PreparedStatement stmt = con.prepareStatement(sql);
    		            stmt.setString(1, password);
    		            stmt.setString(2, email); // Assuming email is retrieved from the text field

    		           
    		            int rowsAffected = stmt.executeUpdate();
    		            if (rowsAffected > 0) {
    		                JOptionPane.showMessageDialog(null, "Update Successful!");
    		                setVisible(false);
    		                AdminLogin loginFrame = new AdminLogin();
    		                loginFrame.setVisible(true);
    		            } else {
    		                JOptionPane.showMessageDialog(null, "Update Failed!");
    		            }

    		            con.close();
    		        } catch (Exception ae) {
    		            ae.printStackTrace();
    		        }
    		    }
    		});
            
        
		
		JLabel lblNewLabel_3 = new JLabel("Return to Login");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(0, 0, 289, 41);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("HOSPITALS");
		lblNewLabel_4.setForeground(new Color(255, 51, 153));
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_4.setBounds(554, 104, 944, 89);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_1 = new JLabel("Forgot password");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(661, 214, 374, 109);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("SUVA ARANA");
		lblNewLabel_5.setForeground(new Color(102, 255, 0));
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_5.setBounds(210, 25, 944, 89);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\brunette-smiling-doctor-uniform-looking-x-ray-image (2).jpg"));
		lblNewLabel.setBounds(-25, 0, 2000, 1333);
		contentPane.add(lblNewLabel);
		
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
