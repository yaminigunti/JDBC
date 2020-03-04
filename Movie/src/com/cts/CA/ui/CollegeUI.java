package com.cts.CA.ui;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import com.cts.CA.exception.CollegeException;
import com.cts.CA.model.College;
import com.cts.CA.model.CollegeAppMenu;
import com.cts.CA.service.CollegeServiceImpl;
import com.cts.CA.service.Icollegeservice;

public class CollegeUI {
	private static Icollegeservice bookService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormater;

	public static void main(String[] args) {

		try {
			Icollegeservice collegeService = new Icollegeservice();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}


		scan = new Scanner(System.in);
		dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		CollegeAppMenu menu = null;

		while (menu != CollegeAppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (CollegeAppMenu m : CollegeAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Pleae choose a choice displayed");
				continue;
			}

			if (choice < 0 || choice >= CollegeAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = CollegeAppMenu.values()[choice];
				switch (menu) {
				case ADD:
					doAdd();
					break;
				case LIST:
					doList();
					break;
				case SEARCH:
					doSearch();
					break;
				case REMOVE:
					doRemove1();
					break;
				case QUIT:
					System.out.println("ThanQ Come Again!");
					break;
				}
			}

		}

		scan.close();
//		try {
		//collegeService.persist();
//		} catch (CollegeException e) {
//			e.printStackTrace();
//		}

	}

	private static void doAdd() {
		try {
			College college = new College();
			System.out.print("Cname: ");
			college.setCname(scan.next());
			System.out.print("Sname: ");
			college.setSname(scan.next());
			System.out.print("JoinDate(dd-MM-yyyy): ");
			String pubDtStr = scan.next();

			try {
				college.setJoinDate(LocalDate.parse(pubDtStr, dtFormater));
			} catch (DateTimeException exp) {
				throw new CollegeException(
						"Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			System.out.print("Price: ");
			if (scan.hasNextDouble())
				college.setFee(scan.nextDouble());
			else {
				scan.next();
				throw new CollegeException("fee is a number");
			}

			String bcode = collegeService.add(college);
			System.out.println("college is Added with code: " + cname);
		} catch (CollegeException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doList() {
		List<College> colleges;
		try {
			colleges = collegeService.getAll();
			if (colleges.size() == 0) {
				System.out.println("No Books To display");
			} else {
				for (College c : colleges)
					System.out.println(c);
			}
		} catch (CollegeException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doSearch() {
		System.out.print("Cname: ");
		String bcode = scan.next();

		try {
			College college = collegeService.get(bcode);
			if (college != null) {
				System.out.println(college);
			} else {
				System.out.println("No Such college");
			}
		} catch (CollegeException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doRemove1() {
		System.out.print("BCode: ");
		String bcode = scan.next();
		try {
			boolean isDone = collegeService.delete(cname);
			if (isDone) {
				System.out.println("College is Deleted");
			} else {
				System.out.println("No Such College");
			}
		} catch (CollegeException exp) {
			System.out.println(exp.getMessage());
		}
	}
}



	
