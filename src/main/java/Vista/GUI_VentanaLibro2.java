/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class GUI_VentanaLibro2 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI_VentanaLibro2.class.getName());

    /**
     * Creates new form VentanaLibro2
     */
    public GUI_VentanaLibro2() {

    initComponents();

    // Ocultar la información al iniciar la página

    scrAffirmative.setVisible(false);
    scrNegative.setVisible(false);
    scrInterrogative.setVisible(false);

    // Cargar la información de las tres secciones.
    mostrarAfirmativas();
    mostrarNegativas();
    mostrarInterrogativas();
    mostrarRemember();

    // Personalizar el título principal.
    lblSimplePresent.setFont(new java.awt.Font(
            "Georgia", java.awt.Font.BOLD, 30));

    // Personalizar el subtítulo.
    lblSentences.setFont(new java.awt.Font(
            "Arial", java.awt.Font.BOLD, 24));

    // Personalizar el contenido.
    txtAffirmative.setFont(new java.awt.Font(
            "Arial", java.awt.Font.PLAIN, 18));

    txtAffirmative.setLineWrap(true);
    txtAffirmative.setWrapStyleWord(true);

}// FIN DEL CONSTRUCTOR
    
    // Mostrar la sección Affirmative.
public void mostrarPanelAffirmative() {

    scrAffirmative.setVisible(true);
    scrNegative.setVisible(false);
    scrInterrogative.setVisible(false);

}

// Mostrar la sección Negative.
public void mostrarPanelNegative() {

    scrAffirmative.setVisible(false);
    scrNegative.setVisible(true);
    scrInterrogative.setVisible(false);

}

// Mostrar la sección Interrogative.
public void mostrarPanelInterrogative() {

    scrAffirmative.setVisible(false);
    scrNegative.setVisible(false);
    scrInterrogative.setVisible(true);

}
    
    
    
// Método para mostrar las oraciones afirmativas.
    public void mostrarAfirmativas() {

        txtAffirmative.setText("""
                               STRUCTURE:
                               Subject + Verb + Complement
                               
                               EXAMPLES:
                               
                               1. I drink water every morning.
                                  Yo tomo agua todas las ma\u00f1anas.
                               
                               2. He watches TV at night.
                                  \u00c9l ve televisi\u00f3n por la noche.
                               
                               3. We listen to music.
                                  Nosotros escuchamos m\u00fasica.
                               
                               4. My mother cooks dinner.
                                  Mi mam\u00e1 prepara la cena.
                               
                               5. They play video games on weekends.
                                  Ellos juegan videojuegos los fines de semana.""");

    }//fin de mostrarAfirmativas

// Método para mostrar las oraciones negativas.
    public void mostrarNegativas() {

        txtNegative.setText("""
                            STRUCTURE:
                            Subject + don't / doesn't + Base Verb + Complement
                            
                            EXAMPLES:
                            
                            1. I don't eat fish.
                               Yo no como pescado.
                            
                            2. She doesn't drive a car.
                               Ella no conduce un autom\u00f3vil.
                            
                            3. We don't go to bed late.
                               Nosotros no nos acostamos tarde.
                            
                            4. He doesn't drink coffee.
                               \u00c9l no toma caf\u00e9.
                            
                            5. They don't study on Sundays.
                               Ellos no estudian los domingos.""");

    }//fin de mostrarNegativas

// Método para mostrar las oraciones interrogativas.
    public void mostrarInterrogativas() {

        txtInterrogative.setText("""
                         
                             STRUCTURE:
                             Do / Does + Subject + Base Verb + Complement?
                             
                             EXAMPLES:
                             
                             1. Do you like chocolate?
                                \u00bfTe gusta el chocolate?
                             
                                Yes, I do/ Yes, I like Chocolate
                             
                             2. Does he play basketball?
                                \u00bf\u00c9l juega baloncesto?
                             
                                Yes, he does / Yes, he plays basketball
                             
                             3. Do they speak English?
                                \u00bfEllos hablan ingl\u00e9s?
                             
                                No, they don`t/ No, they do not speak English
                             
                             4. Does your sister read books?
                                \u00bfTu hermana lee libros?
                             
                                No, she doesn`t/ No, she does not read books
                             
                             5. Do we have homework today?
                                \u00bfTenemos tarea hoy?   Yes, we do/ Yes, we have homework today 
                             
                             """);

    }//fin de mostrarInterrogativas

// Metodo para mostar el panel emember 
    public void mostrarRemember() {

        txtRemember.setText(
                "⭐ REMEMBER! ⭐\n\n"
                + "✨ Magic rule ✨\n\n"
                + "Subjects: HE 👦  SHE 👧  IT 🐶\n"
                + "Add -S or -ES to the verb!\n\n"
                + "Examples:\n"
                + "He plays soccer ⚽\n"
                + "She dances 💃\n"
                + "It sleeps 😴\n\n"
                + "Look at the difference!\n"
                + "I play → He plays!\n"
                + "I watch → She watches!\n\n"
                + "You are doing great! ⭐");

    }//end of mostrarRemember

// Método para conectar los botones con el controlador.
    public void addSentencesListener(ActionListener listener) {

        tbtnAfirmativa.setActionCommand("AFIRMATIVA");
        tbtnNegativa.setActionCommand("NEGATIVA");
        tbtnInterrogative.setActionCommand("INTERROGATIVA");

        tbtnAfirmativa.addActionListener(listener);
        tbtnNegativa.addActionListener(listener);
        tbtnInterrogative.addActionListener(listener);

    }//fin de addSentencesListener

    // Metodo para conetar los botones 
