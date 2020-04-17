package kalkukidz;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;



public class Calculadora extends JFrame implements ActionListener{
	
	// implementamos ActionListener a la clase
	
	private static final long serialVersionUID = 6686737827029296209L;
	
	// definimos todos los componentes (paneles, etiquetas de text y botones) y variables que vamos a usar a nivel de clase
	
	private JPanel contentPane;
	private JLabel lblResultado;
	private JLabel lblOperacion;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn0;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnPunto;
	private JButton btnMultiplicacion;
	private JButton btnDivision;
	private JButton btnIgual;
	private JButton btnReset;
	private JButton btnBorrar;
	private JButton btnVolver;
	
	/* definimos e inicializamos sin ningun valor 3 cadenas de texto, para guardar las 2 cifras con las que vamos 
	 * a realizar la operacion y otra para saber la operacion a realizar
	 */
	
	String numero1 = "";
	String numero2 = "";
	String operacion = "";
	
	/**
	 * Se lanza la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacion del frame
	 */
	public Calculadora() {
		setTitle("Calculadora Aritmetica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		// definimos un label donde iremos poniendo el resultado
		lblResultado = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResultado, 205, SpringLayout.WEST, contentPane);
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setBackground(Color.GRAY);
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblResultado, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblResultado, 88, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblResultado, -20, SpringLayout.EAST, contentPane);
		contentPane.add(lblResultado);
		
