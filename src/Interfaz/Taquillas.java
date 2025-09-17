package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Taquillas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_8;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taquillas frame = new Taquillas();
					frame.setUndecorated(true);
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
	public Taquillas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1270, 200, 460, 330);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent a) {
				int x = a.getXOnScreen();
				int y = a.getYOnScreen();
				Taquillas.this.setLocation(x-xx, y-xy);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
                xy = e.getY();
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 25, 73, 79);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Taquillas.class.getResource("/imag/bank_78392.png")));
		
		JLabel lblNewLabel = new JLabel("TaquillaEstandar");
		lblNewLabel.setBounds(10, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TaquillaEspecializada ");
		lblNewLabel_1.setBounds(10, 115, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Taquillas.class.getResource("/imag/bank_14474.png")));
		lblNewLabel_4.setBounds(10, 131, 73, 84);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Depositar\r\n ,Extraer");
		lblNewLabel_6.setBounds(130, 42, 124, 32);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblCambiarcuenta = new JLabel("CambiarCuenta");
		lblCambiarcuenta.setBounds(130, 255, 98, 27);
		contentPane.add(lblCambiarcuenta);
		
		JLabel lblAgregarcuenta = new JLabel("AgregarCuenta");
		lblAgregarcuenta.setBounds(130, 281, 98, 27);
		contentPane.add(lblAgregarcuenta);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(0, 0, 464, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setBounds(131, 0, 98, 27);
		panel.add(lblOperaciones);
		lblOperaciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblAcceso = new JLabel("Acceso");
		lblAcceso.setBounds(264, 0, 74, 27);
		panel.add(lblAcceso);
		lblAcceso.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_7 = new JLabel("ClienteEstandar");
		lblNewLabel_7.setBounds(264, 38, 105, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblClienteregistrado = new JLabel("ClienteRegistrado");
		lblClienteregistrado.setBounds(264, 61, 105, 14);
		panel.add(lblClienteregistrado);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setBounds(264, 86, 98, 14);
		panel.add(lblAdministrador);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(432, 0, 25, 27);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Taquillas.this.dispose();
				
			
				
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon(Taquillas.class.getResource("/imag/close_111152 (2).png")));
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCantidad.setBounds(361, 0, 74, 27);
		panel.add(lblCantidad);
		
		JLabel label_5 = new JLabel("       2");
		label_5.setBounds(369, 61, 46, 14);
		panel.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 0, 102));
		panel_1.setBounds(0, 106, 464, 111);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDepositarExtraerCheques = new JLabel("Depositar, Retirar");
		lblDepositarExtraerCheques.setBounds(130, 26, 124, 27);
		panel_1.add(lblDepositarExtraerCheques);
		
		JLabel lblChequesJuridico = new JLabel("Cheques ,Juridico");
		lblChequesJuridico.setBounds(130, 50, 111, 27);
		panel_1.add(lblChequesJuridico);
		
		JLabel label_2 = new JLabel("ClienteEstandar");
		label_2.setBounds(264, 32, 105, 14);
		panel_1.add(label_2);
		
		JLabel label = new JLabel("ClienteRegistrado");
		label.setBounds(264, 56, 105, 14);
		panel_1.add(label);
		
		JLabel label_3 = new JLabel("Administrador");
		label_3.setBounds(264, 81, 85, 14);
		panel_1.add(label_3);
		
		JLabel label_6 = new JLabel("       2");
		label_6.setBounds(367, 56, 46, 14);
		panel_1.add(label_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 153, 0));
		panel_2.setBounds(0, 213, 464, 117);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BancaPersonal");
		lblNewLabel_2.setBounds(18, 6, 91, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("ClienteRegistrado");
		label_1.setBounds(264, 44, 114, 14);
		panel_2.add(label_1);
		
		JLabel label_4 = new JLabel("Administrador");
		label_4.setBounds(264, 69, 85, 14);
		panel_2.add(label_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(10, 31, 78, 80);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(Taquillas.class.getResource("/imag/safebox_78389 (2).png")));
		
		JLabel label_7 = new JLabel("       2");
		label_7.setBounds(372, 44, 46, 14);
		panel_2.add(label_7);
	}
}
