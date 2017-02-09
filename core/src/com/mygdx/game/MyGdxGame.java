package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class MyGdxGame implements ApplicationListener{
	SpriteBatch batch;
	Texture texture;
	Sprite sprite;
	TextureAtlas textureAtlas;
    private int currentFrame = 1;
    private String currentAtlasKey = new String("0001");
    
	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/jet.png"));
        textureAtlas = new TextureAtlas(Gdx.files.internal("data/spritesheet.atlas"));
        AtlasRegion region = textureAtlas.findRegion("0001");

		//sprite = new Sprite(texture); //for a single sprite
		sprite = new Sprite(region);
		
		Timer.schedule(new Task(){
            @Override
            public void run() {
                currentFrame++;
                if(currentFrame > 20)
                    currentFrame = 1;
                
                // ATTENTION! String.format() doesnt work under GWT for god knows why...
                currentAtlasKey = String.format("%04d", currentFrame);
                sprite.setRegion(textureAtlas.findRegion(currentAtlasKey));
            }
        }
        ,0,1/30.0f);
		
		//img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.app.log("MyGdxGame", "rendering");
		Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        sprite.draw(batch);
        batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
}
