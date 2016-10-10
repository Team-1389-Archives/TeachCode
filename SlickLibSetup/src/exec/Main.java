package exec;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
public class Main extends BasicGame

{
	public static final int width=500,//width of the grid in pixels
	height=400,//height of the grid in pixels
	gridSpacing=50;//grid spacing must divide evenly with width and height
	public static final int
	gridWidth=width/gridSpacing,
	gridHeight=height/gridSpacing,
	dotSize=2;//size of the grid marks in pixels
	Controller robot;
    public Main()
    {
        super("Hands On Code");
    }
 
    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new Main());
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
    	robot=new Controller();
    }
 
    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    	robot.update(container,delta);
    }
 
    public void render(GameContainer container, Graphics g) throws SlickException
    {
    	g.setBackground(Color.white );
    	g.setColor(Color.black);
    	for(int x=gridSpacing;x<width;x+=gridSpacing){
    		for(int y=gridSpacing;y<height;y+=gridSpacing){
    			g.fillOval(x-dotSize/2, y-dotSize/2, dotSize,dotSize);
    		}
    	}
    	robot.render(container,g);
    }
}