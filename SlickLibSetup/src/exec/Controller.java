package exec;
import java.util.ArrayList;
import java.util.HashMap;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import commands.Command;
import programming.*;
import sprite.Sprite;

public class Controller {
	HashMap<Character, Sprite> sprites;
	ArrayList<Command> program;
	int execSpeed;
	int dt;

	public Controller() {
		this(1000);
	}

	public Controller(int execSpeed) {
		this.execSpeed = execSpeed;
		sprites = new HashMap<Character, Sprite>();
		sprites.put('a', new Sprite("res/Robot.png",0,4));
		program = new UserProgram().getProgram();
	}

	public void update(GameContainer gc, int delta) {
		dt += delta;
		if (dt > execSpeed) {
			exec();
			dt = 0;
		}
	}

	private void exec() {
		if (!program.isEmpty()) {
			Command c = program.remove(0);// removes the top command from the program and stores it in 'c'
			sprites.get(c.sprite).runCommand(c.command);
		}else{
			System.out.println("Program Complete");
		}
	}

	public void render(GameContainer gc, Graphics g) {
		for (Sprite s : sprites.values()) {
			s.render(g);
		}
	}
}
