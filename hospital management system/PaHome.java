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
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class PaHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	private JTextField textField;
	private JTextField textField_1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaHome frame = new PaHome();
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
	public PaHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	        
	        JLabel lblNewLabel_9_1 = new JLabel("");
	        lblNewLabel_9_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
	        lblNewLabel_9_1.setBounds(947, 324, 70, 74);
	        contentPane.add(lblNewLabel_9_1);
	        
	        JLabel lblNewLabel_9 = new JLabel("");
	        lblNewLabel_9.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Office-Customer-Male-Light.64.png"));
	        lblNewLabel_9.setBounds(947, 272, 130, 74);
	        contentPane.add(lblNewLabel_9);
	        

	        JLabel lblNewLabel_2 = new JLabel("username :");
	        lblNewLabel_2.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        lblNewLabel_2.setBounds(551, 291, 152, 29);
	        contentPane.add(lblNewLabel_2);


	        JButton btnNewButton = new JButton("Search");
	        btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 0, 102)));
	        btnNewButton.setBackground(new Color(153, 0, 204));
	        btnNewButton.setForeground(new Color(0, 0, 0));
	        btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
	        btnNewButton.setBounds(621, 413, 436, 74);
	        contentPane.add(btnNewButton);
	        
	        JLabel lblNewLabel_2_1 = new JLabel("Email :");
	        lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        lblNewLabel_2_1.setBounds(593, 347, 110, 29);
	        contentPane.add(lblNewLabel_2_1);
	       
	        
	        
	        textField = new JTextField();
	        textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField.setBounds(688, 298, 249, 29);
	        contentPane.add(textField);
	        textField.setColumns(10);
	        
	        textField_1 = new JTextField();
	        textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField_1.setColumns(10);
	        textField_1.setBounds(688, 353, 249, 29);
	        contentPane.add(textField_1);
	        
	        
	        
	        
	        table_1 =  new JTable();
	        table_1.setForeground(new Color(255, 255, 255));
	        table_1.setBackground(new Color(0, 0, 0));
	        table_1.setBounds(403, 525, 867, 162);
	        contentPane.add(table_1);
	        
	        
	        tableModel = new DefaultTableModel();
	        tableModel.addColumn("Username");
	        tableModel.addColumn("Email");
	        tableModel.addColumn("Age");
	        tableModel.addColumn("Tel");
	        tableModel.addColumn("Gender");
	        table_1.setModel(tableModel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Back");
	        lblNewLabel_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel_1.setBounds(10, 10, 45, 13);
	        contentPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_3 = new JLabel("Patient Information");
	        lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
	        lblNewLabel_3.setBounds(551, 233, 580, 29);
	        contentPane.add(lblNewLabel_3);
	        
	        JLabel lblHospitals = new JLabel("HOSPITALS");
	        lblHospitals.setForeground(Color.BLACK);
	        lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblHospitals.setBackground(Color.WHITE);
	        lblHospitals.setBounds(695, 122, 647, 87);
	        contentPane.add(lblHospitals);
	        
	        JLabel lblNewLabel = new JLabel("SUVA ARANA");
	        lblNewLabel.setForeground(Color.RED);
	        lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblNewLabel.setBackground(Color.WHITE);
	        lblNewLabel.setBounds(133, 10, 617, 151);
	        contentPane.add(lblNewLabel);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(153, 51, 204));
	        panel_1.setBounds(688, 341, 332, 51);
	        contentPane.add(panel_1);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(153, 51, 204));
	        panel.setBounds(688, 286, 332, 51);
	        contentPane.add(panel);
	        
	        JLabel lblNewLabel_4 = new JLabel("New label");
	        lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\doctor-nurse-discussing-digital-tablet.jpg"));
	        lblNewLabel_4.setBounds(-87, -12, 2000, 1333);
	        contentPane.add(lblNewLabel_4);
	       
	        
	        

	        


	        btnNewButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                searchDatabase();
	            }

	            private void searchDatabase() {
	                String searchTextUsername = textField.getText().trim();
	                String searchTextEmail = textField_1.getText().trim();

	                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456")) {
	                    String query = "SELECT * FROM patient WHERE username LIKE ? OR Email LIKE ?";
	                    PreparedStatement stmt = connection.prepareStatement(query);
	                    stmt.setString(1, "%" + searchTextUsername + "%");
	                    stmt.setString(2, "%" + searchTextEmail + "%");
	                    ResultSet resultSet = stmt.executeQuery();

	                    // Clear existing table data
	                   
	                    while (resultSet.next()) {
	                        String username = resultSet.getString("username");
	                        String Email = resultSet.getString("Email");
	                        
	                        if (username.contains(searchTextUsername) && Email.contains(searchTextEmail)) {
	                            String Age = resultSet.getString("Age");
	                            String Tel = resultSet.getString("Tel");
	                            String Gender = resultSet.getString("Gender");


		                        // Add the retrieved data to the table model
		                     tableModel.addRow(new Object[]{username, Email, Age, Tel, Gender});
	                        
	                        }

	                    
	                    }
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        setTitle("Search Example");
	        setSize(1456, 789);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        lblNewLabel_1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Create and display the registration form
	              Dinterface adminlogForm = new Dinterface();
	                adminlogForm.setVisible(true);

	                // Close the login form
	                dispose();
	            }
	        });
	        
	        
	    }
}
