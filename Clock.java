package clock;

import javax.swing.*;

import java.awt.*;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Clock extends JFrame{
	
	//start attributes for clock
	
		Calendar calendar;
		
		SimpleDateFormat timeFormat;
		
		SimpleDateFormat dayFormat;
		
		SimpleDateFormat dateFormat;
		
		
		JLabel timeLabel;
		
		JLabel dayLabel;
		
		JLabel dateLabel;
		
		
		String time;
		
		String day;
		
		String date;
		
		
		//set up a clock constructor
		
		Clock() {
		
		//set clock to close when x is clicked
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set the title of the clock
		
		this.setTitle("Digital Clock");
		
		//set layout for the frame of the clock
		
		this.setLayout(new FlowLayout());
		
		//set the size for the clock
		
		this.setSize(350, 220);
		
		//set size to a fixed height
		
		this.setResizable(false);
		
		
		//initialize date and time format
		
		timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		dayFormat = new SimpleDateFormat("EEEE");
		
		dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
		
		//set label for fonts the colors
		
		timeLabel = new JLabel();
		
		timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
		
		timeLabel.setBackground(Color.BLACK);
		
		timeLabel.setForeground(Color.WHITE);
		
		timeLabel.setOpaque(true);
		
		
		//create labels to hold day and date fonts
		
		dayLabel=new JLabel();
		
		dayLabel.setFont(new Font("Ink Free", Font.BOLD,30));
		
		dateLabel=new JLabel();
		
		dateLabel.setFont(new Font("Ink Free", Font.BOLD,30));
		
		//Add the labels to the clock
		
		this.add(timeLabel);
		
		this.add(dayLabel);
		
		this.add(dateLabel);
		
		//turn on Jframe to be visible
		
		this.setVisible(true);
		
		//start the clock
		
		startClock();

	}
		public void startClock() {
			
			//set up while loop to update time
			
			while (true) {
				
				//update time with current time
				
				time = timeFormat.format(Calendar.getInstance().getTime());
		
				timeLabel.setText(time);
				
				//update time with current day
				
				day=dayFormat.format(Calendar.getInstance().getTime());
				
				dayLabel.setText(day);
				
				//update time with current date
				
				date=dateFormat.format(Calendar.getInstance().getTime());
				
				dateLabel.setText(date);
				
				//put clock to sleep before updating again 
				
				try  {
					
					Thread.sleep(1000);
					
				} catch (Exception e) {
				
					e.getStackTrace();
				
				}//end try
					
			}//end StackClock
				
			}//end clock
		
		public static void main(String[] args) {
			
			//make a new clock
			
			new Clock();
		
		}//end main
		
}//end class
