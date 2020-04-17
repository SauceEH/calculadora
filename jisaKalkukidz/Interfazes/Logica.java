package kalkukidz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;


public class Logica extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1891783098440787516L;
	//Necesidades previas
	private JPanel contentPane;
	private JLabel txtOperador;
	private JButton btnAnd;
	private JButton btnOr;
	private JButton btn1;
	private JButton btn0;
	private JButton btnIgual;
	private JButton btnBorrar;
	
	 
 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logica frame = new Logica();
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
	public Logica() {
		setTitle("Calculadora Logica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(244, 164, 96));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAnd = new JButton("AND");
		btnAnd.addActionListener(this);
		btnAnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAnd.setForeground(Color.BLACK);
		btnAnd.setBounds(52, 246, 160, 58);
		btnAnd.setBackground(new Color(255, 204, 102));
		contentPane.add(btnAnd);
		
		btnOr = new JButton("OR");
		btnOr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOr.setForeground(Color.BLACK);
		btnOr.addActionListener(this);
		btnOr.setBounds(222, 246, 160, 58);
		btnOr.setBackground(new Color(255, 204, 102));
		contentPane.add(btnOr);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(130, 333, 82, 45);
		btn1.setBackground(new Color(255, 228, 181));
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.addActionListener(this);
		btn0.setBounds(222, 333, 82, 45);
		btn0.setBackground(new Color(255, 228, 181));
		contentPane.add(btn0);
		
		txtOperador = new JLabel();
		txtOperador.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtOperador.setForeground(Color.WHITE);
		txtOperador.setBounds(10, 48, 415, 110);
		contentPane.add(txtOperador);
		txtOperador.setText(null);

		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(this);
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnIgual.setBounds(222, 403, 82, 45);
		btnIgual.setBackground(new Color(255, 204, 102));
		contentPane.add(btnIgual);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(this);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBorrar.setBounds(130, 403, 82, 45);
		btnBorrar.setBackground(new Color(255, 99, 71));
		contentPane.add(btnBorrar);	
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setBounds(88, 513, 250, 33);
		contentPane.add(btnVolver);
	}

	//Inicializamos de variables
		String num1 = "";
		String num2 = "";
		String op = "";
		String operacion = "";
		String ultimaOperacion = "";
		String resultado = "";
		boolean n1completo = false;
		boolean n2completo = false;
		private JButton btnVolver;
		
	//Control de los botones 
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			//Cuando el boton es número (el uno o el cero), para la primera cifra 
			if (!n1completo) {
				if ((o == btn0)||(o == btn1)) {
					num1 = num1 + ((JButton)o).getText();
					operacion = operacion + ((JButton)o).getText();
				}
			//cuando el boton es una operación (AND o OR) 
				else if ((o == btnAnd)||(o == btnOr)) {
					n1completo = true;
					op = ((JButton)o).getText();
					operacion = operacion +"" + ((JButton)o).getText() + "";
					
				}
			//Cuando el boton es número (el uno o el cero), para la segunda cifra 
			}
			else if (!n2completo) {
				if ((o == btn0)||(o == btn1)) {
					num2 = num2 + ((JButton)o).getText();
					operacion = operacion + ((JButton)o).getText();
				}
			//cuando el bóton es el igual
				if (o == btnIgual) {
					//lblOperacionesRealizadas.setText(ultimaOperacion);
					n2completo = true;
					resultado = selectOpBin(op, num1, num2);
					operacion = operacion + " = " + resultado;
					ultimaOperacion = operacion;
					num1 = "";
					num2 = "";
				}
			}
			//cuando el bóton es borrar 
			if (o == btnBorrar) {
				num1 = "";
				num2 = "";
				op = "";
				operacion = "";
				resultado = "";
				n1completo = false;
				n2completo = false;
			}
			
			else if (o == btnVolver)
			{
				// creamos un nuevo Jframe de la clase VentanaPrincipal
				VentanaPrincipal vp = new VentanaPrincipal();
				// la mostramos
				vp.setVisible(true);
				// ocultamos la Calculadora
				this.setVisible(false); 
			}
			
			txtOperador.setText(operacion);
			
			
		}
		// Selecciona mediante el operando que función (operación) debemos realizar.
		private String selectOpBin(String op, String n1, String n2) {
			String result = "";
			switch (op) {
			case "AND":
				result = andBin(n1,n2);
				break;
			case "OR":
			result = orBin(n1,n2);
				break;
			default:
				break;
			}
			
			return result;
		}
		// calcula la operación or.
		private String orBin(String n1, String n2) {
			String result = "";
			int pos = 0;
			int posmax = 0;
			if (n1.length() > n2.length()){
				posmax = n1.length() - 1;	
				while (n1.length() > n2.length()) {
					n2 = "0" + n2;
				}
			}
			else if (n2.length() > n1.length()){
				posmax = n2.length() - 1;
				n1 = "0" + n1;
			}
			else {
				posmax = n1.length();
			}//recorremos el String de la primera a la ultima posicion
			for(pos=0; pos <posmax ; pos ++){ 
				result =  orBinPos(n1.charAt(pos), n2.charAt(pos)) + result;

			}
			return result;
		}
		//Calcula la operacion or bit a bit
		private String orBinPos(char charAt, char charAt2) {
			String resultado = "0";
			if ((charAt == '1')||(charAt2 == '1')) {
				resultado = "1";
			}
			return resultado;
		}
		// calcula la operación and
		private String andBin(String n1, String n2) {
			String result = "";
			int pos = 0;
			int posmax = 0;
			if (n1.length() > n2.length()){
				posmax = n1.length() - 1;	
				while (n1.length() > n2.length()) {
					n2 = "0" + n2;
				}
			}
			else if (n2.length() > n1.length()){
				posmax = n2.length() - 1;
				n1 = "0" + n1;
			}
			else {
				posmax = n1.length();
			}
			for(pos=0; pos <posmax ; pos ++){
				result = andBinPos(n1.charAt(pos), n2.charAt(pos)) + result;
			}
			
			return result;
		}
		//Calcula la operacion and bit a bit
		private String andBinPos(char charAt, char charAt2) {
			String resultado = "0";
			if ((charAt == '1')&&(charAt2 == '1')) {
				resultado = "1";
			}
			return resultado;
		}
					//hace la operacion 
					//muestra el resultado 
}
