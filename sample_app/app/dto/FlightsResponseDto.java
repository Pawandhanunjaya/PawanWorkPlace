package dto;


import play.data.validation.Constraints;

import javax.validation.Constraint;


public class FlightsResponseDto {



    @Constraints.Required(message = "Model is Required")
    private String model;

    @Constraints.Required(message = "Seats Data is Required")
    private Integer seats;

    public FlightsResponseDto(String model, Integer seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
