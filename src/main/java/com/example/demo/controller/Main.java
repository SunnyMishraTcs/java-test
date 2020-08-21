package com.example.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="sunny kumar mishra";
		//List<String> s1=Arrays.asList(string.split(" "))
		 String s=Arrays.asList(string.split(" ")).stream().map( ss-> ss.toUpperCase()).collect(Collectors.joining("."));
		 System.out.println(s);
		 
		 
		// LocalDateTime l=LocalDateTime.parse("2020-08-13 11:15:50 AM");
		// System.err.println(l);
		 String ss="2020-08-17 11:15:50 AM";
		 String ss1="2020-08-17 11:15:50 PM";
		 String ss2="2020-08-11 11:15:50 AM";
		 String ss3="2020-09-17 11:15:50 AM";
		// DateTimeFormatter d= DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss aa");
		// d.
		 Date d1 = null,d2=null,d3=null,d4=null;
		try {
			d1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa").parse(ss);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		/*
		 * DateTimeFormatter myFormatObj =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss aa"); SimpleDateFormat
		 * format=new SimpleDateFormat("yyyy-MM-dd hh:mm a"); try {
		 * System.out.println(format.parse(ss)); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */// System.out.println(l1);
		 
		 List<Bean1> list=new ArrayList<Bean1>();
		 Bean1 b1=new Bean1("A",d1,"101");
		 Bean1 b2=new Bean1("D",d2,"108");
		 Bean1 b3=new Bean1("C",d3,"103");  
		 Bean1 b4=new Bean1("B",d4,"99");
		 System.out.println("+++++++++++++++++");
		 list.add(b1);
         list.add(b2);
         list.add(b3);
         list.add(b4);
         
		 
		 Set<Bean1> set=new HashSet<Bean1>(list);
		 System.err.println(set);
		 System.out.println("_________________");
		 
		 
      //.forEach(sss -> System.out.println(sss.getId()));;
		 
		 
		 
		 
		 
		 
		 
		 List<T>  newList=  list.stream().sorted((s1,s2) -> s1.getDate().compareTo(s2.getDate())).collect(Collectors.toList());
         

	}

}
