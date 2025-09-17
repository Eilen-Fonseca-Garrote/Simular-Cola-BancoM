package Interfaz;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Panel;
import java.awt.Color;




















import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.util.ArrayList;
import java.util.Random;

import javax.swing.JScrollPane;

import Paq2.Banco;
import Paq2.Cliente;
import Utile.Fichero;


public class DashBoard extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Modelos para tablas
	////////////////////
	//Depositar
	 String[] columnNamesDep = {"Puesto1","Puesto2"};
     Object[][] dataDep = {
             {null}
     };
       DefaultTableModel dep = new DefaultTableModel(dataDep, columnNamesDep );
   //Retirar
     String[] columnNamesRet = {"Puesto1","Puesto2"};
     Object[][] dataret = {
             {null}
     };
     DefaultTableModel ret = new DefaultTableModel(dataret, columnNamesRet);
   //Cheque
     String[] columnNamesJud = {"Puesto1","Puesto2"};
     Object[][] datache = {
             {null}
     };
     DefaultTableModel che = new DefaultTableModel(datache, columnNamesJud);
   //Juridico
     String[] columnNamesChe = {"Puesto1","Puesto2"};
     Object[][] datajud = {
             {null}
     };
     DefaultTableModel jud = new DefaultTableModel(datajud, columnNamesChe);
   //AddCuenta
     String[] columnNamesAgc = {"Puesto1","Puesto2"};
     Object[][] dataagc = {
             {null}
     };
     DefaultTableModel agc = new DefaultTableModel(dataagc, columnNamesAgc);
   //CambCuenta
     String[] columnNamesCmc = {"Puesto1","Puesto2"};
     Object[][] datacmc = {
             {null}
     };
     DefaultTableModel cmc = new DefaultTableModel(datacmc, columnNamesCmc);
     //Registro
     String[] columnNamesReg = {"Nombre","Operacion"};
     Object[][] datareg = {
             {null}
     };
      DefaultTableModel reg = new DefaultTableModel(datareg, columnNamesReg);
     
     String[] columnNamesReg2 = {"Depositar","Retirar","Cheque","Juridico","AgregarCuenta","CambiarCuenta"};
     Object[][] datareg2 = {
             {null}
     };
      DefaultTableModel reg2 = new DefaultTableModel(datareg2, columnNamesReg2);
