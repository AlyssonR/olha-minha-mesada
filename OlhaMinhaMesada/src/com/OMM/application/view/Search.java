package com.OMM.application.view;

import java.util.Date;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Graphics.ImageFormat;
import com.kilobolt.framework.Screen;

public class Search extends Screen {
	public Search(Game game) {
		
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = ommview.getGraphics();
		Assets.menu = g.newImage("menu.png", ImageFormat.RGB565);
		
		
		ommview.setScreen(new MainMenuScreen(ommview));
		
	}

	@Override
	public void paint(float deltaTime) {
		Graphics g = ommview.getGraphics();
		g.drawImage(Assets.loading, 0, 0);
		
	}

	@Override
	public void pause() {
		Date date = new Date();
		long now = date.getTime();
		
	}
	
	
	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {

	}
}