package f_oop2.access_test;

import java.lang.reflect.Modifier;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMehtod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMehtod();
	
//		System.out.println(am.defaultVar);
//		am.defaultMehod();
		
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.publicVar);
		at.publicMehtod();
		
		System.out.println(at.protectedVar);
		at.protectedMehtod();
		
//		System.out.println(at.defaultVar);
//		at.defaultMethod();
		
//		System.out.println(at.privateVar);
//		at.privateMethod();
	}
}