//Operaciones
	private JPanel contentPane;
	private ArrayList<Cliente> registrados = new ArrayList<Cliente>();
	
	private ArrayList<Cliente> standardUsersDep= new ArrayList<Cliente>();
	private ArrayList<Cliente> standardUsersRet= new ArrayList<Cliente>();
	private ArrayList<Cliente> standardUsersChe= new ArrayList<Cliente>();
	private ArrayList<Cliente> standardUsersJud= new ArrayList<Cliente>();
	private ArrayList<Cliente> standardUsersAgc= new ArrayList<Cliente>();
	private ArrayList<Cliente> standardUsersCmc= new ArrayList<Cliente>();
	Random random = new Random();
	private int randomTime;
	private String userName;
	private boolean exist;
	private Banco banco = new Banco();
	//Temporizadores
	private Timer nTimer;
	private Timer nTimerDep;
	private Timer nTimerRet;
	private Timer nTimerChe;
	private Timer nTimerCmc;
	private Timer nTimerAgc;
	private Timer nTimerJud;
	private String temporizador;
	private String temporizadorOp;
	//Horas,Minutos y Segundos
	private int horas;
	private int minutos;
	private int segundos;
	private int minutosDep;
	private int segundosDep;
	private int minutosRet;
	private int segundosRet;
	private int minutosChe;
	private int segundosChe;
	private int minutosJud;
	private int segundosJud;
	private int minutosCmc;
	private int segundosCmc;
	private int minutosAgc;
	private int segundosAgc;
	
	
	private ImageIcon imagen;
	private Icon icono;

	
	
	//Interfaz
	private JLabel lblTimer;
	private Panel panel_5;
	private Panel panel_6;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private Panel panel_8;
	private JLabel lblNewLabel_8;
	private JPanel Depositar;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_16;
	private JTable table;
	private JTable table_6;
	private JTable table_5;
	private JTable table_4;
	private JTable table_3;
	private JPanel Retirar;
	private JPanel Cheques;
	private JPanel Juridico;
	private JPanel CambiarCuenta;
	private JPanel AgregarCuenta;
	private JLabel lblNewLabel_9;
	private Panel panel_9;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JTable table_1;
	private Panel panel_2;
	private Panel panel_3;
	private Panel panel_1;
	private Panel panel_4;
	private JPanel Registro;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JScrollPane scrollPane_6;
	private JScrollPane scrollPane_7;
	private JScrollPane scrollPane_8;
	
	//Otras Variables
	private boolean stop;
	private int count;
	private boolean contador;
	private Cliente standard;
	private boolean cStandard;
	private JTable table_7;
	private JScrollPane scrollPane_9;
	private int cantClientesDep;
	private int cantClientesRet;
	private int cantClientesChe;
	private int cantClientesJud;
	private int cantClientesAgc;
	private int cantClientesCmc;
	
	//DeclaraciónTemporizadores
	private boolean tempDep;
	private boolean tempRet;
	private boolean tempChe;
	private boolean tempJud;
	private boolean tempAgc;
	private boolean tempCmc;
	private boolean isAdmi;
	
	//DatosRandomUsers
	private int num;
	private int randomUserPointer;
	private int cantRandomUsers;
	private boolean active;
	

	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param users 
	 */
	public DashBoard(ArrayList<Cliente> users) {
		
		this.horas=2;
		this.minutos=59;
		this.segundos=60;
		this.minutosDep =0;
		this.segundosDep =5 ;
		this.minutosRet =9;
		this.segundosRet =60 ;
		this.minutosChe =9;
		this.segundosChe =60 ;
		this.minutosJud =9;
		this.segundosJud =60 ;
		this.minutosCmc =9;
		this.segundosCmc =60 ;
		this.minutosAgc =9;
		this.segundosAgc =60 ;
		
		this.exist = false;
		this.cStandard = false;
		this.count = 0;
		this.stop = false;
		this.contador = false;
		this.cantClientesDep=0;
		this.cantClientesRet=0;
		this.cantClientesChe=0;
		this.cantClientesJud=0;
		this.cantClientesAgc=0;
		this.cantClientesCmc=0;
		
		
		//InicioTemporizadores
		this.tempDep=false;
		this.tempRet=false;
		this.tempChe=false;
		this.tempJud=false;
		this.tempAgc=false;
		this.tempCmc=false;
		this.isAdmi= false;
		this.registrados=users;
		
		
		//InicializandoDatosRandomUsers
		num=0;
		randomUserPointer=0;
		cantRandomUsers=0;
		active = false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		nTimer= new Timer(1000, new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				iniciarT();
				
			
			}
		});
		
		nTimerDep = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempDep();
				
				

				
			
			}
		});
		nTimerRet = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempRet();
				

				
			
			}
		});
		nTimerChe = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempChe();
				

				
			
			}
		});
		nTimerJud = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempJud();
				
				
			
			}
		});
		nTimerCmc = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempCmc();
				

				
			
			}
		});
		nTimerAgc = new Timer(1000, new ActionListener()	{
			public void actionPerformed(ActionEvent e) {
				
				iniciarTempAgc();
				

				
			
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 878, 637);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Depositar = new JPanel();
		Depositar.setVisible(false);
		
		
		Registro = new JPanel();
		Registro.setVisible(false);
		Registro.setBounds(0, 195, 862, 403);
		contentPane.add(Registro);
		Registro.setLayout(null);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Registro.setVisible(false);
			}
		});
		label.setBounds(721, 11, 48, 48);
		Registro.add(label);
		label.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		
		JLabel lblCantidadDeClientes = new JLabel("Cantidad de Clientes por Operacion");
		lblCantidadDeClientes.setBounds(242, 8, 352, 14);
		Registro.add(lblCantidadDeClientes);
		
		scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(10, 33, 584, 48);
		Registro.add(scrollPane_9);
		
		table_7 = new JTable();
		table_7.setModel(reg2);
			
		
		scrollPane_9.setViewportView(table_7);
		
		scrollPane_2 = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_2.setBounds(10, 92, 584, 300);
		Registro.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(0, 102, 51));
		table_2.setModel(reg);
			
		scrollPane_2.setViewportView(table_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		label_2.setBounds(0, -18, 872, 421);
		Registro.add(label_2);
		
		
		
		
		Depositar.setBounds(0, 195, 862, 403);
		contentPane.add(Depositar);
		Depositar.setLayout(null);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Fichero.save(banco);
				System.out.println("Se cargó");
				Depositar.setVisible(false);
			}
		});
		lblNewLabel_12.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_12.setBounds(761, 11, 48, 48);
		Depositar.add(lblNewLabel_12);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(37, 101, 480, 280);
		Depositar.add(scrollPane_3);
		
		
		
		
		table_1 = new JTable();
		table_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		table_1.setRowSelectionAllowed(false);
		scrollPane_3.setViewportView(table_1);
		table_1.setBackground(new Color(0, 102, 51));
		table_1.setForeground(new Color(255, 255, 255));
		table_1.setModel(dep);
		
		
		
		lblNewLabel_13 = new JLabel("  0m:0s");
		lblNewLabel_13.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_13.setBounds(10, 11, 204, 79);
		Depositar.add(lblNewLabel_13);
		
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(0, -20, 862, 423);
		Depositar.add(lblNewLabel_11);
		lblNewLabel_11.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		
		
		Retirar = new JPanel();
		Retirar.setVisible(false);
		Retirar.setBounds(0, 195, 862, 403);
		contentPane.add(Retirar);
		Retirar.setLayout(null);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Retirar.setVisible(false);
				
			}
		});
		lblNewLabel_16.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_16.setBounds(761, 11, 48, 48);
		Retirar.add(lblNewLabel_16);
		lblNewLabel_30 = new JLabel("  0m:0s");
		lblNewLabel_30.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_30.setBounds(10, 11, 204, 79);
		Retirar.add(lblNewLabel_30);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(20, 101, 526, 267);
		Retirar.add(scrollPane_4);
		
		table = new JTable();
		scrollPane_4.setViewportView(table);
		table.setBackground(new Color(0, 102, 51));
		table.setModel(ret);
		
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(0, -20, 862, 423);
		Retirar.add(lblNewLabel_14);
		lblNewLabel_14.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		Cheques = new JPanel();
		Cheques.setVisible(false);
		Cheques.setBounds(0, 195, 862, 403);
		contentPane.add(Cheques);
		Cheques.setLayout(null);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Cheques.setVisible(false);
			}
		});
		lblNewLabel_19.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_19.setBounds(761, 11, 48, 48);
		Cheques.add(lblNewLabel_19);
		lblNewLabel_31 = new JLabel("  0m:0s");
		lblNewLabel_31.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_31.setBounds(10, 11, 204, 79);
		Cheques.add(lblNewLabel_31);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(20, 101, 526, 267);
		Cheques.add(scrollPane_5);
		
		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);
		table_3.setBackground(new Color(0, 102, 51));
		table_3.setModel(che);
		
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(0, -20, 862, 423);
		Cheques.add(lblNewLabel_17);
		lblNewLabel_17.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		Juridico = new JPanel();
		Juridico.setVisible(false);
		Juridico.setBounds(0, 195, 862, 403);
		contentPane.add(Juridico);
		Juridico.setLayout(null);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Juridico.setVisible(false);
			}
		});
		lblNewLabel_22.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_22.setBounds(761, 11, 48, 48);
		Juridico.add(lblNewLabel_22);
		lblNewLabel_32 = new JLabel("  0m:0s");
		lblNewLabel_32.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_32.setBounds(10, 11, 204, 79);
		Juridico.add(lblNewLabel_32);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(20, 101, 526, 267);
		Juridico.add(scrollPane_6);
		
		table_4 = new JTable();
		scrollPane_6.setViewportView(table_4);
		table_4.setBackground(new Color(0, 102, 51));
		table_4.setModel(jud);
		
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setBounds(0, -20, 862, 423);
		Juridico.add(lblNewLabel_20);
		lblNewLabel_20.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		CambiarCuenta = new JPanel();
		CambiarCuenta.setVisible(false);
		CambiarCuenta.setBounds(0, 195, 862, 403);
		contentPane.add(CambiarCuenta);
		CambiarCuenta.setLayout(null);
		
		lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				CambiarCuenta.setVisible(false);
			}
		});
		lblNewLabel_25.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_25.setBounds(761, 11, 48, 48);
		CambiarCuenta.add(lblNewLabel_25);
		lblNewLabel_33 = new JLabel("  0m:0s");
		lblNewLabel_33.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_33.setBounds(10, 11, 204, 79);
		CambiarCuenta.add(lblNewLabel_33);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(20, 101, 526, 267);
		CambiarCuenta.add(scrollPane_7);
		
		table_5 = new JTable();
		scrollPane_7.setViewportView(table_5);
		table_5.setBackground(new Color(0, 102, 51));
		table_5.setModel(agc);
		
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setBounds(0, -20, 862, 423);
		CambiarCuenta.add(lblNewLabel_23);
		lblNewLabel_23.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		AgregarCuenta = new JPanel();
		AgregarCuenta.setVisible(false);
		AgregarCuenta.setBounds(0, 195, 862, 403);
		contentPane.add(AgregarCuenta);
		AgregarCuenta.setLayout(null);
		
		lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				AgregarCuenta.setVisible(false);
			}
		});
		lblNewLabel_28.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/backspace_icon_151584.png")));
		lblNewLabel_28.setBounds(761, 11, 48, 48);
		AgregarCuenta.add(lblNewLabel_28);
		lblNewLabel_34 = new JLabel("  0m:0s");
		lblNewLabel_34.setFont(new Font("Verdana", Font.BOLD, 29));
		lblNewLabel_34.setBounds(10, 11, 204, 79);
		AgregarCuenta.add(lblNewLabel_34);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(20, 101, 526, 267);
		AgregarCuenta.add(scrollPane_8);
		
		table_6 = new JTable();
		scrollPane_8.setViewportView(table_6);
		table_6.setBackground(new Color(0, 102, 51));
		table_6.setModel(cmc);
		
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setBounds(0, -20, 862, 423);
		AgregarCuenta.add(lblNewLabel_26);
		lblNewLabel_26.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/353020995_655717476573047_27349776413016049_n.jpg")));
		
		
		
		
		
		
		
		
		Panel panel = new Panel();
		panel.setForeground(new Color(0, 102, 51));
		panel.setBackground(new Color(0, 102, 51));
		panel.setBounds(0, 0, 862, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 356, 194);
		panel.add(lblNewLabel_2);
		this.imagen = new ImageIcon(DashBoard.class.getResource("/imag/descarga-_4_.jpg"));
		this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(),Image.SCALE_DEFAULT));
		lblNewLabel_2.setIcon(this.icono);
		this.repaint();
		
		
		
		
		
		
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_7.setForeground(new Color(0, 102, 51));
		panel_7.setBackground(new Color(0, 102, 51));
		panel_7.setBounds(444, 43, 194, 123);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		lblTimer = new JLabel("0h: 0m: 0s");
		lblTimer.setBounds(10, 5, 184, 118);
		panel_7.add(lblTimer);
		lblTimer.setForeground(new Color(255, 255, 255));
		lblTimer.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
		
		lblNewLabel_29 = new JLabel("Tiempo Operativo");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		lblNewLabel_29.setBounds(10, 5, 158, 14);
		panel_7.add(lblNewLabel_29);
		
		panel_9 = new Panel();
		
		
		panel_9.addMouseListener(new MouseAdapter() {
			Taquillas taq = new Taquillas();
			
			
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_9);
				
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_9);
			}
			
			public void setColor(Panel panel_9){
				panel_9.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel_9){
				panel_9.setBackground(new java.awt.Color(0,102,51));
			}
			public void mouseClicked(MouseEvent a) {
				
				if (!taq.isVisible()) {
					taq.setUndecorated(true);
					taq.setVisible(true);
					
				}else {
					
					taq.dispose();
				}
				
				
				
		
					
				
				
			}
		});
		panel_9.setBackground(new Color(0, 102, 51));
		panel_9.setBounds(683, 31, 129, 135);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/calendar_year_month_business_schedule_icon_192214 (1).png")));
		lblNewLabel_9.setBounds(0, 0, 149, 135);
		panel_9.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Taquillas disponibles");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(693, 11, 140, 14);
		panel.add(lblNewLabel_10);
		
		panel_2 = new Panel();
		panel_2.addMouseListener(new MouseAdapter() {
			
			
			
			
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_2);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_2);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			public void mouseClicked(MouseEvent arg0) {
				Depositar.setVisible(true);
				AddClientes(dep,standardUsersDep);
				
				
				if (!tempDep) {
					iniciarTempDep();
					tempDep=true;
				}
				
				
                
				
				
				
				
			
				
				
			}
		});
		panel_2.setBackground(new Color(0, 102, 51));
		panel_2.setBounds(174, 253, 126, 145);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Depositar");
		lblNewLabel_1.setBounds(30, 11, 67, 14);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(20, 25, 106, 116);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/deposit_money_bank_salary_saving_icon_192226.png")));
		
		panel_3 = new Panel();
		panel_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_3);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_3);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			public void mouseClicked(MouseEvent arg0) {
				
				Retirar.setVisible(true);
				
				iniciarTempRet();
				
				
				
			}
		});
		panel_3.setBackground(new Color(0, 102, 51));
		panel_3.setBounds(343, 253, 126, 145);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRetirar = new JLabel("Retirar");
		lblRetirar.setBounds(43, 11, 40, 14);
		lblRetirar.setForeground(new Color(255, 255, 255));
		lblRetirar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblRetirar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/withdrawl_finance_economy_money_bank_icon_192192.png")));
		lblNewLabel.setBounds(10, 36, 106, 98);
		panel_3.add(lblNewLabel);
		
		panel_1 = new Panel();
		panel_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_1);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_1);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				Cheques.setVisible(true);
				iniciarTempChe();
			}
		});
		panel_1.setBackground(new Color(0, 102, 51));
		panel_1.setBounds(511, 253, 126, 145);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCheques = new JLabel("Cheques");
		lblCheques.setBounds(39, 11, 48, 14);
		lblCheques.setForeground(new Color(255, 255, 255));
		lblCheques.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblCheques);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/credit_card_payment_banking_business_icon_192217.png")));
		lblNewLabel_4.setBounds(10, 36, 106, 98);
		panel_1.add(lblNewLabel_4);
		
		panel_4 = new Panel();
		panel_4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_4);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_4);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				Juridico.setVisible(true);
				iniciarTempJud();
			}
		});
		panel_4.setBackground(new Color(0, 102, 51));
		panel_4.setBounds(174, 431, 126, 145);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblJuridico = new JLabel("Juridico");
		lblJuridico.setBounds(41, 11, 44, 14);
		lblJuridico.setForeground(new Color(255, 255, 255));
		lblJuridico.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(lblJuridico);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/success_business_money_investor_head_dollar_user_man_businessman_avatar_icon_250733.png")));
		lblNewLabel_5.setBounds(10, 36, 106, 98);
		panel_4.add(lblNewLabel_5);
		
		panel_5 = new Panel();
		panel_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_5);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_5);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				CambiarCuenta.setVisible(true);
				iniciarTempCmc();
			}
		});
		panel_5.setBackground(new Color(0, 102, 51));
		panel_5.setBounds(343, 431, 126, 145);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblCambiarCuenta = new JLabel("Cambiar Cuenta");
		lblCambiarCuenta.setBounds(10, 11, 90, 14);
		lblCambiarCuenta.setForeground(new Color(255, 255, 255));
		lblCambiarCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_5.add(lblCambiarCuenta);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/meeting_finance_coin_man_money_dollar_conference_businessman_business_icon_250730.png")));
		lblNewLabel_6.setBounds(10, 36, 106, 98);
		panel_5.add(lblNewLabel_6);
		
		panel_6 = new Panel();
		panel_6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_6);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_6);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				AgregarCuenta.setVisible(true);
				iniciarTempAgc();
			}
		});
		panel_6.setBackground(new Color(0, 102, 51));
		panel_6.setBounds(511, 431, 126, 145);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblAgregarCuenta = new JLabel("Agregar Cuenta");
		lblAgregarCuenta.setBounds(10, 11, 89, 14);
		lblAgregarCuenta.setForeground(new Color(255, 255, 255));
		lblAgregarCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6.add(lblAgregarCuenta);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/gold_saving_finance_banking_coin_icon_192193.png")));
		lblNewLabel_7.setBounds(10, 36, 106, 98);
		panel_6.add(lblNewLabel_7);
		
		panel_8 = new Panel();
		panel_8.addMouseListener(new MouseAdapter() {
			


			public void mouseEntered(MouseEvent arg0) {
				setColor(panel_8);
				
			}
			public void mouseExited(MouseEvent arg0) {
				resetColor(panel_8);
			}
			
			public void setColor(Panel panel){
				panel.setBackground(new java.awt.Color(115,163,239));
			}
			
			public void resetColor(Panel panel){
				panel.setBackground(new java.awt.Color(0,102,51));
			}
			
			public void mouseClicked(MouseEvent arg0) {
				Registro.setVisible(true);
				banco.getCola().addAll(registrados);
				banco.getCola().addAll(standardUsersDep);
				banco.getCola().addAll(standardUsersRet);
				banco.getCola().addAll(standardUsersChe);
				banco.getCola().addAll(standardUsersJud);
				banco.getCola().addAll(standardUsersAgc);
				banco.getCola().addAll(standardUsersCmc);
				cantClientesDep=banco.getCola().size();
				reg2.setValueAt(cantClientesDep, 0, 0);
				reg2.setValueAt(cantClientesRet, 0, 1);
				reg2.setValueAt(cantClientesChe, 0, 2);
				reg2.setValueAt(cantClientesJud, 0, 3);
				reg2.setValueAt(cantClientesAgc, 0, 4);
				reg2.setValueAt(cantClientesCmc, 0, 5);
				
				//llenarDatosDeTodosLosClientes
			
				
				addRows(reg, banco.getCola().size());
				for (int i = 0; i < banco.getCola().size(); i++) {
					reg.setValueAt(banco.getCola().peek().getNombre(), i, 0);
					if (registrados.contains(banco.getCola().peek())) {
						reg.setValueAt("Registrado", i, 1);
					}else if (standardUsersDep.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}else if (standardUsersRet.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}else if (standardUsersChe.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}else if (standardUsersJud.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}else if (standardUsersAgc.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}else if (standardUsersCmc.contains(banco.getCola().peek())) {
						reg.setValueAt("Estandar", i, 1);
					}
					
					banco.getCola().poll();


				}
				
				
				
				
				
			}
		});
		panel_8.setBackground(new Color(0, 102, 51));
		panel_8.setBounds(670, 343, 126, 145);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegistro.setBounds(37, 11, 48, 14);
		panel_8.add(lblRegistro);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(DashBoard.class.getResource("/imag/business_safebox_money_bank_banking_icon_192220.png")));
		lblNewLabel_8.setBounds(10, 36, 106, 98);
		panel_8.add(lblNewLabel_8);
	}

	
	
	public Panel getPanel_9() {
		return panel_9;
	}

	public void setPanel_9(Panel panel_9) {
		this.panel_9 = panel_9;
		
		
		//Controlar Temporizador
	}

	
