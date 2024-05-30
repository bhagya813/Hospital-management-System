package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class NurseRegis extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseRegis frame = new NurseRegis();
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
	public NurseRegis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 805);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(new Color(153, 51, 102));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(264, 0, 658, 103);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITALS");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(774, 77, 538, 103);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nurses Registration");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_2.setBounds(290, 125, 571, 59);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("username :");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(181, 194, 156, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email :");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_1.setBounds(233, 247, 119, 32);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender :");
		lblNewLabel_3_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_2.setBounds(197, 308, 119, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nic :");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_4.setBounds(233, 368, 88, 32);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_3 = new JLabel("password :");
		lblNewLabel_3_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_3.setBounds(157, 429, 195, 32);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("comfirm password :");
		lblNewLabel_3_4.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_4.setBounds(45, 487, 275, 32);
		contentPane.add(lblNewLabel_3_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(326, 194, 275, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(326, 254, 275, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(326, 315, 275, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(326, 375, 275, 31);
		contentPane.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(326, 436, 275, 31);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(326, 494, 275, 31);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(51, 204, 0)));
		btnNewButton.setBackground(new Color(51, 204, 153));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(290, 568, 384, 68);
		contentPane.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String username = textField.getText();
		        String password = new String(passwordField.getPassword());
		        String confirmPassword = new String(passwordField_1.getPassword());
		        String email = textField_1.getText();
		        String Gender = textField_2.getText();
		        String nic = textField_3.getText();
		        
		        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || email.isEmpty() || Gender.isEmpty() || nic.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                    return; // Exit the action if any fields are empty Fend
                }



		        // Check if passwords match
		        if (!password.equals(confirmPassword)) {
		            JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match. Please try again.");
		            return; // Exit the action if passwords don't match bend
		        }

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");

		            // Ensure that the table structure matches the columns in your SQL query
		            String sql = "INSERT INTO nurse (username,Email, Gender, Nic,password) VALUES (?, ?, ?, ?,?)";
		            PreparedStatement stmt = con.prepareStatement(sql);
		            stmt.setString(1, username);
		            stmt.setString(2, email);
		            stmt.setString(3, Gender);
		            stmt.setString(4, nic);
		            stmt.setString(5, password);

		            int rowsAffected = stmt.executeUpdate();
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(null, "Registration Successful!");
		                setVisible(false);
		                NurseLog loginFrame = new  NurseLog();
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
		
		
		JLabel lblNewLabel_5 = new JLabel("Back");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 10, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Member : Sign in");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_7.setBounds(499, 646, 195, 31);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
		lblNewLabel_6.setBounds(611, 182, 63, 53);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_6_1.setBounds(604, 426, 63, 53);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Semlabs-Web-Blog-Users-mixed-gender-race.48.png"));
		lblNewLabel_6_2.setBounds(611, 309, 49, 53);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Inipagi-Job-Seeker-Id-card.64.png"));
		lblNewLabel_6_3.setBounds(604, 365, 56, 47);
		contentPane.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("");
		lblNewLabel_6_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_6_4.setBounds(604, 246, 70, 53);
		contentPane.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("");
		lblNewLabel_6_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_6_5.setBounds(604, 485, 56, 47);
		contentPane.add(lblNewLabel_6_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(643, 235, 31, 0);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 204, 153));
		panel_1.setBounds(326, 185, 334, 53);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 153));
		panel_2.setBounds(326, 248, 334, 47);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 204, 153));
		panel_2_1.setBounds(326, 308, 334, 47);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 204, 153));
		panel_2_2.setBounds(326, 366, 334, 47);
		contentPane.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 204, 153));
		panel_2_3.setBounds(326, 427, 334, 47);
		contentPane.add(panel_2_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBackground(new Color(0, 204, 153));
		panel_2_4.setBounds(326, 485, 334, 47);
		contentPane.add(panel_2_4);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\portrait-young-nurse-holding-laptop-white.jpg"));
		lblNewLabel_8.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_8);
		
		
		
		
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               Ah2 adminlogForm = new  Ah2();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               NurseLog adminlogForm = new  NurseLog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
