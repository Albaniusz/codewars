package com.codewars.kyu8.welcome;

import java.util.HashMap;
import java.util.Map;

/**
 * Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding
 * countries. Marketing thinks it would be great to welcome visitors to the site in their own language.
 * Luckily you already use an API that detects the user's location, so this is an easy win.
 * <p>
 * <h2>The Task</h2>
 * Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
 * Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
 * <p>
 * <h2>The Database</h2>
 * [ ("english", "Welcome")<br/>
 * , ("czech", "Vitejte")<br/>
 * , ("danish", "Velkomst")<br/>
 * , ("dutch", "Welkom")<br/>
 * , ("estonian", "Tere tulemast")<br/>
 * , ("finnish", "Tervetuloa")<br/>
 * , ("flemish", "Welgekomen")<br/>
 * , ("french", "Bienvenue")<br/>
 * , ("german", "Willkommen")<br/>
 * , ("irish", "Failte")<br/>
 * , ("italian", "Benvenuto")<br/>
 * , ("latvian", "Gaidits")<br/>
 * , ("lithuanian", "Laukiamas")<br/>
 * , ("polish", "Witamy")<br/>
 * , ("spanish", "Bienvenido")<br/>
 * , ("swedish", "Valkommen")<br/>
 * , ("welsh", "Croeso")<br/>
 * ]
 * <p>
 * Possible invalid inputs include:
 * <p>
 * IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address<br/>
 * IP_ADDRESS_NOT_FOUND - ip address not in the database<br/>
 * IP_ADDRESS_REQUIRED - no ip address was supplied
 */
public class Welcome {

    private static final Map<String, String> database;

    static {
        database = new HashMap<>();

        database.put("english", "Welcome");
        database.put("czech", "Vitejte");
        database.put("danish", "Velkomst");
        database.put("dutch", "Welkom");
        database.put("estonian", "Tere tulemast");
        database.put("finnish", "Tervetuloa");
        database.put("flemish", "Welgekomen");
        database.put("french", "Bienvenue");
        database.put("german", "Willkommen");
        database.put("irish", "Failte");
        database.put("italian", "Benvenuto");
        database.put("latvian", "Gaidits");
        database.put("lithuanian", "Laukiamas");
        database.put("polish", "Witamy");
        database.put("spanish", "Bienvenido");
        database.put("swedish", "Valkommen");
        database.put("welsh", "Croeso");
    }

    public static String greet(String language) {
        return database.containsKey(language) ? database.get(language) : database.get("english");
    }
}
