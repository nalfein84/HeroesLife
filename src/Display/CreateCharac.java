package Display;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 * 
 */
public class CreateCharac extends Menu {

    /**
     * Default constructor
     */
    public CreateCharac(MyFrame frame) {
    	super("New Character", "Create Character", "Return", new ImageIcon(), frame);
    }

	@Override
	protected JPanel centre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doOnAnnuler() {
		this.frame.changeToMainMenu();
	}

	@Override
	protected void doOnAccept() {
		// TODO Auto-generated method stub
		this.frame.changeToMainMenu();
	}


}