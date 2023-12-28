
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Tic_Toe_Toe_Game extends javax.swing.JFrame {
    
    private String startGame= "x";
    private int xCount =0;
    private int oCount =0;
    

    /**
     * Creates new form Tic_Toe_Toe_Game
     */
    public Tic_Toe_Toe_Game() {
        initComponents();
    }
    private void gameScore()
    {
    playerx.setText(String.valueOf(xCount));
    playero.setText(String.valueOf(oCount));
    
    }
    private void choose_a_Player(){
    if(startGame.equalsIgnoreCase("x"))
    {
    startGame ="0";
    }
    else 
    {
    startGame= "x";
    }
        
    }
    private void WinningGame()
    {
    String b1=bt1.getText();
    String b2=bt2.getText();
    String b3=bt3.getText();
    String b4=bt4.getText();
    String b5=bt5.getText();
    String b6=bt6.getText();
    String b7=bt7.getText();
    String b8=bt8.getText();
    String b9=bt9.getText();
    //player x code
    if(b1==("x")&&b2==("x")&&b3==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt2.setBackground(Color.ORANGE);
    bt3.setBackground(Color.ORANGE);
    }
    
    if(b4==("x")&&b5==("x")&&b6==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt4.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt6.setBackground(Color.ORANGE);
    }
    
    if(b7==("x")&&b8==("x")&&b9==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt7.setBackground(Color.ORANGE);
    bt8.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b1==("x")&&b4==("x")&&b7==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt4.setBackground(Color.ORANGE);
    bt7.setBackground(Color.ORANGE);
    }
    
    if(b2==("x" )&&b5==("x")&&b8==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt2.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt8.setBackground(Color.ORANGE);
    }
    if(b3==("x")&&b6==("x")&&b9==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt3.setBackground(Color.ORANGE);
    bt6.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b1==("x")&&b5==("x")&&b9==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b3==("x")&&b5==("x")&&b7==("x"))
    {
    JOptionPane.showMessageDialog(this,"Player X win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    bt3.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt7.setBackground(Color.ORANGE);
    }
    //player o code
    
    
    
    
    
     if(b1==("0")&&b2==("0")&&b3==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt2.setBackground(Color.ORANGE);
    bt3.setBackground(Color.ORANGE);
    }
    
    if(b4==("0")&&b5==("0")&&b6==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt4.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt6.setBackground(Color.ORANGE);
    }
    
    if(b7==("0")&&b8==("0")&&b9==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt7.setBackground(Color.ORANGE);
    bt8.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b1==("0")&&b4==("0")&&b7==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt4.setBackground(Color.ORANGE);
    bt7.setBackground(Color.ORANGE);
    }
    
    if(b2==("0" )&&b5==("0")&&b8==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt2.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt8.setBackground(Color.ORANGE);
    }
    if(b3==("0")&&b6==("0")&&b9==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt3.setBackground(Color.ORANGE);
    bt6.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b1==("0")&&b5==("0")&&b9==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt1.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt9.setBackground(Color.ORANGE);
    }
    if(b3==("0")&&b5==("0")&&b7==("0"))
    {
    JOptionPane.showMessageDialog(this,"Player 0 win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    bt3.setBackground(Color.ORANGE);
    bt5.setBackground(Color.ORANGE);
    bt7.setBackground(Color.ORANGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt8 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btexit = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Toe Toe");

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tic TAc Toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        bt8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btexit.setBackground(new java.awt.Color(255, 102, 102));
        btexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btexit.setText("EXIT");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        btset.setBackground(new java.awt.Color(0, 153, 204));
        btset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btset.setText("RESET");
        btset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText(" Player O :");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText(" Player X :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(playerx))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(playero))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btset, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(874, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        // TODO add your handling code here:
         JFrame frame =new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit",
                      "Tic Tac Toe" ,JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }
        
    }//GEN-LAST:event_btexitActionPerformed

    private void btsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsetActionPerformed
        // TODO add your handling code here:
        bt1.setText(null);
        bt2.setText(null);
        bt3.setText(null);
        
        bt4.setText(null);
        bt5.setText(null);
        bt6.setText(null);
        
        bt7.setText(null);
        bt8.setText(null);
        bt9.setText(null);
        
        bt1.setBackground(Color.LIGHT_GRAY);
        bt2.setBackground(Color.LIGHT_GRAY);
        
        bt3.setBackground(Color.LIGHT_GRAY);
        
        bt4.setBackground(Color.LIGHT_GRAY);
        bt5.setBackground(Color.LIGHT_GRAY);
        bt6.setBackground(Color.LIGHT_GRAY);
        bt7.setBackground(Color.LIGHT_GRAY);
        bt8.setBackground(Color.LIGHT_GRAY);
        bt9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
        
        
       
    }//GEN-LAST:event_btsetActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
      bt1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt1.setForeground(Color.RED);
    }
    else 
    {
    bt1.setForeground(Color.MAGENTA);
    }
    choose_a_Player();  
    WinningGame();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
         bt2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt2.setForeground(Color.RED);
    }
    else 
    {
    bt2.setForeground(Color.MAGENTA);
    }
    choose_a_Player();  
    WinningGame();
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
         bt3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt3.setForeground(Color.RED);
    }
    else 
    {
    bt3.setForeground(Color.MAGENTA);
    }
    choose_a_Player(); 
    WinningGame();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
         bt4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt4.setForeground(Color.RED);
    }
    else 
    {
    bt4.setForeground(Color.MAGENTA);
    }
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
         bt5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt5.setForeground(Color.RED);
    }
    else 
    {
    bt5.setForeground(Color.MAGENTA);
    }
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
         bt6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt6.setForeground(Color.RED);
    }
    else 
    {
    bt6.setForeground(Color.MAGENTA);
    }
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
         bt7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt7.setForeground(Color.RED);
    }
    else 
    {
    bt7.setForeground(Color.MAGENTA);
    }
    choose_a_Player(); 
    WinningGame();
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
         bt8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt8.setForeground(Color.RED);
    }
    else 
    {
    bt8.setForeground(Color.MAGENTA);
    }
    choose_a_Player(); 
    WinningGame();
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
         bt9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
    bt9.setForeground(Color.RED);
    }
    else 
    {
    bt9.setForeground(Color.MAGENTA);
    }
    choose_a_Player();
    WinningGame();
    }//GEN-LAST:event_bt9ActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Toe_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Toe_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Toe_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Toe_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Toe_Toe_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    // End of variables declaration//GEN-END:variables
}
