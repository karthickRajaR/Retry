package com.run.failedTests;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void test3() {
//		Assert.assertTrue(false);
//		System.out.println("This is third method");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String input = scan.nextLine();
		System.out.println("Entered text is: " + input);
		String input1 = "Java";
		if (input.equals(input1)) {
			System.out.println("Text matched...");
		} else {
			System.out.println("!Invalid text given...");
		}
	}

}