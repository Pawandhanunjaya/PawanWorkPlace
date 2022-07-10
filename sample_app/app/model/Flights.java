package model;



import play.data.validation.Constraints;



public class Flights {
    @Constraints.Required(message = "Flight Id is Mandatory")
    private Integer id;

    private String model;

    private Integer seats;

    public Flights(Integer id, String model, Integer seats) {
        this.id = id;
        this.model = model;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Flights() {
    }

}
