package services;

import dto.FlightsResponseDto;
import exceptions.ModelNotFoundException;
import model.Flights;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class FlightsServiceImpl implements FlightsService{

    List<FlightsResponseDto> flightsResponseDtos=new ArrayList<>();

    @Override
    public List<FlightsResponseDto> getFlights()
    {
        System.out.println("Get Flights Controller method.....");
        return flightsResponseDtos;

    }

    @Override
    public FlightsResponseDto addFlights(Flights flights) {
        String model=flights.getModel();
        Integer seats=flights.getSeats();
        System.out.println("Flights service Implementation method");
        System.out.println("Model : "+model +" Seats : "+seats);
        flightsResponseDtos.add(new FlightsResponseDto(model,seats));
        return new FlightsResponseDto(model,seats);

    }

    @Override
    public List<FlightsResponseDto> updateFlight(Flights flights) throws ModelNotFoundException {
        int count=0;

            for (FlightsResponseDto i : flightsResponseDtos)
            {
                if (i.getModel().equalsIgnoreCase(flights.getModel())) {
                    i.setSeats(flights.getSeats());
                    count++;
                }
            }
            try
            {
                if (count == 1)
                {
                    System.out.println("Successfully updated......");
                }
                else
                {
                    throw new ModelNotFoundException("Model Not found.....");
                }
            }
            catch (ModelNotFoundException e)
            {
                e.printStackTrace();
            }

            return flightsResponseDtos;
    }


}

