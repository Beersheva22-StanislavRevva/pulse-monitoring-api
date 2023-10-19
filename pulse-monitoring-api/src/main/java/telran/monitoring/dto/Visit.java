package telran.monitoring.dto;

import java.time.LocalDate;

public record Visit(String patientName, String doctorName, LocalDate visitDate) {

}
