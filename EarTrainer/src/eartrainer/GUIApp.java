package eartrainer;


/*

0-> Major second
1-> Major third
2-> Perfect fourth
3-> Perfect fifth
4-> Major six
5-> Major seven
6-> Octave

 */ //array mapping of notToPlay

/*
1-> Unison
2-> mjor 2
3-> major 3
4-> perfect 4
5-> perfect 5
6-> major 6
7-> major 7
8-> octave
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class GUIApp extends javax.swing.JFrame {

    private static Guitar g;
    private static File currentRunning1;
    private static File currentRunning2;
    private static int firstStringToPlay;
    private static int firstFretToPlay;
    private static int nextStringToPlay;
    private static int nextFretToPlay;
    private static boolean notToPlay[] = {false, false, false, false, false, false, false};
    private static boolean gotFunctionToPlay;
    private static boolean stringAndFretSet;
    private static Date date;
    private int functionToPlay;
    private int functionsToPlay;

    public GUIApp() {
        initComponents();
        functionsToPlay = 1;
        stringAndFretSet = false;
        gotFunctionToPlay = false;
        major2.setVisible(false);
        major3.setVisible(false);
        perfect4.setVisible(false);
        perfect5.setVisible(false);
        major6.setVisible(false);
        major7.setVisible(false);
        octave.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mSec = new javax.swing.JCheckBox();
        mThi = new javax.swing.JCheckBox();
        pFou = new javax.swing.JCheckBox();
        pFif = new javax.swing.JCheckBox();
        mSix = new javax.swing.JCheckBox();
        mSev = new javax.swing.JCheckBox();
        oct = new javax.swing.JCheckBox();
        rooteNote = new javax.swing.JLabel();
        major2 = new javax.swing.JLabel();
        major3 = new javax.swing.JLabel();
        perfect4 = new javax.swing.JLabel();
        perfect5 = new javax.swing.JLabel();
        major6 = new javax.swing.JLabel();
        major7 = new javax.swing.JLabel();
        octave = new javax.swing.JLabel();
        fretBoard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        questionsAmount = new javax.swing.JLabel();
        correctAnsAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ear Trainer");
        setMaximumSize(new java.awt.Dimension(571, 361));
        setMinimumSize(new java.awt.Dimension(569, 359));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Intervals to add");

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setOpaque(true);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(7, 1));

        mSec.setForeground(new java.awt.Color(102, 102, 255));
        mSec.setText("Major Second");
        mSec.setOpaque(false);
        mSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSecActionPerformed(evt);
            }
        });
        mSec.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mSecPropertyChange(evt);
            }
        });
        jPanel3.add(mSec);

        mThi.setForeground(new java.awt.Color(102, 102, 255));
        mThi.setText("Major Third");
        mThi.setOpaque(false);
        mThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mThiActionPerformed(evt);
            }
        });
        jPanel3.add(mThi);

        pFou.setForeground(new java.awt.Color(102, 102, 255));
        pFou.setText("Perfect Fourth");
        pFou.setOpaque(false);
        pFou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFouActionPerformed(evt);
            }
        });
        jPanel3.add(pFou);

        pFif.setBackground(new java.awt.Color(0, 0, 0));
        pFif.setForeground(new java.awt.Color(102, 102, 255));
        pFif.setText("Pefect Fifth");
        pFif.setOpaque(false);
        pFif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFifActionPerformed(evt);
            }
        });
        jPanel3.add(pFif);

        mSix.setForeground(new java.awt.Color(102, 102, 255));
        mSix.setText("Major Six");
        mSix.setOpaque(false);
        mSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSixActionPerformed(evt);
            }
        });
        jPanel3.add(mSix);

        mSev.setForeground(new java.awt.Color(102, 102, 255));
        mSev.setText("Major Seven");
        mSev.setOpaque(false);
        mSev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSevActionPerformed(evt);
            }
        });
        jPanel3.add(mSev);

        oct.setForeground(new java.awt.Color(102, 102, 255));
        oct.setText("Octave");
        oct.setOpaque(false);
        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });
        jPanel3.add(oct);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 30, 150, 290);

        rooteNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/RootKnob.png"))); // NOI18N
        jPanel1.add(rooteNote);
        rooteNote.setBounds(230, 140, 30, 30);

        major2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major2Knob.png"))); // NOI18N
        major2.setEnabled(false);
        jPanel1.add(major2);
        major2.setBounds(230, 250, 30, 30);

        major3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major3Knob.png"))); // NOI18N
        major3.setEnabled(false);
        jPanel1.add(major3);
        major3.setBounds(260, 80, 30, 30);

        perfect4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Perfect4Knob.png"))); // NOI18N
        perfect4.setEnabled(false);
        jPanel1.add(perfect4);
        perfect4.setBounds(260, 140, 30, 30);

        perfect5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Perfect5Knob.png"))); // NOI18N
        perfect5.setEnabled(false);
        jPanel1.add(perfect5);
        perfect5.setBounds(260, 250, 30, 30);

        major6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major6Knob.png"))); // NOI18N
        major6.setEnabled(false);
        jPanel1.add(major6);
        major6.setBounds(290, 80, 30, 30);

        major7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major7Knob.png"))); // NOI18N
        major7.setEnabled(false);
        jPanel1.add(major7);
        major7.setBounds(290, 140, 30, 30);

        octave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/OctaveKnob.png"))); // NOI18N
        octave.setEnabled(false);
        jPanel1.add(octave);
        octave.setBounds(290, 250, 30, 30);

        fretBoard.setIcon(new javax.swing.ImageIcon("C:\\HAA\\Ear trainer\\EarTrainer\\resources\\FretFinal.png")); // NOI18N
        jPanel1.add(fretBoard);
        fretBoard.setBounds(190, 10, 170, 320);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Questions:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 30, 70, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Correct:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 60, 70, 40);

        questionsAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        questionsAmount.setForeground(new java.awt.Color(204, 204, 255));
        questionsAmount.setText("0");
        jPanel1.add(questionsAmount);
        questionsAmount.setBounds(110, 40, 50, 20);

        correctAnsAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correctAnsAmount.setForeground(new java.awt.Color(204, 204, 255));
        correctAnsAmount.setText("0");
        jPanel1.add(correctAnsAmount);
        correctAnsAmount.setBounds(110, 70, 50, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\HAA\\Ear trainer\\EarTrainer\\resources\\wp101.jpg")); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 339);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 847, 339);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setOpaque(false);

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pFouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFouActionPerformed
        // TODO add your handling code here:
        if (pFou.isSelected()) {
            perfect4.setVisible(true);
            perfect4.setEnabled(true);
            notToPlay[2] = true;
        } else {
            perfect4.setVisible(false);
            perfect4.setEnabled(false);
            notToPlay[2] = false;
        }
    }//GEN-LAST:event_pFouActionPerformed

    private void mSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSecActionPerformed
        // TODO add your handling code here:
        if (mSec.isSelected()) {
            major2.setVisible(true);
            major2.setEnabled(true);
            notToPlay[0] = true;
            functionsToPlay++;
        } else {
            major2.setVisible(false);
            major2.setEnabled(false);
            notToPlay[0] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_mSecActionPerformed

    private void mThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mThiActionPerformed
        // TODO add your handling code here:
        if (mThi.isSelected()) {
            major3.setVisible(true);
            major3.setEnabled(true);
            notToPlay[1] = true;
            functionsToPlay++;
        } else {
            major3.setVisible(false);
            major3.setEnabled(false);
            notToPlay[1] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_mThiActionPerformed

    private void pFifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFifActionPerformed
        // TODO add your handling code here:
        if (pFif.isSelected()) {
            perfect5.setVisible(true);
            perfect5.setEnabled(true);
            notToPlay[3] = true;
            functionsToPlay++;
        } else {
            perfect5.setVisible(false);
            perfect5.setEnabled(false);
            notToPlay[3] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_pFifActionPerformed

    private void mSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSixActionPerformed
        // TODO add your handling code here:
        if (mSix.isSelected()) {
            major6.setVisible(true);
            major6.setEnabled(true);
            notToPlay[4] = true;
            functionsToPlay++;
        } else {
            major6.setVisible(false);
            major6.setEnabled(false);
            notToPlay[4] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_mSixActionPerformed

    private void mSevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSevActionPerformed
        // TODO add your handling code here:
        if (mSev.isSelected()) {
            major7.setVisible(true);
            major7.setEnabled(true);
            notToPlay[5] = true;
            functionsToPlay++;
        } else {
            major7.setVisible(false);
            major7.setEnabled(false);
            notToPlay[5] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_mSevActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
        // TODO add your handling code here:
        if (oct.isSelected()) {
            octave.setVisible(true);
            octave.setEnabled(true);
            notToPlay[6] = true;
            functionsToPlay++;
        } else {
            octave.setVisible(false);
            octave.setEnabled(false);
            notToPlay[6] = false;
            functionsToPlay--;
        }
    }//GEN-LAST:event_octActionPerformed

    private void mSecPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mSecPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_mSecPropertyChange

    public static void main() throws Exception {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    File f = new File("Sounds.dat");
                    g = new Guitar();

                    if (!f.exists()) {
                        ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream(f));
                        objout.writeObject(g);
                    }
                    Thread.sleep(3000);
                } catch (Exception e) {
                }

                new GUIApp().setVisible(true);
            }
        });
    }

    private void getFunctionToPlay() {
        int random;
        if (functionsToPlay == 1) {
            functionToPlay = 1;
        } else {
            while (gotFunctionToPlay == false) {
                random = (int) (Math.random() * 8 + 1);
                if (random == 1) {
                    functionToPlay = 1;
                } else {
                    for (int i = 0; i <= 6; i++) {
                        if (notToPlay[i] == true && i + 2 == random) {
                            functionToPlay = random;
                            gotFunctionToPlay = true;
                        }
                    }
                }
            }
        }
    }

    private void chooseStringAndFret() { //choose string and fret based on the funtion to play
        switch (functionToPlay) {
            case 1:
                setSandFforUnison();
                break;
            case 2:
                setSandFforM2();
                break;
            case 3:
                setSandFforM3();
                break;
            case 4:
                setSandFforP4();
                break;
            case 5:
                setSandFforP5();
                break;
            case 6:
                setSandFforM6();
                break;
            case 7:
                setSandFforM7();
                break;
            case 8:
                setSandFforO();
                break;

        }
    }

    private void setSandFforUnison() {
        int randomS, randomF;
        int nextS, nextF;
        randomS = (int) Math.random() * 5;
        randomF = (int) Math.random() * 13;
        firstStringToPlay = randomS;
        firstFretToPlay = randomF;
        nextStringToPlay = randomS;
        nextFretToPlay = randomF;
        stringAndFretSet = true;
    }

    private void setSandFforM2() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*13;
            if(randomF<=10) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS;
                nextFretToPlay = randomF+2;
                stringAndFretSet = true;                
            }
        }
    }

    private void setSandFforM3() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*13;
            if(randomS<=3&&randomF>=1) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+1;
                nextFretToPlay = randomF-1;
                stringAndFretSet = true;
            }
        }
    }

    private void setSandFforP4() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*13;
            if(randomS<=3) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+1;
                nextFretToPlay = randomF;
                stringAndFretSet = true;
            }
        }
    }

    private void setSandFforP5() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*13;
            if(randomS<=3&&randomF<=10) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+1;
                nextFretToPlay = randomF+2;
                stringAndFretSet = true;
            }
        }
    }

    private void setSandFforM6() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*14;
            if(randomS<=2&&randomF>=1) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+2;
                nextFretToPlay = randomF-1;
                stringAndFretSet = true;
            }
        }
    }

    private void setSandFforM7() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*14;
            if(randomS<=2&&randomF<=11) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+2;
                nextFretToPlay = randomF+1;
                stringAndFretSet = true;
            }
        }
    }

    private void setSandFforO() {
        int randomS, randomF;
        while (!stringAndFretSet) {
            randomS = (int)Math.random()*5;
            randomF = (int)Math.random()*14;
            if(randomS<=2&&randomF<=10) {
                firstStringToPlay = randomS;
                firstFretToPlay = randomF;
                nextStringToPlay = randomS+2;
                nextFretToPlay = randomF+2;
                stringAndFretSet = true;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctAnsAmount;
    private javax.swing.JLabel fretBoard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox mSec;
    private javax.swing.JCheckBox mSev;
    private javax.swing.JCheckBox mSix;
    private javax.swing.JCheckBox mThi;
    private javax.swing.JLabel major2;
    private javax.swing.JLabel major3;
    private javax.swing.JLabel major6;
    private javax.swing.JLabel major7;
    private javax.swing.JCheckBox oct;
    private javax.swing.JLabel octave;
    private javax.swing.JCheckBox pFif;
    private javax.swing.JCheckBox pFou;
    private javax.swing.JLabel perfect4;
    private javax.swing.JLabel perfect5;
    private javax.swing.JLabel questionsAmount;
    private javax.swing.JLabel rooteNote;
    // End of variables declaration//GEN-END:variables
}
