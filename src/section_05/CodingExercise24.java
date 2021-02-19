package section_05;


public class CodingExercise24 {
	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 1, 5));
		System.out.println(canPack(5, 3, 24));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount<0||smallCount<0||goal<0) {
			return false;
		}

		if(bigCount*5+smallCount>=goal) {
			while (goal>0) {
				if(goal>=5) {
					if(bigCount>0) {
						goal-=5;
						bigCount--;
					}
					else if(smallCount>=goal) {
						goal=0;
						return true;
					} else {
						return false;
					}
				}
				else if(goal<5) {
					if(smallCount>=goal) {
						goal=0;
						return true;
					} else {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
