package de.bschandera.gut;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.io.IOException;

import static de.bschandera.gut.Main.GUT;

public class Add {
    private static final File STAGE = new File(GUT + "/stage");
    private static final File ROOT = new File(".");
    private static final boolean APPEND = true;

    public boolean add(String fileName) {
        try {
            if (FileUtils.directoryContains(ROOT, new File(fileName))) {
                FileUtils.writeStringToFile(STAGE, getPath(fileName), APPEND);
                return true;
            } else {
                System.out.println(fileName + " does not exist. Please spell it rightly.");
                System.out.println("Directory:");
                FileUtils.listFilesAndDirs(ROOT, TrueFileFilter.INSTANCE,
                        FalseFileFilter.INSTANCE).stream().forEach(file -> System.out.println(file));
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getPath(String fileName) {
        return new File(fileName).getAbsolutePath();
    }

}
