package telran.monitoring.dto;

public record PulseProbe(long patientId, int value, long timestamp, int seqNumber) {
	
}
