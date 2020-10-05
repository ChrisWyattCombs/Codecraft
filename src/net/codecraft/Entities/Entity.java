package net.codecraft.Entities;

public abstract class Entity {
float x;
float y;
float z;

public Entity(float x, float y, float z) {
	this.x = x;
	this.y = y;
	this.z = z;
}

public abstract void drawModel();

public float getX() {
	return x;
}

public void setX(float x) {
	this.x = x;
}

public float getY() {
	return y;
}

public void setY(float y) {
	this.y = y;
}

public float getZ() {
	return z;
}

public void setZ(float z) {
	this.z = z;
}

}
