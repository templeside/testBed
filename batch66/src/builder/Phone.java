package builder;

public class Phone {
	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	private int camera;
	public Phone(String os, String processor, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	public Phone(String processor, double screenSize, int battery, int camera) {
		super();
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	public Phone(double screenSize, int battery, int camera) {
		super();
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	
}
