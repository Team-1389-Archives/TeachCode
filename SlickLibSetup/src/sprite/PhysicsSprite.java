package sprite;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Vector2f;

public class PhysicsSprite extends Sprite{
	public static final float friction = .5f;
	public static final float smooth = .01f;
	
	private float mass;
	float power;

	private Vector2f vel;
	private Vector2f force;
	private static Vector2f zeroVector = new Vector2f(0, 0);

	public PhysicsSprite(String icon) {
		super(icon,10,10);
		vel=zeroVector.copy();
		force=zeroVector.copy();
		mass=.2f;
	}
	public void setPower(float power){
		this.power=power;
	}
	public void update(GameContainer container, int delta) {
		super.update(container, delta);
		updateMotorForce();
		Vector2f initialForce = force.copy();
		Vector2f initialVelocity = vel.copy(); // initial velocity

		// Friction
		double angle = vel.getTheta();
		Vector2f frictionForce = new Vector2f(angle);
		frictionForce.scale(friction * vel.length());
		force.sub(frictionForce);

		Vector2f acceleration = force.copy().scale(1 / mass);
		vel.add(acceleration.copy().scale((float) (delta) / 1000)); // final
																	// velocity
		pos.add(vel.copy().add(initialVelocity.copy()).scale(delta / 2)); // x =
																			// vt
																			// +
																			// .5at^2

		if (initialForce.equals(zeroVector) && initialVelocity.getTheta() == vel.getTheta() - 180) {
			zero(vel);
		}

		smooth(vel);
		zero(force);

	}
	private void smooth(Vector2f v) {
		if (Math.abs(v.x) < smooth) {
			v.x = 0;
		}
		if (Math.abs(v.y) < smooth) {
			v.y = 0;
		}
	}

	public void zero(Vector2f v) {
		v.scale(0);
	}
	public void updateFriction(){
		
	}
	public void updateMotorForce(){	
		float theta=0;
		switch (direction) {
		case 0:
			theta=0;
			break;
		case 3:
			theta=90;
			break;
		case 2:
			theta=180;
			break;
		case 1:
			theta=270;
			break;
		}	
		Vector2f force = new Vector2f(theta);
		force.scale(power);
		applyForce(force);
	}
	public void applyForce(Vector2f force) {
		this.force.add(force);
	}


}
