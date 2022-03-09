package Controller.Character_Controller;


import Controller.General_Controller.SQL_Controller;

public class Character_Stats_Controller {

    // db connected method to get values from fetch as return of method<
    // character id = id as listed in db (1 paldin, 2 druide, 3 zauberer, 4 jäger)
    public static String setMainStat(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String mainStat = SQL_Controller.fetchInt("MAIN_ATTR", "PLAYABLE_CHARACTER", CHARACTER_ID);
        //System.out.println("mainStat: " + mainStat);
        return mainStat;
    }

    public static String setCharacterHP(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String characterHP = SQL_Controller.fetchInt("HP", "PLAYABLE_CHARACTER", CHARACTER_ID);
        //System.out.println("characterHP: " +  characterHP);
        return characterHP;
    }

    public static String setCharacterDex(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String characterDex = SQL_Controller.fetchInt("DEXTERITY", "PLAYABLE_CHARACTER", CHARACTER_ID);
        //System.out.println("characterDex: " +  characterDex);
        return characterDex;
    }

    public static String setCharacterMagic(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String characterMagic = SQL_Controller.fetchInt("MAGIC", "PLAYABLE_CHARACTER", CHARACTER_ID);
        //System.out.println("characterMagic: " +  characterMagic);
        return characterMagic;
    }

    public static String getLevel(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String characterLevel = SQL_Controller.fetchInt("LEVEL", "PLAYABLE_CHARACTER", CHARACTER_ID);
        //System.out.println("characterLevel: " + characterLevel);
        return characterLevel;
    }

    public static String getCurrentXP(int CHARACTER_ID) {
        CHARACTER_ID = CHARACTER_ID;
        String currentXP = SQL_Controller.fetchInt("CURRENT_XP", "PLAYABLE_CHARACTER", 1 );
        //System.out.println("Current XP = " + currentXP);
        return currentXP;
    }

    public static String getMaxXP(int LEVEL_ID) {
        LEVEL_ID = LEVEL_ID;
        int maxXP = SQL_Controller.fetchMaxXP("XP_TOTAL", 8);
        String maxXPString = String.valueOf(maxXP);
        //System.out.println("Max XP = " + maxXP);
        return maxXPString;

    }

}
