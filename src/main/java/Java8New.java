import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Java8New {

	public static void main(String arg[]) {

		final int i = 0;
		Map<String, String> str1 = new HashMap<String, String>();
		str1.put("ReportDate", "31-Aug-2018");
		str1.put("Value", "200");

		Map<String, String> str2 = new HashMap<String, String>();
		str2.put("ReportDate", "29-Sep-2018");
		str2.put("Value", "150");

		Map<String, String> str3 = new HashMap<String, String>();
		str3.put("ReportDate", "30-Sep-2018");
		str3.put("Value", "150");

		List<Map<String, String>> numberList = new ArrayList<Map<String, String>>();
		numberList.add(str1);
		numberList.add(str2);
		numberList.add(str3);

		AtomicInteger atomicInteger = new AtomicInteger(0);

		/*
		 * int filterNumber = numberList.stream() .filter(number -> number==5)
		 * .collect(Collectors.toList()).indexOf(5);
		 */

		// filterNumber.forEach(System.out::println);

	/*	Stream<Map<String, String>> lib = numberList.stream()
				.filter(number -> number.get("ReportDate").equalsIgnoreCase("30-Sep-2018"));
				

		 numberList.forEach(number ->{
		 
			
		 atomicInteger.getAndIncrement(); });*/
		 
		System.out.println(atomicInteger.get());

		/*
		 * Stream<Object> index = numberList.stream().map(n -> {
		 * 
		 * 
		 * if(n.get("ReportDate").equalsIgnoreCase("31-Aug-2018")){ return
		 * atomicInteger; }
		 * 
		 * });
		 */

	}

}
