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
	private Texture dirtTexture;
	
	public BlockDirt(int x2, int y2, int z2) {
		super(x2, y2, z2);
		try {
			dirtTexture = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("Resources/Textures/Blocks/dirt.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void drawBlock(int x, int y, int z, float size) {
		Color.white.bind();

		dirtTexture.bind();
		// Front Face
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.25f + ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.25f + ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.25f + ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.25f + ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		// Back Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2), -0.25f+ ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2),  0.25f+ ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2),  0.25f+ ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2), -0.25f+ ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		// Top Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2),0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		// Bottom Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		// Right face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(1.0f, 0.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		glTexCoord2f(0.0f, 0.0f); glVertex3f( 0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		// Left Face
		glEnd();
		Color.white.bind();

		dirtTexture.bind();
		glBegin(GL_QUADS);
		glTexCoord2f(0.0f, 0.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Bottom Left Of The Texture and Quad
		glTexCoord2f(1.0f, 0.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2), -0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Bottom Right Of The Texture and Quad
		glTexCoord2f(1.0f, 1.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2),  0.25f + ((Z+ (z * size))/2));	// Top Right Of The Texture and Quad
		glTexCoord2f(0.0f, 1.0f); glVertex3f(-0.25f+ ((X+ (x * size))/2),  0.25f + ((Y+ (y * size))/2), -0.25f + ((Z+ (z * size))/2));	// Top Left Of The Texture and Quad
		 glEnd();

	}

}
