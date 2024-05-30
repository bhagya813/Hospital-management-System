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

public class patientRegis extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
					patientRegis frame = new patientRegis();
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
	public patientRegis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1476, 996);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4_6 = new JLabel("");
		lblNewLabel_4_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_4_6.setBounds(835, 623, 62, 65);
		contentPane.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Graphicloads-Colorful-Long-Shadow-Phone.48.png"));
		lblNewLabel_4_3.setBounds(824, 431, 62, 56);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_4_5.setBounds(825, 564, 72, 50);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_4_1.setBounds(824, 321, 62, 55);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
		lblNewLabel_4.setBounds(814, 260, 72, 51);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Semlabs-Web-Blog-Users-mixed-gender-race.48.png"));
		lblNewLabel_4_4.setBounds(834, 497, 53, 56);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setBackground(new Color(255, 255, 204));
		lblNewLabel_4_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Semlabs-Web-Blog-Users-mixed-gender-race.48.png"));
		lblNewLabel_4_2.setBounds(824, 376, 87, 52);
		contentPane.add(lblNewLabel_4_2);
		

		JLabel lblNewLabel_1 = new JLabel("Patients Registration");
		lblNewLabel_1.setForeground(new Color(153, 255, 255));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(452, 202, 559, 65);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setForeground(new Color(102, 204, 204));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(452, 277, 123, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email :");
		lblNewLabel_2_1.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(489, 331, 103, 28);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age :");
		lblNewLabel_2_2.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2.setBounds(489, 382, 85, 28);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tel No :");
		lblNewLabel_2_3.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_3.setBounds(472, 446, 103, 28);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender :");
		lblNewLabel_2_4.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_4.setBounds(472, 514, 103, 28);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("password :");
		lblNewLabel_2_5.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_5.setBounds(452, 575, 167, 28);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Comfirm password :");
		lblNewLabel_2_6.setForeground(new Color(102, 204, 204));
		lblNewLabel_2_6.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_6.setBounds(353, 636, 232, 28);
		contentPane.add(lblNewLabel_2_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(585, 277, 236, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(583, 333, 238, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(585, 382, 232, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(585, 443, 236, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(585, 514, 238, 28);
		contentPane.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(585, 577, 236, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(585, 638, 236, 28);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 51));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(472, 685, 580, 70);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String username = textField.getText();
		        String Email = textField_1.getText();
		        String Age = textField_2.getText();
		        String Tel = textField_3.getText();
		        String Gender = textField_4.getText();
		        String password = new String(passwordField.getPassword());
		        String confirmPassword = new String(passwordField_1.getPassword());
		        
		        if (username.isEmpty() || Email.isEmpty() || Age.isEmpty() || Tel.isEmpty() || Gender.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "All fields are required. Please fill in all the fields.");
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
		            String sql = "INSERT INTO patient (username, Email, Age, Tel,Gender,password) VALUES (?, ?, ?, ?,?,?)";
		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, username);
		            stmt.setString(2, Email);
		            stmt.setString(3, Age);
		            stmt.setString(4, Tel);
		            stmt.setString(5, Gender);
		            stmt.setString(6, password);

		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Registration Successful!");
		                setVisible(false);
		                patientLog loginFrame = new patientLog();
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
		
		JLabel lblNewLabel_3 = new JLabel("Or Sign in?");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(974, 765, 193, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Back");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 10, 59, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(331, 16, 617, 151);
		contentPane.add(lblNewLabel);
		
		JLabel lblHospitals = new JLabel("HOSPITALS");
		lblHospitals.setForeground(new Color(51, 255, 255));
		lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblHospitals.setBackground(Color.WHITE);
		lblHospitals.setBounds(669, 123, 647, 87);
		contentPane.add(lblHospitals);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(585, 260, 301, 51);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 153));
		panel_1.setBounds(583, 321, 303, 51);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 153));
		panel_2.setBounds(583, 376, 303, 45);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 153));
		panel_3.setBounds(585, 431, 301, 51);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 153));
		panel_4.setBounds(585, 501, 301, 52);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 153));
		panel_5.setBounds(585, 563, 301, 51);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 153));
		panel_6.setBounds(585, 625, 301, 59);
		contentPane.add(panel_6);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\doctors-team-checking-sick-man-discussing-sickness-symptom.jpg"));
		lblNewLabel_6.setBounds(-18, -370, 2000, 1333);
		contentPane.add(lblNewLabel_6);
		

		lblNewLabel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               Home  adminlogForm = new Home();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               patientLog  adminlogForm = new patientLog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
	}

}
