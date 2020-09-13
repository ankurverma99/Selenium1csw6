package org.qsp.weekend.ioDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSaveDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Aman";
		s.dept = "cs";
		s.roll = 123;
		s.pecr = 73.5;
		FileOutputStream fos;
		ObjectOutputStream ops;
		try {
			fos = new FileOutputStream("sData.txt");
			ops = new ObjectOutputStream(fos);
			ops.writeObject(s);
			ops.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("App end");
	}

}
