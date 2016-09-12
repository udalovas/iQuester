package com.iquester;

import com.iquester.domain.model.Quest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    public void change(int input) {
        input = 0;
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );

        int input = 1;
        change(input);

        assertEquals(1, input);

        final Quest quest = new Quest("","");
        quest.setId("1"); // I don't want it to be corrected!
    }
}
