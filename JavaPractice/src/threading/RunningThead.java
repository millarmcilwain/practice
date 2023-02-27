package threading;

public class RunningThead implements Runnable{

	@Override
	public void run() {
		
		int loop = 10;
		
		do {
			System.out.println(loop);
			loop--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while(loop>0);
}
}
