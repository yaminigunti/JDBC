package com.cts.CD.model;

public class Person implements Comparable<Person> {
		private String name;
		private int age;
		
		public Person() {
			/* default Constructor */
		}
		public Person(String name, int age) {
			super();
		this.name=name;
		this.age=age;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
			
			@Override
		public boolean equals(Object obj) {
			if(this==obj)
				return true;
			if(obj==null)
				return false;
			if(this.getClass()!=obj.getClass())
				return false;
			Person other=(Person)obj;
			if(age!=other.age)
				return false;
			if(name==null) {
				if(other.name!=null)
					return false;
			}
			else if(!name.contentEquals(other.name))
				return false;
			return true;
			}
			
			@Override
			public String toString() {
				return "Person[name="+name+",age="+age+"]";
			}
			public int compareTo(Person other) {
				if(this.name.contentEquals(other.name))
					return this.age-other.age;
				else
				return this.name.compareTo(other.name);
			}
		
		
}
