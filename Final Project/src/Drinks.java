import java.awt.event.ActionListener;


public class Drinks extends global {

	// Variables declaration
    private javax.swing.JButton cokeButton;
    private javax.swing.JLabel cokePriceLabel;
    private javax.swing.JLabel drinksLabel;
    private javax.swing.JButton gatoradeButton;
    private javax.swing.JLabel gatoradePriceLabel;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton pepsiButton;
    private javax.swing.JLabel pepsiPriceLabel;
    private javax.swing.JButton poweradeButton;
    private javax.swing.JLabel poweradePriceLabel;
    // End of variables declaration
    
    public Drinks() {
        initComponents();
    }
    private void initComponents() {

        drinksLabel = new javax.swing.JLabel();
        cokeButton = new javax.swing.JButton();
        pepsiButton = new javax.swing.JButton();
        poweradeButton = new javax.swing.JButton();
        gatoradeButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        gatoradePriceLabel = new javax.swing.JLabel();
        poweradePriceLabel = new javax.swing.JLabel();
        pepsiPriceLabel = new javax.swing.JLabel();
        cokePriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drinksLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        drinksLabel.setText("Drinks");

        cokeButton.setText("Coke");

        pepsiButton.setText("Pepsi");

        poweradeButton.setText("Powerade");

        gatoradeButton.setText("Gatorade");

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        cokeButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                cokeButtonActionPerformed(e);
            }
        });
        pepsiButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                pepsiButtonActionPerformed(e);
            }
        });
        poweradeButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                poweradeButtonActionPerformed(e);
            }
        });
        gatoradeButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                gatoradeButtonActionPerformed(e);
            }
        });

        gatoradePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        poweradePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        pepsiPriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        cokePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cokeButton)
                            .addComponent(pepsiButton)
                            .addComponent(gatoradeButton)
                            .addComponent(poweradeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cokePriceLabel)
                            .addComponent(pepsiPriceLabel)
                            .addComponent(poweradePriceLabel)
                            .addComponent(gatoradePriceLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(drinksLabel)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuButton)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drinksLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeButton)
                    .addComponent(cokePriceLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pepsiPriceLabel)
                    .addComponent(pepsiButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poweradePriceLabel)
                    .addComponent(poweradeButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gatoradePriceLabel)
                    .addComponent(gatoradeButton))
                .addGap(31, 31, 31)
                .addComponent(mainMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button brings the user back to the main menu
        new MainMenuGui().setVisible(true);
        new Entree().setVisible(false);
    }
    private void cokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        coke+=1;
        price+=2;
        System.out.println("Number of cokes = "+coke);
    }
    private void pepsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        pepsi+=1;
        price+=3;
        System.out.println("Number of pepsis = "+pepsi);
    }
    private void poweradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        powerade+=1;
        price+=4;
        System.out.println("Number of powerades = "+powerade);
    }
    private void gatoradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        gatorade+=1;
        price+=5;
        System.out.println("Number of gatorades = "+gatorade);
    }    
}
