package com.codewars.kyu7.hidePasswordFromJdbcUrl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We have to create a function that receives a connection string with password included and you have to mask
 * the password i.e. change password by asterisks.
 * <p>
 * Preconditions:
 * <ul>
 * <li>non empty valid url</li>
 * <li>password always next to string section password=</li>
 * <li>assume password will not contain ampersand sign for sake of simplicity</li>
 * <li>to make it more real it has non ASCII characters</li>
 * <li>"password=" and "user" will occur only once</li>
 * <li>empty passwords are not validated but best solutions take empty passwords into account</li>
 * </ul>
 * <p>
 * Example:
 * <p>
 * input<br/>
 * jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345
 * <p>
 * output<br/>
 * jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****
 * <p>
 * Extra readings:
 * <p>
 * <a href="https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver">https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver</a>
 */
public class PasswordHider {
    private final static String PASSWORD_KEY = "password=";

    private final static String PASSWORD_PATTERN = "password=([^&]*)";

    public static String hidePasswordFromConnection(String urlString) {
        if (urlString == null || urlString.isEmpty() || !urlString.contains(PASSWORD_KEY)) {
            return null;
        }

        Matcher matcher = Pattern.compile(PASSWORD_PATTERN).matcher(urlString);
        matcher.find();
        String password = matcher.group(1);

        return urlString.replaceAll(PASSWORD_PATTERN, PASSWORD_KEY + (password != null ? "*".repeat(password.replace(PASSWORD_KEY, "").length()) : ""));
    }
}
