/*
 * A program to show list of all file names in a folder.
 */

//Author:Sreelekshmi

package com.innovapath.programingpractice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilesFolder {
	
	public static List<String> listf(String directoryName) throws IOException,NullPointerException{
        File directory = new File(directoryName);

        List<String> resultList = new ArrayList<String>();

        // get all the files from a directory
        File[] fList = directory.listFiles();
     
        for (File file : fList) {
            if (file.isFile()) {
                resultList.add(file.getAbsolutePath());
            } 
        }
        return resultList;
    } 
	
	

}
