package padroes.p11.command.cenario01;

import java.util.ArrayList;
import java.util.List;

//invoker
public class Switcher {

	public List<Command> commandList;
	
	public Switcher(){
		this.commandList = new ArrayList<>();
	}
	
	public void addCommand(Command command){
		this.commandList.add(command);
	}
	
	public void executeCommands(){
		for(Command command : this.commandList){
			command.execute();
		}
	}
}
