package GUI;

// import other classes
import Controller.Character_Controller.Character_Stats_Controller;
import Controller.Character_Controller.Inventroy_Controller;
import Controller.General_Controller.SQL_Controller;

// import swing objects
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

    // import GUI elements

    private JPanel mainPanel;
    private JTabbedPane pldQuestTab;
    private JTabbedPane pldCaITab;
    private JButton pldCQuestCompleteFinishBtn;
    private JButton pldCQuestCompleteCancleBtn;
    private JPanel pldMainPanel;
    private JPanel pldProfilePanel;
    private JPanel pldQuestPanel;
    private JPanel pldCaIPanel;
    private JLabel pldProfilePic;
    private JPanel pldCQuestPanel;
    private JPanel pldFQuestPanel;
    private JPanel pldNQuestPanel;
    private JPanel pldCQuestDescriptionPanel;
    private JPanel pldCQuestCompletePanel;
    private JPanel pldCQuestInfoDonePanel;
    private JLabel pldCQuestInfoDoneText;
    private JLabel pldCQuestInfoDoneNumber;
    private JLabel pldCQuestInfoXPText;
    private JLabel pldCQuestInfoDoneXPNumber;
    private JList pldFQuestList;
    private JScrollPane pldFQuestScrollPane;
    private JTextField pldNQuestQuestNameTextFiel;
    private JComboBox pldNQuestEnemyComboBox;
    private JComboBox pldNQuestSceneryComboBox;
    private JComboBox pld;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JButton aufInEinNeuesButton;
    private JLabel pldNQuestQuestHeadline;
    private JLabel pldNQuestEnemyNameHeadline;
    private JLabel pldNQuestSceneryHeadline;
    private JLabel pldNQuestDateHeadline;
    private JPanel pldCaICharacterPanel;
    private JPanel pldCaICharacterPanelInner;
    private JPanel pldCaIInventoryPanel;
    private JPanel pldCaIInventoryDescriptionPanel;
    private JPanel pldCaIInventoryInventoryPanel;
    private JPanel pldCaIInventoryWeaponPanel;
    private JPanel pldCaIInventoryHelmetPanel;
    private JPanel pldCaIInventoryChestPanel;
    private JPanel pldCaIInventoryEarringPanel;
    private JPanel pldCaIInventoryRingPanel;
    private JPanel pldCaIInventoryPlaceholderPanel;
    private JPanel pldCaIStatsPanel;
    private JLabel pldCaIStatsMainattributeText;
    private JLabel pldCaIStatsMainattributeNumber;
    private JLabel pldCaIStatsLPText;
    private JLabel pldCaIStatsLPNumber;
    private JLabel pldCaIStatsMagicText;
    private JLabel pldCaIStatsMagicNumber;
    private JLabel pldCaIStatsDexText;
    private JLabel pldCaIStatsDexNumber;
    private JProgressBar pldCaIStatsProgressBar;
    private JLabel pldCaIStatsXPNumber;
    private JLabel pldCaIStatsHeadline;
    private JLabel pldCaIInventoryHeadline;
    public JLabel pldCaIStatsLevel;
    public JLabel pldCaIStatsXPCurrent;
    public JLabel pldCaIStatsXPMax;
    public JTextPane pldItemDescription;
    public JLabel pldCaIItemMainAttr;
    public JLabel pldCaIItemHP;
    public JLabel pldCaIItemMagic;
    public JLabel pldCaIItemDex;
    public JLabel pldCaIItemMainAttrNumber;
    public JLabel pldItemDescriptionHeadline;
    public JLabel pldCaIItemHPNumber;
    public JLabel pldCaIItemMagicNumber;
    public JLabel pldCaIItemDexNumber;


    public String maxXP;
    public String currentXP;

    public GUI() {
        setContentPane(mainPanel);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // toggle fullscreen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);


        // Mouseover inventory weapon
        pldCaIInventoryWeaponPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                pldCaIItemMainAttr.setText("Hauptattribut");
                pldCaIItemMainAttrNumber.setText(Inventroy_Controller.setWeaponStats("WEAPON", "MAIN_ATTR"));

                pldCaIItemHP.setText("Leben");
                pldCaIItemHPNumber.setText(Inventroy_Controller.setWeaponStats("WEAPON", "HP"));

                pldCaIItemMagic.setText("Magie");
                pldCaIItemMagicNumber.setText(Inventroy_Controller.setWeaponStats("WEAPON", "MAGIC"));

                pldCaIItemDex.setText("Geschicklichkeit");
                pldCaIItemDexNumber.setText(Inventroy_Controller.setWeaponStats("WEAPON", "DEXTERITY"));

                pldItemDescriptionHeadline.setText(String.valueOf(Inventroy_Controller.setWeaponStats("WEAPON","NAME")));
                pldItemDescription.setText(Inventroy_Controller.setWeaponStats("WEAPON", "DESCRIPTION"));


            }
        });
        // Mouseover inventory weapon
        pldCaIInventoryWeaponPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                pldCaIItemMainAttr.setText("");
                pldCaIItemMainAttrNumber.setText("");

                pldCaIItemHP.setText("");
                pldCaIItemHPNumber.setText("");

                pldCaIItemMagic.setText("");
                pldCaIItemMagicNumber.setText("");

                pldCaIItemDex.setText("");
                pldCaIItemDexNumber.setText("");

                pldItemDescriptionHeadline.setText("");
                pldItemDescription.setText("");


            }
        });
        // Mouseover inventory helmet
        pldCaIInventoryHelmetPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                pldCaIItemMainAttr.setText("Hauptattribut");
                pldCaIItemMainAttrNumber.setText(Inventroy_Controller.setWeaponStats("HELMET", "MAIN_ATTR"));

                pldCaIItemHP.setText("Leben");
                pldCaIItemHPNumber.setText(Inventroy_Controller.setWeaponStats("HELMET", "HP"));

                pldCaIItemMagic.setText("Magie");
                pldCaIItemMagicNumber.setText(Inventroy_Controller.setWeaponStats("HELMET", "MAGIC"));

                pldCaIItemDex.setText("Geschicklichkeit");
                pldCaIItemDexNumber.setText(Inventroy_Controller.setWeaponStats("HELMET", "DEXTERITY"));

                pldItemDescriptionHeadline.setText(String.valueOf(Inventroy_Controller.setWeaponStats("HELMET","NAME")));
                pldItemDescription.setText(Inventroy_Controller.setWeaponStats("HELMET", "DESCRIPTION"));


            }
        });

        // Mouseover inventory helmet
        pldCaIInventoryHelmetPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                pldCaIItemMainAttr.setText("");
                pldCaIItemMainAttrNumber.setText("");

                pldCaIItemHP.setText("");
                pldCaIItemHPNumber.setText("");

                pldCaIItemMagic.setText("");
                pldCaIItemMagicNumber.setText("");

                pldCaIItemDex.setText("");
                pldCaIItemDexNumber.setText("");

                pldItemDescriptionHeadline.setText("");
                pldItemDescription.setText("");


            }
        });

        // Mouseover inventory chest
        pldCaIInventoryChestPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                pldCaIItemMainAttr.setText("Hauptattribut");
                pldCaIItemMainAttrNumber.setText(Inventroy_Controller.setWeaponStats("CHEST", "MAIN_ATTR"));

                pldCaIItemHP.setText("Leben");
                pldCaIItemHPNumber.setText(Inventroy_Controller.setWeaponStats("CHEST", "HP"));

                pldCaIItemMagic.setText("Magie");
                pldCaIItemMagicNumber.setText(Inventroy_Controller.setWeaponStats("CHEST", "MAGIC"));

                pldCaIItemDex.setText("Geschicklichkeit");
                pldCaIItemDexNumber.setText(Inventroy_Controller.setWeaponStats("CHEST", "DEXTERITY"));

                pldItemDescriptionHeadline.setText(String.valueOf(Inventroy_Controller.setWeaponStats("CHEST","NAME")));
                pldItemDescription.setText(Inventroy_Controller.setWeaponStats("CHEST", "DESCRIPTION"));


            }
        });

        // Mouseover inventory chest
        pldCaIInventoryChestPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                pldCaIItemMainAttr.setText("");
                pldCaIItemMainAttrNumber.setText("");

                pldCaIItemHP.setText("");
                pldCaIItemHPNumber.setText("");

                pldCaIItemMagic.setText("");
                pldCaIItemMagicNumber.setText("");

                pldCaIItemDex.setText("");
                pldCaIItemDexNumber.setText("");

                pldItemDescriptionHeadline.setText("");
                pldItemDescription.setText("");


            }
        });

        // Mouseover inventory earring
        pldCaIInventoryEarringPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                pldCaIItemMainAttr.setText("Hauptattribut");
                pldCaIItemMainAttrNumber.setText(Inventroy_Controller.setWeaponStats("EARRING", "MAIN_ATTR"));

                pldCaIItemHP.setText("Leben");
                pldCaIItemHPNumber.setText(Inventroy_Controller.setWeaponStats("EARRING", "HP"));

                pldCaIItemMagic.setText("Magie");
                pldCaIItemMagicNumber.setText(Inventroy_Controller.setWeaponStats("EARRING", "MAGIC"));

                pldCaIItemDex.setText("Geschicklichkeit");
                pldCaIItemDexNumber.setText(Inventroy_Controller.setWeaponStats("EARRING", "DEXTERITY"));

                pldItemDescriptionHeadline.setText(String.valueOf(Inventroy_Controller.setWeaponStats("EARRING","NAME")));
                pldItemDescription.setText(Inventroy_Controller.setWeaponStats("EARRING", "DESCRIPTION"));


            }
        });

        // Mouseover inventory earring
        pldCaIInventoryEarringPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                pldCaIItemMainAttr.setText("");
                pldCaIItemMainAttrNumber.setText("");

                pldCaIItemHP.setText("");
                pldCaIItemHPNumber.setText("");

                pldCaIItemMagic.setText("");
                pldCaIItemMagicNumber.setText("");

                pldCaIItemDex.setText("");
                pldCaIItemDexNumber.setText("");

                pldItemDescriptionHeadline.setText("");
                pldItemDescription.setText("");


            }
        });

        // Mouseover inventory ring
        pldCaIInventoryRingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);

                pldCaIItemMainAttr.setText("Hauptattribut");
                pldCaIItemMainAttrNumber.setText(Inventroy_Controller.setWeaponStats("RING", "MAIN_ATTR"));

                pldCaIItemHP.setText("Leben");
                pldCaIItemHPNumber.setText(Inventroy_Controller.setWeaponStats("RING", "HP"));

                pldCaIItemMagic.setText("Magie");
                pldCaIItemMagicNumber.setText(Inventroy_Controller.setWeaponStats("RING", "MAGIC"));

                pldCaIItemDex.setText("Geschicklichkeit");
                pldCaIItemDexNumber.setText(Inventroy_Controller.setWeaponStats("RING", "DEXTERITY"));

                pldItemDescriptionHeadline.setText(String.valueOf(Inventroy_Controller.setWeaponStats("RING","NAME")));
                pldItemDescription.setText(Inventroy_Controller.setWeaponStats("RING", "DESCRIPTION"));


            }
        });

        // Mouseover inventory ring
        pldCaIInventoryRingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);

                pldCaIItemMainAttr.setText("");
                pldCaIItemMainAttrNumber.setText("");

                pldCaIItemHP.setText("");
                pldCaIItemHPNumber.setText("");

                pldCaIItemMagic.setText("");
                pldCaIItemMagicNumber.setText("");

                pldCaIItemDex.setText("");
                pldCaIItemDexNumber.setText("");

                pldItemDescriptionHeadline.setText("");
                pldItemDescription.setText("");

            }
        });
    }



