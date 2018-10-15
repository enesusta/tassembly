/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistapp;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Enes
 */
public class FileChooserDemo {

    private String path;
	private	StringBuilder sb=new StringBuilder();
    	public FileChooserDemo() {
        JFileChooser jfc=new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    	int returnValue=jfc.showOpenDialog(null);
    
    	if(returnValue==JFileChooser.APPROVE_OPTION) {
    	    File selectedFile=jfc.getSelectedFile();
        	path=selectedFile.toString();
    	}
	String currentPath[]=path.split("\\\\");
	
	for(int i=0;i<currentPath.length-1;i++){
		currentPath[i]=currentPath[i]+"\\\\";	
	}
	for(int i=0;i<currentPath.length;i++){
		sb.append(currentPath[i]);
	}
	System.out.print(sb);
    }
    
    public StringBuilder getPath() {
	return sb;
    }
    
    
   }
