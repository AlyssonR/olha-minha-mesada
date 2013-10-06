package com.OMM.application.view;

import java.util.Date;
import java.util.List;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Screen;
import com.kilobolt.framework.Input.TouchEvent;

public class MainMenuScreen extends Screen {
	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = ommview.getGraphics();
		
		List<TouchEvent> touchEvents = ommview.getInput().getTouchEvents();
		//
		// int len = touchEvents.size();
		// for (int i = 0; i < len; i++) {
		// TouchEvent event = touchEvents.get(i);
		// if (event.type == TouchEvent.TOUCH_UP) {
		//
		// if (inBounds(event, 50, 350, 250, 450)) {
		// ommview.setScreen(new Politician(ommview));
		// }
		//
		// }
		// }
	}

	private boolean inBounds(TouchEvent event, int x, int y, int width,
			int height) {
		if (event.x > x && event.x < x + width - 1 && event.y > y
				&& event.y < y + height - 1)
			return true;
		else
			return false;
	}

	@Override
	public void paint(float deltaTime) {
		Graphics g = ommview.getGraphics();
		g.drawScaledImage(Assets.menu, 0, 0, 480, 800, 0, 0,
				Assets.menu.getWidth(), Assets.menu.getHeight());
			pause(7000);
	}

	@Override
	public void pause() {
	}

	public void pause(long time) {
		Date date = new Date();
		long now = date.getTime();
		do {
			date = new Date();
		} while (now + time > date.getTime());
	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {
		android.os.Process.killProcess(android.os.Process.myPid());

	}
}
