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

public class uniqALogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uniqALogin frame = new uniqALogin();
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
	public uniqALogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1391, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(75, -2, 656, 109);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Unique Admin Login");
		lblNewLabel_2.setForeground(new Color(51, 204, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2.setBounds(481, 152, 647, 73);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username :");
		lblNewLabel_3.setForeground(new Color(0, 204, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_3.setBounds(310, 252, 251, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password:");
		lblNewLabel_3_1.setForeground(new Color(51, 204, 204));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_3_1.setBounds(317, 365, 254, 57);
		contentPane.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(571, 252, 363, 57);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(571, 365, 363, 57);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Unique Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.setBounds(493, 536, 647, 109);
		contentPane.add(btnNewButton);
		

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
		
		JLabel lblNewLabel_1 = new JLabel("Back");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 10, 55, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.96.png"));
		lblNewLabel_6.setBounds(935, 235, 85, 91);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.96 (1).png"));
		lblNewLabel_7.setBounds(935, 345, 93, 91);
		contentPane.add(lblNewLabel_7);
		
		JPanel panel = new JPanel();
		panel.setBounds(571, 235, 447, 91);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(571, 345, 457, 91);
		contentPane.add(panel_1);
		
		
		
		

		JLabel lblNewLabel_5 = new JLabel("HOSPITALAS");
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(234, 77, 580, 79);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\mid-adult-doctor-talking-with-patient-phone-writing-notes-clinic.jpg"));
		lblNewLabel_4.setBounds(-47, -174, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
		
		
		
		
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Home adminlogForm = new Home();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
