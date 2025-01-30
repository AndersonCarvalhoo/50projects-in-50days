import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class ProgramTryCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("check-in Date dd/MM/yyyy: ");
            Date checkInDate = sdf.parse(sc.next());
            System.out.print("check-out Date dd/MM/yyyy: ");
            Date checkOutDate = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.print("check-in Date dd/MM/yyyy: ");
            checkInDate = sdf.parse(sc.next());
            System.out.print("check-out Date dd/MM/yyyy: ");
            checkOutDate = sdf.parse(sc.next());

            reservation.updateDates(checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
