package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame {
    public Vista() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lResultado = new javax.swing.JLabel();
        campoTexto = new javax.swing.JTextField();
        euros = new javax.swing.JButton();
        dolares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lResultado.setText("lResultado");

        campoTexto.setText("campoTexto");

        euros.setText("convetir a euros");

        dolares.setText("convertir a dolares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(euros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(dolares))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTexto)
                            .addComponent(lResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euros)
                    .addComponent(dolares))
                .addGap(37, 37, 37)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lResultado)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    //Atributos
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTexto;
    private javax.swing.JButton dolares;
    private javax.swing.JButton euros;
    private javax.swing.JLabel lResultado;
    // End of variables declaration//GEN-END:variables

    //Metodos
    //Getters and setters
    public JTextField getCampoTexto() {
        return campoTexto;
    }

    public void setCampoTexto(JTextField campoTexto) {
        this.campoTexto = campoTexto;
    }

    public JButton getDolares() {
        return dolares;
    }

    public void setDolares(JButton dolares) {
        this.dolares = dolares;
    }

    public JButton getEuros() {
        return euros;
    }

    public void setEuros(JButton euros) {
        this.euros = euros;
    }

    public JLabel getlResultado() {
        return lResultado;
    }

    public void setlResultado(JLabel lResultado) {
        this.lResultado = lResultado;
    }

    //Outros metodos

    
    

}
