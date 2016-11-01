package commands;

import sprite.PhysicsSprite;

public class SetPowerCommand extends Command{
	PhysicsSprite sprite;
	float power;
	@Override
	public boolean execute() {
		sprite.setPower(power);
		return true;
	}
	public SetPowerCommand(PhysicsSprite sprite, float power){
		this.sprite=sprite;
		this.power=power;
	}
}
