package objects.ch4;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountConditionType getType(){
        return type;
    }

    public void setType(DiscountConditionType type) {
        this.type=type;
    }

    public DayOfWeek getDayOfWeek(){
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public int getSequence(){
        return sequence;
    }
    public void setSequence(int sequence){
        this.sequence=sequence;
    }
}
