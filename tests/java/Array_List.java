// Java program to illustrate creating an array 
// of integers, puts some values in the array, 
// and prints each value to standard output. 

import java.io.*; 
import java.lang.*; 
import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.LinkedList;
import java.util.ArrayList;

public class Array_List 
{ 
	public static void mem_info(String str)
	{
		System.out.println("=========================================");
		System.out.println(str + "\n");
		System.out.println("=========================================");
		for(MemoryPoolMXBean memoryPoolMXBean: ManagementFactory.getMemoryPoolMXBeans()){
			System.out.println(memoryPoolMXBean.getName());
			System.out.println(memoryPoolMXBean.getUsage().getUsed());
		}
	}

	public static void gc()
	{
		System.out.println("=========================================");
		System.out.println("Call GC");
		System.gc();
		System.out.println("=========================================");
	}

	public static void main (String[] args) 
	{		 
		// declares an Array of integers. 
		// allocating memory for 5 integers. 
		//
		int num_elements =10000;
        System.out.println("MAX:"+num_elements);

		mem_info("Memory Before");

		// Create the array list
		ArrayList<String> arl = new @Cache ArrayList<String>();
        String str2 = new @Cache String("Testttttttttttttttttttttttttttttttttttttttttttttttt");
		// Add data to the list
		for (int i = 0; i < num_elements; i++)
		{
			String str = new @Cache String("Hello World for the first time");
			arl.add(str);
			String str1 = new @Cache String("Hello World its me giannos");
			arl.add(str1);
            //gc();
		}
		gc();

        /*
		long x = 0;
		// Traverse all the data of the list
		for (int i = 0; i < num_elements; i++)
		{
			x += arl.get(i).hashCode();
		}
		System.out.println("Hashcode Element = " + x);
       */ 
        //gc();

        /*
		x = 0;
		for (int i = 0; i < num_elements; i++)
		{
			x += arl.get(i).hashCode();
		}
		System.out.println("Hashcode Element = " + x);


		gc();

		x = 0;
		for (int i = 0; i < num_elements; i++)
		{
			x += arl.get(i).hashCode();
		}
		System.out.println("Hashcode Element = " + x);

		gc();

		x = 0;
		System.gc();
		for (int i = 0; i < num_elements; i++)
		{
			x += arl.get(i).hashCode();
		}

		System.out.println("Hashcode Element = " + x);

		gc();
	*/	
		mem_info("Memory After");
	} 
} 

