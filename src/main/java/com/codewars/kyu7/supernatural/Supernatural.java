package com.codewars.kyu7.supernatural;

import java.util.HashMap;
import java.util.Map;

/**
 * This kata is a tribute/fanwork to the TV-show: Supernatural
 * <p>
 * Balls!
 * <p>
 * Those wayward Winchester boys are in trouble again, hunting something down in New Orleans. You are Bobby Singer,
 * you know how "idjits" they can be, so you have to prepare. They will call you any minute with the race of the thing,
 * and you want to answer as soon as possible. By answer, I mean: tell them how to kill, or fight it.
 * <p>
 * You have something like a database (more like drunken doodling) to help them:
 * <ul>
 * <li>werewolf : Silver knife or bullet to the heart</li>
 * <li>vampire : Behead it with a machete</li>
 * <li>wendigo : Burn it to death</li>
 * <li>shapeshifter : Silver knife or bullet to the heart</li>
 * <li>angel : Use the angelic blade</li>
 * <li>demon : Use Ruby's knife, or some Jesus-juice</li>
 * <li>ghost : Salt and iron, and don't forget to burn the corpse</li>
 * <li>dragon : You have to find the excalibur for that</li>
 * <li>djinn : Stab it with silver knife dipped in a lamb's blood</li>
 * <li>pagan god : It depends on which one it is</li>
 * <li>leviathan : Use some Borax, then kill Dick</li>
 * <li>ghoul : Behead it</li>
 * <li>jefferson starship : Behead it with a silver blade</li>
 * <li>reaper : If it's nasty, you should gank who controls it</li>
 * <li>rugaru : Burn it alive</li>
 * <li>skinwalker : A silver bullet will do it</li>
 * <li>phoenix : Use the colt</li>
 * <li>witch : They are humans</li>
 * <li>else : I have friggin no idea yet</li>
 * </ul>
 * You can access the database as drunkenDoodling/drunken_doodling/DrunkenDoodling depending on your language.
 * <p>
 * So a call would go down like this:
 * <p>
 * The guys call you: bob('rugaru')
 * <p>
 * ...and you reply (return) with the info, and your signature saying of yours! Burn it alive, idjits!
 */
public class Supernatural {

    private final static Map<String, String> db = new HashMap<>();

    private final static String NO_IDEA = "I have friggin no idea yet";

    static {
        db.put("werewolf", "Silver knife or bullet to the heart");
        db.put("vampire", "Behead it with a machete");
        db.put("wendigo", "Burn it to death");
        db.put("shapeshifter", "Silver knife or bullet to the heart");
        db.put("angel", "Use the angelic blade");
        db.put("demon", "Use Ruby's knife, or some Jesus-juice");
        db.put("ghost", "Salt and iron, and don't forget to burn the corpse");
        db.put("dragon", "You have to find the excalibur for that");
        db.put("djinn", "Stab it with silver knife dipped in a lamb's blood");
        db.put("pagan god", "It depends on which one it is");
        db.put("leviathan", "Use some Borax, then kill Dick");
        db.put("ghoul", "Behead it");
        db.put("jefferson starship", "Behead it with a silver blade");
        db.put("reaper", "If it's nasty, you should gank who controls it");
        db.put("rugaru", "Burn it alive");
        db.put("skinwalker", "A silver bullet will do it");
        db.put("phoenix", "Use the colt");
        db.put("witch", "They are humans");
    }

    public static String bob(String beast) {
        return db.getOrDefault(beast, NO_IDEA) + ", idjits!";
    }
}
