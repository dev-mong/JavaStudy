package classex;

public class Triangle {
	
	int width;
	int height;
	
	Triangle(){
		
	}
	Triangle(int w,int h){
		width=w;
		height=h;
	}
	
	float areaTriangle() {

		float result = width*height/2f;	
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle(2,5);
		System.out.println("삼각형의 밑변: "+t.width);
		System.out.println("삼각형의 높이: "+t.height);
		
		System.out.println("삼각형의 넓이: "+t.areaTriangle());

	}

}
