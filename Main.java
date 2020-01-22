package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

Scanner in =new Scanner(System.in);

System.out.println("Please input day of week");

        String day = in.nextLine().trim().toLowerCase();

        DayResolver.WorkOrWeekend(day);

        System.out.println("Please input work or weekend");

        String dayType = in.nextLine().trim().toLowerCase();

        DayResolver.WhatDays(dayType);

    }
}
