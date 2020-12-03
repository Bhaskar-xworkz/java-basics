package com.xworkz.methods;

import com.xworkz.methods.electronic.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		Speaker speaker = new Speaker("RED", 6);
		System.out.println("Brand: " + speaker.getCompanyNameString());
		System.out.println(speaker.isConnected());
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.onOrOff();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.decreseVolume();
		speaker.decreseVolume();
		speaker.decreseVolume();
		speaker.decreseVolume();
		speaker.decreseVolume();
		speaker.onOrOff();
		speaker.decreseVolume();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.decreseVolume();




	}

}
