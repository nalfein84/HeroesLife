package Display;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 
 */
public class Parameter extends Menu {

    /**
     * Default constructor
     */
    public Parameter(MyFrame frame) {
    	super("Parameter", "Done", "Return", new ImageIcon(), frame);
    }

	@Override
	protected JPanel centre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doOnAnnuler() {
		frame.changeToMainMenu();
	}

	@Override
	protected void doOnAccept() {
		// TODO Auto-generated method stub
		frame.changeToMainMenu();
	}


}