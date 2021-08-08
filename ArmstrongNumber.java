package week1.day1;

import org.apache.poi.util.SystemOutLogger;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num = 153;
	int calculated = 0,remainder,original;
	original = num;
	while(num>0)
	{
		remainder = num%10;
		num=num/10;
		calculated=calculated +(remainder*remainder*remainder);
		
	}
	if(calculated==original)
	{
		System.out.println(original + " is Armstrong Number");
		
	}
	else
	{
		System.out.println("Not an Armstrong Number");
	}
}
}
