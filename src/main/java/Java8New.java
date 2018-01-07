import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Java8New {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	private static BigDecimal rsval  =BigDecimal.ZERO;

	public static boolean filteronDate(Map<String, String> date, String reportDate)  {
		{
			try {
				
				return (sdf.parse(date.get("ReportDate")).compareTo(sdf.parse(reportDate)) > 0);
			} catch (ParseException e) {
				e.printStackTrace();
				return false;
			}

		}
	}
	
	public static BigDecimal filteronValue(String val) {
		{
			if (!val.equalsIgnoreCase("null")) {
				return new BigDecimal(val);
			}
			return BigDecimal.ZERO;
		}
	}
	
	/*public static void  result(BigDecimal val) {
		
		rsval.add(val);
	}*/
	
	public static void main(String arg[]) throws ParseException {

		

		Map<String, String> str4 = new HashMap<String, String>();
		str4.put("ReportDate", "31-Aug-2018");
		str4.put("Value", "200");

		Map<String, String> str3 = new HashMap<String, String>();
		str3.put("ReportDate", "30-Sep-2018");
		str3.put("Value", "150");

		Map<String, String> str2 = new HashMap<String, String>();
		str2.put("ReportDate", "31-Oct-2018");
		str2.put("Value", "null");

		Map<String, String> str1 = new HashMap<String, String>();
		str1.put("ReportDate", "30-Nov-2018");
		str1.put("Value", "250");

		Map<String, String> str5 = new HashMap<String, String>();
		str5.put("ReportDate", "31-Dec-2018");
		str5.put("Value", "350");

		List<Map<String, String>> numberList = new ArrayList<Map<String, String>>();
		numberList.add(str4);
		numberList.add(str3);
		numberList.add(str2);
		numberList.add(str1);
		numberList.add(str5);

		System.out.println(sdf.parse("30-Sep-2018"));

		List<BigDecimal> filterNumber = numberList.stream().filter(number -> filteronDate(number,"30-Sep-2018")
		).limit(3).map(ele -> filteronValue(ele.get("Value"))).collect(Collectors.toList());
		filterNumber.forEach(rs->rsval=rsval.add(rs));
		
		//numberList.stream().filter(number -> filteronDate(number,"30-Sep-2018")
		//).limit(3).map(ele -> filteronValue(ele.get("Value"))).forEach(System.out::println);
	
		System.out.println(rsval);
		
		// filterNumber.forEach(System.out::println);

		/*
		 * Stream<Map<String, String>> lib = numberList.stream() .filter(number
		 * -> number.get("ReportDate").equalsIgnoreCase("30-Sep-2018"));
		 * 
		 * 
		 * numberList.forEach(number ->{
		 * 
		 * 
		 * atomicInteger.getAndIncrement(); });
		 */

		

	}

}
