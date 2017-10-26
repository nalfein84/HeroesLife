package Display;

import java.util.*;

import javax.swing.JPanel;

import Main.Controller;

import javax.swing.ImageIcon;

/**
 * 
 */
public class NewGame extends Menu {

    /**
     * Default constructor
     */
    public NewGame(MyFrame frame) {
    	super("New Game", "Create World", "Return", new ImageIcon(), frame);
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
		Controller.getInstance().generateWorld();
	}


}