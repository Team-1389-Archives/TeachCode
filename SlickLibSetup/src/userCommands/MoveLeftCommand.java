package userCommands; // folder name
import commands.Command;
import sprite.Sprite; 
public class MoveLeftCommand extends Command{ // name of the class
	

		private Sprite controlledSprite; // making a new variable called controlledSprite
		private int spaces; 
		public MoveLeftCommand(Sprite controlledSprite, int spaces){
			this.controlledSprite=controlledSprite;
			this.spaces=spaces;
		}
		@Override
		public boolean execute() {
			controlledSprite.setX(controlledSprite.getX()-1);
		
			return true;
		}
		
	}


