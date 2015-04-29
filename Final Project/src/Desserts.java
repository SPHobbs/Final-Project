import java.awt.event.ActionListener;


public class Desserts extends global {

	// Variables declaration
    private javax.swing.JButton brownieButton;
    private javax.swing.JLabel browniePriceLabel;
    private javax.swing.JButton cakeButton;
    private javax.swing.JLabel cakePriceLabel;
    private javax.swing.JButton cookieButton;
    private javax.swing.JLabel cookiePriceLabel;
    private javax.swing.JLabel dessertsLabel;
    private javax.swing.JButton iceCreamButton;
    private javax.swing.JLabel iceCreamPriceLabel;
    private javax.swing.JButton mainMenuButton;
    // End of variables declaration
    public Desserts() {
        initComponents();
    }
    private void initComponents() {
    	
        dessertsLabel = new javax.swing.JLabel();
        iceCreamButton = new javax.swing.JButton();
        brownieButton = new javax.swing.JButton();
        cookieButton = new javax.swing.JButton();
        cakeButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        cakePriceLabel = new javax.swing.JLabel();
        cookiePriceLabel = new javax.swing.JLabel();
        browniePriceLabel = new javax.swing.JLabel();
        iceCreamPriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dessertsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dessertsLabel.setText("Desserts");

        iceCreamButton.setText("Ice Cream");

        brownieButton.setText("Brownie");

        cookieButton.setText("Cookie");

        cakeButton.setText("Cake");

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        iceCreamButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                iceCreamButtonActionPerformed(e);
            }
        });
        brownieButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                brownieButtonActionPerformed(e);
            }
        });
        cookieButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                cookieButtonActionPerformed(e);
            }
        });
        cakeButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                cakeButtonActionPerformed(e);
            }
        });

        cakePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        cookiePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        browniePriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");

        iceCreamPriceLabel.setText("- - - - - - - - - - - - - - - - - - - - -$2.00");
        //Auto generated code
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iceCreamButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(brownieButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cookieButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cakeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iceCreamPriceLabel)
                            .addComponent(browniePriceLabel)
                            .addComponent(cookiePriceLabel)
                            .addComponent(cakePriceLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(dessertsLabel)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuButton)
                .addGap(36, 36, 36))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {brownieButton, cakeButton, cookieButton, iceCreamButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dessertsLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iceCreamButton)
                    .addComponent(iceCreamPriceLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browniePriceLabel)
                    .addComponent(brownieButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookiePriceLabel)
                    .addComponent(cookieButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cakePriceLabel)
                    .addComponent(cakeButton))
                .addGap(31, 31, 31)
                .addComponent(mainMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {brownieButton, cakeButton, cookieButton, iceCreamButton});

        pack();
    }
    //End auto generated code

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button brings the user back to the main menu
        new MainMenuGui().setVisible(true);
        new Desserts().setVisible(false);
    }
    private void iceCreamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        iceCream+=1;
        price+=2;
        System.out.println("Number of ice creams = "+iceCream);
    }
    private void brownieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        brownie+=1;
        price+=3;
        System.out.println("Number of brownies = "+brownie);
    }
    private void cookieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        cookie+=1;
        price+=4;
        System.out.println("Number of cookies = "+cookie);
    }
    private void cakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // This button adds one pizza to the cutomers order
        cake+=1;
        price+=5;
        System.out.println("Number of cakes = "+cake);
    } 
}
