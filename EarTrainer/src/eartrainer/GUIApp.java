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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class GUIApp extends javax.swing.JFrame {

    protected static Guitar g;
    protected static byte[] note1Byte;
    protected static byte[] note2Byte;
    protected static File note1;
    protected static File note2;
    protected static int firstStringToPlay;
    protected static int firstFretToPlay;
    protected static int nextStringToPlay;
    protected static int nextFretToPlay;
    protected static boolean newQuestion;
    protected static boolean waitingForAnswer;
    protected static boolean stringAndFretSet;
    protected static int functionToPlay;
    protected static int functionsToPlay;
    protected static int playCounter;
    protected static int questionsCounter;
    protected static int answersCounter;
    protected static int answer;
    protected static int correctAnswer;
    protected static Worker functions[];

    public GUIApp() {
        initComponents();
        functions = new Worker[8];
        functions[0] = new SetSandFforUnison();
        functions[1] = new SetSandFforM2();
        functions[2] = new SetSandFforM3();
        functions[3] = new SetSandFforP4();
        functions[4] = new SetSandFforP5();
        functions[5] = new SetSandFforM6();
        functions[6] = new SetSandFforM7();
        functions[7] = new SetSandFforO();

        functionsToPlay = 1;
        playCounter = 1;
        newQuestion = true;
        stringAndFretSet = false;
        waitingForAnswer = false;
        questionsCounter = 0;
        answersCounter = 0;
        answer = 0;
        correctAnswer = 0;
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        a8.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        fretBoard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        questionsAmount = new javax.swing.JLabel();
        correctAnsAmount = new javax.swing.JLabel();
        statusDisplay = new javax.swing.JTextField();
        logDisplay = new javax.swing.JTextField();
        trybut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ear Trainer");
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

        check2.setForeground(new java.awt.Color(0, 153, 255));
        check2.setText("Major Second");
        check2.setOpaque(false);
        check2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check2ItemStateChanged(evt);
            }
        });
        jPanel3.add(check2);

        check3.setForeground(new java.awt.Color(0, 153, 255));
        check3.setText("Major Third");
        check3.setOpaque(false);
        check3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check3ItemStateChanged(evt);
            }
        });
        jPanel3.add(check3);

        check4.setForeground(new java.awt.Color(0, 153, 255));
        check4.setText("Perfect Fourth");
        check4.setOpaque(false);
        check4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check4ItemStateChanged(evt);
            }
        });
        jPanel3.add(check4);

        check5.setForeground(new java.awt.Color(0, 153, 255));
        check5.setText("Perfect Fifth");
        check5.setOpaque(false);
        check5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check5ItemStateChanged(evt);
            }
        });
        jPanel3.add(check5);

        check6.setForeground(new java.awt.Color(0, 153, 255));
        check6.setText("Major Six");
        check6.setOpaque(false);
        check6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check6ItemStateChanged(evt);
            }
        });
        jPanel3.add(check6);

        check7.setForeground(new java.awt.Color(0, 153, 255));
        check7.setText("Major Seven");
        check7.setOpaque(false);
        check7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check7ItemStateChanged(evt);
            }
        });
        jPanel3.add(check7);

        check8.setForeground(new java.awt.Color(0, 153, 255));
        check8.setText("Octave");
        check8.setOpaque(false);
        check8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check8ItemStateChanged(evt);
            }
        });
        jPanel3.add(check8);

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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 30, 150, 290);

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/RootKnob.png"))); // NOI18N
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });
        jPanel1.add(a1);
        a1.setBounds(230, 140, 30, 30);

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major2Knob.png"))); // NOI18N
        a2.setEnabled(false);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        jPanel1.add(a2);
        a2.setBounds(230, 250, 30, 30);

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major3Knob.png"))); // NOI18N
        a3.setEnabled(false);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        jPanel1.add(a3);
        a3.setBounds(260, 80, 30, 30);

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Perfect4Knob.png"))); // NOI18N
        a4.setEnabled(false);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a4MouseClicked(evt);
            }
        });
        jPanel1.add(a4);
        a4.setBounds(260, 140, 30, 30);

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Perfect5Knob.png"))); // NOI18N
        a5.setEnabled(false);
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a5MouseClicked(evt);
            }
        });
        jPanel1.add(a5);
        a5.setBounds(260, 250, 30, 30);

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major6Knob.png"))); // NOI18N
        a6.setEnabled(false);
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a6MouseClicked(evt);
            }
        });
        jPanel1.add(a6);
        a6.setBounds(290, 80, 30, 30);

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/Major7Knob.png"))); // NOI18N
        a7.setEnabled(false);
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a7MouseClicked(evt);
            }
        });
        jPanel1.add(a7);
        a7.setBounds(290, 140, 30, 30);

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eartrainer/KnobFolder/OctaveKnob.png"))); // NOI18N
        a8.setEnabled(false);
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a8MouseClicked(evt);
            }
        });
        jPanel1.add(a8);
        a8.setBounds(290, 250, 30, 30);

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

        statusDisplay.setForeground(new java.awt.Color(51, 255, 0));
        statusDisplay.setOpaque(false);
        jPanel1.add(statusDisplay);
        statusDisplay.setBounds(10, 140, 140, 40);

        logDisplay.setForeground(new java.awt.Color(0, 102, 255));
        logDisplay.setOpaque(false);
        jPanel1.add(logDisplay);
        logDisplay.setBounds(10, 180, 140, 110);

        trybut.setText("Play question");
        trybut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trybutMouseClicked(evt);
            }
        });
        jPanel1.add(trybut);
        trybut.setBounds(10, 110, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\HAA\\Ear trainer\\EarTrainer\\resources\\wp101.jpg")); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 339);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -1, 570, 350);

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

    private void trybutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trybutMouseClicked
        // TODO add your handling code here:

        if (newQuestion == true) {
            stringAndFretSet = false;
            setFunctionToPlay();
            logDisplay.setText(logDisplay.getText() + "\nNewQuestion initialized");
            chooseStringAndFret();
            saveByteArraysOfFileToPlay();
            newQuestion = false;
            playCounter = 1;
            questionsCounter++;
            waitingForAnswer = true;
            questionsAmount.setText("" + questionsCounter);
        }
        play();
    }//GEN-LAST:event_trybutMouseClicked

    private void check2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check2ItemStateChanged
        // TODO add your handling code here:
        if (check2.isSelected()) {
            functionsToPlay++;
            a2.setVisible(true);
            a2.setEnabled(true);
        } else {
            functionsToPlay--;
            a2.setVisible(false);
            a2.setEnabled(false);
            check3.setSelected(false);
        }
    }//GEN-LAST:event_check2ItemStateChanged

    private void check3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check3ItemStateChanged
        // TODO add your handling code here:
        if (check3.isSelected()) {
            functionsToPlay++;
            a3.setVisible(true);
            a3.setEnabled(true);
            check2.setSelected(true);
        } else {
            functionsToPlay--;
            a3.setVisible(false);
            a3.setEnabled(false);
            check4.setSelected(false);
        }
    }//GEN-LAST:event_check3ItemStateChanged

    private void check4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check4ItemStateChanged
        // TODO add your handling code here:
        if (check4.isSelected()) {
            functionsToPlay++;
            a4.setVisible(true);
            a4.setEnabled(true);
            check3.setSelected(true);
        } else {
            functionsToPlay--;
            a4.setVisible(false);
            a4.setEnabled(false);
            check5.setSelected(false);
        }
    }//GEN-LAST:event_check4ItemStateChanged

    private void check5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check5ItemStateChanged
        // TODO add your handling code here:
        if (check5.isSelected()) {
            functionsToPlay++;
            a5.setVisible(true);
            a5.setEnabled(true);
            check4.setSelected(true);
        } else {
            functionsToPlay--;
            a5.setVisible(false);
            a5.setEnabled(false);
            check6.setSelected(false);
        }
    }//GEN-LAST:event_check5ItemStateChanged

    private void check6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check6ItemStateChanged
        // TODO add your handling code here:
        if (check6.isSelected()) {
            functionsToPlay++;
            a6.setVisible(true);
            a6.setEnabled(true);
            check5.setSelected(true);
        } else {
            functionsToPlay--;
            a6.setVisible(false);
            a6.setEnabled(false);
            check7.setSelected(false);
        }
    }//GEN-LAST:event_check6ItemStateChanged

    private void check7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check7ItemStateChanged
        // TODO add your handling code here:
        if (check7.isSelected()) {
            functionsToPlay++;
            a7.setVisible(true);
            a7.setEnabled(true);
            check6.setSelected(true);
        } else {
            functionsToPlay--;
            a7.setVisible(false);
            a7.setEnabled(false);
            check8.setSelected(false);
        }
    }//GEN-LAST:event_check7ItemStateChanged

    private void check8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check8ItemStateChanged
        // TODO add your handling code here:
        if (check8.isSelected()) {
            functionsToPlay++;
            a8.setVisible(true);
            a8.setEnabled(true);
            check7.setSelected(true);
        } else {
            functionsToPlay--;
            a8.setVisible(false);
            a8.setEnabled(false);
        }
    }//GEN-LAST:event_check8ItemStateChanged

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 0;
            checkWin();
        }
    }//GEN-LAST:event_a1MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 1;
            checkWin();
        }
    }//GEN-LAST:event_a2MouseClicked

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 2;
            checkWin();
        }
    }//GEN-LAST:event_a3MouseClicked

    private void a4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 3;
            checkWin();
        }
    }//GEN-LAST:event_a4MouseClicked

    private void a5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 4;
            checkWin();
        }
    }//GEN-LAST:event_a5MouseClicked

    private void a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 5;
            checkWin();
        }
    }//GEN-LAST:event_a6MouseClicked

    private void a7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 6;
            checkWin();
        }
    }//GEN-LAST:event_a7MouseClicked

    private void a8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseClicked
        // TODO add your handling code here:
        if (waitingForAnswer) {
            waitingForAnswer = false;
            answer = 7;
            checkWin();
        }
    }//GEN-LAST:event_a8MouseClicked

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
            java.util.logging.Logger.getLogger(GUIApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    private void setFunctionToPlay() {
        int random;
        random = (int) (Math.random() * (double) functionsToPlay);
        functionToPlay = random;
        correctAnswer = functionToPlay;
    }

    private void chooseStringAndFret() { //choose string and fret based on the funtion to play
        functions[functionsToPlay].work();

    }

    class SetSandFforUnison implements Worker {

        public void work() {
            int randomS, randomF;
            randomS = (int) (Math.random() * 5);
            randomF = (int) (Math.random() * 13);
            firstStringToPlay = randomS;
            firstFretToPlay = randomF;
            nextStringToPlay = randomS;
            nextFretToPlay = randomF;
            stringAndFretSet = true;
        }
    }

    class SetSandFforM2 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 13);
                if (randomF <= 10) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS;
                    nextFretToPlay = randomF + 2;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforM3 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 13);
                if (randomS <= 3 && randomF >= 1) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 1;
                    nextFretToPlay = randomF - 1;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforP4 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 13);
                if (randomS <= 3) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 1;
                    nextFretToPlay = randomF;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforP5 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 13);
                if (randomS <= 3 && randomF <= 10) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 1;
                    nextFretToPlay = randomF + 2;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforM6 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 14);
                if (randomS <= 2 && randomF >= 1) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 2;
                    nextFretToPlay = randomF - 1;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforM7 implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 14);
                if (randomS <= 2 && randomF <= 11) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 2;
                    nextFretToPlay = randomF + 1;
                    stringAndFretSet = true;
                }
            }
        }
    }

    class SetSandFforO implements Worker {

        public void work() {
            int randomS, randomF;
            while (!stringAndFretSet) {
                randomS = (int) (Math.random() * 5);
                randomF = (int) (Math.random() * 14);
                if (randomS <= 2 && randomF <= 10) {
                    firstStringToPlay = randomS;
                    firstFretToPlay = randomF;
                    nextStringToPlay = randomS + 2;
                    nextFretToPlay = randomF + 2;
                    stringAndFretSet = true;
                }
            }
        }
    }

    private void saveByteArraysOfFileToPlay() {
        note1Byte = g.getByteArray(firstStringToPlay, firstFretToPlay);
        note2Byte = g.getByteArray(nextStringToPlay, nextFretToPlay);
        try {
            if (note1 != null && note1.exists()) {
                note1.delete();
            }
            if (note2 != null && note2.exists()) {
                note2.delete();
            }

            note1 = File.createTempFile("note1", ".wav");
            note1.deleteOnExit();
            note2 = File.createTempFile("note2", ".wav");
            note2.deleteOnExit();

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write(note1Byte, 0, note1Byte.length);
            out.writeTo(new FileOutputStream(note1));
            out.close();

            ByteArrayOutputStream out1 = new ByteArrayOutputStream();
            out1.write(note2Byte, 0, note2Byte.length);
            out1.writeTo(new FileOutputStream(note2));
            out1.close();
        } catch (IOException ex) {
            System.out.println("file writing error");
        }

    }

    private void play() {
        if (playCounter <= 5) {
            try {
                statusDisplay.setText("Counter: " + playCounter);
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(note1));
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();

                Thread.sleep(200);

                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(note2));
                clip.start();
                while (!clip.isRunning()) {
                    Thread.sleep(10);
                }
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }
                clip.close();

                playCounter++;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error reading files!");
            }
        }

    }

    private void checkWin() {
        newQuestion = true;
        logDisplay.setText(logDisplay.getText() + "\nanswer recieved");
        if (answer == correctAnswer) {
            answersCounter++;
            correctAnsAmount.setText("" + answersCounter);
            statusDisplay.setText("Correct Answer!!");
        } else {
            statusDisplay.setText("Wrong answer");
        }
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
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
    private javax.swing.JTextField logDisplay;
    private javax.swing.JLabel questionsAmount;
    private javax.swing.JTextField statusDisplay;
    private javax.swing.JButton trybut;
    // End of variables declaration//GEN-END:variables
}
