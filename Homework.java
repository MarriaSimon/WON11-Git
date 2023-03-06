public class Homework{
	public static void main(String[] args) {
		Exercise1();
		Exercise2();
		System.out.println(" ");
		Exercise3();
	}

	public static void Exercise1(){
		int[] array =new int[] {1,2,3,4,6,7,8,15};
		int sum = 0;
		for (int i= 0; i<array.length;i++){
			sum += array[i];
		}
			System.out.println(sum);
	}
	public static void Exercise2(){
		for (int i = 0;i<15;i++){
			if (i%2 !=0){
				System.out.print(i + " ");
			}
		}

	}

	public static void Exercise3(){
			for(int i = 0;i<15;i++){
			if(i <= 10){
				continue;
			}
			System.out.print(i + " ");
		}
	}
}