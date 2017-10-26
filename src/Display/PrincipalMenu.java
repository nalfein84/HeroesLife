package Display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 */
public class PrincipalMenu extends PanelFond {

	final private String NEWCHAR = "New Character";
	final private String NEWGAME = "New Game";
	final private String PARAMET = "Parameter";
	final private String LOADGAM = "Load Game";
	final private String QUITGAM = "Quit";
	private MyFrame frame;
	
    /**
     * Default constructor
     */
    public PrincipalMenu(MyFrame frame) {
    	super(new ImageIcon());
    	this.frame = frame;
    	add(center());
    }
    
    private JPanel center() {
    	JPanel panel = new JPanel();
    	panel.setOpaque(false);
    	panel.add(createButton(NEWCHAR));
    	panel.add(createButton(NEWGAME));
    	panel.add(createButton(PARAMET));
    	panel.add(createButton(LOADGAM));
    	panel.add(createButton(QUITGAM));
    	return panel;
    }
    
    private JButton createButton(String name) {
		JButton button = new JButton(name);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals(NEWCHAR)) {
					frame.changeToNewPerso();
				} else if (e.getActionCommand().equals(NEWGAME)) {
					frame.changeToNewGame();
				} else if (e.getActionCommand().equals(PARAMET)) {
					frame.changeToParameter();
				} else if (e.getActionCommand().equals(LOADGAM)) {
					frame.changeToLoadGame();
				}
				
			}
		});
    	return button;
    }


}