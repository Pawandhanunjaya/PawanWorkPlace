package services;

import com.google.inject.ImplementedBy;
import dto.FlightsResponseDto;
import exceptions.ModelNotFoundException;
import model.Flights;

import java.util.List;

@ImplementedBy(FlightsServiceImpl.class)
public interface FlightsService {
    public List<FlightsResponseDto> getFlights();
    public FlightsResponseDto addFlights(Flights flights);
    public List<FlightsResponseDto> updateFlight(Flights flights) throws ModelNotFoundException, ModelNotFoundException;
}
