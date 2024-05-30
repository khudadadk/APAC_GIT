package com.test.groupby.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupingBy {

	public static void main(String[] args) {
		Pair<String, Integer> val1 = new Pair<>("Math", 85);
		Pair<String, Integer> val2 = new Pair<>("Physics", 95);
		Pair<String, Integer> val3 = new Pair<>("History", 80);
		List<Pair<String,Integer>> marksheet = new ArrayList<>();
		marksheet.add(val1);
		marksheet.add(val2);
		marksheet.add(val3);
		
		Pair<String, Integer> val1b = new Pair<>("Math", 80);
		Pair<String, Integer> val2b = new Pair<>("Physics", 90);
		Pair<String, Integer> val3b = new Pair<>("History", 70);
		List<Pair<String,Integer>> marksheetb = new ArrayList<>();
		marksheetb.add(val1b);
		marksheetb.add(val2b); 
		marksheetb.add(val3b);
		
		Pair<String, Integer> val1c = new Pair<>("Math", 75);
		Pair<String, Integer> val2c = new Pair<>("Physics", 85);
		Pair<String, Integer> val3c = new Pair<>("History", 60);
		List<Pair<String,Integer>> marksheetc = new ArrayList<>();
		marksheetc.add(val1c);
		marksheetc.add(val2c); 
		marksheetc.add(val3c);
		
		Student student = new Student("Anu", marksheet);
		Student student2 = new Student("Bala", marksheetb);
		Student student3 = new Student("Chanda", marksheetc);
		
		List<Student> slist = new ArrayList<>();
		slist.add(student);
		slist.add(student2);
		slist.add(student3);
		
		List<Pair<String,Integer>> marksheetAll = new ArrayList<>();
		marksheetAll.addAll(marksheet);
		marksheetAll.addAll(marksheetb);
		marksheetAll.addAll(marksheetc);
		Map<Object, List<Pair<String, Integer>>> sortedMarksheets = marksheetAll.stream().collect(Collectors.groupingBy(m -> m.key()));
		for (Map.Entry<Object, List<Pair<String, Integer>>> m : sortedMarksheets.entrySet()) {
			System.out.println("Subject: " + m.getKey());
			System.out.println("Average: " + m.getValue().stream().mapToInt(v -> v.value()).average().getAsDouble());
		}
	}

}
