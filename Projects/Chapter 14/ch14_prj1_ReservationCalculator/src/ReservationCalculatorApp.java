import java.time.LocalDate;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the 'Reservation Calculator' application!");
		
		// prompt user to continue (part 1)
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// enter arrival date
			int arrivalMonth = Console.getInt("Enter arrival month (1-12):  ", 1, 12);
			int arrivalDay = Console.getInt("Enter arrival day (1-31):  ", 1, 31);
			int arrivalYear = Console.getInt("Enter arrival year:  ", 2018, Integer.MAX_VALUE);
			System.out.println();
			// enter departure date
			int departureMonth = Console.getInt("Enter arrival month (1-12):  ", 1, 12);
			int departureDay = Console.getInt("Enter arrival day (1-31):  ", 1, 31);
			int departureYear = Console.getInt("Enter arrival year:  ", 2018, Integer.MAX_VALUE);
			System.out.println();
					
			LocalDate arrival = LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
			LocalDate departure = LocalDate.of(departureYear, departureMonth, departureDay);
			
			Reservation reservation = new Reservation(arrival, departure);
			
			String message = "Arrival date: "   + reservation.getArrivalDateFormatted()   + "\n"
						   + "Departure date: " + reservation.getDepartureDateFormatted() + "\n"
						   + "Price per night: "+ reservation.getPricePerNightFormatted() + "\n"
						   + "Total price: "	+ reservation.getTotalPriceFormatted()    + " for " 
						   						+ reservation.getNumberOfNights()         + " of nights" + "\n";
			System.out.println(message);
			
			// prompt user to continue (part 2)
			choice = Console.getString("Would you like to enter another reservation? ('y'/'n')  ");
		}
		
		// exit message
		System.out.println("\nThank you for using the 'Reservation Calculator' application!");
	}

}
