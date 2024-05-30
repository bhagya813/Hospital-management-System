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
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class PPHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	private JTable table_2;
	private JScrollPane scrollPane;
	private JLabel lblHospitals;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PPHome frame = new PPHome();
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
	public PPHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		    JLabel lblNewLabel = new JLabel("SUVA ARANA ");
	        lblNewLabel.setForeground(Color.RED);
	        lblNewLabel.setBackground(Color.WHITE);
	        lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblNewLabel.setBounds(68, 20, 864, 82);
	        contentPane.add(lblNewLabel);
	        

	        JLabel lblNewLabel_2 = new JLabel("username :");
	        lblNewLabel_2.setForeground(new Color(0, 0, 0));
	        lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
	        lblNewLabel_2.setBounds(484, 263, 167, 35);
	        contentPane.add(lblNewLabel_2);


	        JButton btnNewButton = new JButton("Search");
	        btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(102, 0, 0)));
	        btnNewButton.setForeground(new Color(255, 255, 255));
	        btnNewButton.setBackground(new Color(0, 51, 255));
	        btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
	        btnNewButton.setBounds(600, 383, 317, 82);
	        contentPane.add(btnNewButton);
	        
	        JLabel lblNewLabel_2_1 = new JLabel("Email         :");
	        lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
	        lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
	        lblNewLabel_2_1.setBounds(484, 308, 163, 29);
	        contentPane.add(lblNewLabel_2_1);
	       
	        
	        
	        textField = new JTextField();
	        textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField.setBounds(657, 263, 317, 33);
	        contentPane.add(textField);
	        textField.setColumns(10);
	        
	        textField_1 = new JTextField();
	        textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField_1.setColumns(10);
	        textField_1.setBounds(657, 312, 317, 35);
	        contentPane.add(textField_1);
	        
	        
	        
	        
	        table_1 =  new JTable();
	        table_1.setForeground(Color.WHITE);
	        table_1.setBackground(Color.BLACK);
	        table_1.setBounds(248, 565, 978, 165);
	        contentPane.add(table_1);
	        
	        
	        tableModel = new DefaultTableModel();
	        tableModel.addColumn("Username");
	        tableModel.addColumn("Email");
	        tableModel.addColumn("Age");
	        tableModel.addColumn("Tel");
	        tableModel.addColumn("Gender");
	        table_1.setModel(tableModel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Back");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel_1.setBounds(10, 10, 45, 13);
	        contentPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_3 = new JLabel("Patient Information");
	        lblNewLabel_3.setForeground(new Color(0, 0, 0));
	        lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 50));
	        lblNewLabel_3.setBounds(446, 193, 590, 51);
	        contentPane.add(lblNewLabel_3);
	        
	        scrollPane = new JScrollPane();
	        scrollPane.setBounds(247, 537, 979, 193);
	        contentPane.add(scrollPane);
	        
	        table_2 = new JTable();
	        scrollPane.setViewportView(table_2);
	        table_2.setModel(new DefaultTableModel(
	        	new Object[][] {
	        	},
	        	new String[] {
	        		"username", "Email", "Age", "Tel", "Gender"
	        	}
	        ));
	        
	        lblHospitals = new JLabel("HOSPITALS");
	        lblHospitals.setForeground(new Color(0, 0, 0));
	        lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblHospitals.setBackground(Color.WHITE);
	        lblHospitals.setBounds(622, 101, 553, 82);
	        contentPane.add(lblHospitals);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(102, 102, 204));
	        panel.setBounds(655, 257, 330, 45);
	        contentPane.add(panel);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(102, 102, 204));
	        panel_1.setBounds(657, 308, 328, 45);
	        contentPane.add(panel_1);
	        JLabel lblNewLabel_4 = new JLabel("");
	        lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\doctors-team-checking-sick-man-discussing-sickness-symptom.jpg"));
	        lblNewLabel_4.setBounds(0, -198, 2000, 1333);
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
	        setSize(1494, 990);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        lblNewLabel_1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Create and display the registration form
	              patientRegis adminlogForm = new patientRegis();
	                adminlogForm.setVisible(true);

	                // Close the login form
	                dispose();
	            }
	        });
	        
	        
	    }
}
