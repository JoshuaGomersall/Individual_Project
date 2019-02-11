package AdventureGame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Checkbox;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Insets;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class GameGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GameGUI window = new GameGUI();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameGUI() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// dice roller 
	 	 int loopcount = 0;
	 	 int roll = 0;
	 	 int rolltotal = 0;
	 	 
	 	 // player attack
	 	 boolean incombat = false;
	 	 boolean ranged = true;
	 	 boolean aimed = false;
	 	 int weapondamage = 2;
	 	 int damagetotal = 0;
	 	 
	 	 // player stats
	 	 int playerhp = 4;
	 	 int playerarmor = 4;
	 	 int xp = 0;
	 	 float playerlevel = 1;
	 	 int playerkills = 0;
	 	 
	 	 int startfightbonus = 10;
	 	 int attackbonus = 0;
	 	 int sightbonus = 0;
	 	 int smartsbonus = 0;
	 	 int charmbonus = 0;
	 	 
	 	 // enemy stats 
	 	 int enemyhp = 4;
	 	 int enemyarmor = 1;
	 	 int charmresist = 0;
	 	 int expgiven = 10;
	 	 
	 	 
	 	 //type of rolls
	 	 int startfightroll = 0;
	 	 int attackroll = 0;
	 	 int sightroll = 0;
	 	 int smartsroll = 0;
	 	 int charmroll = 0;
	 	 int errorroll = 0;
	 	 int blankroll = 0;
	 	 
	 	 int total = 0;
	 	 
	 	 	
	 	 //type of roll 
	 	 startfightroll = 0;
	 	 attackroll = 0;
	 	 sightroll = 0;
	 	 smartsroll = 0;
	 	 charmroll = 0;
	 	 errorroll = 0;
	 	 
	 	 
	 	 int playing = 1;
	 	 //while (playing ==1)
	 	 //{
	 		JLabel lblRollResult = new JLabel("" + total);
	 	 //}
	 		startfightroll = 0;
	 		attackroll = 0;
	 	 	sightroll = 0;
	 	 	smartsroll = 0;
	 	 	charmroll = 0;
	 	 	errorroll = 0;
	 	 	blankroll = 0;
	 	 //}
		
	 	 	if (errorroll == 0 || blankroll == 1)
  			{
  				while (loopcount < 1)
  				{
  					rolltotal = 0;
  					roll = 0;
  					loopcount = loopcount +1;
  					roll = 1 + new Random().nextInt(6); // [0...6]
  					rolltotal = rolltotal + roll;
  			 
  					if (roll == 6)
  					{
  						while (roll == 6)
  						{
  							roll = 0;
  							roll = 1 + new Random().nextInt(6); // [0...6]
  							rolltotal = rolltotal + roll;
  							System.out.println("You did a critical strike");
  							JLabel lblRollResult1 = new JLabel("" + total);
  						}
  						if (roll != 6)
  						{
  							System.out.print("Roll Number " + loopcount + ":");
  							System.out.println(rolltotal);
  						}
  					}
  					
  					
  					if (startfightroll == 1)
  					{
  						total = 0;
  						total = rolltotal + startfightbonus;
  						JLabel lblRollResult1 = new JLabel("" + total);
  						
  						System.out.println(total);
  						if (total > 16)
  						{
  							//get from database
  							enemyhp = 5;
  							enemyarmor = 3;
  							charmresist = 3;
  						 	expgiven = 50;
  							
  							System.out.print("You Find A Legendary Creature");
  						}
  						else if (total > 12)
  						{
  							//get from database
  							enemyhp = 3;
  							enemyarmor = 1;
  							charmresist = 1;
  						 	expgiven = 20;
  							
  							System.out.print("You Find A Rare Item Protected By A Knight");
  						}
  						else if (total > 8)
  						{
  							//get from database
  							enemyhp = 1;
  							enemyarmor = 0;
  							charmresist = 10;
  						 	expgiven = 0;
  							
  							System.out.print("You Find A Chest ,Thats It Just A Normal Chest");
  						}
  						else if (total >= 4)
  						{
  							//get from database
  							enemyhp = 2;
  							enemyarmor = 0;
  							charmresist = 1;
  						 	expgiven = 10;
  							
  							System.out.print("You Find A Basic Enemy");
  						}
  						else if (total < 4)
  						{
  							System.out.print("You Find A Small Creature , and he also smells bad");
  							//get from database
  							enemyhp = 1;
  							enemyarmor = 0;
  							charmresist = 0;
  						 	expgiven = 10;
  							
  						}
  						incombat = true;
  					}
  					
   	
  					if (attackroll == 1)
  					{
  						if (aimed == true)
  						{
  							damagetotal = rolltotal + weapondamage + 2;
  							System.out.println("Total Damage Is : " + damagetotal +  "");
  						}
  						
  						else 
  						{
  							damagetotal = rolltotal + weapondamage;
  	  						System.out.println("Total Damage Is : " + damagetotal +  "");
  						}
  						
  						if (damagetotal - enemyarmor > 16)
  						{
  							enemyhp = enemyhp - 4;
  						}
  						else if (damagetotal - enemyarmor > 12)
  						{
  							enemyhp = enemyhp - 3;
  						}
  						else if (damagetotal - enemyarmor > 8)
  						{
  							enemyhp = enemyhp - 2;
  						}
  						else if (damagetotal - enemyarmor >= 4)
  						{
  							enemyhp = enemyhp - 1;
  						}
  						else if (damagetotal - enemyarmor < 4)
  						{
  							enemyhp = enemyhp - 0;
  						}
  						
  						System.out.println(enemyhp);
  					
  						if (enemyhp > 3)
  						{
  							System.out.println("The Enemy dosent have a scratch on them ");
  						}
  						else if (enemyhp > 2)
  						{
  							System.out.println("They seem to have taken some light blows");
  						}
  						else if (enemyhp > 1)
  						{
  							System.out.println("They are getting close to going down");
  						}
  						else if (enemyhp > 0)
  						{
  							System.out.println("One more clean strike might do it");
  						}
  						else if (enemyhp <= 0)
  						{
  							System.out.println("ummm ,yeah ,they seem dead to me");
  							playerkills = playerkills +1;
  							enemyhp = 4;
  							incombat = false;
  						}
  					}				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JSplitPane splitPane_2 = new JSplitPane();
		panel.add(splitPane_2);
		
		JButton btnStart = new JButton("Start ");
		btnStart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int startfightroll = 1;
			}
		});
		splitPane_2.setLeftComponent(btnStart);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int attackroll = 1;
			}
		});
		splitPane_2.setRightComponent(btnAttack);
		
		JSplitPane splitPane_1 = new JSplitPane();
		panel.add(splitPane_1);
		
		JButton btnAim = new JButton("Aim");
		splitPane_1.setLeftComponent(btnAim);
		
		JButton btnSearch = new JButton("Search");
		splitPane_1.setRightComponent(btnSearch);
		
		JSplitPane splitPane = new JSplitPane();
		panel.add(splitPane);
		
		JButton btnThink = new JButton("Think");
		splitPane.setLeftComponent(btnThink);
		
		JButton btnCharm = new JButton("Charm");
		splitPane.setRightComponent(btnCharm);
		
		JLabel lblRollResult1 = new JLabel("" + total);
		
				
				
		panel.add(lblRollResult1);
		
		JPanel GameTxtOut = new JPanel();
		frame.getContentPane().add(GameTxtOut, BorderLayout.SOUTH);
		
		JLabel lblTest = new JLabel("fyjfgjyfjgfjhfhfhjjffjhfjhhfjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjf");
		lblTest.setEnabled(false);
		GameTxtOut.add(lblTest);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setAlignOnBaseline(true);
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		
		JSplitPane splitPane_3 = new JSplitPane();
		panel_2.add(splitPane_3);
		
		JLabel lblPlayerHp = new JLabel("Player HP : 100");
		splitPane_3.setLeftComponent(lblPlayerHp);
		
		JLabel lblPlayerArmor = new JLabel("Player Armor : 10");
		splitPane_3.setRightComponent(lblPlayerArmor);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {90};
		gbl_panel_3.rowHeights = new int[] {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
		gbl_panel_3.columnWeights = new double[]{0.0};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblEnemyHp = new JLabel("Enemy HP ");
		GridBagConstraints gbc_lblEnemyHp = new GridBagConstraints();
		gbc_lblEnemyHp.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnemyHp.gridx = 0;
		gbc_lblEnemyHp.gridy = 0;
		panel_3.add(lblEnemyHp, gbc_lblEnemyHp);
		
		JLabel lblEnemyArmor = new JLabel("Enemy Armor");
		GridBagConstraints gbc_lblEnemyArmor = new GridBagConstraints();
		gbc_lblEnemyArmor.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnemyArmor.gridx = 0;
		gbc_lblEnemyArmor.gridy = 1;
		panel_3.add(lblEnemyArmor, gbc_lblEnemyArmor);
		
		JLabel label = new JLabel("New label");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 2;
		panel_3.add(label, gbc_label);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		panel_4.add(layeredPane, BorderLayout.NORTH);
  				}
  		}
}
}