public void actTimerDep(){
	
		
		
		segundosDep--;
		
		if (segundosDep == 0) {
			segundosDep=60;
			minutosDep--;
		}
	}
public void actTimerRet(){
	
	
	segundosRet--;
	
	if (segundosRet == 0) {
		segundosRet=60;
		minutosRet--;
	}
}
public void actTimerChe(){
	
	
	segundosChe--;
	
	if (segundosChe == 0) {
		segundosChe=60;
		minutosChe--;
	}
}
public void actTimerJud(){
	
	
	segundosJud--;
	
	if (segundosJud == 0) {
		segundosJud=60;
		minutosJud--;
	}
}
public void actTimerCmc(){
	
	
	segundosCmc--;
	
	if (segundosCmc == 0) {
		segundosCmc=60;
		minutosCmc--;
	}
}
public void actTimerAgc(){
	
	
	segundosDep--;
	
	if (segundosAgc == 0) {
		segundosAgc=60;
		minutosAgc--;
	}
}

	
	
	
	
	public void actTimer() {
		segundos--;
		
		if (segundos == 0) {
			segundos=60;
			minutos--;
		}
		
		if (minutos == 00) {
			minutos=60;
			horas--;
		}
	
			
	}
	
	
	
	
//Iniciar Temporizadores
	
	public void iniciarT() {
		nTimer.start();
		actTimer();
		actLabel();
		randomTime = random.nextInt(6);
		//ClientesEstandarEnTiempoRandom(Solo temporizador General)
		if (isAdmi && randomTime==0) {	
				Cliente s1 = new Cliente(null, "visitor"+num);
				standardUsersDep.add(s1);
				num++;		
				cantClientesDep = banco.getCola().size();
			
		}
		if (isAdmi && randomTime==1) {	
			Cliente s1 = new Cliente(null, "visitor"+num);
			standardUsersRet.add(s1);
			num++;		
			cantClientesRet = banco.getCola().size();
		
	}
		if (isAdmi && randomTime==2) {	
			Cliente s1 = new Cliente(null, "visitor"+num);
			standardUsersChe.add(s1);
			num++;		
			cantClientesChe = banco.getCola().size();
		
	}if (isAdmi && randomTime==3) {	
		Cliente s1 = new Cliente(null, "visitor"+num);
		standardUsersJud.add(s1);
		num++;		
		cantClientesJud = banco.getCola().size();
	
}if (isAdmi && randomTime==4) {	
	Cliente s1 = new Cliente(null, "visitor"+num);
	standardUsersAgc.add(s1);
	num++;		
	cantClientesAgc = banco.getCola().size();

}if (isAdmi && randomTime==5) {	
	Cliente s1 = new Cliente(null, "visitor"+num);
	standardUsersCmc.add(s1);
	num++;		
	cantClientesCmc = banco.getCola().size();

}
		
		if (horas==0) {
			nTimer.stop();
			DashBoard.this.dispose();
		}
		
				
	}
	public void iniciarTempDep(){
		DefaultTableModel mod = (DefaultTableModel) table_1.getModel();
		int i=0;
		if (!stop) {
			banco.getCola().addAll(registrados);
			banco.getCola().addAll(standardUsersDep);
			stop=true;
		}
		
		
	

		
		int size = banco.getCola().size();
		
		nTimerDep.start();
		actTimerDep();
		actLabelDep();
		if (!contador) {
			if (size%2==0) {
				count=size/2;
			}else
				count=size/2 + 1;
			contador=true;
		}
		
		
		if (minutosDep == 0 && segundosDep==1) {
			
			
			
			for ( ; i <size; i++) {
					
			
				mod.setValueAt(mod.getValueAt(i+1, 0), i, 0);
				mod.setValueAt(mod.getValueAt(i+1, 1), i, 1);
				


			}
			count--;
			if (count==0) {
				segundosDep=60;
				minutosDep=9;
				actLabelDep();
				
				nTimerDep.stop();
				
			}else{segundosDep=4;
			minutosDep=0;
			
			nTimerDep.start();}
			
			
			
			
		}
		
		
	}
