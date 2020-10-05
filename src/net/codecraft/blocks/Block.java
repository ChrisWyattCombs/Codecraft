package net.codecraft.blocks;

public abstract class Block {
protected int X = 0;
protected int Y = 0;
protected int Z = 0;
public int id;

public abstract void drawBlock();
public Block(int x, int y, int z, int id) {
	X = x;
	Y = y;
	Z = z;
	this.id = id;
}
public int getX() {
	return X;
}
public int getY() {
	return Y;
}
public int getZ() {
	return Z;
}


}
