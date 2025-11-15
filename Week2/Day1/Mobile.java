package week2.day1;

public class Mobile {

	public void downloadApp() {
		String name = "canva";
		System.out.println(name);
	}

	public void openSettings(String settingsName) {
		System.out.println(settingsName);
	}

	public void takePhoto(int numberOfPhotos, String extension) {
		System.out.println(numberOfPhotos + " " + extension);
	}

	public static void main(String[] args) {

		Mobile mobOptions = new Mobile();
		mobOptions.downloadApp();

		mobOptions.openSettings("Camera settings");
		mobOptions.openSettings("App settings");

		mobOptions.takePhoto(5, "png");

	}

}
