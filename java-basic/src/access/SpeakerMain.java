package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		//필드에 직접 접근하여 정보값을 바꾸는 것은 위험하다!!
		System.out.println("volume 필드에 직접 접근");
		//speaker.volume = 200;
		speaker.showVolume();
	}
}
