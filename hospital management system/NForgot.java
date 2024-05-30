package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.ImageIcon;
public class NForgot extends JFrame {

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
					NForgot frame = new NForgot();
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
	public NForgot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1478, 893);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Forgot Password ?");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(580, 195, 371, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(502, 261, 82, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(448, 325, 136, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("comfirm password :");
		lblNewLabel_2_1_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1.setBounds(339, 367, 241, 29);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(580, 241, 285, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(583, 309, 285, 54);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(580, 373, 285, 54);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(153, 255, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(593, 477, 285, 75);
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
		            String sql = "UPDATE nurse SET password = ? WHERE Email= ?";


		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, password);
		            stmt.setString(2, email); // Assuming email is retrieved from the text field

		           
		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Update Successful!");
		                setVisible(false);
		                NurseLog loginFrame = new NurseLog();
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
		lblNewLabel_3.setBounds(0, 0, 193, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SUWA ARANA ");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_4.setBounds(192, 10, 707, 101);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblHospitals = new JLabel("HOSPITALS");
		lblHospitals.setForeground(new Color(51, 255, 0));
		lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblHospitals.setBackground(Color.WHITE);
		lblHospitals.setBounds(639, 98, 647, 87);
		contentPane.add(lblHospitals);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\female-doctor-with-stethoscope-posing-gray-background-high-quality-photo.jpg"));
		lblNewLabel.setBounds(-16, -11, 2000, 1333);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               NurseLog  adminlogForm = new NurseLog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}

}
