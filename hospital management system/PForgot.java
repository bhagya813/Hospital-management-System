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

public class PForgot extends JFrame {

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
					PForgot frame = new PForgot();
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
	public PForgot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1489, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("SUVA ARNA ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(346, 0, 717, 99);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Forgot Password ?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(576, 189, 312, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(450, 264, 96, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(397, 329, 149, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("comfirm password :");
		lblNewLabel_2_1_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1_1.setBounds(251, 379, 295, 29);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(565, 264, 267, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(565, 331, 267, 29);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(565, 396, 267, 29);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(153, 0, 153));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(476, 503, 519, 80);
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
		            String sql = "UPDATE patient SET password = ? WHERE Email= ?";


		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, password);
		            stmt.setString(2, email); // Assuming email is retrieved from the text field

		           
		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Update Successful!");
		                setVisible(false);
		                patientRegis loginFrame = new patientRegis();
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
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(0, 0, 239, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblHospitals = new JLabel("HOSPITALS");
		lblHospitals.setForeground(new Color(0, 0, 0));
		lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblHospitals.setBounds(566, 84, 717, 99);
		contentPane.add(lblHospitals);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 102));
		panel.setBounds(566, 252, 295, 51);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(566, 252, 10, 10);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(153, 0, 102));
		panel_1_1.setBounds(566, 313, 295, 56);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(153, 0, 102));
		panel_1_2.setBounds(566, 379, 295, 56);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\portrait-young-business-woman-suddenly-remember-something-important-isolated-gray.jpg"));
		lblNewLabel_4.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		

		lblNewLabel_3 .addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                patientRegis adminlogForm = new  patientRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
	}

}
