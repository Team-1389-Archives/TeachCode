package commands;
import sprite.Sprite;
import commands.Command;
public class MoveDownCommand extends Command{
	private Sprite sprite;
	public MoveDownCommand(Sprite controlledSprite){
		this.sprite= controlledSprite;
		
	}
	@Override
	 protected boolean execute(){
		 this.sprite.setY(this.sprite.getY()-1);
		return true; 
	 }
	

}