public void iniciarTempRet(){
		
		nTimerRet.start();
		actTimerRet();
		actLabelRet();
		if (minutosRet == 0 && segundosRet==1) {
			nTimerRet.stop();
			segundosRet=60;
			minutosRet=9;
			nTimerRet.start();
		}
	}
public void iniciarTempChe(){
	
	nTimerChe.start();
	actTimerChe();
	actLabelChe();
	if (minutosChe == 0 && segundosChe==1) {
		nTimerChe.stop();
		segundosChe=60;
		minutosChe=9;
		nTimerChe.start();
	}
}
public void iniciarTempJud(){
	
	nTimerJud.start();
	actTimerJud();
	actLabelJud();
	if (minutosJud== 0 && segundosJud==1) {
		nTimerJud.stop();
		segundosJud=60;
		minutosJud=9;
		nTimerJud.start();
	}
}
public void iniciarTempAgc(){
	
	nTimerAgc.start();
	actTimerCmc();
	actLabelAgc();
	if (minutosAgc == 0 && segundosAgc==1) {
		nTimerAgc.stop();
		segundosAgc=60;
		minutosAgc=9;
		nTimerAgc.start();
	}
}
public void iniciarTempCmc(){
	
	nTimerCmc.start();
	actTimerAgc();
	actLabelCmc();
	if (minutosCmc == 0 && segundosCmc==1) {
		nTimerCmc.stop();
		segundosCmc=60;
		minutosCmc=9;
		nTimerCmc.start();
	}
}
	

	
	
	
	
	
	
	//Actualizar Temporizadores
	
	public void actLabel() {
		
		 temporizador = horas +"h:"+minutos+"m:"+segundos+"s";
		
		lblTimer.setText(temporizador);
		
			
	}
	
	public void actLabelDep() {
		 temporizadorOp =minutosDep+"m:"+segundosDep+"s";
		
			lblNewLabel_13.setText(temporizadorOp);
		
			
	}
	public void actLabelRet() {
		 temporizadorOp =minutosRet+"m:"+segundosRet+"s";
		
			lblNewLabel_30.setText(temporizadorOp);
		
			
	}
	public void actLabelChe() {
		 temporizadorOp =minutosChe+"m:"+segundosChe+"s";
		
			lblNewLabel_31.setText(temporizadorOp);
		
			
	}
	public void actLabelJud() {
		 temporizadorOp =minutosJud+"m:"+segundosJud+"s";
		
			lblNewLabel_32.setText(temporizadorOp);
		
			
	}
	public void actLabelAgc() {
		 temporizadorOp =minutosCmc+"m:"+segundosCmc+"s";
		
			lblNewLabel_34.setText(temporizadorOp);
		
			
	}
	public void actLabelCmc() {
		 temporizadorOp =minutosAgc+"m:"+segundosAgc+"s";
		
			lblNewLabel_33.setText(temporizadorOp);
		
			
	}
	
	
	 
	

	public void onlyStandard(){
		panel_5.setEnabled(false);
		lblNewLabel_6.setEnabled(false);
		panel_6.setEnabled(false);
		lblNewLabel_7.setEnabled(false);
		
	}
	
	public void onlyAdmi(){
		panel_8.setVisible(false);
		lblNewLabel_8.setVisible(false);
		
	}
	
	public void userName(Cliente c1){
		this.userName = c1.getNombre();
	}
	
	public int getCantNameRows(int cantRows,int column,String name, DefaultTableModel model){
		int cantNames =0;
		for (int i = 0; i < cantRows; i++) {
			name = (String) model.getValueAt(i, column);
			if (name!=null) {
				cantNames++;
			}
			
		}
		return cantNames;
	}
	public void addRows(DefaultTableModel model, int cant){
		for (int i = 0; i < cant; i++) {
			model.addRow(new Object[]{null,null});
		}
		
	}



	public void getCliStandard(Cliente c1) {
		this.standard = c1;
		
	}



	public void isStandard(boolean decision) {
		this.cStandard = decision;
		
	}



	public void getAdmiKey(boolean key) {
		this.isAdmi = key;
		
	}
	//AnnadirClientesALasTaquillas
	public void AddClientes(DefaultTableModel model,ArrayList<Cliente>standarUsers){
		if (!exist) {
			
			exist=true;
			banco.getCola().addAll(registrados);
			if (isAdmi) {
				banco.getCola().addAll(standarUsers);
			}
			if (cStandard) {
				banco.getCola().offer(standard);
			}
			
			
			int cantUsers = banco.getCola().size();
			
			
			int j=0;
			int k=0;
			
			addRows(model, cantUsers);
			int cantRows = model.getRowCount();
			
			for (int i = 0; i < cantUsers; i++) {
				
					//Auto Ajuste
					int cantNamesCol1=getCantNameRows(cantRows, 0, userName, model);
					int cantNamesCol2=getCantNameRows(cantRows, 1, userName, model);
					if (cantNamesCol1 <= cantNamesCol2) {
					
                     model.setValueAt(banco.getCola().peek().getNombre(), j,0); // Agregar fila con valores iniciales
                     banco.getCola().poll();
                     j++;

					}else{   
						
						model.setValueAt(banco.getCola().peek().getNombre(), k,1); // Agregar fila con valores iniciales
					banco.getCola().poll();
						k++;
					}
	                 
					
						

                 
			}
			
			
			
		}
	}



	public Banco getBanco() {
		return banco;
	}



	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	

}
