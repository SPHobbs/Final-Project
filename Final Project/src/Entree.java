import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class Entree extends global {

	// Variables declaration
    private javax.swing.JButton hamburgerButton;
    private javax.swing.JLabel pizzaLabel;
    private javax.swing.JButton hotdogButton;
    private javax.swing.JLabel hotdogLabel;
    private javax.swing.JLabel hamburgerLabel;
    private javax.swing.JButton steakButton;
    private javax.swing.JLabel steakLabel;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton pizzaButton;
    private javax.swing.JLabel entreeLabel;
    // End of variables declaration

    public Entree() {
        initComponents();
    }

    private void initComponents() {

        mainMenuButton = new javax.swing.JButton();
        steakButton = new javax.swing.JButton();
        hotdogButton = new javax.swing.JButton();
        hamburgerButton = new javax.swing.JButton();
        pizzaButton = new javax.swing.JButton();
        entreeLabel = new javax.swing.JLabel();
        hamburgerLabel = new javax.swing.JLabel();
        pizzaLabel = new javax.swing.JLabel();
        hotdogLabel = new javax.swing.JLabel();
        steakLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                mainMenuButtonActionPerformed(e);
            }
        });
        pizzaButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                pizzaButtonActionPerformed(e);
            }
        });
        hotdogButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                hotdogButtonActionPerformed(e);
            }
        });
        hamburgerButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                hamburgerButtonActionPerformed(e);
            }
        });
        steakButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                steakButtonActionPerformed(e);
            }
        });

        steakButton.setText("Steak");

        hotdogButton.setText("Hotdog");

        hamburgerButton.setText("Hamburger");

        pizzaButton.setText("Pizza");

        entreeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        entreeLabel.setText("Entree");

        pizzaLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        hotdogLabel.setText("- - - - - - - - - - - - - - - - - - - - -$3.00");

        hamburgerLabel.setText("- - - - - - - - - - - - - - - - - - - - -$4.00");

        steakLabel.setText("- - - - - - - - - - - - - - - - - - - - -$5.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pizzaButton)
                            .addComponent(hamburgerButton)
                            .addComponent(steakButton)
                            .addComponent(hotdogButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hamburgerLabel)
                            .addComponent(pizzaLabel)
                            .addComponent(hotdogLabel)
                            .addComponent(steakLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(entreeLabel)))
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
                .addComponent(entreeLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pizzaButton)
                    .addComponent(pizzaLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotdogLabel)
                    .addComponent(hotdogButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hamburgerLabel)
                    .addComponent(hamburgerButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steakLabel)
                    .addComponent(steakButton))
                .addGap(31, 31, 31)
                .addComponent(mainMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuButtonActionPerformed(ActionEvent e) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button brings the user back to the main menu
        new MainMenuGui().setVisible(true);
        new Entree().setVisible(false);
    }//GEN-LAST:event_mainMenuButtonActionPerformed
    private void pizzaButtonActionPerformed(ActionEvent e) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        pizza+=1;
        price+=2;
        System.out.println("Number of Pizzas = "+pizza);
    }
    private void hotdogButtonActionPerformed(ActionEvent e) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        hotdog+=1;
        price+=3;
        System.out.println("Number of Hotdogs = "+hotdog);
    }
    private void hamburgerButtonActionPerformed(ActionEvent e) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        hamburger+=1;
        price+=4;  
        System.out.println("Number of Hamburgers = "+hamburger);
    }
    private void steakButtonActionPerformed(ActionEvent e) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        steak+=1;
        price+=5; 
        System.out.println("Number of Steaks = "+steak);
    }

    
}
