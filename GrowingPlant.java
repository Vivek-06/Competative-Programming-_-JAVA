public class GrowingPlant{
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight){
		if(desiredHeight<upSpeed)
			return 1;
		double x = desiredHeight-downSpeed;System.out.println(x);
		double y = upSpeed- downSpeed; System.out.println(y);
		double z = x/y;
		z += 0.5;
		//double sum =  ((desiredHeight-downSpeed)/(upSpeed-downSpeed));
		//sum += 0.5;
		//System.out.println(sum);
		return (int)z;
	}

	public static void main(String[] args) {
		int upSpeed = 5, downSpeed = 2, desiredHeight = 7;
		int res = growingPlant(upSpeed, downSpeed, desiredHeight);
		System.out.println(res);
	}
}