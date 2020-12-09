package com.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	 private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		/*try {
			String secret = "60ec99bc-ae36-11e9-a2a3-2a2ae2dbcce4";
			String message = "123456789012345678901234567890http://10.10.29.94:8080";

			Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
			SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
			sha256_HMAC.init(secret_key);

			String hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
			System.out.println(hash);
		} catch (Exception e) {
			System.out.println("Error");
		}*/
		/*int year = 2009;
	    int month = 2; // January
	    int date = 1;
		Calendar cal = Calendar.getInstance();
	    cal.clear();

	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month-1);
	    cal.set(Calendar.DATE, date);

	    java.util.Date utilDate = cal.getTime();
	    System.out.println(utilDate);*/
		
		//dateConstruction();
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString().replace("[", "").replace("]", ""));*/
		
		StringBuffer sb = new StringBuffer("");
        String dateParameter = sb.append(simpleDateFormat.format(new Date())).append(";").append(simpleDateFormat.format(new Date())).toString();
        System.out.println("Date : "+dateParameter);
		
		
	}
	public static String splitCamelCaseString(String s){
	    StringBuffer sb = new StringBuffer("");
	    for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
	    	if(sb.toString().equalsIgnoreCase("")) {
	    		sb.append(w);
	    	}else {
	    		sb.append(" "+w);
	    	}
	    }    
	    return sb.toString();
	}
	
	public static void dateConstruction(){
		Map<String,Date>  dateMap = new HashMap<String, Date>();
		Date today = new Date();
		
		Calendar currentdayCal = Calendar.getInstance();
		currentdayCal.setTime(today);
		
		Calendar startCal = Calendar.getInstance();
		startCal.setTime(today);
		startCal.set(Calendar.HOUR_OF_DAY, 0);
		startCal.set(Calendar.MINUTE, 0);
		startCal.set(Calendar.SECOND, 0);
		
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(today);
		endCal.set(Calendar.HOUR_OF_DAY, 23);
		endCal.set(Calendar.MINUTE, 59);
		endCal.set(Calendar.SECOND, 59);
		
		if(currentdayCal.get(Calendar.DAY_OF_MONTH) == 3) {
			startCal.add(Calendar.MONTH, -1);
			startCal.set(Calendar.DAY_OF_MONTH, 22);
			
 
			endCal.add(Calendar.MONTH, -1);
			endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH));
			
		}else {
			startCal.add(Calendar.DATE, -9);
			
			endCal.add(Calendar.DATE, -3);
		}
		dateMap.put("startDate", startCal.getTime());
		dateMap.put("endDate", endCal.getTime());
		System.out.println("Start date : "+dateMap.get("startDate") + " and end date: "+dateMap.get("endDate"));
		
	}
	
	
	
}