// fetch all paladin related informations and set into interface panel
    public void setCharacterStats(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        pldCaIStatsLevel.setText(Character_Stats_Controller.getLevel(CHARACTER_ID));

        pldCaIStatsMainattributeNumber.setText(Character_Stats_Controller.setMainStat(CHARACTER_ID));
        pldCaIStatsLPNumber.setText(Character_Stats_Controller.setCharacterHP(CHARACTER_ID));
        pldCaIStatsDexNumber.setText(Character_Stats_Controller.setCharacterDex(CHARACTER_ID));
        pldCaIStatsMagicNumber.setText(Character_Stats_Controller.setCharacterMagic(CHARACTER_ID));

        pldCaIStatsXPMax.setText(Character_Stats_Controller.getMaxXP(CHARACTER_ID));
        maxXP = Character_Stats_Controller.getMaxXP(CHARACTER_ID);
            int maxXPInt = Integer.parseInt(maxXP);
        pldCaIStatsProgressBar.setMinimum(0);
        pldCaIStatsProgressBar.setMaximum(maxXPInt);

        pldCaIStatsXPCurrent.setText(Character_Stats_Controller.getCurrentXP(CHARACTER_ID));
        currentXP = Character_Stats_Controller.getCurrentXP(CHARACTER_ID);
            int currentXPInt = Integer.parseInt(currentXP);
        System.out.println("CURRENT XP = " + currentXP);
        pldCaIStatsProgressBar.setValue(currentXPInt);

        //System.out.println(pldCaIStatsProgressBar.getValue());
        //System.out.println(pldCaIStatsProgressBar.getMaximum());
    }
}
