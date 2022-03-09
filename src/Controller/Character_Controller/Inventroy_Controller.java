package Controller.Character_Controller;

import Controller.General_Controller.SQL_Controller;

public class Inventroy_Controller {

public static String setWeapon(int CHARACTER_ID) {

    String weapon = null;
    CHARACTER_ID = CHARACTER_ID;

    int charLevel = Integer.parseInt(Character_Stats_Controller.getLevel(CHARACTER_ID));
    return weapon;
}

public static String setWeaponStats(String ITEM, String ATTRIBUTE) {

       ITEM = ITEM;
       ATTRIBUTE = ATTRIBUTE;

       int itemID = Integer.parseInt(SQL_Controller.fetchInt(ITEM, "PLAYABLE_CHARACTER", 1));
       //System.out.println("itemID : " + itemID);
       String attribute = SQL_Controller.fetchItemStr(ITEM,itemID,ATTRIBUTE);
       //System.out.println("attribute : " + attribute);

       return attribute;
    }





}
