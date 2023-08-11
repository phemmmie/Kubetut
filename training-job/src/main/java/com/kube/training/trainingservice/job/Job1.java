package com.kube.training.trainingservice.job;
import java.io.FileOutputStream;
import java.util.Date;
/**
 * 
 * @author jijia
 *
 */
public class Job1 {

	public static void main(String[] args) {
		System.out.println("****************** The job started at "+(new Date().toString()));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try(FileOutputStream fin = new FileOutputStream("/log/+"+System.currentTimeMillis())) {
			fin.write(("****************** The job started at "+(new Date().toString())).getBytes());
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("******************* The job ended at "+(new Date().toString()));
	
	}
}
