package com.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
	public static void main(String[] args) {
		Stream<Integer> str=Stream.of(1,2,3,4,5);
		str.forEach(g->System.out.println(g));
		String [] name=new String[] {"pavan","govardhan","pavan","mahesh"};
		Stream<String> arr1=Arrays.stream(name);
		arr1.forEach(System.out::println);
		List<String> lis=Arrays.asList(name);
		Stream<String> arr2=lis.stream();
		//arr2.map(nu->nu.length()).forEach(System.out::println);
		//Set<String> set=arr2.collect(Collectors.toSet());
		//System.out.println(set);
	//	Map<Integer,String>  map=arr2.collect(Collectors.toMap(, valueMapper));
		//arr2.filter(nam->nam.length()>6).forEach(System.out::println);
		//arr2.skip(2).forEach(System.out::println);
		//arr2.limit(3).forEach(System.out::println);
		arr2.distinct().forEach(System.out::println);

	
	}

}
