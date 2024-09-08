package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
    //Atributos
    private Modelo modelo;
    private Vista vista;
    
    //Metodos 
    //Constructor
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.getDolares().addActionListener(this);
        this.vista.getEuros().addActionListener(this);
        
    }
    //Getters and setters

    
    //Outros métodos
    public void iniciarVista() {
    vista.setTitle("Conversor");
    vista.pack();
    vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    }
    
    
    //Implementacion dos metodos abastractos da interfaz
    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(vista.getEuros() == event.getSource()){
            if(!"".equals(vista.getCampoTexto().getText())){
                try{
                modelo.setCantidad(Double.parseDouble(vista.getCampoTexto().getText()));
                modelo.setMoneda(0.9345);
                modelo.convetirDolarAEuro();
                vista.getlResultado().setText(""+modelo.getResultado());
                }catch(NumberFormatException error){
                    System.out.println("Error o parsear a cantidade, revise a cantidade introducida no campo de texto.");
                }
            }
        
        
        }else if(vista.getDolares() == event.getSource()){
            if(!"".equals(vista.getCampoTexto().getText())){
                try{
                    modelo.setCantidad(Double.parseDouble(vista.getCampoTexto().getText()));
                    modelo.setMoneda(1.07);
                    modelo.convertirEuroADolar();
                    vista.getlResultado().setText(""+modelo.getResultado());
                                      
                }catch(NumberFormatException error){
                    System.out.println("Error o parsear a cantidade, revise a cantidade introducida no campo de texto.");
                }
            }
        
        }
        
        
        
    }


    
    

}
