public class SwapVals {
	public static void main(String[] args) {
		int swapa = 1;
		int swapb = 2;
		int temp = 0;
		System.out.print(swapa+" ");
		System.out.println(swapb);
		//swap values
		temp = swapa;
		swapa = swapb;
		swapb = temp;
		System.out.print(swapa+ " ");
		System.out.println(swapb);

	}
}
