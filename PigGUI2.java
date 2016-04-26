
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PigGUI extends JFrame implements ActionListener 
{
JPanel mainPanel;
JPanel optionPanel;
JPanel dicePanel;
private JPanel dicePanel_1;
JButton rollDice;
JButton hold;
JMenu options;
JMenuItem quit;
JMenuItem seeStats;
JMenuBar menuBar;
JLabel diceLabel;
JLabel diceLabel2;
Dice dice;
Graphics die1;
Graphics die2;
private boolean rolling;

public PigGUI()
{
    setTitle("Play Pig!");
    this.setPreferredSize(new Dimension(1200,600));

    mainPanel = new JPanel();
    optionPanel = new JPanel();
    optionPanel.setBackground(Color.WHITE);
    optionPanel.setBounds(386, 471, 446, 37);
    dicePanel = new JPanel();
    options = new JMenu("Options");
    quit = new JMenuItem("Quit");
    seeStats = new JMenuItem("See Stats");
    menuBar = new JMenuBar();
    dice = new Dice();

    options.add(quit);
    options.add(seeStats);

    menuBar.add(options);

    optionPanel.add(menuBar);
    optionPanel.setPreferredSize(new Dimension(600,100));
    
    dicePanel_1 = new JPanel(new GridLayout(2,1));
    dicePanel_1.setBounds(530, 251, 200, 58);

    mainPanel.setPreferredSize(new Dimension(600,600));
    mainPanel.setLayout(null);
    mainPanel.add(optionPanel);
    mainPanel.add(dicePanel_1);


    quit.addActionListener(this);
    seeStats.addActionListener(this);

    this.getContentPane().add(mainPanel);
    rollDice = new JButton("Roll Dice");
    rollDice.setBounds(530, 321, 100, 29);
    mainPanel.add(rollDice);
    hold = new JButton("Hold");
    hold.setBounds(642, 321, 100, 29);
    mainPanel.add(hold);
    diceLabel = new JLabel();
    diceLabel.setBounds(342, 365, 218, 29);
    mainPanel.add(diceLabel);
    diceLabel2 = new JLabel();
    diceLabel2.setBounds(352, 395, 200, 29);
    mainPanel.add(diceLabel2);
    
    

    
    JLabel lblNewLabel = new JLabel("");
    Image img = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
    lblNewLabel.setIcon(new ImageIcon(img));
    lblNewLabel.setBounds(6, 5, 1188, 567);
    mainPanel.add(lblNewLabel);
    rollDice.addActionListener(this);

    this.pack();
    this.setVisible(true);
}


public void actionPerformed(ActionEvent e) {
    if (e.getSource()== quit)
        System.exit(0);

    if (e.getSource() == seeStats)
    {
        JOptionPane.showMessageDialog(mainPanel,
                "Your stats are: "); 
    }

    if (e.getSource() == rollDice)
    {


    	rolling = true;
    }
}
}
