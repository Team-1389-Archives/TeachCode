package exec;
import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import sprite.Sprite;
public class DisplayManager extends BasicGame

{
	public static final int width=500,//width of the grid in pixels
	height=400,//height of the grid in pixels
	gridSpacing=50;//grid spacing must divide evenly with width and height
	public static final int
	gridWidth=width/gridSpacing,
	gridHeight=height/gridSpacing,
	dotSize=2;//size of the grid marks in pixels
	Controller robot;
	ArrayList<Sprite> sprites;
    public DisplayManager()
    {
        super("Hands On Code");
    }
 
    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new DisplayManager());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
 
    @Override
    public void init(GameContainer container) throws SlickException
    {
    	sprites=new ArrayList<>();
    	Sprite.setDisplayManager(this);
    	robot=new Controller();
    }
    public void attach(Sprite sprite){
    	sprites.add(sprite);
    }
 
    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    	robot.update(container,delta);
    	for(Sprite sprite:sprites){
    		sprite.update(container,delta);
    	}
    }
 
    public void render(GameContainer container, Graphics g) throws SlickException
    {
    	g.setBackground(Color.black );
    	g.setColor(Color.white);
    	for(int x=gridSpacing;x<width;x+=gridSpacing){
    		for(int y=gridSpacing;y<height;y+=gridSpacing){
    			g.fillOval(x-dotSize/2, y-dotSize/2, dotSize,dotSize);
    		}
    	}
		for (Sprite s : sprites) {
			s.render(g);
		}
    }
}