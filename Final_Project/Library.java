/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame.Proje;

/**
 *
 * @author firat
 */
public class Library extends javax.swing.JFrame {

    /**
     * Creates new form Library
     */
    public Library() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        info_text = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_list = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jSplitPane1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Information Box");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 419, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        info_text.setColumns(20);
        info_text.setRows(5);
        jScrollPane2.setViewportView(info_text);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 962;
        gridBagConstraints.ipady = 687;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(57, 87, 0, 0);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jSplitPane1.setRightComponent(jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        info_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Prokaryotic Cells", "Eukaryotic Cells", "Animal Nutrition", "Plant Nutrition" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        info_list.setPreferredSize(new java.awt.Dimension(150, 80));
        info_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(info_list);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.ipady = 503;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Back To Tables");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 49, 86, 0);
        jPanel3.add(jButton1, gridBagConstraints);

        jSplitPane1.setLeftComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info_listMouseClicked
        // TODO add your handling code here:
        // Jlistin işaretlenen elemanın bilgisini yazdır
        int index = info_list.getSelectedIndex();
        if (index == 0) {
            info_text.setText("Prokaryotes include bacteria and archaea, two of the three domains of life.\n"
                    + "Prokaryotic cells were the first form of life on Earth,\n"
                    + "characterized by having vital biological processes including cell signaling.\n"
                    + "They are simpler and smaller than eukaryotic cells, and lack a nucleus, and other membrane-bound \n"
                    + "The DNA of a prokaryotic cell consists of a single circular chromosome that is in direct contact with the cytoplasm.\n"
                    + "The nuclear region in the cytoplasm is called the nucleoid."
                    + "Most prokaryotes are the smallest of all ");
            
            
        }
        if (index == 1) {
            info_text.setText("lants, animals, fungi, slime moulds, protozoa, and algae are all eukaryotic.\n"
                    + "These cells are about fifteen times wider than a typical prokaryote and can be as much as a thousand times greater in volume.\n"
                    + "The main distinguishing feature of eukaryotes as compared to prokaryotes is compartmentalization:\n"
                    + "the presence of membrane-bound organelles (compartments) in which specific activities take place.\nMost important among these is a cell nucleus, an organelle that houses the cell's DNA."
                    + "This nucleus gives the eukaryote its name, which means \"true kernel (nucleus)\".");
            
        }
        if (index == 2) {
            info_text.setText("Animal nutrition focuses on the dietary nutrient needs of animals,\n"
                    + " often in comparison (or contrast) to other organisms like plants.\n"
                    + " Carnivore and herbivore diets are contrasting, with basic nitrogen and carbon proportions varying for their particular foods. Many herbivores rely on bacterial fermentation to create digestible nutrients from indigestible plant cellulose,\n"
                    + " while obligate carnivores must eat animal meats to obtain certain vitamins or nutrients their bodies cannot otherwise synthesize.\nAnimals generally have a higher requirement of energy in comparison to plants");
            
        }if (index == 3) {
            info_text.setText("Plant nutrition is the study of the chemical elements that are necessary for plant growth.\nThere are several principles that apply to plant nutrition.\nSome elements are directly involved in plant metabolism.\n"
                    + "However, this principle does not account for the so-called beneficial elements, whose presence, while not required,\n"
                    + "has clear positive effects on plant growth.");
            
            
        }
        
        
        
        
    }//GEN-LAST:event_info_listMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Tables tables = new Tables();
            tables.show();
            dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> info_list;
    private javax.swing.JTextArea info_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
