public class ocean {

	public static void main(String[] args){
		for (int i=1; i<=10; i++){
			line_game();
			System.out.println("");
		}
		
	}
	public static void line_game(){
		
		String line = "-";
		String hike = "^";
		
		double flag = 0;
		

		
		while (flag < 100){
			flag++;
			double run = (double)flag%5;
			if (run==0){
				System.out.print(hike);
			}else{	
				if (flag%3==0){
					System.out.print(".");
				}else{
					if (flag%(double)2==0){
						System.out.print("_");
					}else{
						System.out.print(line);
					}
				}
			}
		}
	}
	
		
}