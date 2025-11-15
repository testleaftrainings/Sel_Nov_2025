package week2.day1;

public class GooglePixel {

	public String takeHQphoto() {
		String photoExtension = "png";
		return photoExtension;

	}

	public static void main(String[] args) {
		GooglePixel options = new GooglePixel();
		String photo = options.takeHQphoto();
		System.out.println(photo);

	}

}
