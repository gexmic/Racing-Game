/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingame;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author michael
 */
public class Race extends javax.swing.JFrame {

    /**
     * Creates new form Race
     */
    
    JLabel[] playerLabel = new JLabel[34];   
    protected int carRoll;
    
    public Race() {
        initComponents();       
        ImageIcon imgThisImg = new ImageIcon("car final java/redCar330.png");
       
        playerLabel[0] = lblPlayer0;
        playerLabel[1] = lblPlayer1;
        playerLabel[2] = lblPlayer2;
        playerLabel[3] = lblPlayer3;
        playerLabel[4] = lblPlayer4;
        playerLabel[5] = lblPlayer5;
        playerLabel[6] = lblPlayer6;
        playerLabel[7] = lblPlayer7;
        playerLabel[8] = lblPlayer8;
        playerLabel[9] = lblPlayer9;
        playerLabel[10] = lblPlayer10;
        playerLabel[11] = lblPlayer11;
        playerLabel[12] = lblPlayer12;
        playerLabel[13] = lblPlayer13;
        playerLabel[14] = lblPlayer14;
        playerLabel[15] = lblPlayer15;
        playerLabel[16] = lblPlayer16;
        playerLabel[17] = lblPlayer17;
        playerLabel[18] = lblPlayer18;
        playerLabel[19] = lblPlayer19;
        playerLabel[20] = lblPlayer20;
        playerLabel[21] = lblPlayer21;
        playerLabel[22] = lblPlayer22;
        playerLabel[23] = lblPlayer23;
        playerLabel[24] = lblPlayer24;
        playerLabel[25] = lblPlayer25;
        playerLabel[26] = lblPlayer26;
        playerLabel[27] = lblPlayer27;
        playerLabel[28] = lblPlayer28;
        playerLabel[29] = lblPlayer29;
        playerLabel[30] = lblPlayer30;
        playerLabel[31] = lblPlayer31;
        playerLabel[32] = lblPlayer32;
        playerLabel[33] = lblPlayer33;
        
        for(int i = 0 ; i <playerLabel.length;++i)
        {
            playerLabel[i].setVisible(false);
        }
        
        lblPlayer0.setIcon(imgThisImg);
        lblPlayer0.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlayer33b = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPlayer4 = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer5 = new javax.swing.JLabel();
        lblPlayer6 = new javax.swing.JLabel();
        lblPlayer8 = new javax.swing.JLabel();
        lblPlayer0 = new javax.swing.JLabel();
        lblPlayer10 = new javax.swing.JLabel();
        lblPlayer7 = new javax.swing.JLabel();
        lblPlayer11 = new javax.swing.JLabel();
        lblPlayer13 = new javax.swing.JLabel();
        lblPlayer9 = new javax.swing.JLabel();
        lblPlayer14 = new javax.swing.JLabel();
        lblPlayer15 = new javax.swing.JLabel();
        lblPlayer16 = new javax.swing.JLabel();
        lblPlayer17 = new javax.swing.JLabel();
        lblPlayer18 = new javax.swing.JLabel();
        lblPlayer19 = new javax.swing.JLabel();
        lblPlayer20 = new javax.swing.JLabel();
        lblPlayer12 = new javax.swing.JLabel();
        lblPlayer21 = new javax.swing.JLabel();
        lblPlayer22 = new javax.swing.JLabel();
        lblPlayer23 = new javax.swing.JLabel();
        lblPlayer24 = new javax.swing.JLabel();
        lblPlayer25 = new javax.swing.JLabel();
        lblPlayer26 = new javax.swing.JLabel();
        lblPlayer27 = new javax.swing.JLabel();
        lblPlayer28 = new javax.swing.JLabel();
        lblPlayer29 = new javax.swing.JLabel();
        lblPlayer30 = new javax.swing.JLabel();
        lblPlayer31 = new javax.swing.JLabel();
        lblPlayer32 = new javax.swing.JLabel();
        lblPlayer3 = new javax.swing.JLabel();
        lblPlayer33 = new javax.swing.JLabel();
        lblComp1 = new javax.swing.JLabel();
        lblComp2 = new javax.swing.JLabel();
        lblComp3 = new javax.swing.JLabel();
        lblComp4 = new javax.swing.JLabel();
        lblComp5 = new javax.swing.JLabel();
        lblComp6 = new javax.swing.JLabel();
        lblComp7 = new javax.swing.JLabel();
        lblComp8 = new javax.swing.JLabel();
        lblComp9 = new javax.swing.JLabel();
        lblComp10 = new javax.swing.JLabel();
        lblComp11 = new javax.swing.JLabel();
        lblComp12 = new javax.swing.JLabel();
        lblComp13 = new javax.swing.JLabel();
        lblComp14 = new javax.swing.JLabel();
        lblComp15 = new javax.swing.JLabel();
        lblComp16 = new javax.swing.JLabel();
        lblComp17 = new javax.swing.JLabel();
        lblComp18 = new javax.swing.JLabel();
        lblComp19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(lblPlayer33b);
        lblPlayer33b.setBounds(290, 510, 90, 0);

        jButton1.setText("Existing Player");
        getContentPane().add(jButton1);
        jButton1.setBounds(1290, 630, 130, 50);

        jButton2.setText("Roll to Go");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 290, 130, 50);

