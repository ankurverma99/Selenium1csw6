package org.qsp.weekend.ioDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("sData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s = null;
			if (o instanceof Student) {
				s = (Student) o;
				System.out.println(s.name + " " + s.dept + " " + s.pecr + " " + s.roll);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
