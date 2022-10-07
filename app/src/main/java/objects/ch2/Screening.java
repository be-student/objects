package objects.ch2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie,int sequence,LocalDateTime whenScreened){
        this.movie=movie;
        this.sequence=sequence;
        this.whenScreened=whenScreened;
    }

    public LocalDateTime getStartTime(){
        return whenScreened;
    }

    public boolean isSequence(int sequence){
        return this.sequence==sequence;
    }

    public Money getMovieFee(){
        return movie.getFee();
    }
    public Reservation reserve(Customer customer,int audienceCount){
        return new Reservation(customer,this,calculateFee(audienceCount),audienceCount);
    }
    private Money calculateFee(int audienceCount){
        System.out.println(new Movie("star wars", Duration.ofMinutes(210),Money.wons(10000),new NoneDiscountPolicy()));
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
