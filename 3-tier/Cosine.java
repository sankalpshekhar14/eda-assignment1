import java.lang.Math;
public class Cosine {

	private double radian;
	private double value;
	
	public Cosine(double radian) {
		this.radian=radian;
        this.value=cos(radian)
	}

	public String getValue() {
		return Double.toString(value);
	}
	public String getRadian() {
		return Double.toString(radian);
	}
}
