package net.codecraft.blocks;

import org.newdawn.slick.opengl.Texture;

public abstract class Block {
	protected int X = 0;
	protected int Y = 0;
	protected int Z = 0;

	public abstract void drawBlock(int x, int y, int z, float size);

	public Block(int x, int y, int z) {
		X = x;
		Y = y;
		Z = z;
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
