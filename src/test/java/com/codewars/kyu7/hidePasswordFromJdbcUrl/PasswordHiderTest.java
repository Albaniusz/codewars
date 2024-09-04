package com.codewars.kyu7.hidePasswordFromJdbcUrl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordHiderTest {

    @Test
    public void hidePasswordFromConnection() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
    }

    @Test
    public void emptyPassword() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password="));
    }

    @Test
    public void paramAfterPassword() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=********&xxx=123", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=lorem123&xxx=123"));
    }

    @Test
    public void nationalCharsInPassword() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=********************&xxx=123", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=lorem123ñedcvfr45tgb&xxx=123"));
    }


//    nonEmptyValidUrl
//    passwordAlwaysNextToStringSectionPassword
//    assumePasswordWillNotContainAmpersandSignForSakeOfSimplicity
//    passwordHasNonAsciiCharacters
//    passwordAndUserWillOccurOnlyOnce
//    empty passwords are not validated but best solutions take empty passwords into account
}
