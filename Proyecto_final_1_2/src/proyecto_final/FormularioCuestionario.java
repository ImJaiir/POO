/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


/**
 *
 * @author Erick Jair
 */
public class FormularioCuestionario extends javax.swing.JFrame {

    List<JRadioButton> radios = new ArrayList<>();
    List<Pregunta> preguntas = new ArrayList<>();
    int preguntaActual=0;
    int respuestacorrecta=0;
    
    public FormularioCuestionario() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/proyecto_final/Disney.png")).getImage());
        radios.add(radioTituloOpcion0);
        radios.add(radioTituloOpcion1);
        radios.add(radioTituloOpcion2);
        radios.add(radioTituloOpcion3);
        generarCuestionario();
        
    }
    
    public void generarCuestionario() {
        //Con el modelo construido debemos representar uestra pregunta
        //y mostrarala
        //Primero creamos las opciones
        Opcion op1 = new Opcion();
        op1.setTitulo("A) Pocoyó");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("B) Tritón.");
        op2.setCorrecta(true);

        Opcion op3 = new Opcion();
        op3.setTitulo("C) Doctor Simi.");
        op3.setCorrecta(false);

        Opcion op4 = new Opcion();
        op4.setTitulo("D) Erick");
        op4.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones = {op1, op2, op3, op4};
        Pregunta p1 = new Pregunta();
        p1.setTitulo("1. ¿Ariel de quién era hija?");
        p1.setOpciones(opciones);

//-------------------------------------------------------------------------------------
        
        Opcion op21 = new Opcion();
        op21.setTitulo("A) Blanca Nieves.");
        op21.setCorrecta(true);

        Opcion op22 = new Opcion();
        op22.setTitulo("B) Cenicienta.");
        op22.setCorrecta(false);

        Opcion op23 = new Opcion();
        op23.setTitulo("C) La sirenita. ");
        op23.setCorrecta(false);

        Opcion op24 = new Opcion();
        op24.setTitulo("D) Erick");
        op24.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones2 = {op21, op22, op23, op24};
        Pregunta p2 = new Pregunta();
        p2.setTitulo("2. ¿Cuál fue la primera película de Princesas Disney? ");
        p2.setOpciones(opciones2);
 //-------------------------------------------------------------------------------------
        
        Opcion op31 = new Opcion();
        op31.setTitulo("A) Pocahontas ");
        op31.setCorrecta(false);

        Opcion op32 = new Opcion();
        op32.setTitulo("B) Mulán");
        op32.setCorrecta(true);

        Opcion op33 = new Opcion();
        op33.setTitulo("C) Tiana");
        op33.setCorrecta(false);

        Opcion op34 = new Opcion();
        op34.setTitulo("D) Ninguno de los anteriores");
        op34.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones3 = {op31, op32, op33, op34};
        Pregunta p3 = new Pregunta();
        p3.setTitulo("3. ¿Qué princesa se viste como hombre para salvar a su padre?");
        p3.setOpciones(opciones3);

 //-------------------------------------------------------------------------------------
        
        Opcion op41 = new Opcion();
        op41.setTitulo("A) Aurora.");
        op41.setCorrecta(false);

        Opcion op42 = new Opcion();
        op42.setTitulo("B) Cenicienta.");
        op42.setCorrecta(true);

        Opcion op43 = new Opcion();
        op43.setTitulo("C) De la Bestia");
        op43.setCorrecta(false);

        Opcion op44 = new Opcion();
        op44.setTitulo("D) El castillo no se muestra en ninguna película de Disney.");
        op44.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones4 = {op41, op42, op43, op44};
        Pregunta p4 = new Pregunta();
        p4.setTitulo("4. ¿De quien es el castillo que se muestra en el emblemático logotipo de Walt Disney Company?");
        p4.setOpciones(opciones4);
 //-------------------------------------------------------------------------------------
        
        Opcion op51 = new Opcion();
        op51.setTitulo("A) Príncipe Encantador ");
        op51.setCorrecta(false);

        Opcion op52 = new Opcion();
        op52.setTitulo("B) Príncipe Florian ");
        op52.setCorrecta(false);

        Opcion op53 = new Opcion();
        op53.setTitulo("C) Príncipe Felipe");
        op53.setCorrecta(true);

        Opcion op54 = new Opcion();
        op54.setTitulo("D) Príncipe Juan");
        op54.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones5 = {op51, op52, op53, op54};
        Pregunta p5 = new Pregunta();
        p5.setTitulo("5. ¿Cómo se llama el príncipe de la Princesa Aurora?");
        p5.setOpciones(opciones5);

//-------------------------------------------------------------------------------------
        
        Opcion op61 = new Opcion();
        op61.setTitulo("A) Perico");
        op61.setCorrecta(false);

        Opcion op62 = new Opcion();
        op62.setTitulo("B) Elefante ");
        op62.setCorrecta(false);

        Opcion op63 = new Opcion();
        op63.setTitulo("C) Tigre");
        op63.setCorrecta(true);

        Opcion op64 = new Opcion();
        op64.setTitulo("D) Gato");
        op64.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones6 = {op61, op62, op63, op64};
        Pregunta p6 = new Pregunta();
        p6.setTitulo("6. ¿Qué tipo de mascota tiene la princesa Jasmine?");
        p6.setOpciones(opciones6);

        //-------------------------------------------------------------------------------------
        
        Opcion op71 = new Opcion();
        op71.setTitulo("A) Bélgica");
        op71.setCorrecta(false);

        Opcion op72 = new Opcion();
        op72.setTitulo("B) Inglaterra");
        op72.setCorrecta(false);

        Opcion op73 = new Opcion();
        op73.setTitulo("C) México");
        op73.setCorrecta(false);

        Opcion op74 = new Opcion();
        op74.setTitulo("D) Francia");
        op74.setCorrecta(true);

        //Sigue el arreglo de opcion
        Opcion[] opciones7 = {op71, op72, op73, op74};
        Pregunta p7 = new Pregunta();
        p7.setTitulo("7. ¿En qué País se desarrolla la Historia de “La bella y la bestia”?");
        p7.setOpciones(opciones7);
        
        //-------------------------------------------------------------------------------------
        
        Opcion op81 = new Opcion();
        op81.setTitulo("A) Pocahontas ");
        op81.setCorrecta(true);

        Opcion op82 = new Opcion();
        op82.setTitulo("B) Aladino");
        op82.setCorrecta(false);

        Opcion op83 = new Opcion();
        op83.setTitulo("C) El Rey León");
        op83.setCorrecta(false);

        Opcion op84 = new Opcion();
        op84.setTitulo("D) Avengers");
        op84.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones8 = {op81, op82, op83, op84};
        Pregunta p8 = new Pregunta();
        p8.setTitulo("8. ¿Qué película de Disney fue la primera con base en la historia?");
        p8.setOpciones(opciones8);

//-------------------------------------------------------------------------------------
        
        Opcion op91 = new Opcion();
        op91.setTitulo("A) Ariel");
        op91.setCorrecta(false);

        Opcion op92 = new Opcion();
        op92.setTitulo("B) Rapunzel");
        op92.setCorrecta(false);

        Opcion op93 = new Opcion();
        op93.setTitulo("C) Alicia");
        op93.setCorrecta(true);

        Opcion op94 = new Opcion();
        op94.setTitulo("D) Blanca nieves");
        op94.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones9 = {op91, op92, op93, op94};
        Pregunta p9 = new Pregunta();
        p9.setTitulo("9. ¿Cuál de estas protagonistas no es realmente una princesa?");
        p9.setOpciones(opciones9);

//-------------------------------------------------------------------------------------
        
        Opcion op101 = new Opcion();
        op101.setTitulo("A) Gus ");
        op101.setCorrecta(true);

        Opcion op102 = new Opcion();
        op102.setTitulo("B) Lucifer");
        op102.setCorrecta(false);

        Opcion op103 = new Opcion();
        op103.setTitulo("C) Jacques");
        op103.setCorrecta(false);

        Opcion op104 = new Opcion();
        op104.setTitulo("D) Iron Man");
        op104.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones10 = {op101, op102, op103, op104};
        Pregunta p10 = new Pregunta();
        p10.setTitulo("10. La madrastra de Cenicienta tenía un gato bastante desagradable, ¿cómo se llamaba?");
        p10.setOpciones(opciones10);


        //Vamos a adaptar el cuestioanario a lo que ya teniamos
        Cuestionario c = new Cuestionario();
        //Creamos el list de preguntas

        //Se agrega a este list la unica prgunta que tenemos
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        c.setPreguntas(preguntas);
//Primero ajustamos el titulo de la primer pregunta en la etiqueta de la preunta
        mostrarPregunta(preguntaActual);
        
    }
    public void mostrarPregunta(int indicePregunta){
    //Checar si el indice de pregunta no rebaso el numero de preguntas
    //dentro del arraylist preguntas.
    etiquetaTituloPregunta.setText(preguntas.get(indicePregunta).getTitulo());

        //Llenamos con el modelo los radio buttons
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(preguntas.get(indicePregunta).getOpciones()[i].getTitulo());
        }

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        etiquetaTituloPregunta = new javax.swing.JLabel();
        radioTituloOpcion0 = new javax.swing.JRadioButton();
        radioTituloOpcion1 = new javax.swing.JRadioButton();
        radioTituloOpcion2 = new javax.swing.JRadioButton();
        radioTituloOpcion3 = new javax.swing.JRadioButton();
        botonRespuesta = new javax.swing.JButton();
        etiquetaRespuesta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTituloPregunta.setText("jLabel1");

        grupo.add(radioTituloOpcion0);
        radioTituloOpcion0.setText("jRadioButton1");
        radioTituloOpcion0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTituloOpcion0ActionPerformed(evt);
            }
        });

        grupo.add(radioTituloOpcion1);
        radioTituloOpcion1.setText("jRadioButton2");

        grupo.add(radioTituloOpcion2);
        radioTituloOpcion2.setText("jRadioButton3");

        grupo.add(radioTituloOpcion3);
        radioTituloOpcion3.setText("jRadioButton4");

        botonRespuesta.setText("Next");
        botonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRespuestaActionPerformed(evt);
            }
        });

        etiquetaRespuesta.setText("Aciertos: 0");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTituloPregunta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioTituloOpcion0)
                                .addGap(18, 18, 18)
                                .addComponent(radioTituloOpcion1)
                                .addGap(18, 18, 18)
                                .addComponent(radioTituloOpcion2)
                                .addGap(18, 18, 18)
                                .addComponent(radioTituloOpcion3))
                            .addComponent(etiquetaRespuesta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(botonRespuesta))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTituloPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTituloOpcion0)
                    .addComponent(radioTituloOpcion1)
                    .addComponent(radioTituloOpcion2)
                    .addComponent(radioTituloOpcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addComponent(etiquetaRespuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTituloOpcion0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTituloOpcion0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTituloOpcion0ActionPerformed

    private void botonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRespuestaActionPerformed
        // TODO add your handling code here:
        if(preguntaActual<preguntas.size()){
        Opcion[] opciones = preguntas.get(preguntaActual).getOpciones();
       boolean acierto=false;
       for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {   
                acierto=true;
                respuestacorrecta++;
                break;
            }
            
        }
       
        etiquetaRespuesta.setText("Aciertos: "+respuestacorrecta);
        preguntaActual++;
        mostrarPregunta(preguntaActual);
        if(preguntaActual==9){
            botonRespuesta.setEnabled(false);
             JOptionPane.showMessageDialog(null,"Calificación: "+respuestacorrecta,"Calificación", JOptionPane.WARNING_MESSAGE);
             
        }
        }
    }//GEN-LAST:event_botonRespuestaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRespuesta;
    private javax.swing.JLabel etiquetaRespuesta;
    private javax.swing.JLabel etiquetaTituloPregunta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton radioTituloOpcion0;
    private javax.swing.JRadioButton radioTituloOpcion1;
    private javax.swing.JRadioButton radioTituloOpcion2;
    private javax.swing.JRadioButton radioTituloOpcion3;
    // End of variables declaration//GEN-END:variables
}