		// definimos un label donde iremos poniendo cada tecla pulsada
		lblOperacion = new JLabel("");
		lblOperacion.setHorizontalAlignment(SwingConstants.LEFT);
		lblOperacion.setForeground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblOperacion, 0, SpringLayout.NORTH, lblResultado);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblOperacion, 73, SpringLayout.NORTH, lblResultado);
		contentPane.add(lblOperacion);
		
		// definimos los botones numericos y les añadimos un ActionListener comun
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn9.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.EAST, btn9, -180, SpringLayout.EAST, contentPane);
		contentPane.add(btn9);
		btn9.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn8.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.EAST, lblOperacion, -10, SpringLayout.EAST, btn8);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn8, 207, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn9, 6, SpringLayout.EAST, btn8);
		contentPane.add(btn8);
		btn8.addActionListener(this);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn7.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.WEST, lblOperacion, 0, SpringLayout.WEST, btn7);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn7, 207, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn8, 0, SpringLayout.SOUTH, btn7);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn9, 0, SpringLayout.NORTH, btn7);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn9, 0, SpringLayout.SOUTH, btn7);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn7, 5, SpringLayout.WEST, contentPane);
		contentPane.add(btn7);
		btn7.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn6.setBackground(new Color(255, 228, 181));
		contentPane.add(btn6);
		btn6.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn5.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.EAST, btn8, 0, SpringLayout.EAST, btn5);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn5, 88, SpringLayout.WEST, contentPane);
		contentPane.add(btn5);
		btn5.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn4.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn7, -6, SpringLayout.NORTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn5, 0, SpringLayout.NORTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn5, 0, SpringLayout.SOUTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn6, 0, SpringLayout.NORTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn6, 0, SpringLayout.SOUTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn7, 0, SpringLayout.EAST, btn4);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn8, 6, SpringLayout.EAST, btn4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn4, 291, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn4, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn4, -6, SpringLayout.WEST, btn5);
		contentPane.add(btn4);
		btn4.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn3.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.WEST, btn6, 0, SpringLayout.WEST, btn3);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn6, 0, SpringLayout.EAST, btn3);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn3, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btn3);
		btn3.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn2.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.EAST, btn5, 0, SpringLayout.EAST, btn2);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn2, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn2, -6, SpringLayout.WEST, btn3);
		contentPane.add(btn2);
		btn2.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn1.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn2, 0, SpringLayout.NORTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn3, 0, SpringLayout.NORTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn3, 0, SpringLayout.SOUTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn4, -6, SpringLayout.NORTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn1, 375, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn1, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn1, -6, SpringLayout.WEST, btn2);
		contentPane.add(btn1);
		btn1.addActionListener(this);
		
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Dialog", Font.PLAIN, 35));
		btn0.setBackground(new Color(255, 228, 181));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn1, -6, SpringLayout.NORTH, btn0);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btn0, 459, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btn0, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn0, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btn0);
		btn0.addActionListener(this);
		
		
		// definimos el boton punto
		btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Dialog", Font.PLAIN, 35));
		btnPunto.setBackground(new Color(255, 228, 181));
		
		// le añadimos un action listener
		btnPunto.setBackground(new Color(255, 204, 102));
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// guardamos lo que hay en la pantalla resultado en un String del mismo nombre
				String loQueHayEnResultado = lblResultado.getText();
				int longitud;
				int posicion;
				boolean hayPunto;
				
				
				// inicializacion de la repeticion
				hayPunto = false;
				longitud = loQueHayEnResultado.length();
				posicion = 0;
				
				/* recorreremos el string caracter a caracter en busca de un punto
				 * las condiciones de finalizacion del bucle son 2: recorrer la totalidad del string o encontrar un punto dentro del mismo
				 */
				while ((posicion < longitud) && (hayPunto == false))
				{
					// comprobamos mediante un substring si el caracter en cuestion es un punto
					if (loQueHayEnResultado.substring(posicion, posicion + 1).equals("."))
					{
						// si lo es modificamos el booleano a true para indicarlo y para salir de la repeticion
						hayPunto = true;
					}
					
					// actualizacion de la repeticion
					posicion = posicion + 1;
				}
				// si la repeticion no ha encontrado ningun punto se lo ponemos
				if (hayPunto == false)
				{
					lblResultado.setText(lblResultado.getText()+".");
					lblOperacion.setText(lblOperacion.getText()+".");
					
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btn2, -6, SpringLayout.NORTH, btnPunto);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPunto, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btn0, -6, SpringLayout.WEST, btnPunto);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPunto, 0, SpringLayout.NORTH, btn0);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPunto, 0, SpringLayout.SOUTH, btn0);
		contentPane.add(btnPunto);
		
		// definimos el boton igual
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Dialog", Font.PLAIN, 35));
		btnIgual.setBackground(new Color(255, 204, 102));
		
		// añadimos un ActionListener
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// declaramos las variables necesarias para hacer la operacion
				String cadenaResultado;
				Double doubleResultado = 0.0;
				Double operando1;
				Double operando2;
				
				// agregamos a la pantalla de operacion el simbolo =
				lblOperacion.setText(lblOperacion.getText()+"=");
				
				// guardamos lo que tenemos en pantalla en numero2, este sera nuestro segundo operando
				numero2 = lblResultado.getText();
				
				/* convertimos lo que previamente habiamos guardado en los String numero1 y numero 2 a doubles 
				 * para poder operar con ellos
				 */
				
				operando1 = Double.parseDouble(numero1);
				operando2 = Double.parseDouble(numero2);
				
				
				// comprobamos la operacion que se nos ha introducido y hacemos la operacion correspondiente
				switch (operacion)
				{
					case("+"): doubleResultado = operando1 + operando2; break;
					case("-"): doubleResultado = operando1 - operando2; break;
					case("x"): doubleResultado = operando1 * operando2; break;			
					case("/"): 		// si la operacion es la division y el segundo operando es 0
									if (operando2 == 0)
									{ 
										// nos sale un mensaje de error indicando que no se puede dividir entre 0
										JOptionPane.showMessageDialog(null,(String)"No se puede dividir entre 0","Error",JOptionPane.INFORMATION_MESSAGE,null); 
										
										// dejamos todo en el estado inicial, como si se hubiese pulsado el boton borrar
										lblResultado.setText("0");
										lblOperacion.setText("");
										numero1 = "";
										numero2 = "";
										operacion = "";
									}
									else 
									{
										doubleResultado = operando1 / operando2;
									}
									break;
				}
				
				// convertimos el resultado a String
				cadenaResultado = Double.toString(doubleResultado);
				
				// y lo mostramos por pantalla
				lblResultado.setText(cadenaResultado);	
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.EAST, btn3, 0, SpringLayout.EAST, btnIgual);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnIgual, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPunto, -6, SpringLayout.WEST, btnIgual);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIgual, 0, SpringLayout.NORTH, btn0);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnIgual, 0, SpringLayout.SOUTH, btn0);
		contentPane.add(btnIgual);
		
		// añadimos ActionListeners a los botones de operacion
		
		btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnSuma.setBackground(new Color(255, 204, 102));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSuma, 0, SpringLayout.NORTH, btn7);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSuma, 6, SpringLayout.EAST, btn9);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSuma, 0, SpringLayout.SOUTH, btn7);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSuma, -97, SpringLayout.EAST, contentPane);
		contentPane.add(btnSuma);
		btnSuma.addActionListener(this);
		
		btnResta = new JButton("-");
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnResta.setBackground(new Color(255, 204, 102));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnResta, 0, SpringLayout.NORTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnResta, 6, SpringLayout.EAST, btn6);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnResta, 0, SpringLayout.SOUTH, btn4);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnResta, -97, SpringLayout.EAST, contentPane);
		contentPane.add(btnResta);
		btnResta.addActionListener(this);
		
		btnMultiplicacion = new JButton("x");
		btnMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnMultiplicacion.setBackground(new Color(255, 204, 102));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMultiplicacion, 0, SpringLayout.NORTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnMultiplicacion, 6, SpringLayout.EAST, btn3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMultiplicacion, 0, SpringLayout.SOUTH, btn1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMultiplicacion, -97, SpringLayout.EAST, contentPane);
		contentPane.add(btnMultiplicacion);
		btnMultiplicacion.addActionListener(this);
		
		btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnDivision.setBackground(new Color(255, 204, 102));
		sl_contentPane.putConstraint(SpringLayout.WEST, btnDivision, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnDivision, -97, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnIgual, -6, SpringLayout.WEST, btnDivision);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnDivision, 0, SpringLayout.NORTH, btn0);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnDivision, 0, SpringLayout.SOUTH, btn0);
		contentPane.add(btnDivision);
		btnDivision.addActionListener(this);
		
		// definimos el boton atras
		btnBorrar = new JButton("C");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnBorrar.setBackground(new Color(255, 99, 71));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBorrar, 140, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBorrar, 0, SpringLayout.WEST, lblOperacion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBorrar, -6, SpringLayout.NORTH, btn8);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// obtenemos lo que hay en resultado y lo guardamos en un String del mismo nombre
				String loQueHayEnResultado = lblResultado.getText();
				
				// obtenemos la longitud del String resultado
				int longitud = loQueHayEnResultado.length();
				
				// obtenemos lo que hay en operacion y lo guardamos en un String del mismo nombre
				String loQueHayEnOperacion = lblOperacion.getText();
				
				// obtenemos la longitud del String operacion
				int longitud2 = loQueHayEnOperacion.length();
				
				// comprobamos la longitud del String resultado
				
				if ( longitud > 1) // si hay algo en el String
				{
					// le restamos el ultimo caracter al String y lo sobreescribimos
					loQueHayEnResultado = loQueHayEnResultado.substring(0, longitud -1);
					
					// mostramos en la pantalla resultado el resultado anterior (el string menos el ultimo caracter)
					lblResultado.setText(loQueHayEnResultado);
						
				}
				else // si el String esta a 0
				{
					// ponemos un 0 en la pantalla resultado
					lblResultado.setText("0");
				}
				
				// lo mismo para el String operacion
				if (longitud2 > 1)
				{
					loQueHayEnOperacion = loQueHayEnOperacion.substring(0, longitud2 -1);
					lblOperacion.setText(loQueHayEnOperacion);
				}
				
				else 
				{
					lblOperacion.setText("");
				}
				
				
			}
		});
		contentPane.add(btnBorrar);
		
		// definimos el boton borrar
		btnReset = new JButton("CE");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 35));
		sl_contentPane.putConstraint(SpringLayout.WEST, btnReset, 210, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnReset, -8, SpringLayout.EAST, contentPane);
		btnReset.setBackground(new Color(255, 99, 71));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnReset, 52, SpringLayout.SOUTH, lblResultado);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnReset, -6, SpringLayout.NORTH, btn9);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBorrar, -6, SpringLayout.WEST, btnReset);
		
		// añadimos un ActionListener
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// borramos todo dejandolo como en el estado inicial
				
				lblResultado.setText("0");
				lblOperacion.setText("");
				numero1 = "";
				numero2 = "";
				operacion = "";
			}
		});
		contentPane.add(btnReset);
		
		// definimos el boton volver
		btnVolver = new JButton("VOLVER");
		btnVolver.setBackground(new Color(0, 128, 128));
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, 0, SpringLayout.EAST, btnReset);
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVolver, 0, SpringLayout.NORTH, btn9);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVolver, 6, SpringLayout.EAST, btnSuma);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, 0, SpringLayout.SOUTH, btn0);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnVolver);
		btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// acciones a realizar en botones que tengan ActionListener con "this"
		
		// obtenemos que boton ha sido pulsado
		Object o = ae.getSource();
		
		// obtenemos la propiedad texto del boton pulsado y lo guardamos como string en "textoBoton"
		String textoBoton = ((JButton)o).getText();
		
		// obtenemos lo que hay en pantalla y lo guardamos en un String del mismo nombre
		String loQueHayEnPantalla = lblResultado.getText();
		
		// agregamos a la pantalla de operaciones el texto del boton pulsado
		lblOperacion.setText(lblOperacion.getText() + textoBoton);
	
		
		// acciones a realizar si el boton pulsado es un boton numerico
		
		if ((o == btn1) || (o==btn2) || (o == btn3)||(o == btn4) || (o == btn5) || (o == btn6) || (o == btn7) || (o == btn8) || (o == btn9) || (o == btn0))
		{
			
			/* si lo que hay en pantalla es unicamente un 0 o un operador lo "sobreescribimos" no poniendo nada
			 * esto lo hacemos para que no aparezcan ni sean tenidos en cuenta por el programa los ceros a la izquierda 
			 * introducidos por el usuario
			 * 
			 */
			if (loQueHayEnPantalla.equals("0")  || loQueHayEnPantalla.equals("+") || loQueHayEnPantalla.equals("-") || loQueHayEnPantalla.equals("x") || loQueHayEnPantalla.equals("/")) 
			{
				lblResultado.setText("");	
			}
			
			// añadimos a la pantalla resultado el texto del boton pulsado
			lblResultado.setText(lblResultado.getText()+textoBoton);
			
		}
		
		// acciones a realizar si el boton pulsado es un boton de operacion
		else if ((o == btnSuma) || (o == btnResta) || (o == btnMultiplicacion) || (o == btnDivision))
		{
			// guardamos lo que hay en pantalla como numero 1, con el cual despues haremos la operacion
			numero1 = loQueHayEnPantalla;
			
			// ponemos en el resultado el signo de la operacion
			lblResultado.setText(textoBoton);
			
			// guardamos la operacion a realizar 
			operacion = textoBoton;
			
			// marcamos que ya tenemos un operador para tenerlo en cuenta en futuras acciones
			
		}
		
		// acciones a realizar si el boton pulsado es el de volver
		else if (o == btnVolver)
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
