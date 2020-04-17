package kalkukidz;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Cuadrado extends JFrame implements ActionListener {

	/**
	 * 
	 */
	//Necesidades previas
	private static final long serialVersionUID = -8586585426948200994L;
	private JPanel contentPane;
	private JLabel lblResultado;
	private JLabel lblLado;
	private JLabel lblarea;
	private JLabel lblPerimetro;
	private JButton btnVolver;
	
	

	private JLabel lblArearesultado;
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
	private JLabel  lblPerimetroresultado;

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrado frame = new Cuadrado();
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
	public Cuadrado() {
		setTitle("Cuadrado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setAlignmentY(0.01f);
		contentPane.setAlignmentX(0.01f);
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	//Definimos el label que pide el lado.	
		lblLado = new JLabel("Introduce el lado del cuadrado:");
		lblLado.setForeground(Color.WHITE);
		lblLado.setBounds(10, 11, 415, 33);
		lblLado.setFont(new Font("Calibri", Font.BOLD, 25));
		contentPane.add(lblLado);
		
		
		

	
			
		
	//Definimos el campo de texto donde introducimos los números.			
		lblResultado = new JLabel();
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setBounds(10, 55, 415, 49);
		contentPane.add(lblResultado);
		/**
		 * Ponemos como falsa la opcion de editar 
		 * el campo de texto para que no de pueda 
		 * editar el texto que halla dentro.
		 */

	//Definimos el label del Área.
		lblarea = new JLabel("\u00C1rea:");
		lblarea.setForeground(Color.WHITE);
		lblarea.setBounds(122, 427, 52, 33);
		lblarea.setFont(new Font("Calibri", Font.BOLD, 21));
		contentPane.add(lblarea);
		
	//Definimos el label del Perímetro.			
		lblPerimetro = new JLabel("Per\u00EDmetro:");
		lblPerimetro.setForeground(Color.WHITE);
		lblPerimetro.setBackground(Color.WHITE);
		lblPerimetro.setBounds(78, 469, 96, 33);
		lblPerimetro.setFont(new Font("Calibri", Font.BOLD, 21));
		contentPane.add(lblPerimetro);
		
	//Definimos el boton Volver
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBounds(97, 513, 250, 33);
		btnVolver.setBackground(new Color(0, 128, 128));
		contentPane.add(btnVolver);
		
		lblPerimetroresultado = new JLabel("");
		lblPerimetroresultado.setBounds(178, 469, 169, 33);
		contentPane.add(lblPerimetroresultado);
		
		lblArearesultado = new JLabel("");
		lblArearesultado.setBounds(178, 427, 169, 33);
		contentPane.add(lblArearesultado);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn0.setBackground(new Color(255, 228, 181));
		btn0.setBounds(67, 350, 144, 49);
		contentPane.add(btn0);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn1.setBackground(new Color(255, 228, 181));
		btn1.setBounds(67, 277, 67, 62);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn2.setBackground(new Color(255, 228, 181));
		btn2.setBounds(144, 277, 67, 62);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn3.setBackground(new Color(255, 228, 181));
		btn3.setBounds(221, 277, 67, 62);
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn4.setBackground(new Color(255, 228, 181));
		btn4.setBounds(67, 204, 67, 62);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn5.setBackground(new Color(255, 228, 181));
		btn5.setBounds(144, 204, 67, 62);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn6.setBackground(new Color(255, 228, 181));
		btn6.setBounds(221, 204, 67, 62);
		contentPane.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn7.setBackground(new Color(255, 228, 181));
		btn7.setBounds(67, 131, 67, 62);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn8.setBackground(new Color(255, 228, 181));
		btn8.setBounds(144, 131, 67, 62);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 32));
		btn9.setBackground(new Color(255, 228, 181));
		btn9.setBounds(221, 131, 67, 62);
		contentPane.add(btn9);
		
		btnBorrar = new JButton("C");
		btnBorrar.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnBorrar.setBackground(new Color(255, 99, 71));
		btnBorrar.setBounds(298, 131, 67, 62);
		contentPane.add(btnBorrar);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnIgual.setBackground(new Color(255, 204, 102));
		btnIgual.setBounds(298, 204, 67, 195);
		contentPane.add(btnIgual);
		
		btnPunto = new JButton(".");
		btnPunto.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPunto.setFont(new Font("Dialog", Font.PLAIN, 32));
		btnPunto.setBackground(new Color(255, 204, 102));
		btnPunto.setBounds(221, 350, 67, 49);
		contentPane.add(btnPunto);
		
		//Definimos el boton Volver
		btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		String texto = ((JButton)o).getText();
		lblResultado.setText(lblResultado.getText()+texto);
		
		if (o == btnVolver)
		{
			// creamos un nuevo Jframe de la clase VentanaPrincipal
			VentanaPrincipal vp = new VentanaPrincipal();
			// la mostramos
			vp.setVisible(true);
			// ocultamos la Calculadora
			this.setVisible(false); 
		}
		   
		   
		}			
	}

