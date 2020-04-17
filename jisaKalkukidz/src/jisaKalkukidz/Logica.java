package jisaKalkukidz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import jisaKalkukidz.VentanaPrincipal;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Logica extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1891783098440787516L;
	//Necesidades previas
	private JPanel contentPane;
	private JLabel lblOperador;
	private JButton btnAnd;
	private JButton btnOr;
	private JButton btn1;
	private JButton btn0;
	private JButton btnIgual;
	private JButton btnBorrar;
	private JButton btnVolver;
	private JLabel lblResultado;
 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logica frame = new Logica();
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
		
		lblOperador = new JLabel();
		lblOperador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOperador.setForeground(Color.WHITE);
		lblOperador.setBounds(10, 48, 245, 110);
		contentPane.add(lblOperador);
		lblOperador.setText(null);

		
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
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setBounds(88, 513, 250, 33);
		contentPane.add(btnVolver);
		
		lblResultado = new JLabel("");
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(265, 48, 160, 110);
		contentPane.add(lblResultado);
	}

	//Inicializamos de variables
		String num1 = "";
		String num2 = "";
		String operador = "";
		String operacion = "";
		String resultado = "";
		boolean n1completo = false;
		boolean n2completo = false;
		
		
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
					operador = ((JButton)o).getText();
					operacion = operacion + " " + ((JButton)o).getText() + " ";
					
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
					operacion = operacion + " = ";
					
					/*	llamamos a la funcion selectOpBin, pasandole como parametros los Strings operador, num1 y num2
					 *  nos devolvera un String que contendra el resultado final que mostraremos por pantalla
					 */
					resultado = selectOpBin(operador, num1, num2);
					lblResultado.setText(resultado);
					
					}
			}
			lblOperador.setText(operacion);
			//cuando el bóton es borrar 
			if (o == btnBorrar) {
				num1 = "";
				num2 = "";
				operador = "";
				operacion = "";
				resultado = "";
				n1completo = false;
				n2completo = false;
				lblResultado.setText("");
				lblOperador.setText("");
			}
			
			else if (o == btnVolver)
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
		/*	Selecciona mediante el operando que función (operación) debemos realizar.
		 *  recibe 3 Strings, el operador, el primer numero y el segundo numero
		 */
		private String selectOpBin(String op, String n1, String n2) {
			String result = "";
			int pos = 0;
			int posmax = 0;
			
			
			// primeramente comprobamos si los 2 numeros tienen el mismo numero de caracteres
			
			// si el primer numero tiene mas que el segundo
			if (n1.length() > n2.length()){
				
				// vamos agregando ceros a la izquierda del segundo numero hasta que su longitud sea igual a la del primero
				while (n1.length() > n2.length()) {
					n2 = "0" + n2;
				}
			}
			// si el segundo numero tiene mas que el primero, realizamos el mismo proceso a la inversa
			else if (n2.length() > n1.length()){
				
				while (n2.length() > n1.length()) {
					n1 = "0" + n1;
				}
			}
			// en este punto los 2 numeros tienen la misma longitud
			// la posicion maxima del String resultante sera la posicion maxima de cualquiera de los 2 numeros
			posmax = n1.length() -1;
			
			
			/* comprobamos que operacion se ha introducido y en ambos casos recorremos el string caracter a caracter
			 * llamando en cada iteracion a la funcion correspondiente al operador
			 */
			switch (op) {
			case "AND":
				
				for(pos=0; pos <= posmax ; pos ++){
					result = result + andBinPos(n1.charAt(pos), n2.charAt(pos));
				}
				
				break;
				
			case "OR":
				
				for(pos=0; pos <= posmax ; pos ++){
					result = result + orBinPos(n1.charAt(pos), n2.charAt(pos));
				}
				
				break;
			default:
				break;
			}
			
			// devolvemos el String resultante, el cual contiene el numero resultado
			return result;
		}
		
		
		/* Calcula la operacion OR caracter a caracter
		 * recibiendo cada caracter de los 2 numeros
		 */
		private String orBinPos(char charAt1, char charAt2) {
			String resultado = "0"; // el resultado por defecto es 0
			if ((charAt1 == '1')||(charAt2 == '1')) {
				// si uno de los 2 caracteres es 1, el resultado es 1
				resultado = "1";
			}
			// devolvemos el caracter resultante
			return resultado;
		}
		
		//Calcula la operacion AND caracter a caracter
		private String andBinPos(char charAt1, char charAt2) {
			String resultado = "0"; 
			// si ambos caracteres son 1, el resultado sera 1
			if ((charAt1 == '1')&&(charAt2 == '1')) {
				resultado = "1";
			}
			return resultado;
		}
}
