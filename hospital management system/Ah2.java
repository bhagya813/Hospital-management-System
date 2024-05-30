package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
public class Ah2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ah2 frame = new Ah2();
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
	public Ah2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1392, 893);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(269, -17, 795, 175);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITALS");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(733, 87, 523, 107);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Admin");
		btnNewButton.setBorder(new MatteBorder(12, 10, 10, 10, (Color) new Color(204, 0, 153)));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.ITALIC, 24));
		btnNewButton.setBounds(145, 160, 193, 301);
		contentPane.add(btnNewButton);
		
		JButton btnAddNurse = new JButton("Add Nurse");
		btnAddNurse.setForeground(new Color(255, 255, 255));
		btnAddNurse.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 0, 255)));
		btnAddNurse.setBackground(new Color(153, 0, 102));
		btnAddNurse.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 23));
		btnAddNurse.setBounds(576, 168, 193, 301);
		contentPane.add(btnAddNurse);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.setForeground(new Color(255, 255, 255));
		btnAddDoctor.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(51, 0, 204)));
		btnAddDoctor.setBackground(new Color(102, 0, 153));
		btnAddDoctor.setFont(new Font("Stencil", Font.ITALIC, 24));
		btnAddDoctor.setBounds(997, 168, 186, 287);
		contentPane.add(btnAddDoctor);
		
		JLabel lblNewLabel_2 = new JLabel("Back");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 10, 83, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnDeleteNurse = new JButton("Delete Nurse");
		btnDeleteNurse.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 102, 51)));
		btnDeleteNurse.setBackground(new Color(204, 255, 102));
		btnDeleteNurse.setFont(new Font("Stencil", Font.ITALIC, 21));
		btnDeleteNurse.setBounds(424, 487, 186, 301);
		contentPane.add(btnDeleteNurse);
		
		JButton btnDeleteDoctor = new JButton("Delete Doctor");
		btnDeleteDoctor.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 153, 51)));
		btnDeleteDoctor.setBackground(new Color(102, 204, 0));
		btnDeleteDoctor.setFont(new Font("Stencil", Font.ITALIC, 20));
		btnDeleteDoctor.setBounds(818, 487, 186, 301);
		contentPane.add(btnDeleteDoctor);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Mandala Royal Resort Logo Minimalist (1).png"));
		lblNewLabel_4.setBounds(1307, 0, 215, 190);
		contentPane.add(lblNewLabel_4);
		
		JButton btnDeleteAdmin = new JButton("Delete Admin");
		btnDeleteAdmin.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(204, 0, 255)));
		btnDeleteAdmin.setBackground(new Color(153, 102, 102));
		btnDeleteAdmin.setFont(new Font("Stencil", Font.ITALIC, 21));
		btnDeleteAdmin.setBounds(73, 487, 186, 301);
		contentPane.add(btnDeleteAdmin);
		
		JButton btnDeleteDoctor_1 = new JButton("Delete patient");
		btnDeleteDoctor_1.setFont(new Font("Stencil", Font.ITALIC, 20));
		btnDeleteDoctor_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 153, 51)));
		btnDeleteDoctor_1.setBackground(Color.CYAN);
		btnDeleteDoctor_1.setBounds(1227, 487, 186, 301);
		contentPane.add(btnDeleteDoctor_1);
	
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\low-rise-building.jpg"));
		lblNewLabel_3.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_3);
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                AdminRegister adminlogForm = new AdminRegister();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Home adminlogForm = new Home();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnAddNurse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                NurseRegis adminlogForm = new  NurseRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		

		btnAddDoctor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DoctorRegis adminlogForm = new DoctorRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnDeleteNurse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DeleteN adminlogForm = new DeleteN();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnDeleteDoctor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DeleteD adminlogForm = new DeleteD();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnDeleteAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DeleteA adminlogForm = new DeleteA();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnDeleteDoctor_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DeleteP adminlogForm = new DeleteP();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
