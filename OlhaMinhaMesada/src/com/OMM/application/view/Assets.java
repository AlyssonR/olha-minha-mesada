package com.OMM.application.view;

import com.kilobolt.framework.Image;
import com.kilobolt.framework.Music;
import com.kilobolt.framework.Sound;

public class Assets {
	
	public static Image menu, loading;

	public static Sound click;
	public static Music theme;
	
	public static void load(Loading sampleGame) {
		// TODO Auto-generated method stub
		theme = sampleGame.getAudio().createMusic("menutheme.mp3");
		theme.setLooping(false);
		theme.setVolume(0.85f);
		theme.play();
	}
	
}
