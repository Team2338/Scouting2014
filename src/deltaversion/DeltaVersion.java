package deltaversion;

/**
 * This scouting program was developed by
 * FRC Team 2338 Gear it Forward
 * and was created for the FRC 2014 game Aerial Assist.
 */


import deltaversion.Robot;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Patrick Ubelhor
 */
public class DeltaVersion extends javax.swing.JFrame {
    
    Robot robotOne = new Robot();
    Robot robotTwo = new Robot();
    Robot robotThree = new Robot();
    Robot robotFour = new Robot();
    Robot robotFive = new Robot();
    Robot robotSix = new Robot();
    PrintWriter writer;
    BufferedReader br;
    String matchSchedule = "MatchSchedule.csv";
    String exportFile = "RawData.csv";
    String csvSplitBy = ",";
    String line = "";
    boolean going;
    
    //Creates new form GammaVersion
    public DeltaVersion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        robotOnePanel = new javax.swing.JPanel();
        robotOneHighMissAutoLabel = new javax.swing.JLabel();
        robotOneHighSuccessAutoLabel = new javax.swing.JLabel();
        robotOneLowMissAutoLabel = new javax.swing.JLabel();
        robotOneLowSuccessAutoLabel = new javax.swing.JLabel();
        robotOneTrussMissLabel = new javax.swing.JLabel();
        robotOneTrussSuccessLabel = new javax.swing.JLabel();
        robotOneCatchSuccessLabel = new javax.swing.JLabel();
        robotOneMobilitySuccessLabel = new javax.swing.JLabel();
        robotOneGameModeLabel = new javax.swing.JLabel();
        robotOneMathStateLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        autonomousColumnLabel = new javax.swing.JLabel();
        teleopColumnLabel = new javax.swing.JLabel();
        robotOneHighMissTeleLabel = new javax.swing.JLabel();
        robotOneHighSuccessTeleLabel = new javax.swing.JLabel();
        robotOneLowMissTeleLabel = new javax.swing.JLabel();
        robotOneLowSuccessTeleLabel = new javax.swing.JLabel();
        robotOneIdentifierLabel = new javax.swing.JLabel();
        operatorPanel = new javax.swing.JPanel();
        matchNumTextField = new javax.swing.JTextField();
        robotOneNumTextField = new javax.swing.JTextField();
        robotTwoNumTextField = new javax.swing.JTextField();
        robotThreeNumTextField = new javax.swing.JTextField();
        robotFourNumTextField = new javax.swing.JTextField();
        robotFiveNumTextField = new javax.swing.JTextField();
        robotSixNumTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        matchNumLabel = new javax.swing.JLabel();
        blueAllianceLabel = new javax.swing.JLabel();
        redAllianceLabel = new javax.swing.JLabel();
        robotOneNumLabel = new javax.swing.JLabel();
        robotTwoNumLabel = new javax.swing.JLabel();
        robotThreeNumLabel = new javax.swing.JLabel();
        robotFourNumLabel = new javax.swing.JLabel();
        robotFiveNumLabel = new javax.swing.JLabel();
        robotSixNumLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        beginButton = new javax.swing.JButton();
        robotTwoPanel = new javax.swing.JPanel();
        robotTwoHighMissAutoLabel = new javax.swing.JLabel();
        robotTwoHighSuccessAutoLabel = new javax.swing.JLabel();
        robotTwoLowMissAutoLabel = new javax.swing.JLabel();
        robotTwoLowSuccessAutoLabel = new javax.swing.JLabel();
        robotTwoTrussMissLabel = new javax.swing.JLabel();
        robotTwoTrussSuccessLabel = new javax.swing.JLabel();
        robotTwoCatchSuccessLabel = new javax.swing.JLabel();
        robotTwoMobilitySuccessLabel = new javax.swing.JLabel();
        robotTwoGameModeLabel = new javax.swing.JLabel();
        robotTwoMathStateLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        autonomousColumnLabel1 = new javax.swing.JLabel();
        teleopColumnLabel1 = new javax.swing.JLabel();
        robotTwoHighMissTeleLabel = new javax.swing.JLabel();
        robotTwoHighSuccessTeleLabel = new javax.swing.JLabel();
        robotTwoLowMissTeleLabel = new javax.swing.JLabel();
        robotTwoLowSuccessTeleLabel = new javax.swing.JLabel();
        robotTwoIdentifierLabel = new javax.swing.JLabel();
        robotThreePanel = new javax.swing.JPanel();
        robotThreeHighMissAutoLabel = new javax.swing.JLabel();
        robotThreeHighSuccessAutoLabel = new javax.swing.JLabel();
        robotThreeLowMissAutoLabel = new javax.swing.JLabel();
        robotThreeLowSuccessAutoLabel = new javax.swing.JLabel();
        robotThreeTrussMissLabel = new javax.swing.JLabel();
        robotThreeTrussSuccessLabel = new javax.swing.JLabel();
        robotThreeCatchSuccessLabel = new javax.swing.JLabel();
        robotThreeMobilitySuccessLabel = new javax.swing.JLabel();
        robotThreeGameModeLabel = new javax.swing.JLabel();
        robotThreeMathStateLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        autonomousColumnLabel2 = new javax.swing.JLabel();
        teleopColumnLabel2 = new javax.swing.JLabel();
        robotThreeHighMissTeleLabel = new javax.swing.JLabel();
        robotThreeHighSuccessTeleLabel = new javax.swing.JLabel();
        robotThreeLowMissTeleLabel = new javax.swing.JLabel();
        robotThreeLowSuccessTeleLabel = new javax.swing.JLabel();
        robotThreeIdentifierLabel = new javax.swing.JLabel();
        robotFourPanel = new javax.swing.JPanel();
        robotFourHighMissAutoLabel = new javax.swing.JLabel();
        robotFourHighSuccessAutoLabel = new javax.swing.JLabel();
        robotFourLowMissAutoLabel = new javax.swing.JLabel();
        robotFourLowSuccessAutoLabel = new javax.swing.JLabel();
        robotFourTrussMissLabel = new javax.swing.JLabel();
        robotFourTrussSuccessLabel = new javax.swing.JLabel();
        robotFourCatchSuccessLabel = new javax.swing.JLabel();
        robotFourMobilitySuccessLabel = new javax.swing.JLabel();
        robotFourGameModeLabel = new javax.swing.JLabel();
        robotFourMathStateLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        autonomousColumnLabel3 = new javax.swing.JLabel();
        teleopColumnLabel3 = new javax.swing.JLabel();
        robotFourHighMissTeleLabel = new javax.swing.JLabel();
        robotFourHighSuccessTeleLabel = new javax.swing.JLabel();
        robotFourLowMissTeleLabel = new javax.swing.JLabel();
        robotFourLowSuccessTeleLabel = new javax.swing.JLabel();
        robotFourIdentifierLabel = new javax.swing.JLabel();
        robotFivePanel = new javax.swing.JPanel();
        robotFiveHighMissAutoLabel = new javax.swing.JLabel();
        robotFiveHighSuccessAutoLabel = new javax.swing.JLabel();
        robotFiveLowMissAutoLabel = new javax.swing.JLabel();
        robotFiveLowSuccessAutoLabel = new javax.swing.JLabel();
        robotFiveTrussMissLabel = new javax.swing.JLabel();
        robotFiveTrussSuccessLabel = new javax.swing.JLabel();
        robotFiveCatchSuccessLabel = new javax.swing.JLabel();
        robotFiveMobilitySuccessLabel = new javax.swing.JLabel();
        robotFiveGameModeLabel = new javax.swing.JLabel();
        robotFiveMathStateLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        autonomousColumnLabel4 = new javax.swing.JLabel();
        teleopColumnLabel4 = new javax.swing.JLabel();
        robotFiveHighMissTeleLabel = new javax.swing.JLabel();
        robotFiveHighSuccessTeleLabel = new javax.swing.JLabel();
        robotFiveLowMissTeleLabel = new javax.swing.JLabel();
        robotFiveLowSuccessTeleLabel = new javax.swing.JLabel();
        robotFiveIdentifierLabel = new javax.swing.JLabel();
        robotSixPanel = new javax.swing.JPanel();
        robotSixHighMissAutoLabel = new javax.swing.JLabel();
        robotSixHighSuccessAutoLabel = new javax.swing.JLabel();
        robotSixLowMissAutoLabel = new javax.swing.JLabel();
        robotSixLowSuccessAutoLabel = new javax.swing.JLabel();
        robotSixTrussMissLabel = new javax.swing.JLabel();
        robotSixTrussSuccessLabel = new javax.swing.JLabel();
        robotSixCatchSuccessLabel = new javax.swing.JLabel();
        robotSixMobilitySuccessLabel = new javax.swing.JLabel();
        robotSixGameModeLabel = new javax.swing.JLabel();
        robotSixMathStateLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        autonomousColumnLabel5 = new javax.swing.JLabel();
        teleopColumnLabel5 = new javax.swing.JLabel();
        robotSixHighMissTeleLabel = new javax.swing.JLabel();
        robotSixHighSuccessTeleLabel = new javax.swing.JLabel();
        robotSixLowMissTeleLabel = new javax.swing.JLabel();
        robotSixLowSuccessTeleLabel = new javax.swing.JLabel();
        robotSixIdentifierLabel = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scouting 2014");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        robotOnePanel.setBackground(new java.awt.Color(9, 29, 255));
        robotOnePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotOneHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneHighMissAutoLabel.setText("High Miss: 0");

        robotOneHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneHighSuccessAutoLabel.setText("High Success: 0");

        robotOneLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneLowMissAutoLabel.setText("Low Miss: 0");

        robotOneLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneLowSuccessAutoLabel.setText("Low Success: 0");

        robotOneTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneTrussMissLabel.setText("Truss Miss: 0");

        robotOneTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneTrussSuccessLabel.setText("Truss Success: 0");

        robotOneCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneCatchSuccessLabel.setText("Catch Success: 0");

        robotOneMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneMobilitySuccessLabel.setText("Mobility Success: 0");

        robotOneGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotOneGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneGameModeLabel.setText("Autonomous");

        robotOneMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotOneMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneMathStateLabel.setText("Adding");

        autonomousColumnLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel.setText("Autonomous");

        teleopColumnLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel.setText("Teleop");

        robotOneHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneHighMissTeleLabel.setText("High Miss: 0");

        robotOneHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneHighSuccessTeleLabel.setText("High Success: 0");

        robotOneLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneLowMissTeleLabel.setText("Low Miss: 0");

        robotOneLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotOneLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneLowSuccessTeleLabel.setText("Low Success: 0");

        robotOneIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotOneIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotOneIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotOnePanelLayout = new javax.swing.GroupLayout(robotOnePanel);
        robotOnePanel.setLayout(robotOnePanelLayout);
        robotOnePanelLayout.setHorizontalGroup(
            robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotOnePanelLayout.createSequentialGroup()
                        .addComponent(robotOneIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotOneGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotOneMathStateLabel))
                    .addGroup(robotOnePanelLayout.createSequentialGroup()
                        .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotOneHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel)
                            .addComponent(robotOneHighMissAutoLabel)
                            .addComponent(robotOneLowMissAutoLabel)
                            .addComponent(robotOneLowSuccessAutoLabel)
                            .addComponent(robotOneMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel)
                            .addComponent(robotOneHighMissTeleLabel)
                            .addComponent(robotOneHighSuccessTeleLabel)
                            .addComponent(robotOneLowMissTeleLabel)
                            .addComponent(robotOneLowSuccessTeleLabel)
                            .addComponent(robotOneTrussMissLabel)
                            .addComponent(robotOneTrussSuccessLabel)
                            .addComponent(robotOneCatchSuccessLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotOnePanelLayout.setVerticalGroup(
            robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotOneMathStateLabel)
                    .addComponent(robotOneIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel)
                    .addComponent(teleopColumnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneHighMissAutoLabel)
                    .addComponent(robotOneHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneHighSuccessAutoLabel)
                    .addComponent(robotOneHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneLowMissAutoLabel)
                    .addComponent(robotOneLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneLowSuccessAutoLabel)
                    .addComponent(robotOneLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneTrussMissLabel)
                    .addComponent(robotOneMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotOneTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotOneCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        operatorPanel.setBackground(new java.awt.Color(204, 204, 204));
        operatorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        operatorPanel.setForeground(new java.awt.Color(255, 255, 255));

        matchNumTextField.setText("0");
        matchNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchNumTextFieldActionPerformed(evt);
            }
        });

        robotOneNumTextField.setText("0000");
        robotOneNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotOneNumTextFieldActionPerformed(evt);
            }
        });

        robotTwoNumTextField.setText("0000");
        robotTwoNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotTwoNumTextFieldActionPerformed(evt);
            }
        });

        robotThreeNumTextField.setText("0000");
        robotThreeNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotThreeNumTextFieldActionPerformed(evt);
            }
        });

        robotFourNumTextField.setText("0000");
        robotFourNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotFourNumTextFieldActionPerformed(evt);
            }
        });

        robotFiveNumTextField.setText("0000");
        robotFiveNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotFiveNumTextFieldActionPerformed(evt);
            }
        });

        robotSixNumTextField.setText("0000");
        robotSixNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotSixNumTextFieldActionPerformed(evt);
            }
        });

        matchNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        matchNumLabel.setText("Match #");

        blueAllianceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        blueAllianceLabel.setText("Blue Alliance:");

        redAllianceLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        redAllianceLabel.setText("Red Alliance:");

        robotOneNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotOneNumLabel.setText("Team #");

        robotTwoNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotTwoNumLabel.setText("Team #");

        robotThreeNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotThreeNumLabel.setText("Team #");

        robotFourNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotFourNumLabel.setText("Team #");

        robotFiveNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotFiveNumLabel.setText("Team #");

        robotSixNumLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        robotSixNumLabel.setText("Team #");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        beginButton.setText("Begin");
        beginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginButtonActionPerformed(evt);
            }
        });
        beginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                beginButtonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout operatorPanelLayout = new javax.swing.GroupLayout(operatorPanel);
        operatorPanel.setLayout(operatorPanelLayout);
        operatorPanelLayout.setHorizontalGroup(
            operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operatorPanelLayout.createSequentialGroup()
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(operatorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(operatorPanelLayout.createSequentialGroup()
                                .addComponent(robotSixNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(robotSixNumLabel))
                            .addGroup(operatorPanelLayout.createSequentialGroup()
                                .addComponent(matchNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matchNumLabel))
                            .addComponent(blueAllianceLabel)
                            .addGroup(operatorPanelLayout.createSequentialGroup()
                                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(robotTwoNumTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(robotOneNumTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(robotThreeNumTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(robotThreeNumLabel)
                                    .addComponent(robotOneNumLabel)
                                    .addComponent(robotTwoNumLabel)))
                            .addComponent(redAllianceLabel)
                            .addGroup(operatorPanelLayout.createSequentialGroup()
                                .addComponent(robotFourNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(robotFourNumLabel))
                            .addGroup(operatorPanelLayout.createSequentialGroup()
                                .addComponent(robotFiveNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(robotFiveNumLabel)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operatorPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(beginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        operatorPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {beginButton, saveButton});

        operatorPanelLayout.setVerticalGroup(
            operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matchNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueAllianceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotOneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotOneNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotTwoNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotThreeNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redAllianceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotFourNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotFiveNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotSixNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(operatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        operatorPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {beginButton, saveButton});

        robotTwoPanel.setBackground(new java.awt.Color(9, 29, 255));
        robotTwoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotTwoHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoHighMissAutoLabel.setText("High Miss: 0");

        robotTwoHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoHighSuccessAutoLabel.setText("High Success: 0");

        robotTwoLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoLowMissAutoLabel.setText("Low Miss: 0");

        robotTwoLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoLowSuccessAutoLabel.setText("Low Success: 0");

        robotTwoTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoTrussMissLabel.setText("Truss Miss: 0");

        robotTwoTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoTrussSuccessLabel.setText("Truss Success: 0");

        robotTwoCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoCatchSuccessLabel.setText("Catch Success: 0");

        robotTwoMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoMobilitySuccessLabel.setText("Mobility Success: 0");

        robotTwoGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotTwoGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoGameModeLabel.setText("Autonomous");

        robotTwoMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotTwoMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoMathStateLabel.setText("Adding");

        autonomousColumnLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel1.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel1.setText("Autonomous");

        teleopColumnLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel1.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel1.setText("Teleop");

        robotTwoHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoHighMissTeleLabel.setText("High Miss: 0");

        robotTwoHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoHighSuccessTeleLabel.setText("High Success: 0");

        robotTwoLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoLowMissTeleLabel.setText("Low Miss: 0");

        robotTwoLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotTwoLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoLowSuccessTeleLabel.setText("Low Success: 0");

        robotTwoIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotTwoIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotTwoIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotTwoPanelLayout = new javax.swing.GroupLayout(robotTwoPanel);
        robotTwoPanel.setLayout(robotTwoPanelLayout);
        robotTwoPanelLayout.setHorizontalGroup(
            robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotTwoPanelLayout.createSequentialGroup()
                        .addComponent(robotTwoIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotTwoGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotTwoMathStateLabel))
                    .addGroup(robotTwoPanelLayout.createSequentialGroup()
                        .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotTwoHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel1)
                            .addComponent(robotTwoHighMissAutoLabel)
                            .addComponent(robotTwoLowMissAutoLabel)
                            .addComponent(robotTwoLowSuccessAutoLabel)
                            .addComponent(robotTwoMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel1)
                            .addComponent(robotTwoHighMissTeleLabel)
                            .addComponent(robotTwoHighSuccessTeleLabel)
                            .addComponent(robotTwoLowMissTeleLabel)
                            .addComponent(robotTwoLowSuccessTeleLabel)
                            .addComponent(robotTwoTrussMissLabel)
                            .addComponent(robotTwoTrussSuccessLabel)
                            .addComponent(robotTwoCatchSuccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotTwoPanelLayout.setVerticalGroup(
            robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotTwoMathStateLabel)
                    .addComponent(robotTwoIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel1)
                    .addComponent(teleopColumnLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoHighMissAutoLabel)
                    .addComponent(robotTwoHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoHighSuccessAutoLabel)
                    .addComponent(robotTwoHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoLowMissAutoLabel)
                    .addComponent(robotTwoLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoLowSuccessAutoLabel)
                    .addComponent(robotTwoLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotTwoTrussMissLabel)
                    .addComponent(robotTwoMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotTwoTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotTwoCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        robotThreePanel.setBackground(new java.awt.Color(9, 29, 255));
        robotThreePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotThreeHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeHighMissAutoLabel.setText("High Miss: 0");

        robotThreeHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeHighSuccessAutoLabel.setText("High Success: 0");

        robotThreeLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeLowMissAutoLabel.setText("Low Miss: 0");

        robotThreeLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeLowSuccessAutoLabel.setText("Low Success: 0");

        robotThreeTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeTrussMissLabel.setText("Truss Miss: 0");

        robotThreeTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeTrussSuccessLabel.setText("Truss Success: 0");

        robotThreeCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeCatchSuccessLabel.setText("Catch Success: 0");

        robotThreeMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeMobilitySuccessLabel.setText("Mobility Success: 0");

        robotThreeGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotThreeGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeGameModeLabel.setText("Autonomous");

        robotThreeMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotThreeMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeMathStateLabel.setText("Adding");

        autonomousColumnLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel2.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel2.setText("Autonomous");

        teleopColumnLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel2.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel2.setText("Teleop");

        robotThreeHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeHighMissTeleLabel.setText("High Miss: 0");

        robotThreeHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeHighSuccessTeleLabel.setText("High Success: 0");

        robotThreeLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeLowMissTeleLabel.setText("Low Miss: 0");

        robotThreeLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotThreeLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeLowSuccessTeleLabel.setText("Low Success: 0");

        robotThreeIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotThreeIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotThreeIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotThreePanelLayout = new javax.swing.GroupLayout(robotThreePanel);
        robotThreePanel.setLayout(robotThreePanelLayout);
        robotThreePanelLayout.setHorizontalGroup(
            robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotThreePanelLayout.createSequentialGroup()
                        .addComponent(robotThreeIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotThreeGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotThreeMathStateLabel))
                    .addGroup(robotThreePanelLayout.createSequentialGroup()
                        .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotThreeHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel2)
                            .addComponent(robotThreeHighMissAutoLabel)
                            .addComponent(robotThreeLowMissAutoLabel)
                            .addComponent(robotThreeLowSuccessAutoLabel)
                            .addComponent(robotThreeMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel2)
                            .addComponent(robotThreeHighMissTeleLabel)
                            .addComponent(robotThreeHighSuccessTeleLabel)
                            .addComponent(robotThreeLowMissTeleLabel)
                            .addComponent(robotThreeLowSuccessTeleLabel)
                            .addComponent(robotThreeTrussMissLabel)
                            .addComponent(robotThreeTrussSuccessLabel)
                            .addComponent(robotThreeCatchSuccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotThreePanelLayout.setVerticalGroup(
            robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotThreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotThreeMathStateLabel)
                    .addComponent(robotThreeIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel2)
                    .addComponent(teleopColumnLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeHighMissAutoLabel)
                    .addComponent(robotThreeHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeHighSuccessAutoLabel)
                    .addComponent(robotThreeHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeLowMissAutoLabel)
                    .addComponent(robotThreeLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeLowSuccessAutoLabel)
                    .addComponent(robotThreeLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotThreeTrussMissLabel)
                    .addComponent(robotThreeMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotThreeTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotThreeCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        robotFourPanel.setBackground(new java.awt.Color(255, 0, 51));
        robotFourPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotFourHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourHighMissAutoLabel.setText("High Miss: 0");

        robotFourHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourHighSuccessAutoLabel.setText("High Success: 0");

        robotFourLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourLowMissAutoLabel.setText("Low Miss: 0");

        robotFourLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourLowSuccessAutoLabel.setText("Low Success: 0");

        robotFourTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourTrussMissLabel.setText("Truss Miss: 0");

        robotFourTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourTrussSuccessLabel.setText("Truss Success: 0");

        robotFourCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourCatchSuccessLabel.setText("Catch Success: 0");

        robotFourMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourMobilitySuccessLabel.setText("Mobility Success: 0");

        robotFourGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFourGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourGameModeLabel.setText("Autonomous");

        robotFourMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFourMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourMathStateLabel.setText("Adding");

        autonomousColumnLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel3.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel3.setText("Autonomous");

        teleopColumnLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel3.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel3.setText("Teleop");

        robotFourHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourHighMissTeleLabel.setText("High Miss: 0");

        robotFourHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourHighSuccessTeleLabel.setText("High Success: 0");

        robotFourLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourLowMissTeleLabel.setText("Low Miss: 0");

        robotFourLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFourLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourLowSuccessTeleLabel.setText("Low Success: 0");

        robotFourIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFourIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFourIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotFourPanelLayout = new javax.swing.GroupLayout(robotFourPanel);
        robotFourPanel.setLayout(robotFourPanelLayout);
        robotFourPanelLayout.setHorizontalGroup(
            robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotFourPanelLayout.createSequentialGroup()
                        .addComponent(robotFourIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotFourGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotFourMathStateLabel))
                    .addGroup(robotFourPanelLayout.createSequentialGroup()
                        .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotFourHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel3)
                            .addComponent(robotFourHighMissAutoLabel)
                            .addComponent(robotFourLowMissAutoLabel)
                            .addComponent(robotFourLowSuccessAutoLabel)
                            .addComponent(robotFourMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel3)
                            .addComponent(robotFourHighMissTeleLabel)
                            .addComponent(robotFourHighSuccessTeleLabel)
                            .addComponent(robotFourLowMissTeleLabel)
                            .addComponent(robotFourLowSuccessTeleLabel)
                            .addComponent(robotFourTrussMissLabel)
                            .addComponent(robotFourTrussSuccessLabel)
                            .addComponent(robotFourCatchSuccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotFourPanelLayout.setVerticalGroup(
            robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotFourMathStateLabel)
                    .addComponent(robotFourIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel3)
                    .addComponent(teleopColumnLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourHighMissAutoLabel)
                    .addComponent(robotFourHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourHighSuccessAutoLabel)
                    .addComponent(robotFourHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourLowMissAutoLabel)
                    .addComponent(robotFourLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourLowSuccessAutoLabel)
                    .addComponent(robotFourLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFourTrussMissLabel)
                    .addComponent(robotFourMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotFourTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotFourCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        robotFivePanel.setBackground(new java.awt.Color(255, 0, 51));
        robotFivePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotFiveHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveHighMissAutoLabel.setText("High Miss: 0");

        robotFiveHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveHighSuccessAutoLabel.setText("High Success: 0");

        robotFiveLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveLowMissAutoLabel.setText("Low Miss: 0");

        robotFiveLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveLowSuccessAutoLabel.setText("Low Success: 0");

        robotFiveTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveTrussMissLabel.setText("Truss Miss: 0");

        robotFiveTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveTrussSuccessLabel.setText("Truss Success: 0");

        robotFiveCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveCatchSuccessLabel.setText("Catch Success: 0");

        robotFiveMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveMobilitySuccessLabel.setText("Mobility Success: 0");

        robotFiveGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFiveGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveGameModeLabel.setText("Autonomous");

        robotFiveMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFiveMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveMathStateLabel.setText("Adding");

        autonomousColumnLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel4.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel4.setText("Autonomous");

        teleopColumnLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel4.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel4.setText("Teleop");

        robotFiveHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveHighMissTeleLabel.setText("High Miss: 0");

        robotFiveHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveHighSuccessTeleLabel.setText("High Success: 0");

        robotFiveLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveLowMissTeleLabel.setText("Low Miss: 0");

        robotFiveLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotFiveLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveLowSuccessTeleLabel.setText("Low Success: 0");

        robotFiveIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotFiveIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotFiveIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotFivePanelLayout = new javax.swing.GroupLayout(robotFivePanel);
        robotFivePanel.setLayout(robotFivePanelLayout);
        robotFivePanelLayout.setHorizontalGroup(
            robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotFivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotFivePanelLayout.createSequentialGroup()
                        .addComponent(robotFiveIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotFiveGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotFiveMathStateLabel))
                    .addGroup(robotFivePanelLayout.createSequentialGroup()
                        .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotFiveHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel4)
                            .addComponent(robotFiveHighMissAutoLabel)
                            .addComponent(robotFiveLowMissAutoLabel)
                            .addComponent(robotFiveLowSuccessAutoLabel)
                            .addComponent(robotFiveMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel4)
                            .addComponent(robotFiveHighMissTeleLabel)
                            .addComponent(robotFiveHighSuccessTeleLabel)
                            .addComponent(robotFiveLowMissTeleLabel)
                            .addComponent(robotFiveLowSuccessTeleLabel)
                            .addComponent(robotFiveTrussMissLabel)
                            .addComponent(robotFiveTrussSuccessLabel)
                            .addComponent(robotFiveCatchSuccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotFivePanelLayout.setVerticalGroup(
            robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotFivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotFiveMathStateLabel)
                    .addComponent(robotFiveIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel4)
                    .addComponent(teleopColumnLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveHighMissAutoLabel)
                    .addComponent(robotFiveHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveHighSuccessAutoLabel)
                    .addComponent(robotFiveHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveLowMissAutoLabel)
                    .addComponent(robotFiveLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveLowSuccessAutoLabel)
                    .addComponent(robotFiveLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotFivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotFiveTrussMissLabel)
                    .addComponent(robotFiveMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotFiveTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotFiveCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        robotSixPanel.setBackground(new java.awt.Color(255, 0, 51));
        robotSixPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        robotSixHighMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixHighMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixHighMissAutoLabel.setText("High Miss: 0");

        robotSixHighSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixHighSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixHighSuccessAutoLabel.setText("High Success: 0");

        robotSixLowMissAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixLowMissAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixLowMissAutoLabel.setText("Low Miss: 0");

        robotSixLowSuccessAutoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixLowSuccessAutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixLowSuccessAutoLabel.setText("Low Success: 0");

        robotSixTrussMissLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixTrussMissLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixTrussMissLabel.setText("Truss Miss: 0");

        robotSixTrussSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixTrussSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixTrussSuccessLabel.setText("Truss Success: 0");

        robotSixCatchSuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixCatchSuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixCatchSuccessLabel.setText("Catch Success: 0");

        robotSixMobilitySuccessLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixMobilitySuccessLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixMobilitySuccessLabel.setText("Mobility Success: 0");

        robotSixGameModeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotSixGameModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixGameModeLabel.setText("Autonomous");

        robotSixMathStateLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotSixMathStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixMathStateLabel.setText("Adding ");

        autonomousColumnLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        autonomousColumnLabel5.setForeground(new java.awt.Color(255, 255, 255));
        autonomousColumnLabel5.setText("Autonomous");

        teleopColumnLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        teleopColumnLabel5.setForeground(new java.awt.Color(255, 255, 255));
        teleopColumnLabel5.setText("Teleop");

        robotSixHighMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixHighMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixHighMissTeleLabel.setText("High Miss: 0");

        robotSixHighSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixHighSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixHighSuccessTeleLabel.setText("High Success: 0");

        robotSixLowMissTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixLowMissTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixLowMissTeleLabel.setText("Low Miss: 0");

        robotSixLowSuccessTeleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        robotSixLowSuccessTeleLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixLowSuccessTeleLabel.setText("Low Success: 0");

        robotSixIdentifierLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        robotSixIdentifierLabel.setForeground(new java.awt.Color(255, 255, 255));
        robotSixIdentifierLabel.setText("#0000");

        javax.swing.GroupLayout robotSixPanelLayout = new javax.swing.GroupLayout(robotSixPanel);
        robotSixPanel.setLayout(robotSixPanelLayout);
        robotSixPanelLayout.setHorizontalGroup(
            robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotSixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotSixPanelLayout.createSequentialGroup()
                        .addComponent(robotSixIdentifierLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotSixGameModeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(robotSixMathStateLabel))
                    .addGroup(robotSixPanelLayout.createSequentialGroup()
                        .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotSixHighSuccessAutoLabel)
                            .addComponent(autonomousColumnLabel5)
                            .addComponent(robotSixHighMissAutoLabel)
                            .addComponent(robotSixLowMissAutoLabel)
                            .addComponent(robotSixLowSuccessAutoLabel)
                            .addComponent(robotSixMobilitySuccessLabel))
                        .addGap(18, 18, 18)
                        .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleopColumnLabel5)
                            .addComponent(robotSixHighMissTeleLabel)
                            .addComponent(robotSixHighSuccessTeleLabel)
                            .addComponent(robotSixLowMissTeleLabel)
                            .addComponent(robotSixLowSuccessTeleLabel)
                            .addComponent(robotSixTrussMissLabel)
                            .addComponent(robotSixTrussSuccessLabel)
                            .addComponent(robotSixCatchSuccessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        robotSixPanelLayout.setVerticalGroup(
            robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotSixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixGameModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotSixMathStateLabel)
                    .addComponent(robotSixIdentifierLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonomousColumnLabel5)
                    .addComponent(teleopColumnLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixHighMissAutoLabel)
                    .addComponent(robotSixHighMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixHighSuccessAutoLabel)
                    .addComponent(robotSixHighSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixLowMissAutoLabel)
                    .addComponent(robotSixLowMissTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixLowSuccessAutoLabel)
                    .addComponent(robotSixLowSuccessTeleLabel))
                .addGap(18, 18, 18)
                .addGroup(robotSixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotSixTrussMissLabel)
                    .addComponent(robotSixMobilitySuccessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotSixTrussSuccessLabel)
                .addGap(18, 18, 18)
                .addComponent(robotSixCatchSuccessLabel)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(operatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(robotFourPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(robotOnePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(robotFivePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotTwoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(robotThreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(robotSixPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(operatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(robotTwoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(robotThreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(robotSixPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(robotFivePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(robotFourPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void robotOneNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotOneNumTextFieldActionPerformed
        robotOne.setTeamNumber(robotOneNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotOneNumTextFieldActionPerformed

    private void matchNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchNumTextFieldActionPerformed
        matchNumLabel.setText("Match #" + matchNumTextField.getText());
        robotOne.setMatchNumber(matchNumTextField.getText());
        robotTwo.setMatchNumber(matchNumTextField.getText());
        robotThree.setMatchNumber(matchNumTextField.getText());
        robotFour.setMatchNumber(matchNumTextField.getText());
        robotFive.setMatchNumber(matchNumTextField.getText());
        robotSix.setMatchNumber(matchNumTextField.getText());
        
        try {
            br = new BufferedReader(new FileReader(matchSchedule));
            going = true;
            while ((line = br.readLine()) != null && going) {
                String[] number = line.split(csvSplitBy);
                robotOne.setTeamNumber(number[1]);
                robotTwo.setTeamNumber(number[2]);
                robotThree.setTeamNumber(number[3]);
                robotFour.setTeamNumber(number[4]);
                robotFive.setTeamNumber(number[5]);
                robotSix.setTeamNumber(number[6]);
                if (number[0].equals(matchNumTextField.getText())) {
                    going = false;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        robotOneNumTextField.setText(robotOne.getTeamNumber());
        robotTwoNumTextField.setText(robotTwo.getTeamNumber());
        robotThreeNumTextField.setText(robotThree.getTeamNumber());
        robotFourNumTextField.setText(robotFour.getTeamNumber());
        robotFiveNumTextField.setText(robotFive.getTeamNumber());
        robotSixNumTextField.setText(robotSix.getTeamNumber());
        setLabels();
    }//GEN-LAST:event_matchNumTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        robotOne.exportData(exportFile);
        robotTwo.exportData(exportFile);
        robotThree.exportData(exportFile);
        robotFour.exportData(exportFile);
        robotFive.exportData(exportFile);
        robotSix.exportData(exportFile);
        
        robotOne.resetData();
        robotTwo.resetData();
        robotThree.resetData();
        robotFour.resetData();
        robotFive.resetData();
        robotSix.resetData();
        
        matchNumTextField.setText("0");
        matchNumLabel.setText("Match #");
        
        robotOneNumTextField.setText("0000");
        robotOneNumLabel.setText("Team #");
        robotOneIdentifierLabel.setText("#0000");
        robotOneGameModeLabel.setText("Autonomous");
        robotOneMathStateLabel.setText("Adding");
        robotOneHighMissAutoLabel.setText("High Miss: 0");
        robotOneHighSuccessAutoLabel.setText("High Success: 0");
        robotOneLowMissAutoLabel.setText("Low Miss: 0");
        robotOneLowSuccessAutoLabel.setText("Low Success: 0");
        robotOneHighMissTeleLabel.setText("High Miss: 0");
        robotOneHighSuccessTeleLabel.setText("High Success: 0");
        robotOneLowMissTeleLabel.setText("Low Miss: 0");
        robotOneLowSuccessTeleLabel.setText("Low Success: 0");
        robotOneTrussMissLabel.setText("Truss Miss: 0");
        robotOneTrussSuccessLabel.setText("Truss Success: 0");
        robotOneCatchSuccessLabel.setText("Catch Success: 0");
        robotOneMobilitySuccessLabel.setText("Mobility Success: 0");
        
        robotTwoNumTextField.setText("0000");
        robotTwoNumLabel.setText("Team #");
        robotTwoIdentifierLabel.setText("#0000");
        robotTwoGameModeLabel.setText("Autonomous");
        robotTwoMathStateLabel.setText("Adding");
        robotTwoHighMissAutoLabel.setText("High Miss: 0");
        robotTwoHighSuccessAutoLabel.setText("High Success: 0");
        robotTwoLowMissAutoLabel.setText("Low Miss: 0");
        robotTwoLowSuccessAutoLabel.setText("Low Success: 0");
        robotTwoHighMissTeleLabel.setText("High Miss: 0");
        robotTwoHighSuccessTeleLabel.setText("High Success: 0");
        robotTwoLowMissTeleLabel.setText("Low Miss: 0");
        robotTwoLowSuccessTeleLabel.setText("Low Success: 0");
        robotTwoTrussMissLabel.setText("Truss Miss: 0");
        robotTwoTrussSuccessLabel.setText("Truss Success: 0");
        robotTwoCatchSuccessLabel.setText("Catch Success: 0");
        robotTwoMobilitySuccessLabel.setText("Mobility Success: 0");
        
        robotThreeNumTextField.setText("0000");
        robotThreeNumLabel.setText("Team #");
        robotThreeIdentifierLabel.setText("#0000");
        robotThreeGameModeLabel.setText("Autonomous");
        robotThreeMathStateLabel.setText("Adding");
        robotThreeHighMissAutoLabel.setText("High Miss: 0");
        robotThreeHighSuccessAutoLabel.setText("High Success: 0");
        robotThreeLowMissAutoLabel.setText("Low Miss: 0");
        robotThreeLowSuccessAutoLabel.setText("Low Success: 0");
        robotThreeHighMissTeleLabel.setText("High Miss: 0");
        robotThreeHighSuccessTeleLabel.setText("High Success: 0");
        robotThreeLowMissTeleLabel.setText("Low Miss: 0");
        robotThreeLowSuccessTeleLabel.setText("Low Success: 0");
        robotThreeTrussMissLabel.setText("Truss Miss: 0");
        robotThreeTrussSuccessLabel.setText("Truss Success: 0");
        robotThreeCatchSuccessLabel.setText("Catch Success: 0");
        robotThreeMobilitySuccessLabel.setText("Mobility Success: 0");
        
        robotFourNumTextField.setText("0000");
        robotFourNumLabel.setText("Team #");
        robotFourIdentifierLabel.setText("#0000");
        robotFourGameModeLabel.setText("Autonomous");
        robotFourMathStateLabel.setText("Adding");
        robotFourHighMissAutoLabel.setText("High Miss: 0");
        robotFourHighSuccessAutoLabel.setText("High Success: 0");
        robotFourLowMissAutoLabel.setText("Low Miss: 0");
        robotFourLowSuccessAutoLabel.setText("Low Success: 0");
        robotFourHighMissTeleLabel.setText("High Miss: 0");
        robotFourHighSuccessTeleLabel.setText("High Success: 0");
        robotFourLowMissTeleLabel.setText("Low Miss: 0");
        robotFourLowSuccessTeleLabel.setText("Low Success: 0");
        robotFourTrussMissLabel.setText("Truss Miss: 0");
        robotFourTrussSuccessLabel.setText("Truss Success: 0");
        robotFourCatchSuccessLabel.setText("Catch Success: 0");
        robotFourMobilitySuccessLabel.setText("Mobility Success: 0");
        
        robotFiveNumTextField.setText("0000");
        robotFiveNumLabel.setText("Team #");
        robotFiveIdentifierLabel.setText("#0000");
        robotFiveGameModeLabel.setText("Autonomous");
        robotFiveMathStateLabel.setText("Adding");
        robotFiveHighMissAutoLabel.setText("High Miss: 0");
        robotFiveHighSuccessAutoLabel.setText("High Success: 0");
        robotFiveLowMissAutoLabel.setText("Low Miss: 0");
        robotFiveLowSuccessAutoLabel.setText("Low Success: 0");
        robotFiveHighMissTeleLabel.setText("High Miss: 0");
        robotFiveHighSuccessTeleLabel.setText("High Success: 0");
        robotFiveLowMissTeleLabel.setText("Low Miss: 0");
        robotFiveLowSuccessTeleLabel.setText("Low Success: 0");
        robotFiveTrussMissLabel.setText("Truss Miss: 0");
        robotFiveTrussSuccessLabel.setText("Truss Success: 0");
        robotFiveCatchSuccessLabel.setText("Catch Success: 0");
        robotFiveMobilitySuccessLabel.setText("Mobility Success: 0");
        
        robotSixNumTextField.setText("0000");
        robotSixNumLabel.setText("Team #");
        robotSixIdentifierLabel.setText("#0000");
        robotSixGameModeLabel.setText("Autonomous");
        robotSixMathStateLabel.setText("Adding");
        robotSixHighMissAutoLabel.setText("High Miss: 0");
        robotSixHighSuccessAutoLabel.setText("High Success: 0");
        robotSixLowMissAutoLabel.setText("Low Miss: 0");
        robotSixLowSuccessAutoLabel.setText("Low Success: 0");
        robotSixHighMissTeleLabel.setText("High Miss: 0");
        robotSixHighSuccessTeleLabel.setText("High Success: 0");
        robotSixLowMissTeleLabel.setText("Low Miss: 0");
        robotSixLowSuccessTeleLabel.setText("Low Success: 0");
        robotSixTrussMissLabel.setText("Truss Miss: 0");
        robotSixTrussSuccessLabel.setText("Truss Success: 0");
        robotSixCatchSuccessLabel.setText("Catch Success: 0");
        robotSixMobilitySuccessLabel.setText("Mobility Success: 0");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void beginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginButtonActionPerformed
        beginButton.requestFocus();
    }//GEN-LAST:event_beginButtonActionPerformed

    private void beginButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beginButtonKeyReleased
        switch (evt.getKeyCode()) {
            
            //Gamemode
            // <editor-fold defaultstate="collapsed" desc="Gamemode"> 
            case 49 :
                robotOne.changeGameMode();
                if (robotOne.getGameMode())
                    { robotOneGameModeLabel.setText("Autonomous"); }
                else
                    { robotOneGameModeLabel.setText("Teleop"); }
                break;
                
            case 50 :
                robotTwo.changeGameMode();
                if (robotTwo.getGameMode()) {
                    robotTwoGameModeLabel.setText("Autonomous"); }
                else {
                    robotTwoGameModeLabel.setText("Teleop"); }
                break;
                
            case 51 :
                robotThree.changeGameMode();
                if (robotThree.getGameMode()) {
                    robotThreeGameModeLabel.setText("Autonomous"); }
                else {
                    robotThreeGameModeLabel.setText("Teleop"); }
                break;
                
            case 52 :
                robotFour.changeGameMode();
                if (robotFour.getGameMode()) {
                    robotFourGameModeLabel.setText("Autonomous"); }
                else {
                    robotFourGameModeLabel.setText("Teleop"); }
                break;
                
            case 53 :
                robotFive.changeGameMode();
                if (robotFive.getGameMode()) {
                    robotFiveGameModeLabel.setText("Autonomous"); }
                else {
                    robotFiveGameModeLabel.setText("Teleop"); }
                break;
                
            case 54 :
                robotSix.changeGameMode();
                if (robotSix.getGameMode()) {
                    robotSixGameModeLabel.setText("Autonomous"); }
                else {
                    robotSixGameModeLabel.setText("Teleop"); }
                break;
            // </editor-fold>
                
            //Math function
            // <editor-fold defaultstate="collapsed" desc="Math Function">
            case 55 :
                robotOne.changeMathMode();
                if (robotOne.getMathMode()) {
                    robotOneMathStateLabel.setText("Adding"); }
                else {
                    robotOneMathStateLabel.setText("Subtracting"); }
                break;
                
            case 56 :
                robotTwo.changeMathMode();
                if (robotTwo.getMathMode()) {
                    robotTwoMathStateLabel.setText("Adding"); }
                else {
                    robotTwoMathStateLabel.setText("Subtracting"); }
                break;
                    
            case 57 :
                robotThree.changeMathMode();
                if (robotThree.getMathMode()) {
                    robotThreeMathStateLabel.setText("Adding"); }
                else {
                    robotThreeMathStateLabel.setText("Subtracting"); }
                break;
                
            case 48 :
                robotFour.changeMathMode();
                if (robotFour.getMathMode()) {
                    robotFourMathStateLabel.setText("Adding"); }
                else {
                    robotFourMathStateLabel.setText("Subtracting"); }
                break;
                
            case 45 :
                robotFive.changeMathMode();
                if (robotFive.getMathMode()) {
                    robotFiveMathStateLabel.setText("Adding"); }
                else {
                    robotFiveMathStateLabel.setText("Subtracting"); }
                break;
                
            case 61 :
                robotSix.changeMathMode();
                if (robotSix.getMathMode()) {
                    robotSixMathStateLabel.setText("Adding"); }
                else {
                    robotSixMathStateLabel.setText("Subtracting"); }
                break;
            // </editor-fold>
                
            //High goal failure
            // <editor-fold defaultstate="collapsed" desc="High Goal Failure">
            case 8 :
                robotOne.setValue("highFailure");
                robotOneHighMissAutoLabel.setText("High Miss: " + robotOne.getValue("highFailureAuto"));
                robotOneHighMissTeleLabel.setText("High Miss: " + robotOne.getValue("highFailureTele"));
                break;
                
            case 81 :
                robotTwo.setValue("highFailure");
                robotTwoHighMissAutoLabel.setText("High Miss: " + robotTwo.getValue("highFailureAuto"));
                robotTwoHighMissTeleLabel.setText("High Miss: " + robotTwo.getValue("highFailureTele"));
                break;
                
            case 87 :
                robotThree.setValue("highFailure");
                robotThreeHighMissAutoLabel.setText("High Miss: " + robotThree.getValue("highFailureAuto"));
                robotThreeHighMissTeleLabel.setText("High Miss: " + robotThree.getValue("highFailureTele"));
                break;
                
            case 69 :
                robotFour.setValue("highFailure");
                robotFourHighMissAutoLabel.setText("High Miss: " + robotFour.getValue("highFailureAuto"));
                robotFourHighMissTeleLabel.setText("High Miss: " + robotFour.getValue("highFailureTele"));
                break;
                
            case 82 :
                robotFive.setValue("highFailure");
                robotFiveHighMissAutoLabel.setText("High Miss: " + robotFive.getValue("highFailureAuto"));
                robotFiveHighMissTeleLabel.setText("High Miss: " + robotFive.getValue("highFailureTele"));
                break;
                
            case 84 :
                robotSix.setValue("highFailure");
                robotSixHighMissAutoLabel.setText("High Miss: " + robotSix.getValue("highFailureAuto"));
                robotSixHighMissTeleLabel.setText("High Miss: " + robotSix.getValue("highFailureTele"));
                break;
            // </editor-fold>
                
            //High goal success
            // <editor-fold defaultstate="collapsed" desc="High Goal Success">
            case 89 :
                robotOne.setValue("highSuccess");
                robotOneHighSuccessAutoLabel.setText("High Success: " + robotOne.getValue("highSuccessAuto"));
                robotOneHighSuccessTeleLabel.setText("High Success: " + robotOne.getValue("highSuccessTele"));
                break;
                
            case 85 :
                robotTwo.setValue("highSuccess");
                robotTwoHighSuccessAutoLabel.setText("High Success: " + robotTwo.getValue("highSuccessAuto"));
                robotTwoHighSuccessTeleLabel.setText("High Success: " + robotTwo.getValue("highSuccessTele"));
                break;
                
            case 73 :
                robotThree.setValue("highSuccess");
                robotThreeHighSuccessAutoLabel.setText("High Success: " + robotThree.getValue("highSuccessAuto"));
                robotThreeHighSuccessTeleLabel.setText("High Success: " + robotThree.getValue("highSuccessTele"));
                break;
                
            case 79 :
                robotFour.setValue("highSuccess");
                robotFourHighSuccessAutoLabel.setText("High Success: " + robotFour.getValue("highSuccessAuto"));
                robotFourHighSuccessTeleLabel.setText("High Success: " + robotFour.getValue("highSuccessTele"));
                break;
                
            case 80 :
                robotFive.setValue("highSuccess");
                robotFiveHighSuccessAutoLabel.setText("High Success: " + robotFive.getValue("highSuccessAuto"));
                robotFiveHighSuccessTeleLabel.setText("High Success: " + robotFive.getValue("highSuccessTele"));
                break;
                
            case 91 :
                robotSix.setValue("highSuccess");
                robotSixHighSuccessAutoLabel.setText("High Success: " + robotSix.getValue("highSuccessAuto"));
                robotSixHighSuccessTeleLabel.setText("High Success: " + robotSix.getValue("highSuccessTele"));
                break;
            // </editor-fold>
                
            //Low goal failure
            // <editor-fold defaultstate="collapsed" desc="Low Goal Failure">
            case 93 :
                robotOne.setValue("lowFailure");
                robotOneLowMissAutoLabel.setText("Low Miss: " + robotOne.getValue("lowFailureAuto"));
                robotOneLowMissTeleLabel.setText("Low Miss: " + robotOne.getValue("lowFailureTele"));
                break;
                
            case 92 :
                robotTwo.setValue("lowFailure");
                robotTwoLowMissAutoLabel.setText("Low Miss: " + robotTwo.getValue("lowFailureAuto"));
                robotTwoLowMissTeleLabel.setText("Low Miss: " + robotTwo.getValue("lowFailureTele"));
                break;
                
            case 65 :
                robotThree.setValue("lowFailure");
                robotThreeLowMissAutoLabel.setText("Low Miss: " + robotThree.getValue("lowFailureAuto"));
                robotThreeLowMissTeleLabel.setText("Low Miss: " + robotThree.getValue("lowFailureTele"));
                break;
                
            case 83 :
                robotFour.setValue("lowFailure");
                robotFourLowMissAutoLabel.setText("Low Miss: " + robotFour.getValue("lowFailureAuto"));
                robotFourLowMissTeleLabel.setText("Low Miss: " + robotFour.getValue("lowFailureTele"));
                break;
                
            case 68 :
                robotFive.setValue("lowFailure");
                robotFiveLowMissAutoLabel.setText("Low Miss: " + robotFive.getValue("lowFailureAuto"));
                robotFiveLowMissTeleLabel.setText("Low Miss: " + robotFive.getValue("lowFailureTele"));
                break;
                
            case 70 :
                robotSix.setValue("lowFailure");
                robotSixLowMissAutoLabel.setText("Low Miss: " + robotSix.getValue("lowFailureAuto"));
                robotSixLowMissTeleLabel.setText("Low Miss: " + robotSix.getValue("lowFailureTele"));
                break;
            // </editor-fold>
                
            //Low goal success
            // <editor-fold defaultstate="collapsed" desc="Low Goal Success">
            case 71 :
                robotOne.setValue("lowSuccess");
                robotOneLowSuccessAutoLabel.setText("Low Success: " + robotOne.getValue("lowSuccessAuto"));
                robotOneLowSuccessTeleLabel.setText("Low Success: " + robotOne.getValue("lowSuccessTele"));
                break;
                
            case 72 :
                robotTwo.setValue("lowSuccess");
                robotTwoLowSuccessAutoLabel.setText("Low Success: " + robotTwo.getValue("lowSuccessAuto"));
                robotTwoLowSuccessTeleLabel.setText("Low Success: " + robotTwo.getValue("lowSuccessTele"));
                break;
                
            case 74 :
                robotThree.setValue("lowSuccess");
                robotThreeLowSuccessAutoLabel.setText("Low Success: " + robotThree.getValue("lowSuccessAuto"));
                robotThreeLowSuccessTeleLabel.setText("Low Success: " + robotThree.getValue("lowSuccessTele"));
                break;
                
            case 75 :
                robotFour.setValue("lowSuccess");
                robotFourLowSuccessAutoLabel.setText("Low Success: " + robotFour.getValue("lowSuccessAuto"));
                robotFourLowSuccessTeleLabel.setText("Low Success: " + robotFour.getValue("lowSuccessTele"));
                break;
                
            case 76 :
                robotFive.setValue("lowSuccess");
                robotFiveLowSuccessAutoLabel.setText("Low Success: " + robotFive.getValue("lowSuccessAuto"));
                robotFiveLowSuccessTeleLabel.setText("Low Success: " + robotFive.getValue("lowSuccessTele"));
                break;
                
            case 59 :
                robotSix.setValue("lowSuccess");
                robotSixLowSuccessAutoLabel.setText("Low Success: " + robotSix.getValue("lowSuccessAuto"));
                robotSixLowSuccessTeleLabel.setText("Low Success: " + robotSix.getValue("lowSuccessTele"));
                break;
            // </editor-fold>
                
            //Truss failure
            // <editor-fold defaultstate="collapsed" desc="Truss Failure">
            case 222 :
                robotOne.setValue("trussFailure");
                robotOneTrussMissLabel.setText("Truss Miss: " + robotOne.getValue("trussFailure"));
                break;
                
            case 10 :
                robotTwo.setValue("trussFailure");
                robotTwoTrussMissLabel.setText("Truss Miss: " + robotTwo.getValue("trussFailure"));
                break;
                
            case 16 :
                robotThree.setValue("trussFailure");
                robotThreeTrussMissLabel.setText("Truss Miss: " + robotThree.getValue("trussFailure"));
                break;
                
            case 90 :
                robotFour.setValue("trussFailure");
                robotFourTrussMissLabel.setText("Truss Miss: " + robotFour.getValue("trussFailure"));
                break;
                
            case 88 :
                robotFive.setValue("trussFailure");
                robotFiveTrussMissLabel.setText("Truss Miss: " + robotFive.getValue("trussFailure"));
                break;
                
            case 67 :
                robotSix.setValue("trussFailure");
                robotSixTrussMissLabel.setText("Truss Miss: " + robotSix.getValue("trussFailure"));
                break;
            // </editor-fold>
                
            //Truss success
            // <editor-fold defaultstate="collapsed" desc="Truss Success">
            case 86 :
                robotOne.setValue("trussSuccess");
                robotOneTrussSuccessLabel.setText("Truss Success: " + robotOne.getValue("trussSuccess"));
                break;
                
            case 66 :
                robotTwo.setValue("trussSuccess");
                robotTwoTrussSuccessLabel.setText("Truss Success: " + robotTwo.getValue("trussSuccess"));
                break;
                
            case 78 :
                robotThree.setValue("trussSuccess");
                robotThreeTrussSuccessLabel.setText("Truss Success: " + robotThree.getValue("trussSuccess"));
                break;
                
            case 77 :
                robotFour.setValue("trussSuccess");
                robotFourTrussSuccessLabel.setText("Truss Success: " + robotFour.getValue("trussSuccess"));
                break;
                
            case 44 :
                robotFive.setValue("trussSuccess");
                robotFiveTrussSuccessLabel.setText("Truss Success: " + robotFive.getValue("trussSuccess"));
                break;
                
            case 46 :
                robotSix.setValue("trussSuccess");
                robotSixTrussSuccessLabel.setText("Truss Success: " + robotSix.getValue("trussSuccess"));
                break;
            // </editor-fold>
                
            //Catch/Mobility success
            // <editor-fold defaultstate="collapsed" desc="Catch/Mobility">
            case 47 :
                robotOne.setValue("special");
                robotOneMobilitySuccessLabel.setText("Mobility Success: " + robotOne.getValue("mobility"));
                robotOneCatchSuccessLabel.setText("Catch Success: " + robotOne.getValue("catchSuccess"));
                break;
                
            case 32 :
                robotTwo.setValue("special");
                robotTwoMobilitySuccessLabel.setText("Mobility Success: " + robotTwo.getValue("mobility"));
                robotTwoCatchSuccessLabel.setText("Catch Success: " + robotTwo.getValue("catchSuccess"));
                break;
                
            case 37 :
                robotThree.setValue("special");
                robotThreeMobilitySuccessLabel.setText("Mobility Success: " + robotThree.getValue("mobility"));
                robotThreeCatchSuccessLabel.setText("Catch Success: " + robotThree.getValue("catchSuccess"));
                break;
                
            case 38 :
                robotFour.setValue("special");
                robotFourMobilitySuccessLabel.setText("Mobility Success: " + robotFour.getValue("mobility"));
                robotFourCatchSuccessLabel.setText("Catch Success: " + robotFour.getValue("catchSuccess"));
                break;
                
            case 39 :
                robotFive.setValue("special");
                robotFiveMobilitySuccessLabel.setText("Mobility Success: " + robotFive.getValue("mobility"));
                robotFiveCatchSuccessLabel.setText("Catch Success: " + robotFive.getValue("catchSuccess"));
                break;
                
            case 40 :
                robotSix.setValue("special");
                robotSixMobilitySuccessLabel.setText("Mobility Success: " + robotSix.getValue("mobility"));
                robotSixCatchSuccessLabel.setText("Catch Success: " + robotSix.getValue("catchSuccess"));
                break;
            // </editor-fold>
                
        }
    }//GEN-LAST:event_beginButtonKeyReleased

    private void robotTwoNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotTwoNumTextFieldActionPerformed
        robotTwo.setTeamNumber(robotTwoNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotTwoNumTextFieldActionPerformed

    private void robotThreeNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotThreeNumTextFieldActionPerformed
        robotThree.setTeamNumber(robotThreeNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotThreeNumTextFieldActionPerformed

    private void robotFourNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotFourNumTextFieldActionPerformed
        robotFour.setTeamNumber(robotFourNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotFourNumTextFieldActionPerformed

    private void robotFiveNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotFiveNumTextFieldActionPerformed
        robotFive.setTeamNumber(robotFiveNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotFiveNumTextFieldActionPerformed

    private void robotSixNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotSixNumTextFieldActionPerformed
        robotSix.setTeamNumber(robotSixNumTextField.getText());
        setLabels();
    }//GEN-LAST:event_robotSixNumTextFieldActionPerformed
    
    private void setLabels() {
        robotOneIdentifierLabel.setText("#" + robotOne.getTeamNumber());
        robotTwoIdentifierLabel.setText("#" + robotTwo.getTeamNumber());
        robotThreeIdentifierLabel.setText("#" + robotThree.getTeamNumber());
        robotFourIdentifierLabel.setText("#" + robotFour.getTeamNumber());
        robotFiveIdentifierLabel.setText("#" + robotFive.getTeamNumber());
        robotSixIdentifierLabel.setText("#" + robotSix.getTeamNumber());
        
        robotOneNumLabel.setText("Team #" + robotOne.getTeamNumber());
        robotTwoNumLabel.setText("Team #" + robotTwo.getTeamNumber());
        robotThreeNumLabel.setText("Team #" + robotThree.getTeamNumber());
        robotFourNumLabel.setText("Team #" + robotFour.getTeamNumber());
        robotFiveNumLabel.setText("Team #" + robotFive.getTeamNumber());
        robotSixNumLabel.setText("Team #" + robotSix.getTeamNumber());
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeltaVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeltaVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeltaVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeltaVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeltaVersion().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autonomousColumnLabel;
    private javax.swing.JLabel autonomousColumnLabel1;
    private javax.swing.JLabel autonomousColumnLabel2;
    private javax.swing.JLabel autonomousColumnLabel3;
    private javax.swing.JLabel autonomousColumnLabel4;
    private javax.swing.JLabel autonomousColumnLabel5;
    private javax.swing.JButton beginButton;
    private javax.swing.JLabel blueAllianceLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel matchNumLabel;
    private javax.swing.JTextField matchNumTextField;
    private javax.swing.JPanel operatorPanel;
    private javax.swing.JLabel redAllianceLabel;
    private javax.swing.JLabel robotFiveCatchSuccessLabel;
    private javax.swing.JLabel robotFiveGameModeLabel;
    private javax.swing.JLabel robotFiveHighMissAutoLabel;
    private javax.swing.JLabel robotFiveHighMissTeleLabel;
    private javax.swing.JLabel robotFiveHighSuccessAutoLabel;
    private javax.swing.JLabel robotFiveHighSuccessTeleLabel;
    private javax.swing.JLabel robotFiveIdentifierLabel;
    private javax.swing.JLabel robotFiveLowMissAutoLabel;
    private javax.swing.JLabel robotFiveLowMissTeleLabel;
    private javax.swing.JLabel robotFiveLowSuccessAutoLabel;
    private javax.swing.JLabel robotFiveLowSuccessTeleLabel;
    private javax.swing.JLabel robotFiveMathStateLabel;
    private javax.swing.JLabel robotFiveMobilitySuccessLabel;
    private javax.swing.JLabel robotFiveNumLabel;
    private javax.swing.JTextField robotFiveNumTextField;
    private javax.swing.JPanel robotFivePanel;
    private javax.swing.JLabel robotFiveTrussMissLabel;
    private javax.swing.JLabel robotFiveTrussSuccessLabel;
    private javax.swing.JLabel robotFourCatchSuccessLabel;
    private javax.swing.JLabel robotFourGameModeLabel;
    private javax.swing.JLabel robotFourHighMissAutoLabel;
    private javax.swing.JLabel robotFourHighMissTeleLabel;
    private javax.swing.JLabel robotFourHighSuccessAutoLabel;
    private javax.swing.JLabel robotFourHighSuccessTeleLabel;
    private javax.swing.JLabel robotFourIdentifierLabel;
    private javax.swing.JLabel robotFourLowMissAutoLabel;
    private javax.swing.JLabel robotFourLowMissTeleLabel;
    private javax.swing.JLabel robotFourLowSuccessAutoLabel;
    private javax.swing.JLabel robotFourLowSuccessTeleLabel;
    private javax.swing.JLabel robotFourMathStateLabel;
    private javax.swing.JLabel robotFourMobilitySuccessLabel;
    private javax.swing.JLabel robotFourNumLabel;
    private javax.swing.JTextField robotFourNumTextField;
    private javax.swing.JPanel robotFourPanel;
    private javax.swing.JLabel robotFourTrussMissLabel;
    private javax.swing.JLabel robotFourTrussSuccessLabel;
    private javax.swing.JLabel robotOneCatchSuccessLabel;
    private javax.swing.JLabel robotOneGameModeLabel;
    private javax.swing.JLabel robotOneHighMissAutoLabel;
    private javax.swing.JLabel robotOneHighMissTeleLabel;
    private javax.swing.JLabel robotOneHighSuccessAutoLabel;
    private javax.swing.JLabel robotOneHighSuccessTeleLabel;
    private javax.swing.JLabel robotOneIdentifierLabel;
    private javax.swing.JLabel robotOneLowMissAutoLabel;
    private javax.swing.JLabel robotOneLowMissTeleLabel;
    private javax.swing.JLabel robotOneLowSuccessAutoLabel;
    private javax.swing.JLabel robotOneLowSuccessTeleLabel;
    private javax.swing.JLabel robotOneMathStateLabel;
    private javax.swing.JLabel robotOneMobilitySuccessLabel;
    private javax.swing.JLabel robotOneNumLabel;
    private javax.swing.JTextField robotOneNumTextField;
    private javax.swing.JPanel robotOnePanel;
    private javax.swing.JLabel robotOneTrussMissLabel;
    private javax.swing.JLabel robotOneTrussSuccessLabel;
    private javax.swing.JLabel robotSixCatchSuccessLabel;
    private javax.swing.JLabel robotSixGameModeLabel;
    private javax.swing.JLabel robotSixHighMissAutoLabel;
    private javax.swing.JLabel robotSixHighMissTeleLabel;
    private javax.swing.JLabel robotSixHighSuccessAutoLabel;
    private javax.swing.JLabel robotSixHighSuccessTeleLabel;
    private javax.swing.JLabel robotSixIdentifierLabel;
    private javax.swing.JLabel robotSixLowMissAutoLabel;
    private javax.swing.JLabel robotSixLowMissTeleLabel;
    private javax.swing.JLabel robotSixLowSuccessAutoLabel;
    private javax.swing.JLabel robotSixLowSuccessTeleLabel;
    private javax.swing.JLabel robotSixMathStateLabel;
    private javax.swing.JLabel robotSixMobilitySuccessLabel;
    private javax.swing.JLabel robotSixNumLabel;
    private javax.swing.JTextField robotSixNumTextField;
    private javax.swing.JPanel robotSixPanel;
    private javax.swing.JLabel robotSixTrussMissLabel;
    private javax.swing.JLabel robotSixTrussSuccessLabel;
    private javax.swing.JLabel robotThreeCatchSuccessLabel;
    private javax.swing.JLabel robotThreeGameModeLabel;
    private javax.swing.JLabel robotThreeHighMissAutoLabel;
    private javax.swing.JLabel robotThreeHighMissTeleLabel;
    private javax.swing.JLabel robotThreeHighSuccessAutoLabel;
    private javax.swing.JLabel robotThreeHighSuccessTeleLabel;
    private javax.swing.JLabel robotThreeIdentifierLabel;
    private javax.swing.JLabel robotThreeLowMissAutoLabel;
    private javax.swing.JLabel robotThreeLowMissTeleLabel;
    private javax.swing.JLabel robotThreeLowSuccessAutoLabel;
    private javax.swing.JLabel robotThreeLowSuccessTeleLabel;
    private javax.swing.JLabel robotThreeMathStateLabel;
    private javax.swing.JLabel robotThreeMobilitySuccessLabel;
    private javax.swing.JLabel robotThreeNumLabel;
    private javax.swing.JTextField robotThreeNumTextField;
    private javax.swing.JPanel robotThreePanel;
    private javax.swing.JLabel robotThreeTrussMissLabel;
    private javax.swing.JLabel robotThreeTrussSuccessLabel;
    private javax.swing.JLabel robotTwoCatchSuccessLabel;
    private javax.swing.JLabel robotTwoGameModeLabel;
    private javax.swing.JLabel robotTwoHighMissAutoLabel;
    private javax.swing.JLabel robotTwoHighMissTeleLabel;
    private javax.swing.JLabel robotTwoHighSuccessAutoLabel;
    private javax.swing.JLabel robotTwoHighSuccessTeleLabel;
    private javax.swing.JLabel robotTwoIdentifierLabel;
    private javax.swing.JLabel robotTwoLowMissAutoLabel;
    private javax.swing.JLabel robotTwoLowMissTeleLabel;
    private javax.swing.JLabel robotTwoLowSuccessAutoLabel;
    private javax.swing.JLabel robotTwoLowSuccessTeleLabel;
    private javax.swing.JLabel robotTwoMathStateLabel;
    private javax.swing.JLabel robotTwoMobilitySuccessLabel;
    private javax.swing.JLabel robotTwoNumLabel;
    private javax.swing.JTextField robotTwoNumTextField;
    private javax.swing.JPanel robotTwoPanel;
    private javax.swing.JLabel robotTwoTrussMissLabel;
    private javax.swing.JLabel robotTwoTrussSuccessLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel teleopColumnLabel;
    private javax.swing.JLabel teleopColumnLabel1;
    private javax.swing.JLabel teleopColumnLabel2;
    private javax.swing.JLabel teleopColumnLabel3;
    private javax.swing.JLabel teleopColumnLabel4;
    private javax.swing.JLabel teleopColumnLabel5;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
}