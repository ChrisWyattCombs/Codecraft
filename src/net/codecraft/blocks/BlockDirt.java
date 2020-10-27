package net.codecraft.blocks;

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

public class BlockDirt extends Block {
	private static Texture dirtTexture;
	static {
		try {
			dirtTexture = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("Resources/Textures/Blocks/dirt.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BlockDirt(int x2, int y2, int z2) {
		super(x2, y2, z2);
		
	}

	@Override
	public void drawBlock(int x, int y, int z, float size) {
		Color.white.bind();

		dirtTexture.bind();
		// Front Facew
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		// Back Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		// Top Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)),0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		// Bottom Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		// Right face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		// Left Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.5f + (X+ (x * size)), -0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)),  0.5f + (Z+ (z * size)));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.5f + (X+ (x * size)),  0.5f + (Y+ (y * size)), -0.5f + (Z+ (z * size)));	// Top Left Of The Texture and Quad
		 glEnd();

	}
}