        jButton3.setText("New Player");
        getContentPane().add(jButton3);
        jButton3.setBounds(1290, 680, 130, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/Go_FAS_Racing.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 370, 410, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/checkeredFlag.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(980, 200, 340, 200);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/checkeredFlag.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 200, 350, 200);

        lblPlayer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar.png"))); // NOI18N
        getContentPane().add(lblPlayer4);
        lblPlayer4.setBounds(711, 666, 90, 30);

        lblPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar330.png"))); // NOI18N
        getContentPane().add(lblPlayer1);
        lblPlayer1.setBounds(450, 600, 80, 60);

        lblPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar345.png"))); // NOI18N
        getContentPane().add(lblPlayer2);
        lblPlayer2.setBounds(540, 650, 80, 50);

        lblPlayer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar.png"))); // NOI18N
        getContentPane().add(lblPlayer5);
        lblPlayer5.setBounds(800, 670, 90, 30);

        lblPlayer6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar22.png"))); // NOI18N
        getContentPane().add(lblPlayer6);
        lblPlayer6.setBounds(890, 650, 80, 50);

        lblPlayer8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar22.png"))); // NOI18N
        getContentPane().add(lblPlayer8);
        lblPlayer8.setBounds(1120, 520, 80, 55);

        lblPlayer0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar330.png"))); // NOI18N
        getContentPane().add(lblPlayer0);
        lblPlayer0.setBounds(360, 550, 90, 50);

        lblPlayer10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar45.png"))); // NOI18N
        getContentPane().add(lblPlayer10);
        lblPlayer10.setBounds(1290, 410, 70, 70);

        lblPlayer7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar22.png"))); // NOI18N
        getContentPane().add(lblPlayer7);
        lblPlayer7.setBounds(990, 600, 80, 60);

        lblPlayer11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar60.png"))); // NOI18N
        getContentPane().add(lblPlayer11);
        lblPlayer11.setBounds(1340, 340, 50, 80);

        lblPlayer13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar115.png"))); // NOI18N
        getContentPane().add(lblPlayer13);
        lblPlayer13.setBounds(1340, 170, 50, 80);

        lblPlayer9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar22.png"))); // NOI18N
        getContentPane().add(lblPlayer9);
        lblPlayer9.setBounds(1220, 460, 80, 60);

        lblPlayer14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar140.png"))); // NOI18N
        getContentPane().add(lblPlayer14);
        lblPlayer14.setBounds(1290, 120, 70, 60);

        lblPlayer15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar150.png"))); // NOI18N
        getContentPane().add(lblPlayer15);
        lblPlayer15.setBounds(1230, 90, 80, 60);

