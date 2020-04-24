package box;

public class GoldPaperBox extends PaperBox{
	
	public void goldWrap() {
		System.out.println("gold wrap");
	}
	
	@Override	
	public void wrapOverriding() {
		System.out.println("gold wrap1");
	}
	
	public void wrapOverroding() {
		super.wrapOverroding();
		System.out.println("gold wrap");
	}
}
