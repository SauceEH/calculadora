package jisaKalkukidz;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import jisaKalkukidz.VentanaPrincipal;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Circulo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	//Necesidades previas
	private static final long serialVersionUID = -8586585426948200994L;
	private JPanel contentPane;
	private JLabel lblPantalla;
	private JLabel lblRadio;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnBorrar;
	private JButton btnIgual;
	private JButton btnPunto;
	private JLabel lblarea;
	private JLabel lblPerimetro;
	private JLabel lblAreaResultado;
	private JLabel lblPerimetroResultado;
	private JButton btnVolver;
	
	double pi= 3.141592; //hacemos esto para que la aplicacion obtenga el numero pi desde el principio
	double area;
	double perimetro;
	double radio;
	
	String numero = ""; //Al poner este valor el programa no asignara un valor nulo
	String cadenarea = ""; //Para poder hacer la formula del area del circulo
	String cadenaperimetro = ""; //Para poder hacer la formula del perimetro del circulo
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circulo frame = new Circulo();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Circulo() {
		setTitle("Circulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setAlignmentY(0.01f);
		contentPane.setAlignmentX(0.01f);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRadio = new JLabel("Introduce el radio del c\u00EDrculo:");
		lblRadio.setForeground(Color.WHITE);
		lblRadio.setBounds(10, 11, 321, 33);
		lblRadio.setFont(new Font("Calibri", Font.BOLD, 25));
		contentPane.add(lblRadio);
		
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn0.addActionListener(this);
		btn0.setBounds(73, 334, 144, 49);
		contentPane.add(btn0);
		btn0.setBackground(new Color(255, 228, 181));
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn1.addActionListener(this);
		btn1.setBounds(73, 261, 67, 62);
		contentPane.add(btn1);
		btn1.setBackground(new Color(255, 228, 181));
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn2.addActionListener(this);
		btn2.setBounds(150, 261, 67, 62);
		contentPane.add(btn2);
		btn2.setBackground(new Color(255, 228, 181));
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn3.addActionListener(this);
		btn3.setBounds(227, 261, 67, 62);
		contentPane.add(btn3);
		btn3.setBackground(new Color(255, 228, 181));
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn4.addActionListener(this);
		btn4.setBounds(73, 188, 67, 62);
		contentPane.add(btn4);
		btn4.setBackground(new Color(255, 228, 181));
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn5.addActionListener(this);
		btn5.setBounds(150, 188, 67, 62);
		contentPane.add(btn5);
		btn5.setBackground(new Color(255, 228, 181));
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn6.addActionListener(this);
		btn6.setBounds(227, 188, 67, 62);
		contentPane.add(btn6);
		btn6.setBackground(new Color(255, 228, 181));
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn7.addActionListener(this);
		btn7.setBounds(73, 115, 67, 62);
		contentPane.add(btn7);
		btn7.setBackground(new Color(255, 228, 181));
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn8.addActionListener(this);
		btn8.setBounds(150, 115, 67, 62);
		contentPane.add(btn8);
		btn8.setBackground(new Color(255, 228, 181));
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn9.addActionListener(this);
		btn9.setBounds(227, 115, 67, 62);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btn9);
		btn9.setBackground(new Color(255, 228, 181));
		
		btnBorrar = new JButton("C");
		btnBorrar.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnBorrar.setBounds(304, 115, 67, 62);
		btnBorrar.setBackground(new Color(255, 99, 71));
		contentPane.add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				lblPantalla.setText("0");
				lblAreaResultado.setText("");
				lblPerimetroResultado.setText("");
				numero="";
				btnPunto.setEnabled(true);
			
			}
		});
		
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnIgual.setBackground(new Color(255, 204, 102));
		btnIgual.setBounds(304, 188, 67, 195);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				// recogemos el numero de la pantalla
				numero = lblPantalla.getText();
				// lo convertimos a double
				radio = Double.parseDouble(numero);
				
				area = pi*radio*radio;
				perimetro = pi*radio*2;
				
				// convertimos los resultados a Strings para poder mostrarlos dandoles formato de 2 decimales
				cadenarea = String.format("%.2f", area);
				cadenaperimetro = String.format("%.2f", perimetro);
				
				
				// los mostramos en pantalla
				lblAreaResultado.setText(cadenarea);
				lblPerimetroResultado.setText(cadenaperimetro);
				
				
				// ponemos la pantalla a 0 y habilitamos el boton punto
				lblPantalla.setText("0");
				btnPunto.setEnabled(true);
				
			}
		});
		
		
		
		btnPunto = new JButton(".");
		btnPunto.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPunto.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnPunto.setBackground(new Color(255, 204, 102));
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ponemos el punto en la pantalla
				lblPantalla.setText(lblPantalla.getText()+".");
				// deshabilitamos el boton
				btnPunto.setEnabled(false);
			}
			
		});
		btnPunto.setBounds(227, 334, 67, 49);
		contentPane.add(btnPunto);
			
				
		lblPantalla = new JLabel();
		lblPantalla.setText("0");
		lblPantalla.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPantalla.setForeground(Color.WHITE);
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPantalla.setBounds(10, 55, 415, 49);
		contentPane.add(lblPantalla);
		
		lblarea = new JLabel("Area");
		lblarea.setHorizontalAlignment(SwingConstants.CENTER);
		lblarea.setForeground(Color.WHITE);
		lblarea.setBounds(78, 427, 96, 33);
		lblarea.setFont(new Font("Calibri", Font.BOLD, 21));
		contentPane.add(lblarea);
		
		lblPerimetro = new JLabel("Perimetro");
		lblPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerimetro.setForeground(Color.WHITE);
		lblPerimetro.setBackground(Color.WHITE);
		lblPerimetro.setBounds(78, 469, 96, 33);
		lblPerimetro.setFont(new Font("Calibri", Font.BOLD, 21));
		contentPane.add(lblPerimetro);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBounds(97, 513, 250, 33);
		btnVolver.setBackground(new Color(0, 128, 128));
		contentPane.add(btnVolver);
		
		lblAreaResultado = new JLabel("");
		lblAreaResultado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAreaResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAreaResultado.setBounds(184, 427, 163, 33);
		contentPane.add(lblAreaResultado);
		
		lblPerimetroResultado = new JLabel("");
		lblPerimetroResultado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPerimetroResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPerimetroResultado.setBounds(184, 469, 163, 33);
		contentPane.add(lblPerimetroResultado);
		btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		Object o = ae.getSource();
		String textoBoton = ((JButton)o).getText();
		
		// guardamos lo que tenemos en pantalla
		String loQueHayEnPantalla = lblPantalla.getText();
		
		// lo comparamos con 0
		if (loQueHayEnPantalla.equals("0"))
		{
			// si se cumple, borramos el 0
			lblPantalla.setText("");
		}
		// ponemos en pantalla el numero pulsado
		lblPantalla.setText(lblPantalla.getText()+textoBoton);
		
		if (o == btnVolver)
		{
			// creamos un nuevo Jframe de la clase VentanaPrincipal
			VentanaPrincipal vp = new VentanaPrincipal();
			// la mostramos
			vp.setVisible(true);
			vp.setResizable(false);
			// ocultamos esta
			this.setVisible(false); 
		}
		
		
	}
}
