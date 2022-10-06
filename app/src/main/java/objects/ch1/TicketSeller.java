package objects.ch1;

public class TicketSeller {
    private TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice=ticketOffice;
    }

    public void sellTo(Audience audience){
        this.ticketOffice.sellTicketTo(audience);
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
