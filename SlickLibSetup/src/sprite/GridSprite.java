package sprite;

import org.newdawn.slick.GameContainer;

import exec.DisplayManager;

public class GridSprite extends Sprite{
	public int gridX;
	public int gridY;

	public GridSprite(String icon) {
		this(icon,1,1);
	}
	public GridSprite(String icon, int x,int y){
		super(icon,gridToCoord(x),gridToCoord(y));
		this.gridX=x;
		this.gridY=y;

	}
	public void setX(int gridX) {
		System.out.println(gridX);
		if (gridX < DisplayManager.gridWidth && gridX > 0) {
			this.gridX = gridX;
		} else {
			System.err.println("x input is off the screen");
		}
	}

	public void setY(int gridY) {
		if (gridY < DisplayManager.gridHeight && gridY > 0) {
			this.gridY = gridY;
		} else {
			System.err.println("y input is off the screen");
		}
	}
	public int getGridX(){
		return gridX;
	}
	public int getGridY(){
		return gridY;
	}
	public boolean isFacingWall() {
		boolean isFacingWall = false;
		switch (direction) {
		case 0:
			isFacingWall = isNearRightWall();
			break;
		case 3:
			isFacingWall = isNearBottomWall();
			break;
		case 2:
			isFacingWall = isNearLeftWall();
			break;
		case 1:
			isFacingWall = isNearTopWall();
			break;
		}
		return isFacingWall;
	}
	@Override
	public void update(GameContainer gc, int delta){
		super.update(gc, delta);
		pos.x=gridToCoord(gridX);
		pos.y=gridToCoord(gridY);

	}
	public boolean isNearWall() {
		return isNearRightWall() || isNearLeftWall() || isNearTopWall() || isNearBottomWall();
	}

	private boolean isNearRightWall() {
		return gridX == DisplayManager.gridWidth - 1;
	}

	private boolean isNearLeftWall() {
		return gridX == 1;
	}

	private boolean isNearTopWall() {
		return gridY == DisplayManager.gridWidth - 1;
	}

	private boolean isNearBottomWall() {
		return gridY == DisplayManager.gridHeight - 1;
	}
	public static int coordToGrid(float coord){
		return (int)coord/DisplayManager.gridSpacing;
	}
	public static int gridToCoord(int grid){
		return grid*DisplayManager.gridSpacing;
	}
}
