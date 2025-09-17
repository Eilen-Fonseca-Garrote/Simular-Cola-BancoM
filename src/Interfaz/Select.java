package Interfaz;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Button;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.SwingConstants;

import Paq2.Cliente;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Select extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Cliente> c = new ArrayList<Cliente>();
	Cliente standard = new Cliente(null, "visitor");
	private boolean decision = false;

	



	



	/**
	 * Launch the application.
	 */
	

	

	/**
	 * Create the frame.
	 * @param clientes 
	 */
	public Select(ArrayList<Cliente> clientes) {
	this.c=clientes;
	pc();
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 214);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Administrador");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Login log = new Login(c);
				boolean key = true;
				log.adminKey(key);
				log.setVisible(true);
				Select.this.dispose();
				
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setBounds(33, 138, 95, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Cliente Registrado");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login(c);
				boolean key = false;
				log.adminKey(key);
				log.setVisible(true);
				Select.this.dispose();
				
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBounds(272, 138, 118, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Cliente Estandar");
		button_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				DashBoard fDash = new DashBoard(c);
				decision = true;
				fDash.setVisible(true);
				Select.this.dispose();
				fDash.getCliStandard(standard);
				fDash.isStandard(decision);
				fDash.iniciarT();
				fDash.onlyStandard();
				fDash.onlyAdmi();
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setBounds(147, 138, 107, 22);
		contentPane.add(button_2);
		
		JLabel lblNewLabel = new JLabel("Seleccione su tipo de Ingreso");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(94, 86, 215, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon(Select.class.getResource("/imag/descarga (1).png")));
		lblNewLabel_1.setBounds(33, -30, 368, 162);
		contentPane.add(lblNewLabel_1);
	}
	
public void pc(){
	for (int i = 0; i < c.size(); i++) {
		System.out.println(c.get(i).getNombre());
	}
}
	
	
	

}
