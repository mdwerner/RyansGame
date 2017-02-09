package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationDemo implements ApplicationListener{

	private SpriteBatch batch;
    private TextureAtlas textureAtlas;
    private Animation<TextureRegion> rotateUpAnimation;
    private Animation<TextureRegion> rotateDownAnimation;

    private float elapsedTime = 0;
    
    @Override
    public void create() {        
        batch = new SpriteBatch();
        textureAtlas = new TextureAtlas(Gdx.files.internal("data/spritesheet.atlas"));
        
        TextureRegion[] rotateUpFrames = new TextureRegion[10];
        
        // Rotate Up Animation
        // Create an array of TextureRegions
        rotateUpFrames[0] = (textureAtlas.findRegion("0001"));
        rotateUpFrames[1] = (textureAtlas.findRegion("0002"));
        rotateUpFrames[2] = (textureAtlas.findRegion("0003"));
        rotateUpFrames[3] = (textureAtlas.findRegion("0004"));
        rotateUpFrames[4] = (textureAtlas.findRegion("0005"));
        rotateUpFrames[5] = (textureAtlas.findRegion("0006"));
        rotateUpFrames[6] = (textureAtlas.findRegion("0007"));
        rotateUpFrames[7] = (textureAtlas.findRegion("0008"));
        rotateUpFrames[8] = (textureAtlas.findRegion("0009"));
        rotateUpFrames[9] = (textureAtlas.findRegion("0010"));

        rotateUpAnimation = new Animation(0.1f,rotateUpFrames);
        
        // Rotate Down Animation
        // Or you can just pass in all of the regions to the Animation constructor
        rotateDownAnimation = new Animation(0.1f,
                (textureAtlas.findRegion("0011")),
                (textureAtlas.findRegion("0012")),
                (textureAtlas.findRegion("0013")),
                (textureAtlas.findRegion("0014")),
                (textureAtlas.findRegion("0015")),
                (textureAtlas.findRegion("0016")),
                (textureAtlas.findRegion("0017")),
                (textureAtlas.findRegion("0018")),
                (textureAtlas.findRegion("0019")),
                (textureAtlas.findRegion("0020")));

    }//end create method

    @Override
    public void dispose() {
        batch.dispose();
        textureAtlas.dispose();
    }

    @Override
    public void render() {        
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        //sprite.draw(batch);
        elapsedTime += Gdx.graphics.getDeltaTime();
        batch.draw(rotateDownAnimation.getKeyFrame(elapsedTime, true), 0, 0); //the 'true' parameter tells it to loop the animation
        batch.draw(rotateUpAnimation.getKeyFrame(elapsedTime, true), 50, 50);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

}
