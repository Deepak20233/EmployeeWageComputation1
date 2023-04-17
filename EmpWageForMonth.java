package com.java;

public class EmpWageForMonth {

	public static void main(String[] args) {
		int empWage=20;
		int sum=0;
		int numberOfDays=20;
        for (int i = 1; i <= numberOfDays; i++) {
            double isPresent = Math.random() * 3;
            
            if (isPresent >= 2) {
                sum += empWage;
                System.out.println("Employee is present");
            }
            else if (isPresent >= 1 && isPresent < 2) {
                sum += (empWage/ 2);
                System.out.println("Employee is partial present");
            }
            else {
                System.out.println("Employee is absent");
                System.out.println("Employee earned " + 0);
            }
            System.out.println("Employee earned " + sum);

}
	}
	}

