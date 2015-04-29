import java.awt.event.ActionListener;

public class Sides extends global {

	// Variables declaration
    private javax.swing.JButton MACButton;
    private javax.swing.JLabel MACLabel;
    private javax.swing.JButton biscuitsButton;
    private javax.swing.JLabel biscuitsLabel;
    private javax.swing.JLabel friesLabel;
    private javax.swing.JButton greenBeansButton;
    private javax.swing.JLabel greenBeensLabel;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton friesButton;
    private javax.swing.JLabel sidesLabel;
    // End of variables declaration
    
    /**
     * Creates new form Sides
     */
    public Sides() {
        initComponents();
    }
    private void initComponents() {

        mainMenuButton = new javax.swing.JButton();
        greenBeansButton = new javax.swing.JButton();
        biscuitsButton = new javax.swing.JButton();
        MACButton = new javax.swing.JButton();
        friesButton = new javax.swing.JButton();
        sidesLabel = new javax.swing.JLabel();
        friesLabel = new javax.swing.JLabel();
        MACLabel = new javax.swing.JLabel();
        biscuitsLabel = new javax.swing.JLabel();
        greenBeensLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });
        friesButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                friesButtonActionPerformed(e);
            }
        });
        MACButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                MACButtonActionPerformed(e);
            }
        });
        biscuitsButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                biscuitsButtonActionPerformed(e);
            }
        });
        greenBeansButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                greenBeansButtonActionPerformed(e);
            }
        });

        greenBeansButton.setText("Green Beans");

        biscuitsButton.setText("Biscuits");

        MACButton.setText("Mac & Cheese");

        friesButton.setText("Fries");

        sidesLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sidesLabel.setText("Sides");

        friesLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        MACLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        biscuitsLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.50");

        greenBeensLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.50");
        //Auto generated code
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(friesButton)
                            .addComponent(MACButton)
                            .addComponent(greenBeansButton)
                            .addComponent(biscuitsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(friesLabel)
                            .addComponent(MACLabel)
                            .addComponent(biscuitsLabel)
                            .addComponent(greenBeensLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(sidesLabel)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuButton)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidesLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(friesButton)
                    .addComponent(friesLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MACLabel)
                    .addComponent(MACButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biscuitsLabel)
                    .addComponent(biscuitsButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greenBeensLabel)
                    .addComponent(greenBeansButton))
                .addGap(31, 31, 31)
                .addComponent(mainMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    //End auto generated code
    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button brings the user back to the main menu
        new MainMenuGui().setVisible(true);
        new Sides().setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed
    private void friesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        fries+=1;
        price+=2;
        System.out.println("Number of fries = "+fries);
    }
    private void MACButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        MAC+=1;
        price+=3;
        System.out.println("Number of mac and cheese = "+MAC);
    }
    private void biscuitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        biscuits+=1;
        price+=4;
        System.out.println("Number of biscuits = "+biscuits);
    }
    private void greenBeansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        greenBeans+=1;
        price+=5;
        System.out.println("Number of green beans = "+greenBeans);
    }    
}
