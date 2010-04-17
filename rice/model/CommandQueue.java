package rice.model;

import java.util.ArrayList;
import java.util.List;

import rice.model.command.Command;

/**
 * This class represents the queue of commands found within a controllable
 * @author Marcos
 *
 */
public class CommandQueue {

	/**
	 * So that Eclipse doesn't complain
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Command> commandList;
	
    public CommandQueue() {
		commandList = new ArrayList<Command>();
	}
    
    public void addCommand(Command c) {
    	commandList.add(c);
    }
    
    public String[] getCommandStrings() {
    	String[] commands = new String[commandList.size()];
    	for(int i = 0; i < commandList.size(); i++){
    		commands[i] = commandList.get(i).toString();
    	}
    	return commands;
    }

}
