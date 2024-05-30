package hosLogin;

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
import java.sql.ResultSet;

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

public class patientLog extends JFrame {

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
					patientLog frame = new patientLog();
					
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
	public patientLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1444, 861);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("HOSPITALS");
		lblNewLabel.setBackground(new Color(0, 102, 0));
		lblNewLabel.setForeground(new Color(0, 102, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel.setBounds(716, 86, 513, 114);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Login");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(605, 180, 423, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(436, 262, 214, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(436, 310, 169, 28);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(595, 255, 234, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(595, 322, 234, 35);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(595, 436, 326, 65);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
                    String sql = "SELECT * FROM patient WHERE username = ? AND password = ?";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.setString(1, textField.getText());
                    stmt.setString(2, passwordField.getText());

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        String username = rs.getString("username"); // Retrieve the username
                        PPHome adminAccountFrame = new PPHome(); // Pass the 
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
		
		JLabel lblNewLabel_3 = new JLabel("Or Sign Up?");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(809, 537, 166, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Forgot password?");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(762, 398, 213, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Back");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 10, 59, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblSuvaArana = new JLabel("SUVA ARANA");
		lblSuvaArana.setForeground(Color.RED);
		lblSuvaArana.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblSuvaArana.setBounds(351, 10, 624, 100);
		contentPane.add(lblSuvaArana);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_7.setBounds(839, 247, 45, 43);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_7_1.setBounds(819, 320, 73, 51);
		contentPane.add(lblNewLabel_7_1);
				
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 0));
		panel.setBounds(595, 242, 282, 58);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 204, 0));
		panel_1.setBounds(595, 313, 282, 58);
		contentPane.add(panel_1);
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\front-view-female-doctors-patient.jpg"));
		lblNewLabel_6.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_6);
		
	
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                patientRegis adminlogForm = new patientRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                patientRegis adminlogForm = new patientRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                PForgot adminlogForm = new PForgot();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}

}
