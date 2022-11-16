package com.skillstorm;


public class CoffeeMug {

	//a simple fully-encapsulated class
		
		private byte volumeInOunce;
		private String message;
		private boolean insulated;
		
		public CoffeeMug() {
			super();
		}
		
		public CoffeeMug (byte volumeInOunce, String message, boolean insulated) {
			super();
			this.volumeInOunce = volumeInOunce;
			this.message = message;
			this.insulated = insulated;
		}

		// we want the user experience to stay consistent, so if we change the functionality of our code internally
		// we want to ensure that it functions the same externally
		// the user is expecting a return value that fits into a byte
		// but we've changed volumeInOunce to an int, so this covers our bases
		public byte getVolumeInOunce() {
			if (volumeInOunce <= 127 && volumeInOunce >= -128) {
				return (byte)volumeInOunce;
			} else {
				System.out.println("Volume can't fit into a byte!");
				return 0;
			}
			
			
		}

		public void setVolumeInOunce(byte volumeInOunce) {
			this.volumeInOunce = volumeInOunce;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public boolean isInsulated() {
			return insulated;
		}

		public void setInsulated(boolean insulated) {
			this.insulated = insulated;
		}

		@Override
		public String toString() {
			return "CoffeeMug [volumeInOunce=" + volumeInOunce + ", message=" + message + ", insulated=" + insulated
					+ "]";
		}
		
		
		
	}

