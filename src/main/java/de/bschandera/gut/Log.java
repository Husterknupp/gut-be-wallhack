package de.bschandera.gut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Log {

	public boolean log() {
		try {
			FileReader fr = new FileReader(".gut/log");

			BufferedReader logfile = new BufferedReader(fr);
			String line;

			line = logfile.readLine();
			while (line != null) {
				System.out.println(line);
				line = logfile.readLine();
			}

			logfile.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}