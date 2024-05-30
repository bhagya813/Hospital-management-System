package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AdminLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1390, 873);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(new Color(153, 0, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(273, 13, 635, 99);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITALS");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(578, 75, 663, 109);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_2.setBounds(671, 194, 275, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username :");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(482, 273, 185, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_1.setBounds(493, 353, 142, 38);
		contentPane.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(645, 281, 323, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(645, 363, 323, 38);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(153, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(645, 489, 353, 65);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Or Sign Up");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(919, 557, 142, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Back");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 13, 56, 19);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Forgot Password?");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setBounds(893, 438, 211, 38);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
		lblNewLabel_8.setBounds(970, 259, 64, 75);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_8_1.setBounds(966, 347, 74, 65);
		contentPane.add(lblNewLabel_8_1);

		JPanel panel = new JPanel();
		panel.setBounds(644, 270, 378, 57);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(643, 347, 379, 65);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\doctor-nurse-discussing-digital-tablet.jpg"));
		lblNewLabel_7.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_7);
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
                    String sql = "SELECT * FROM tblogin WHERE username = ? AND password = ?";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.setString(1, textField.getText());
                    stmt.setString(2, passwordField.getText());

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        String username = rs.getString("username"); // Retrieve the username
                        Ah2 adminAccountFrame = new Ah2(); // Pass the 
                        adminAccountFrame.setVisible(true);

                        setVisible(false); // Close the login form
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect username and password");
                    }
                } catch (Exception ae) {
                    ae.printStackTrace();
                }
            }
        });
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                AdminRegister adminlogForm = new AdminRegister();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                AdminRegister adminlogForm = new AdminRegister();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                forgot adminlogForm = new forgot();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}

}
