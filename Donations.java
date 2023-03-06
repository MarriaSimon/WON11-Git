import java.util.Random;

public class Donations{
	public static void main(String[] args){
		addDonation();
		//numberOfDonations();
	}

	public static void addDonation(){
		Random rand = new Random();
		int amount = rand.nextInt(35);

		int target = 14589;
		int sum = 0;

		do {
			System.out.println("add a donation:" );
			sum = sum + amount;
			if((amount >0) && (sum >= target)){
				break;
			}
			System.out.println("need more docations " + sum);
		} while(true);
		System.out.println("success you have reached the donations target" + sum);
	}

	
	public static void numberOfDonations(){
		Random rand = new Random();
		int maxNo = rand.nextInt(16) + 1;
		int sum = 0;
		
		for (maxNo = 0;maxNo<17;maxNo++) {
				sum += maxNo;
			if (maxNo == 17){
				break;
			}
			System.out.println("number of donations achieved "+ maxNo + " amount reached to  "+ sum);
			} 
	}
}