package net.codecraft.renderEngine;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glVertex3f;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import net.codecraft.blocks.Block;

public class Chunk {
private Block Blocks[];
private int x;
private int y;
private int z;
private float size = 25;
private Texture dirtTexture;
private Texture grassTexture;
public  boolean[][][] isBlockInPos = new boolean[25][25][25];


public Chunk(Block Blocks[], int x, int y, int z) {
	this.Blocks = Blocks;
	this.x = x;
	this.y = y;
	this.z = z;
	for(Block block : Blocks) {
		isBlockInPos[block.getX()][block.getY()][block.getZ()] = true;
	}
	try {
		dirtTexture = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("Resources/Textures/Blocks/dirt.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}try {
	grassTexture = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("Resources/Textures/Blocks/grass.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void DrawChunk(float vdx, float vdxn, float vdy, float vdyn, float vdz, float vdzn ) {
	float pitchRadian = (float) (DisplayUtills.getRotY()/2 * (Math.PI / 180)); // X rotation
	float yawRadian   = (float) (DisplayUtills.getRotX() * (Math.PI / 180)); // Y rotation
	for(Block block : Blocks) {
		
		if(block != null) {
			boolean bl = false;
			boolean  br = false;
			boolean  bf = false;
			boolean bb = false;
			boolean  bu  = false;
			boolean  bd = false;
			try {
			bl = isBlockInPos[block.getX()+1][block.getY()][block.getZ()];
			br = isBlockInPos[block.getX()-1][block.getY()][block.getZ()];
			bf = isBlockInPos[block.getX()][block.getY()][block.getZ()+1];
			bb = isBlockInPos[block.getX()][block.getY()][block.getZ()-1];
			bu = isBlockInPos[block.getX()][block.getY()+1][block.getZ()];
			bd = isBlockInPos[block.getX()][block.getY()-1][block.getZ()];
			}catch(Exception e) {
				
			}
			if((block.getX()+ (x * size) + DisplayUtills.getPosX()-12.5f <=vdx && block.getX()+ (x * size) + DisplayUtills.getPosX()-12.5f >= vdxn )&&( block.getY()+ (y * size) + DisplayUtills.getPosY() -78 <= vdy && block.getY()+ (y * size) + DisplayUtills.getPosY()-78  >= vdyn) &&( block.getZ()+(z * size) + DisplayUtills.getPosZ() -12.5f <= vdz && block.getZ()+(z * size) + DisplayUtills.getPosZ() -12.5f >= vdzn)) {
			//if((block.getX()+ (x * size)+ - DisplayUtills.getPosX()-12.5f) * Math.sin(yawRadian) * Math.cos(pitchRadian) <=10 && (block.getY()+ (y * size)+DisplayUtills.getPosY()-12.5f) * -Math.sin(pitchRadian) <=10 &&(block.getZ()+ (z * size)+ DisplayUtills.getPosZ()-12.5f) * Math.cos(yawRadian) * Math.cos(pitchRadian) >=-3 && (block.getX()+ (x * size)- DisplayUtills.getPosX()-12.5f) * Math.sin(yawRadian) * Math.cos(pitchRadian) >=-3 && (block.getY()+ (y * size)+ DisplayUtills.getPosY()-12.5f) * -Math.sin(pitchRadian) >=-3 &&(block.getZ()+ (z * size)+ DisplayUtills.getPosZ()-12.5f) * Math.cos(yawRadian) * Math.cos(pitchRadian) >=-3 ) {
				
				if(bl == false || br == false || bf == false || bb == false || bu == false || bd == false) {
				
				Color.white.bind();

			dirtTexture.bind();
			// Front Face
			glBegin(GL_QUADS);
			glTexCoord2f(0.0f, 0.0f); glVertex3f(-1.0f + block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Left Of The Texture and Quad
			glTexCoord2f(1.0f, 0.0f); glVertex3f( 1.0f + block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			glTexCoord2f(1.0f, 1.0f); glVertex3f( 1.0f + block.getX()+ (x * size),  1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			glTexCoord2f(0.0f, 1.0f); glVertex3f(-1.0f + block.getX()+ (x * size),  1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			// Back Face
			glEnd();
			Color.white.bind();

			dirtTexture.bind();
			glBegin(GL_QUADS);
			glTexCoord2f(1.0f, 0.0f); glVertex3f(-1.0f+ block.getX()+ (x * size), -1.0f+ block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			glTexCoord2f(1.0f, 1.0f); glVertex3f(-1.0f+ block.getX()+ (x * size),  1.0f+ block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			glTexCoord2f(0.0f, 1.0f); glVertex3f( 1.0f+ block.getX()+ (x * size),  1.0f+ block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			glTexCoord2f(0.0f, 0.0f); glVertex3f( 1.0f+ block.getX()+ (x * size), -1.0f+ block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Bottom Left Of The Texture and Quad
			// Top Face
			glEnd();
			Color.white.bind();

			grassTexture.bind();
			glBegin(GL_QUADS);
			glTexCoord2f(0.0f, 1.0f); glVertex3f(-1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			glTexCoord2f(0.0f, 0.0f); glVertex3f(-1.0f+ block.getX()+ (x * size),1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Left Of The Texture and Quad
			glTexCoord2f(1.0f, 0.0f); glVertex3f( 1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			glTexCoord2f(1.0f, 1.0f); glVertex3f( 1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			// Bottom Face
			glEnd();
			Color.white.bind();

			dirtTexture.bind();
			glBegin(GL_QUADS);
			glTexCoord2f(1.0f, 1.0f); glVertex3f(-1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			glTexCoord2f(0.0f, 1.0f); glVertex3f( 1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			glTexCoord2f(0.0f, 0.0f); glVertex3f( 1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Left Of The Texture and Quad
			glTexCoord2f(1.0f, 0.0f); glVertex3f(-1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			// Right face
			glEnd();
			Color.white.bind();

			dirtTexture.bind();
			glBegin(GL_QUADS);
			glTexCoord2f(1.0f, 0.0f); glVertex3f( 1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			glTexCoord2f(1.0f, 1.0f); glVertex3f( 1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			glTexCoord2f(0.0f, 1.0f); glVertex3f( 1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			glTexCoord2f(0.0f, 0.0f); glVertex3f( 1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+(z * size));	// Bottom Left Of The Texture and Quad
			// Left Face
			glEnd();
			Color.white.bind();

			dirtTexture.bind();
			glBegin(GL_QUADS);
			glTexCoord2f(0.0f, 0.0f); glVertex3f(-1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Bottom Left Of The Texture and Quad
			glTexCoord2f(1.0f, 0.0f); glVertex3f(-1.0f+ block.getX()+ (x * size), -1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Bottom Right Of The Texture and Quad
			glTexCoord2f(1.0f, 1.0f); glVertex3f(-1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size),  1.0f + block.getZ()+ (z * size));	// Top Right Of The Texture and Quad
			glTexCoord2f(0.0f, 1.0f); glVertex3f(-1.0f+ block.getX()+ (x * size),  1.0f + block.getY()+ (y * size), -1.0f + block.getZ()+ (z * size));	// Top Left Of The Texture and Quad
			 glEnd();
			}
			}
		}
		
		
	}
	
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
public int getZ() {
	return z;
}

}
