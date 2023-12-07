package com.codewars.kyu7.acronymGenerator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AcronymGeneratorTest {

    @Test
    public void testSimple() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Meyer", "Thomas"), is("TM"));
    }

    @Test
    public void testMultipleLastNames() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Meyer-Schmidt", "Paul"), is("PMS"));
    }

    @Test
    public void testMultipleFirstNamesWithBlank() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Mueller", "Jan Erich"), is("JEM"));
    }

    @Test
    public void testMultipleFirstNamesWithDash() throws Exception {
        assertThat(AcronymGenerator.createAcronym("Schmidt", "Jan-Erich"), is("JES"));
    }

    @Test
    public void testVonName() throws Exception {
        assertThat(AcronymGenerator.createAcronym("von Lahnstein", "Peter"), is("PvL"));
    }
}
