package controllers;

import com.google.inject.Inject;
import dto.FlightsResponseDto;
import exceptions.ModelNotFoundException;
import model.Flights;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import services.FlightsService;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok();
    }

    @Inject
    FormFactory formFactory;

    @Inject
    FlightsService flightsService;


    public Result getFlights()
    {
        List<FlightsResponseDto> flightsResponseDto= flightsService.getFlights();
        return ok(Json.toJson(flightsResponseDto));
    }

    public Result addFlights(Http.Request request)
    {
        Form<Flights> flightsForm= formFactory.form(Flights.class).bindFromRequest(request);
        FlightsResponseDto flightsResponseDto = flightsService.addFlights(flightsForm.get());
        System.out.println("Controller Method..............");
        System.out.println("Model : "+flightsResponseDto.getModel() +" Seats : "+flightsResponseDto.getSeats());
        System.out.println("Flight data added..............");
        return  ok(Json.toJson(flightsResponseDto));
    }

    public Result updateFlight(Http.Request request) throws ModelNotFoundException {
        Form<Flights> flightsForm=formFactory.form(Flights.class).bindFromRequest(request);
        List<FlightsResponseDto> flightsResponseDto= flightsService.updateFlight(flightsForm.get());
        System.out.println("Flight data Updated.............");
        return redirect("http://localhost:9000/v1/flights");

    }
}
