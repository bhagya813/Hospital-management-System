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

public class DoctorsLog extends JFrame {

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
					DoctorsLog frame = new DoctorsLog();
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
	public DoctorsLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1513, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(231, 10, 944, 89);
		contentPane.add(lblNewLabel);
		

		JLabel lblNewLabel_1 = new JLabel("Doctors Login");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setBounds(648, 200, 457, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(495, 263, 180, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(495, 325, 180, 28);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(685, 265, 260, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(685, 328, 260, 39);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(671, 431, 389, 63);
		contentPane.add(btnNewButton);
		

		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
                    String sql = "SELECT * FROM doctor WHERE username = ? AND password = ?";
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
		
		JLabel lblNewLabel_3 = new JLabel("Or Sign Up");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(1027, 504, 111, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Back");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 10, 45, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New Member ?");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(864, 504, 173, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Forgot password?");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setBounds(615, 388, 232, 28);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("HOSPITALS");
		lblNewLabel_8.setForeground(new Color(0, 204, 0));
		lblNewLabel_8.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_8.setBounds(575, 89, 944, 89);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
		lblNewLabel_9.setBounds(955, 257, 64, 55);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_9_1.setBounds(955, 311, 69, 79);
		contentPane.add(lblNewLabel_9_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(684, 257, 340, 55);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 255, 204));
		panel_1.setBounds(685, 322, 340, 56);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\medical-banner-with-doctor-wearing-goggles.jpg"));
		lblNewLabel_7.setBounds(-37, -186, 2000, 1333);
		contentPane.add(lblNewLabel_7);
		
		
		
	
		
		
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DoctorRegis adminlogForm = new DoctorRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
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
		
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DForgot adminlogForm = new  DForgot();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
