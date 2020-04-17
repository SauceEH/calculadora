package jisaKalkukidz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import jisaKalkukidz.TrianguloIntermedio;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TrianguloPerimetro extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3033397771841922923L;
	private JPanel contentPane;
	private JLabel lblMensaje;
	private JLabel lblPantalla;
	private JLabel lblPerimetro;
	private JLabel lblResultado;
	private JButton btnVolver;
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
	private JButton btnSiguiente;
	private JButton btnReiniciar;
	
	String lado1;
	String lado2;
	String lado3;
	String cadenaperimetro;
	
	double numero1;
	double numero2;
	double numero3;
	double perimetro;

	int contador=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrianguloPerimetro frame = new TrianguloPerimetro();
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
	public TrianguloPerimetro() {
		setTitle("Triangulo Perimetro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMensaje = new JLabel("Introduce un lado:");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Calibri", Font.BOLD, 25));
		lblMensaje.setBounds(10, 11, 417, 33);
		contentPane.add(lblMensaje);
		contentPane.setBackground(new Color(244, 164, 96));
		
		lblPantalla = new JLabel();
		lblPantalla.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPantalla.setForeground(Color.WHITE);
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPantalla.setText("0");
		lblPantalla.setBounds(20, 55, 407, 49);
		contentPane.add(lblPantalla);
		
		lblPerimetro = new JLabel("Perimetro");
		lblPerimetro.setForeground(Color.WHITE);
		lblPerimetro.setFont(new Font("Calibri", Font.BOLD, 21));
		lblPerimetro.setBounds(80, 461, 100, 24);
		contentPane.add(lblPerimetro);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(190, 454, 151, 31);
		contentPane.add(lblResultado);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setBounds(91, 513, 250, 33);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(this);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn0.setBackground(new Color(255, 228, 181));
		btn0.setBounds(64, 347, 144, 49);
		contentPane.add(btn0);
		btn0.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn1.setBackground(new Color(255, 228, 181));
		btn1.setBounds(64, 274, 67, 62);
		contentPane.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn2.setBackground(new Color(255, 228, 181));
		btn2.setBounds(141, 274, 67, 62);
		contentPane.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn3.setBackground(new Color(255, 228, 181));
		btn3.setBounds(218, 274, 67, 62);
		contentPane.add(btn3);
		btn3.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn4.setBackground(new Color(255, 228, 181));
		btn4.setBounds(64, 201, 67, 62);
		contentPane.add(btn4);
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn5.setBackground(new Color(255, 228, 181));
		btn5.setBounds(141, 201, 67, 62);
		contentPane.add(btn5);
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn6.setBackground(new Color(255, 228, 181));
		btn6.setBounds(218, 201, 67, 62);
		contentPane.add(btn6);
		btn6.addActionListener(this);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn7.setBackground(new Color(255, 228, 181));
		btn7.setBounds(64, 128, 67, 62);
		contentPane.add(btn7);
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn8.setBackground(new Color(255, 228, 181));
		btn8.setBounds(141, 128, 67, 62);
		contentPane.add(btn8);
		btn8.addActionListener(this);
		
		btnBorrar = new JButton("C");
		btnBorrar.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnBorrar.setBackground(new Color(255, 99, 71));
		btnBorrar.setBounds(295, 128, 67, 62);
		contentPane.add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				lblPantalla.setText("0");
				lblResultado.setText("");
				
				btnPunto.setEnabled(true);
						
			}
		});
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn9.setBackground(new Color(255, 228, 181));
		btn9.setBounds(218, 128, 67, 62);
		contentPane.add(btn9);
		btn9.addActionListener(this);
		
		btnIgual = new JButton("=");
		btnIgual.setEnabled(false);
		btnIgual.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnIgual.setBackground(new Color(255, 204, 102));
		btnIgual.setBounds(295, 274, 67, 122);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				
				lado3=lblPantalla.getText();
				numero3=Double.parseDouble(lado3);	
				perimetro = (numero1+numero2+numero3);
				cadenaperimetro = String.format("%.2f",perimetro); 
				lblResultado.setText(cadenaperimetro); 
				
				lblPantalla.setText("0");
				btnIgual.setEnabled(false);
				
				
			}
			
			});
		
		btnPunto = new JButton(".");
		btnPunto.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPunto.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnPunto.setBackground(new Color(255, 204, 102));
		btnPunto.setBounds(218, 347, 67, 49);
		contentPane.add(btnPunto);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ponemos el punto en la pantalla
				lblPantalla.setText(lblPantalla.getText()+".");
				// deshabilitamos el boton
				btnPunto.setEnabled(false);
				
			}});
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSiguiente.setBackground(new Color(255, 204, 102));
		btnSiguiente.setBounds(64, 407, 298, 36);
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				//Cuando le de click al boton "siguiente" tendra en cuenta todo lo guardaddo en el contador
				
				if (contador ==1)
				{
				lado1=lblPantalla.getText();
				numero1=Double.parseDouble(lado1);
				lblPantalla.setText("0");
				lblMensaje.setText("Introduce el segundo lado:");
				}
				
				if (contador==2)
				{
				lado2=lblPantalla.getText();
				numero2=Double.parseDouble(lado2);
				lblPantalla.setText("0");
				lblMensaje.setText("Introduce el tercer lado:");
				btnSiguiente.setEnabled(false);
				btnIgual.setEnabled(true);
				}
				
				btnPunto.setEnabled(true);
				contador= contador +1;
			}
		});
		
		btnReiniciar = new JButton("CE");
		btnReiniciar.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnReiniciar.setBackground(new Color(255, 99, 71));
		btnReiniciar.setBounds(295, 201, 67, 62);
		contentPane.add(btnReiniciar);
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblPantalla.setText("0");
				lblResultado.setText("");
				lblMensaje.setText("Introduce un lado:");
				
				contador=1;
				btnPunto.setEnabled(true);
				btnSiguiente.setEnabled(true);
				btnIgual.setEnabled(false);
			}
			
		});
		
	}
		

	 

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
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
			TrianguloIntermedio TriInt = new TrianguloIntermedio();
			// la mostramos
			TriInt.setVisible(true);
			TriInt.setResizable(false);
			// ocultamos esta
			this.setVisible(false); 
		}
	   
	   
	}
		
	   
}

