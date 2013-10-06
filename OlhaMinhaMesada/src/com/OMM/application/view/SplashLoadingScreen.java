package com.OMM.application.view;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Graphics.ImageFormat;
import com.kilobolt.framework.Screen;

public class SplashLoadingScreen extends Screen {
	public SplashLoadingScreen(Game ommview) {
		super(ommview);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = ommview.getGraphics();
		Assets.loading= g.newImage("loading.png", ImageFormat.RGB565);

		
		ommview.setScreen(new Search(ommview));

	}

	@Override
	public void paint(float deltaTime) {

	}

	@Override
	public void pause() {

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