package Interfaz;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Button;

import javax.swing.JTextField;
import javax.swing.JSeparator;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPasswordField;

import Paq2.Banco;
import Paq2.Cliente;
import Utile.Fichero;


public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Cliente> users = new ArrayList<Cliente>();
	private boolean key;
	

	private int xx,xy;
	private JPasswordField passwordField;
	private JTextField userField;
	private DashBoard fDashBoard;

	public DashBoard getfDashBoard() {
		return fDashBoard;
	}

	public void setfDashBoard(DashBoard fDashBoard) {
		this.fDashBoard = fDashBoard;
	}

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param c 
	 */
	public Login(ArrayList<Cliente> c) {
		this.users = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 51));
		panel_1.setBounds(0, 0, 172, 299);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
                xy = e.getY();
				
				
			}
		});
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent a) {
				
				int x = a.getXOnScreen();
				int y = a.getYOnScreen();
				Login.this.setLocation(x-xx, y-xy);
				
				
				
				
			}
		});
		lblNewLabel.setBounds(0, -24, 172, 358);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imag/descarga-_3_.jpg")));
		
		Button button = new Button("Iniciar Sesion");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				DashBoard fDash = new DashBoard(users);
				
				
				boolean ver1= false;
				boolean ver2= false;

				
				
				if (key) {
					char[] enteredPasswordAdmi = passwordField.getPassword();
                String correctPasswordAdmi = "1111";
                
					if (userField.getText().equalsIgnoreCase("admi")) {
						ver1 = true;
					}

					 
		                if (Arrays.equals(enteredPasswordAdmi, correctPasswordAdmi.toCharArray())) {
		                	ver2=true;
		                	
		                }
		                if (ver1&&ver2) {
		                	fDash.getAdmiKey(key);
		                	fDash.setVisible(true);
							
							Login.this.dispose();
							
							fDash.iniciarT();
	                		
						}
				}
				
				
				
					if (!key) {
						int CantUsers=users.size();
						for (int i = 0; i < CantUsers; i++) {
							System.out.println(users.get(i).getNombre());
							if (userField.getText().trim().equalsIgnoreCase(users.get(i).getNombre()) ) {
								ver1 = true;
							}
								 char[] enteredPassword = passwordField.getPassword();
					                String correctPassword = users.get(i).getId();
					                if (Arrays.equals(enteredPassword, correctPassword.toCharArray())) {
					                	ver2 = true;
					                			if (ver1&&ver2) {
					                				Banco b = (Banco)Fichero.load();
					                				if(b != null)
					                					fDash.setBanco(b);
					                				fDash.onlyAdmi();
					                				fDash.setVisible(true);
													Login.this.dispose();
													
													fDash.iniciarT();
												}
										
									
									}
								
					}
					
							  
					}if (!ver1) 
					 JOptionPane.showMessageDialog(null, "El usuario es incorrecto. Por favor, verifica los datos.",
			                    "Aviso", JOptionPane.WARNING_MESSAGE);
					if (!ver2) {
						 JOptionPane.showMessageDialog(null, " la Clave es incorrecta. Por favor, verifica los datos.",
				                    "Aviso", JOptionPane.WARNING_MESSAGE);
					}
				
				
				
		
				
				
				
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 102, 51));
		button.setBounds(213, 224, 142, 35);
		contentPane.add(button);
		
		userField = new JTextField();
		userField.setToolTipText("");
		userField.setBounds(212, 80, 211, 35);
		contentPane.add(userField);
		userField.setColumns(10);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(212, 99, 211, 2);
		contentPane.add(separator);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(213, 45, 80, 24);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(213, 126, 80, 24);
		contentPane.add(lblContrasea);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(212, 189, 211, 2);
		contentPane.add(separator_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 158, 210, 33);
		contentPane.add(passwordField);
	}
	
	public void adminKey(boolean key){
		this.key  = key;
	}
	
	

	
}
