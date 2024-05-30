package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class DForgot extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DForgot frame = new DForgot();
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
	public DForgot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1473, 828);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Forgot Password");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setBounds(505, 259, 472, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(489, 370, 126, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(442, 427, 153, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("comfirm password :");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2.setBounds(340, 473, 263, 29);
		contentPane.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(605, 365, 276, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(605, 420, 276, 37);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(605, 467, 276, 44);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(431, 548, 450, 74);
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
		            String sql = "UPDATE doctor SET password = ? WHERE Email= ?";


		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, password);
		            stmt.setString(2, email); // Assuming email is retrieved from the text field

		           
		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Update Successful!");
		                setVisible(false);
		                DoctorsLog loginFrame = new DoctorsLog();
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
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(0, 10, 276, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_8 = new JLabel("HOSPITALS");
		lblNewLabel_8.setForeground(new Color(255, 51, 153));
		lblNewLabel_8.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_8.setBounds(606, 116, 944, 89);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(new Color(51, 102, 153));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(232, 31, 944, 89);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\20020.jpg"));
		lblNewLabel_4.setBounds(-14, -145, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		

		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DoctorRegis adminlogForm = new DoctorRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		
	}
}
