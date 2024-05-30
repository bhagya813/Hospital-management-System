package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
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
import javax.swing.border.MatteBorder;

public class DoctorRegis extends JFrame {

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
					DoctorRegis frame = new DoctorRegis();
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
	public DoctorRegis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1499, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setBounds(393, 10, 1061, 114);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctors Registration");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(537, 165, 539, 47);
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setBounds(476, 224, 160, 28);
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email :");
		lblNewLabel_2_1.setBounds(537, 290, 103, 28);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Specialization :");
		lblNewLabel_2_2.setBounds(444, 344, 208, 28);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tel No :");
		lblNewLabel_2_3.setBounds(533, 403, 103, 28);
		lblNewLabel_2_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender :");
		lblNewLabel_2_4.setBounds(510, 466, 143, 28);
		lblNewLabel_2_4.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("password :");
		lblNewLabel_2_5.setBounds(487, 537, 153, 28);
		lblNewLabel_2_5.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Comfirm password :");
		lblNewLabel_2_6.setBounds(373, 611, 280, 28);
		lblNewLabel_2_6.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_2_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(655, 226, 306, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_1.setBounds(655, 290, 306, 33);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_2.setBounds(655, 351, 306, 28);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_3.setBounds(655, 410, 306, 33);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_4.setBounds(655, 466, 306, 28);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(655, 540, 306, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField_1.setBounds(655, 611, 306, 28);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 204, 255)));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setBounds(601, 663, 505, 76);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String username = textField.getText();
		        String Email = textField_1.getText();
		        String Specialization = textField_2.getText();
		        String Tel = textField_3.getText();
		        String Gender = textField_4.getText();
		        String password = new String(passwordField.getPassword());
		        String confirmPassword = new String(passwordField_1.getPassword());
		        
		        if (username.isEmpty() || Email.isEmpty() || Specialization.isEmpty() || Tel.isEmpty() || Gender.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match. Please try again.");
                } else {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");

                        // Ensure that the table structure matches the columns in your SQL query
                        String sql = "INSERT INTO doctor (username, Email, Specialization, Tel, Gender, password) VALUES (?, ?, ?, ?, ?, ?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1, username);
                        stmt.setString(2, Email);
                        stmt.setString(3, Specialization);
                        stmt.setString(4, Tel);
                        stmt.setString(5, Gender);
                        stmt.setString(6, password);

                        int rowsAffected = stmt.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Registration Successful!");
                            setVisible(false);
                            DoctorsLog loginFrame = new DoctorsLog();
                            loginFrame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Registration Failed!");
                        }

                        con.close();
                    } catch (Exception ae) {
                        ae.printStackTrace();
                    }
                }
            }
        });


		
		JLabel lblNewLabel_3 = new JLabel("Or Sign In?");
		lblNewLabel_3.setBounds(1127, 688, 132, 28);
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Back");
		lblNewLabel_4.setBounds(35, 36, 45, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("HOSPITALS");
		lblNewLabel_6.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_6.setBackground(new Color(0, 0, 0));
		lblNewLabel_6.setBounds(806, 95, 461, 98);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_7.setBounds(971, 203, 54, 63);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_7_1.setBounds(961, 277, 64, 53);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Graphicloads-Folded-Degree-folded.48.png"));
		lblNewLabel_7_2.setBounds(971, 344, 54, 43);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("");
		lblNewLabel_7_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Graphicloads-Colorful-Long-Shadow-Phone.48.png"));
		lblNewLabel_7_3.setBounds(964, 403, 61, 40);
		contentPane.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("");
		lblNewLabel_7_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Semlabs-Web-Blog-Users-mixed-gender-race.48.png"));
		lblNewLabel_7_4.setBounds(971, 457, 54, 63);
		contentPane.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("");
		lblNewLabel_7_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_7_5.setBounds(971, 516, 74, 57);
		contentPane.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_7_6 = new JLabel("");
		lblNewLabel_7_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_7_6.setBounds(971, 590, 64, 63);
		contentPane.add(lblNewLabel_7_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(654, 211, 371, 55);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(654, 281, 371, 49);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(655, 340, 372, 47);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(654, 400, 371, 47);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(654, 459, 371, 47);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(654, 526, 371, 47);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(655, 599, 377, 47);
		contentPane.add(panel_6);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\close-up-african-american-hand-holding-stethoscope.jpg"));
		lblNewLabel_5.setBounds(-317, 0, 2000, 1333);
		contentPane.add(lblNewLabel_5);
		
		
		
		
		
	
		

		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               DoctorsLog  adminlogForm = new  DoctorsLog ();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Ah2 adminlogForm = new Ah2();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
