/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrew.dec2hex;

/**
 *
 * @author Andrew Wright
 */
public class Converter 
{
   public String toHex(String argument)
   {
        int Arg1=0;
        
        try 
        {
            Arg1 = Integer.parseInt(argument);
        } 
        catch (NumberFormatException e) 
        {
            System.err.println("Argument" + argument + " must be an integer.");
            System.exit(1);
        }

	

    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
	num = Arg1;
	String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        return hexadecimal;
    }
}
