import java.util.Random;
import java.util.ArrayList;
public class randomZeroes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		ArrayList<Integer>numsRandom=new ArrayList<Integer>(10);
		for (int i=0;i<10;i++){
			numsRandom.add((int)(Math.random()*10));
		}
		for (int i=0;i<numsRandom.size();i++){
			numsRandom.set(i,0);
		}
		System.out.println(numsRandom);
	}
}
