import java.util.Scanner;

public class time2 {
	public static void main(String[] arg) {
		int hour;
		int seconds;
		int minutes;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your hour : ");
		hour = in.nextInt();
		System.out.println("enter your minutes : ");
		minutes = in.nextInt();
		System.out.println("enter your seconds : ");
		seconds = in.nextInt();
		int d_in_seconds = hour * 3600 + minutes * 60 + seconds;
		System.out.println("\nthe number of seconds since midnight : " + d_in_seconds);
		System.out.println("\nthe percentage of the day that has passed since midnight : % " + (d_in_seconds * 100) / (24 * 3600));
		int hour_now;
		int minutes_now;
		int seconds_now;
		System.out.println("enter your hour_now : ");
		hour_now = in.nextInt();
		System.out.println("enter your mintes_now : ");
		minutes_now = in.nextInt();
		System.out.println("enter your seconds_now : ");
		seconds_now = in.nextInt();
		int time_now_in_seconds = (hour_now * 3600 + minutes_now * 60 + seconds_now);
		System.out.print("\ntime spended on this exsercice : " + (time_now_in_seconds - d_in_seconds) + " seconds");

	}

}
