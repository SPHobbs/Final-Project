import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class MainMenuGui extends global{

	// Variables declaration
	private javax.swing.JLabel MainMenuTitle;
    private javax.swing.JButton dessertsButton;
    private javax.swing.JButton drinksButton;
    private javax.swing.JButton entreeButton;
    private javax.swing.JButton finishButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sidesButton;
    private javax.swing.JButton signOutButton;
    public int price;
    // End of variables declaration

    private void initComponents() {

        MainMenuTitle = new javax.swing.JLabel();
        entreeButton = new javax.swing.JButton();
        sidesButton = new javax.swing.JButton();
        drinksButton = new javax.swing.JButton();
        dessertsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        finishButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainMenuTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MainMenuTitle.setText("Sean's Restaurant of Awesomeness");

        entreeButton.setText("Entrees");
        entreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreeButtonActionPerformed(evt);
            }
        });

        sidesButton.setText("Sides");
        sidesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidesButtonActionPerformed(evt);
            }
        });

        drinksButton.setText("Drinks");
        drinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksButtonActionPerformed(evt);
            }
        });

        dessertsButton.setText("Desserts");
        dessertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessertsButtonActionPerformed(evt);
            }
        });

        finishButton.setText("Finish and Pay");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	finishButtonActionPerformed(evt);
            }
        });
        resetButton.setText("Reset order");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	resetButtonActionPerformed(evt);
            }
        });
        
        signOutButton.setText("Sign Out");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainMenuTitle)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinksButton)
                            .addComponent(entreeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dessertsButton)
                            .addComponent(sidesButton)))
                    .addComponent(signOutButton))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dessertsButton, drinksButton, entreeButton, sidesButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainMenuTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entreeButton)
                        .addGap(18, 18, 18)
                        .addComponent(drinksButton)
                        .addGap(28, 28, 28)
                        .addComponent(signOutButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidesButton)
                        .addGap(18, 18, 18)
                        .addComponent(dessertsButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishButton)
                    .addComponent(resetButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dessertsButton, drinksButton, entreeButton, sidesButton});

        pack();
    }

    protected void resetButtonActionPerformed(ActionEvent evt) {
		// This method resets the program for the next customer
    	try {
			Runtime.getRuntime().exec("cls");
		} catch (IOException e) {
			System.out.println("Console could not be cleared.");
		}
    	pizza=0;
    	hotdog=0;
    	hamburger=0;
    	hamburger=0;
    	steak=0;
    	fries=0;
    	MAC=0;
    	biscuits=0;
    	greenBeans=0;
    	coke=0;
    	pepsi=0;
    	powerade=0;
    	gatorade=0;
    	iceCream=0;
    	brownie=0;
    	cookie=0;
    	cake=0;		
	}

	protected void finishButtonActionPerformed(ActionEvent evt) {
		// This method finishes the transaction between the customer and the restaurant
		try {
			PrintStream out = new PrintStream(new FileOutputStream("CustomerReciept.txt"));
				if(pizza>0)
				{
					out.println(pizza+" number of pizzas = $"+pizza*2);
				}
				if(hotdog>0)
				{
					out.println(hotdog+" number of hotdogs = $"+hotdog*3);
				}
				if(hamburger>0)
				{
					out.println(hamburger+" number of hamburgers = $"+hamburger*4);
				}
				if(steak>0)
				{
					out.println(steak+" number of steaks = $"+steak*5);
				}
				
				if(fries>0)
				{
					out.println(fries+" number of fries = $"+fries*2);
				}
				if(MAC>0)
				{
					out.println(MAC+" number of mac and cheese = $"+MAC*2);
				}
				if(biscuits>0)
				{
					out.println(biscuits+" number of biscuits = $"+biscuits*2);
				}
				if(greenBeans>0)
				{
					out.println(greenBeans+" number of green beans = $"+greenBeans*2);
				}
				
				if(coke>0)
				{
					out.println(coke+" number of cokes = $"+coke*2);
				}
				if(pepsi>0)
				{
					out.println(pepsi+" number of pepsis = $"+pepsi*2);
				}
				if(powerade>0)
				{
					out.println(powerade+" number of powerades = $"+powerade*2);
				}
				if(gatorade>0)
				{
					out.println(gatorade+" number of gatorades = $"+gatorade*2);
				}
				
				if(iceCream>0)
				{
					out.println(iceCream+" number of ice creams = $"+iceCream*2);
				}
				if(brownie>0)
				{
					out.println(brownie+" number of brownies = $"+brownie*2);
				}
				if(cookie>0)
				{
					out.println(cookie+" number of cookies = $"+cookie*4);
				}
				if(cake>0)
				{
					out.println(cake+" number of cakes = $"+cake*5);
				}

			      out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not print reciept");
		}
	}

	private void entreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreeButtonActionPerformed
        // This button brings up the entree selection menu
        new MainMenuGui().setVisible(false);
        new Entree().setVisible(true);
    }

    private void sidesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidesButtonActionPerformed
        // This button brings the user to the sides menu
        new MainMenuGui().setVisible(false);
        new Entree().setVisible(true);
    }

    private void drinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksButtonActionPerformed
        // This button brings the user to the drinks menu
        new MainMenuGui().setVisible(false);
        new Drinks().setVisible(true);
    }

    private void dessertsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessertsButtonActionPerformed
        // This button brings the user to the dessert menu
        new MainMenuGui().setVisible(false);
        new Desserts().setVisible(true);
    }

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        // This button exits the program and returns the user to the authentication screen
        new MainMenuGui().setVisible(false);
        new NewJFrame().setVisible(true);
    }
   
}