public void addNavigationListener(ActionListener listener) {

    btnVolver2.setActionCommand("VOLVER2");
    btnSiguiente2.setActionCommand("SIGUIENTE2");

    btnVolver2.addActionListener(listener);
    btnSiguiente2.addActionListener(listener);

}//fin 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        lblSimplePresent = new javax.swing.JLabel();
        lblSentences = new javax.swing.JLabel();
        tbtnAfirmativa = new javax.swing.JToggleButton();
        tbtnNegativa = new javax.swing.JToggleButton();
        tbtnInterrogative = new javax.swing.JToggleButton();
        scrAffirmative = new javax.swing.JScrollPane();
        txtAffirmative = new javax.swing.JTextArea();
        btnSiguiente2 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        scrNegative = new javax.swing.JScrollPane();
        txtNegative = new javax.swing.JTextArea();
        scrInterrogative = new javax.swing.JScrollPane();
        txtInterrogative = new javax.swing.JTextArea();
        pnlRemember = new javax.swing.JPanel();
        scrRemember = new javax.swing.JScrollPane();
        txtRemember = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBack.setBackground(new java.awt.Color(153, 204, 255));
        pnlBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSimplePresent.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblSimplePresent.setForeground(new java.awt.Color(0, 51, 255));
        lblSimplePresent.setText("Simple Present ");
        pnlBack.add(lblSimplePresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 380, 80));

        lblSentences.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        lblSentences.setForeground(new java.awt.Color(0, 51, 204));
        lblSentences.setText("Sentences");
        pnlBack.add(lblSentences, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 160, 70));

        tbtnAfirmativa.setBackground(new java.awt.Color(204, 255, 204));
        tbtnAfirmativa.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        tbtnAfirmativa.setForeground(new java.awt.Color(0, 51, 0));
        tbtnAfirmativa.setText("Affirmative");
        pnlBack.add(tbtnAfirmativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 60));

        tbtnNegativa.setBackground(new java.awt.Color(255, 204, 204));
        tbtnNegativa.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        tbtnNegativa.setForeground(new java.awt.Color(255, 51, 51));
        tbtnNegativa.setText("Negative ");
        pnlBack.add(tbtnNegativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 200, 60));

        tbtnInterrogative.setBackground(new java.awt.Color(255, 255, 153));
        tbtnInterrogative.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        tbtnInterrogative.setForeground(new java.awt.Color(153, 153, 0));
        tbtnInterrogative.setText("Interrogative");
        pnlBack.add(tbtnInterrogative, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 200, 60));

        txtAffirmative.setEditable(false);
        txtAffirmative.setBackground(new java.awt.Color(204, 255, 204));
        txtAffirmative.setColumns(20);
        txtAffirmative.setRows(5);
        scrAffirmative.setViewportView(txtAffirmative);

        pnlBack.add(scrAffirmative, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, 310));

        btnSiguiente2.setBackground(new java.awt.Color(0, 153, 255));
        btnSiguiente2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente2.setText("Siguiente");
        pnlBack.add(btnSiguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 130, 30));

        btnVolver2.setBackground(new java.awt.Color(255, 153, 102));
        btnVolver2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver2.setText("Volver");
        pnlBack.add(btnVolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 780, 130, 40));

        scrNegative.setEnabled(false);

        txtNegative.setEditable(false);
        txtNegative.setBackground(new java.awt.Color(255, 204, 204));
        txtNegative.setColumns(20);
        txtNegative.setForeground(new java.awt.Color(0, 0, 0));
        txtNegative.setRows(5);
        txtNegative.setToolTipText("");
        scrNegative.setViewportView(txtNegative);

        pnlBack.add(scrNegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 220, 310));

        txtInterrogative.setEditable(false);
        txtInterrogative.setBackground(new java.awt.Color(255, 255, 153));
        txtInterrogative.setColumns(20);
        txtInterrogative.setRows(5);
        scrInterrogative.setViewportView(txtInterrogative);

        pnlBack.add(scrInterrogative, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 210, 310));

        pnlRemember.setBackground(new java.awt.Color(153, 153, 255));

        txtRemember.setEditable(false);
        txtRemember.setBackground(new java.awt.Color(153, 153, 255));
        txtRemember.setColumns(20);
        txtRemember.setRows(5);
        scrRemember.setViewportView(txtRemember);

        javax.swing.GroupLayout pnlRememberLayout = new javax.swing.GroupLayout(pnlRemember);
        pnlRemember.setLayout(pnlRememberLayout);
        pnlRememberLayout.setHorizontalGroup(
            pnlRememberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRememberLayout.createSequentialGroup()
                .addComponent(scrRemember, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlRememberLayout.setVerticalGroup(
            pnlRememberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRememberLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrRemember, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBack.add(pnlRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 400, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUI_VentanaLibro2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSentences;
    private javax.swing.JLabel lblSimplePresent;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlRemember;
    private javax.swing.JScrollPane scrAffirmative;
    private javax.swing.JScrollPane scrInterrogative;
    private javax.swing.JScrollPane scrNegative;
    private javax.swing.JScrollPane scrRemember;
    private javax.swing.JToggleButton tbtnAfirmativa;
    private javax.swing.JToggleButton tbtnInterrogative;
    private javax.swing.JToggleButton tbtnNegativa;
    private javax.swing.JTextArea txtAffirmative;
    private javax.swing.JTextArea txtInterrogative;
    private javax.swing.JTextArea txtNegative;
    private javax.swing.JTextArea txtRemember;
    // End of variables declaration//GEN-END:variables
}
