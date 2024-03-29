/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Listas;

/**
 *
 * @author Usuario
 */
public class ListasEstaticas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListasEstaticas
     */
    public ListasEstaticas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAEj1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();
        txtValor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ejercicios con Array[]");

        btnAEj1.setText("Ejercicio1");
        btnAEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEj1ActionPerformed(evt);
            }
        });

        jLabel1.setText("PRÁCTICA COLECCIONES");

        lblValor.setText("Ingrese un valor:");

        txtAResultado.setColumns(20);
        txtAResultado.setRows(5);
        jScrollPane1.setViewportView(txtAResultado);

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblValor)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAEj1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAEj1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEj1ActionPerformed
        // TODO add your handling code here:
//        String palabra=txtValor.getText();
//        String[]listaPalabras=new String[5];
//        for (int i = 0; i < listaPalabras.length; i++) {
//            listaPalabras[i]=palabra;
//        }
       

    }//GEN-LAST:event_btnAEj1ActionPerformed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        // TODO add your handling code here:
        String palabra=txtValor.getText();
        String [] listaPalabras=this.crearLista(palabra);
         for (String listaPalabra : listaPalabras) {
            txtAResultado.append(listaPalabra);}
    }//GEN-LAST:event_txtValorKeyPressed
private String[] crearLista(String palabra){
    String[]listaPalabras=new String[5];
        for (int i = 0; i < listaPalabras.length; i++) {
            listaPalabras[i]=palabra;
        }
        return listaPalabras;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAEj1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
