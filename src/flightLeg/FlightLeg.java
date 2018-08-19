package flightLeg;

public class FlightLeg {
    private final String from;
    private final String to;
    private boolean delayed;
    private float price;

    private FlightLeg(FlightBuilder flightBuilder) {
        from = flightBuilder.from;
        to = flightBuilder.to;
        delayed = flightBuilder.delayed;
        price = flightBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean getDelayed() {
        return delayed;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightBuilder {
        private final String from;
        private final String to;
        private boolean delayed;
        private float price;

        public FlightBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightBuilder buildPrice(float price){
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            if(price == 0){
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }
}