        lblPlayer16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer16);
        lblPlayer16.setBounds(1140, 90, 80, 40);

        lblPlayer17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer17);
        lblPlayer17.setBounds(1050, 90, 80, 40);

        lblPlayer18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer18);
        lblPlayer18.setBounds(950, 90, 100, 40);

        lblPlayer19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer19);
        lblPlayer19.setBounds(840, 90, 100, 40);

        lblPlayer20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer20);
        lblPlayer20.setBounds(740, 90, 80, 40);

        lblPlayer12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar90.png"))); // NOI18N
        getContentPane().add(lblPlayer12);
        lblPlayer12.setBounds(1350, 250, 40, 80);

        lblPlayer21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer21);
        lblPlayer21.setBounds(648, 96, 80, 30);

        lblPlayer22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer22);
        lblPlayer22.setBounds(550, 100, 90, 30);

        lblPlayer23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer23);
        lblPlayer23.setBounds(458, 96, 90, 40);

        lblPlayer24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer24);
        lblPlayer24.setBounds(368, 96, 90, 40);

        lblPlayer25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar180.png"))); // NOI18N
        getContentPane().add(lblPlayer25);
        lblPlayer25.setBounds(278, 100, 90, 30);

        lblPlayer26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar195.png"))); // NOI18N
        getContentPane().add(lblPlayer26);
        lblPlayer26.setBounds(198, 96, 80, 50);

        lblPlayer27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar220.png"))); // NOI18N
        getContentPane().add(lblPlayer27);
        lblPlayer27.setBounds(140, 130, 70, 60);

        lblPlayer28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar250.png"))); // NOI18N
        getContentPane().add(lblPlayer28);
        lblPlayer28.setBounds(120, 180, 50, 80);

        lblPlayer29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar270.png"))); // NOI18N
        getContentPane().add(lblPlayer29);
        lblPlayer29.setBounds(120, 256, 40, 90);

        lblPlayer30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar300.png"))); // NOI18N
        getContentPane().add(lblPlayer30);
        lblPlayer30.setBounds(120, 350, 50, 70);

        lblPlayer31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar315.png"))); // NOI18N
        getContentPane().add(lblPlayer31);
        lblPlayer31.setBounds(140, 410, 70, 70);

        lblPlayer32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar330.png"))); // NOI18N
        getContentPane().add(lblPlayer32);
        lblPlayer32.setBounds(210, 470, 80, 50);

        lblPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar.png"))); // NOI18N
        getContentPane().add(lblPlayer3);
        lblPlayer3.setBounds(620, 660, 80, 40);

        lblPlayer33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/redCar330.png"))); // NOI18N
        getContentPane().add(lblPlayer33);
        lblPlayer33.setBounds(290, 510, 80, 50);
        getContentPane().add(lblComp1);
        lblComp1.setBounds(520, 700, 100, 40);
        getContentPane().add(lblComp2);
        lblComp2.setBounds(610, 700, 100, 40);
        getContentPane().add(lblComp3);
        lblComp3.setBounds(710, 700, 90, 40);
        getContentPane().add(lblComp4);
        lblComp4.setBounds(800, 700, 90, 40);
        getContentPane().add(lblComp5);
        lblComp5.setBounds(900, 690, 90, 50);
        getContentPane().add(lblComp6);
        lblComp6.setBounds(1000, 630, 100, 60);
        getContentPane().add(lblComp7);
        lblComp7.setBounds(1140, 550, 100, 60);
        getContentPane().add(lblComp8);
        lblComp8.setBounds(1240, 500, 80, 60);
        getContentPane().add(lblComp9);
        lblComp9.setBounds(1320, 440, 70, 60);
        getContentPane().add(lblComp10);
        lblComp10.setBounds(1380, 350, 50, 80);
        getContentPane().add(lblComp11);
        lblComp11.setBounds(1390, 250, 40, 80);
        getContentPane().add(lblComp12);
        lblComp12.setBounds(1380, 160, 50, 80);
        getContentPane().add(lblComp13);
        lblComp13.setBounds(1310, 90, 80, 70);
        getContentPane().add(lblComp14);
        lblComp14.setBounds(420, 640, 100, 60);
        getContentPane().add(lblComp15);
        lblComp15.setBounds(1010, 140, 100, 50);
        getContentPane().add(lblComp16);
        lblComp16.setBounds(1230, 50, 90, 50);
        getContentPane().add(lblComp17);
        lblComp17.setBounds(1320, 90, 80, 70);
        getContentPane().add(lblComp18);
        lblComp18.setBounds(1320, 90, 80, 70);
        getContentPane().add(lblComp19);
        lblComp19.setBounds(1320, 90, 80, 70);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1250, 70, 41, 16);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1141, 50, 80, 40);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1051, 56, 80, 30);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(941, 56, 100, 30);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 50, 110, 40);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(738, 56, 90, 40);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(648, 56, 90, 40);

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(548, 56, 90, 40);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(458, 56, 90, 40);

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(368, 56, 90, 30);

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(278, 56, 90, 40);

        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(178, 66, 90, 40);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(110, 96, 80, 70);

        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(80, 166, 48, 90);

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(70, 256, 48, 90);

        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(80, 356, 48, 80);

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(108, 446, 80, 70);

        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(178, 496, 90, 60);

        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(270, 550, 70, 50);

        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(340, 590, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/racingame/media/raceTrack2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 1500, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int random = (int )(Math.random() * 6 + 1);
        carRoll += random;        
       for(int i = 0 ; i <playerLabel.length;++i)
        {
            if(i == carRoll)
            playerLabel[i].setVisible(true);
            else
               playerLabel[i].setVisible(false); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Race race = new Race();
                race.setVisible(true);                
              // race.setLocationRelativeTo(null);
               race.setSize(1525, 925);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblComp1;
    private javax.swing.JLabel lblComp10;
    private javax.swing.JLabel lblComp11;
    private javax.swing.JLabel lblComp12;
    private javax.swing.JLabel lblComp13;
    private javax.swing.JLabel lblComp14;
    private javax.swing.JLabel lblComp15;
    private javax.swing.JLabel lblComp16;
    private javax.swing.JLabel lblComp17;
    private javax.swing.JLabel lblComp18;
    private javax.swing.JLabel lblComp19;
    private javax.swing.JLabel lblComp2;
    private javax.swing.JLabel lblComp3;
    private javax.swing.JLabel lblComp4;
    private javax.swing.JLabel lblComp5;
    private javax.swing.JLabel lblComp6;
    private javax.swing.JLabel lblComp7;
    private javax.swing.JLabel lblComp8;
    private javax.swing.JLabel lblComp9;
    private javax.swing.JLabel lblPlayer0;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer10;
    private javax.swing.JLabel lblPlayer11;
    private javax.swing.JLabel lblPlayer12;
    private javax.swing.JLabel lblPlayer13;
    private javax.swing.JLabel lblPlayer14;
    private javax.swing.JLabel lblPlayer15;
    private javax.swing.JLabel lblPlayer16;
    private javax.swing.JLabel lblPlayer17;
    private javax.swing.JLabel lblPlayer18;
    private javax.swing.JLabel lblPlayer19;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblPlayer20;
    private javax.swing.JLabel lblPlayer21;
    private javax.swing.JLabel lblPlayer22;
    private javax.swing.JLabel lblPlayer23;
    private javax.swing.JLabel lblPlayer24;
    private javax.swing.JLabel lblPlayer25;
    private javax.swing.JLabel lblPlayer26;
    private javax.swing.JLabel lblPlayer27;
    private javax.swing.JLabel lblPlayer28;
    private javax.swing.JLabel lblPlayer29;
    private javax.swing.JLabel lblPlayer3;
    private javax.swing.JLabel lblPlayer30;
    private javax.swing.JLabel lblPlayer31;
    private javax.swing.JLabel lblPlayer32;
    private javax.swing.JLabel lblPlayer33;
    private javax.swing.JLabel lblPlayer33b;
    private javax.swing.JLabel lblPlayer4;
    private javax.swing.JLabel lblPlayer5;
    private javax.swing.JLabel lblPlayer6;
    private javax.swing.JLabel lblPlayer7;
    private javax.swing.JLabel lblPlayer8;
    private javax.swing.JLabel lblPlayer9;
    // End of variables declaration//GEN-END:variables
}
