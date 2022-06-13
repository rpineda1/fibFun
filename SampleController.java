package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
/**
 * The method SampleController class
 * @author ricardo
 */
public class SampleController implements Initializable {

	@FXML
	private LineChart<?, ?> chart;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
			
		XYChart.Series series = new XYChart.Series<>();
		
		series.getData().add(new XYChart.Data("0",2000));
		series.getData().add(new XYChart.Data("1",600));
		series.getData().add(new XYChart.Data("1",1000));
		series.getData().add(new XYChart.Data("2",2000));
		series.getData().add(new XYChart.Data("3",13500));
		series.getData().add(new XYChart.Data("5",25000));
		series.getData().add(new XYChart.Data("8",56000));
		series.getData().add(new XYChart.Data("13",75000));
		series.getData().add(new XYChart.Data("21",100000));
		series.getData().add(new XYChart.Data("34",120000));
		series.getData().add(new XYChart.Data("55",150000));
		series.getData().add(new XYChart.Data("89",250000));
		series.setName("Recursive method");
XYChart.Series series2 = new XYChart.Series<>();
		
		series2.getData().add(new XYChart.Data("0",1000));
		series2.getData().add(new XYChart.Data("1",500));
		series2.getData().add(new XYChart.Data("1",430));
		series2.getData().add(new XYChart.Data("2",400));
		series2.getData().add(new XYChart.Data("3",389));
		series2.getData().add(new XYChart.Data("5",365));
		series2.getData().add(new XYChart.Data("8",350));
		series2.getData().add(new XYChart.Data("13",340));
		series2.getData().add(new XYChart.Data("21",280));
		series2.getData().add(new XYChart.Data("34",264));
		series2.getData().add(new XYChart.Data("55",253));
		series2.getData().add(new XYChart.Data("89",200));
		series2.setName("Iteration method");
		
		chart.getData().addAll(series,series2);
	}
	
	/**
	 * the main method
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * loops Recursive method for fibonacci number
		 * @param i the time from 12 cycles 
		 */
		long startTime = System.nanoTime();
		for (long i=0; i<12; i++) {
			System.out.println(fib(i));
		}
		long endTime = System.nanoTime();
		System.out.println("\nUsing Recursive method it took: "+ (endTime-startTime)+" nanoseconds.\n");
		
		long start = System.nanoTime();
		System.out.printf("Using Iteration method it took: "+(System.nanoTime() - start) +" nanoseconds");
	}
	/**
	 * loops Iteration method for fibonacci number
	 * @param a the time from 12 cycles
	 * @return
	 */
	static int fibIteration(int n) {
		int a = 0, b = 1, c = 1;
		for (int i = 0; i < 12; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return a;
	}
	public static long fib(long num) {

		if (num==0) {
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		return fib(num-1) + fib(num-2);
	}

}
