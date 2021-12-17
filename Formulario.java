

package lab21;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame{

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private JTextField nombre;
    private JTextField año;
    private JTextField mes;
    private JTextField dia;
    
    private JLabel mensaje;

    public Formulario(){
	setSize(WIDTH, HEIGHT);
        setTitle("PACIENTE");
	setBounds(50, 50, 1400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    }
    
    public void createContents(){
	JLabel nom = new JLabel("Nombre");
	nom.setBounds(30, 10,200,30);
        nombre = new JTextField(5);
        nombre.setBounds(90, 10,200,30);
	JLabel FN = new JLabel("Fecha de nacimiento/");
	FN.setBounds(30, 50,200,30);
        
        JLabel laño = new JLabel("Año: ");
	laño.setBounds(180, 50,100,30);
	año = new JTextField(5);
        año.setBounds(230, 50,30,30);
        
        JLabel lmes = new JLabel("Mes: ");
	lmes.setBounds(280, 50,100,30);
        mes = new JTextField(2);
        mes.setBounds(330, 50,30,30);
        
        
        JLabel ldia = new JLabel("Día: ");
        ldia.setBounds(380, 50,100,30);
	dia = new JTextField(2);
        dia.setBounds(430, 50,30,30);
        
	JLabel sexo = new JLabel("Sexo: ");
	sexo.setBounds(30, 90,200,30);
	String [] listSexo = {"masculino","femenino"};
	JComboBox Sexo = new JComboBox(listSexo);
        Sexo.setBounds(80, 90,200,30);
	JLabel Enfermedad = new JLabel("Enfermedad: ");
	Enfermedad.setBounds(30, 130,200,30);
	String [] listEnfermedad = {"tos","gripe","covid"};
	JComboBox enfermedad = new JComboBox(listEnfermedad);
        enfermedad.setBounds(130, 130,200,30);
        JButton Registrar = new JButton("Registrar");
	Registrar.setBounds(150, 180, 150, 40);
        mensaje = new JLabel();
	
	add(nom);
        add(nombre);
	add(FN);
        
        add(laño);
        add(año);
        add(lmes);
        add(mes);
        add(ldia);
        add(dia);
        
	add(sexo);
	add(Sexo);
	add(Enfermedad);
	add(enfermedad);
	Registrar.addActionListener(new Listener());
	add(Registrar);
        add(mensaje);
    }
    
    private class Listener implements ActionListener{
        
        public void actionPerformed(ActionEvent ae) {
	    String Mensaje;
	    mensaje.setText("Se guardó exitosamente");
        }
    }

    public static void main(String[] args) {
	new Formulario();
    }
    
}
