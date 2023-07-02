package ascending;

import java.io.*;
import java.util.*;

public class Ascending {
	
	static String directory= "C:\\Users\\sahagraw\\OneDrive - Cisco\\Desktop\\LockedMe\\src\\Storage";
	public static void ascendingOrder() {
		
		File[] files = new File(directory).listFiles();
		Set<String> a = new TreeSet<>();
		for(File file : files) {
			if (!file.isFile()) {
				continue;
			}
			a.add(file.getName());
		}
		a.forEach(i->System.out.println(i));

	}
}
