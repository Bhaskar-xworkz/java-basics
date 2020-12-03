package com.xworkz.methods.electronic;

public class Speaker {
	private String companyNameString = "JBL";
	private String color;
	private int batterBackupInHours;

	private boolean connected;
	private int maxVolumeLevel = 5;
	private int minVolumeLevel = 1;
	private int currentVolume;

	public Speaker(String color, int batterBackupInHours) {
		this.color = color;
		this.batterBackupInHours = batterBackupInHours;
		System.out.println("created Speaker");
		System.out.println("color: " + color);
		System.out.println("battery backup: " + batterBackupInHours + "hrs");

	}

	public void onOrOff() {
		if (this.connected == false) {
			this.connected = true;
			System.out.println("speaker is on");
		} else if (this.connected == true) {
			this.connected = false;
			System.out.println("speaker is off");

		}

	}

	public void increaseVolume() {
		if (this.connected == true) {
			if (this.currentVolume < maxVolumeLevel) {
				this.currentVolume = this.currentVolume + 1;
				System.out.println("current volume is: " + this.currentVolume);

			} else {
				System.out.println("you reached max volume!!!");
			}
		}

	}

	public void decreseVolume() {
		if (this.connected == true) {
			if (this.currentVolume > minVolumeLevel) {
				this.currentVolume = this.currentVolume - 1;
				System.out.println("current volume is: " + this.currentVolume);

			} else {
				System.out.println("min volume is: " + this.currentVolume);
			}
		}

	}

	public String getCompanyNameString() {
		return companyNameString;
	}

	public int getBatterBackupInHours() {
		return batterBackupInHours;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public int getMaxVolumeLevel() {
		return maxVolumeLevel;
	}

	public int getMinVolumeLevel() {
		return minVolumeLevel;
	}

	public boolean isConnected() {
		return connected;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

}
