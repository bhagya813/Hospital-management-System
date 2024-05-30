package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\OOP project\\photos oop\\Mandala Royal Resort Logo Minimalist (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 780);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(new Color(0, 255, 204));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(30, 3, 767, 100);
		contentPane.add(lblNewLabel);
		 
		JButton btnPatient = new JButton("Patient");
		btnPatient.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 255)));
		btnPatient.setBackground(new Color(153, 255, 255));
		btnPatient.setForeground(Color.BLACK);
		btnPatient.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPatient.setBounds(1225, 454, 229, 328);
		contentPane.add(btnPatient);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 204)));
		btnAdmin.setBackground(new Color(102, 204, 255));
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdmin.setBounds(828, 344, 229, 328);
		contentPane.add(btnAdmin);
		
		JButton btnDoctor = new JButton("Doctor");
		btnDoctor.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 102)));
		btnDoctor.setBackground(new Color(0, 204, 255));
		btnDoctor.setForeground(new Color(0, 0, 0));
		btnDoctor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDoctor.setBounds(48, 113, 229, 328);
		contentPane.add(btnDoctor);
		
		JButton btnNurse = new JButton("Nurse");
		btnNurse.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 153)));
		btnNurse.setBackground(new Color(0, 255, 255));
		btnNurse.setForeground(Color.BLACK);
		btnNurse.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNurse.setBounds(433, 255, 229, 328);
		contentPane.add(btnNurse);
		
		JLabel lblNewLabel_3 = new JLabel("HOSPITALAS");
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_3.setForeground(new Color(0, 255, 204));
		lblNewLabel_3.setBounds(457, 120, 583, 126);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Mandala Royal Resort Logo Minimalist (1).png"));
		lblNewLabel_2.setBounds(1305, 3, 269, 155);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\brunette-smiling-doctor-uniform-looking-x-ray-image (2).jpg"));
		lblNewLabel_1.setBounds(0, 0, 2031, 1333);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
		
		btnAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                uniqALogin adminlogForm = new uniqALogin();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnNurse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               NHlog  adminlogForm = new NHlog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnDoctor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               DHlog  adminlogForm = new DHlog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnPatient.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
               patientRegis  adminlogForm = new patientRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}
}
