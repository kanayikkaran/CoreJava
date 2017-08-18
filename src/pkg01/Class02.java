package pkg01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Class02 {

	public static void main(String[] args) {
		
		int threads = Runtime.getRuntime().availableProcessors();
		System.out.println("availableProcessors:"+threads);
		
		ExecutorService service = Executors.newFixedThreadPool(threads);
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMddHHmmss");
		System.out.println("TimeBeforeExec="+ft.format(date));
		for(int i=1; i<=10; i++)
		{
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			
			//if(i%10000 == 0)
			System.out.println("i="+i);
			final int count = i;
			service.submit(new Runnable(){
				@Override
				public void run(){
					//if(count%10000 == 0)
					System.out.println("i inside run="+count);
				}
			});
			
		}
		
		date = new Date();
		System.out.println("TimeAfterExec="+ft.format(date));
		

	}

}
