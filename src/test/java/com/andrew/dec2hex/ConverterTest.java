/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.dec2hex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew Wright
 */
public class ConverterTest {
    
    public ConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toHex method, of class Converter.
     */
    @Test
    public void testToHex() 
    {
        System.out.println("toHex");
        String argument = "12";
        Converter instance = new Converter();
        String expResult = "C";
        String result = instance.toHex(argument);
        
        //assert that the result we expect comes out. If the result that is expecte is generated then the test will pass. If not, then it will fail
        assertEquals(expResult, result);
        assertEquals("D", instance.toHex("13"));
        assertEquals("7B", instance.toHex("123"));
        assertEquals("D", instance.toHex("13"));
        assertEquals("2710", instance.toHex("10000"));
    }
    
}
