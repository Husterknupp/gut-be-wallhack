package de.bschandera.gut;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Commit {
	// TODO: Pls calculate CommitId from Head+1. CommitId as transfer parameter
	// as int.
	public boolean changeLog(int commitId) {
		String newLog = "";
		try {

			//newLog = Integer.toString(commitId)+"\n";
			for (int i = commitId; i >= 0; i--) {
				newLog = newLog + Integer.toString(i)+"\n";
			}

			FileUtils.writeStringToFile(new File(".gut/log"), newLog);

			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}