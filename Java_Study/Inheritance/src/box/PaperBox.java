package box;

public class PaperBox extends Box{
	
	public void paperWrap() {

		System.out.println("paper wrap");
	}
	
	@Override	
	public void wrapOverriding() {
		System.out.println("paper wrap1");
	}
	
	public void wrapOverroding() {
		super.wrapOverroding();
		System.out.println("paper wrap");
	}
	
	
	
}
