package net.codecraft.Entities;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glVertex3f;

import org.lwjgl.opengl.GL11;

public class EntityPlayer extends Entity {

	public EntityPlayer(float x, float y, float z) {
		super(x, y, z);
		
	}

	@Override
	public void drawModel() {
		
	}

}
