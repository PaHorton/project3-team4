package profApp.DeskApp;

import java.io.File;

import javax.swing.JFileChooser;

import profApp.Utils.QuizConstants;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JFileChooser jFile =  new JFileChooser();
    	jFile.setDialogTitle("Select directory");
    	jFile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    	jFile.setAcceptAllFileFilterUsed(false);
    	
    	if(jFile.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
    	{
    		File dirName = jFile.getSelectedFile();
    		QuizConstants.directoryName = dirName.getAbsolutePath();
    		//System.out.println(QuizConstants.directoryName);
    	}
        ApplicationWindow appWindow = new ApplicationWindow();
       
    }
}
