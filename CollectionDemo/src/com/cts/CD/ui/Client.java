package com.cts.CD.ui;

//import java.util.LinkedHashSet;//

import java.util.Set;
import java.util.TreeSet;

import com.cts.CD.model.Person;

public class Client {
	public static void main(String[]args) {
		Set<Person>persons=new TreeSet<>();
		persons.add(new Person("yam",22));
		persons.add(new Person("jam",21));
		persons.add(new Person("yam",23));
		persons.add(new Person("jaan",23));
		for(Person person:persons) {
		System.out.println(person);
		}
	}
}
