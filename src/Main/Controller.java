package Main;

import java.util.*;

import DB.Save;
import Display.MyFrame;
import Map.Map;

/**
 * 
 */
public class Controller {

    private static Controller instance = new Controller();

	/**
     * Default constructor
     */
    public Controller() {
    }




    /**
     * 
     */
    private MyFrame frame;

    /**
     * 
     */
    private Save save;

    /**
     * 
     */
    private Map map;

    /**
     * 
     */
    public void createPerso() {
        // TODO implement here
    }

    /**
     * 
     */
    public void generateWorld() {
        // TODO implement here
    }

	public static Controller getInstance() {
		return instance ;
	}

}