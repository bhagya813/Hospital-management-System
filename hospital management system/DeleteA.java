package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DeleteA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteA frame = new DeleteA();
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
	public DeleteA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1490, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(384, 0, 689, 107);
		contentPane.add(lblNewLabel);
		
		

		JLabel lblNewLabel_1 = new JLabel("Delete Admin  Account");
		lblNewLabel_1.setForeground(new Color(0, 153, 255));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setBounds(417, 176, 703, 54);
		contentPane.add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(448, 240, 159, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email :");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(494, 339, 113, 29);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(617, 243, 271, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Account");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 102, 102));
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(588, 450, 415, 82);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
	           
			
		    public void mouseClicked(MouseEvent e) {
		    	 String username = textField.getText().trim();
				    String Email = textField_1.getText().trim();
				   
		   
		    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456")) {
		        String deleteQuery = "DELETE FROM tblogin WHERE username = ? AND EmailID = ?";
		        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
		        preparedStatement.setString(1, username);
		        preparedStatement.setString(2, Email);
                   
		        int rowsDeleted = preparedStatement.executeUpdate();

		        if (rowsDeleted > 0) {
		            JOptionPane.showMessageDialog(null, "Account deleted successfully.");
		            setVisible(false);
		            Ah2 loginFrame = new Ah2();
		            loginFrame.setVisible(true);
		        } else {
		            JOptionPane.showMessageDialog(null, "No record found for deletion.");
		        }
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		        JOptionPane.showMessageDialog(null, "An error occurred while deleting the account: " + ex.getMessage());
		    }
		}

       
    });

	    
		
		JLabel lblNewLabel_3 = new JLabel("Back");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 10, 56, 29);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(617, 342, 271, 36);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_6.setBounds(890, 335, 64, 48);
		contentPane.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_7.setBounds(908, 222, 56, 71);
		contentPane.add(lblNewLabel_7);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(617, 232, 337, 58);
		contentPane.add(panel);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(617, 331, 337, 58);
		contentPane.add(panel_1);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("HOSPITALS");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(672, 78, 689, 107);
		contentPane.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\20020.jpg"));
		lblNewLabel_4.setBounds(-12, -124, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
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