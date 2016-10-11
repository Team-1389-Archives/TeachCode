package userCommands;

import org.newdawn.slick.Input;

import commands.Command;
import sprite.Sprite;

public class ControlSpriteCommand extends Command {
	boolean debounce;
	Input input;
	Sprite sprite;

	public ControlSpriteCommand(Input input, Sprite sprite) {
		this.input = input;
		this.sprite = sprite;
	}

	@Override
	public void init() {
		super.init();
		debounce = false;
	}

	@Override
	protected boolean execute() {
		if (input.isButton1Pressed(0)) {
			System.out.println(debounce);
			if (!debounce) {
				System.out.println("going");
				debounce=true;
				sprite.setX(sprite.getX() + 1);
			}
		} else {
			debounce = false;
		}
		return false;
	}

}
