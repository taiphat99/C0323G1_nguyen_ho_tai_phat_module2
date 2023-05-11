package ss4_class_and_object_in_array.exercise.exercise_2;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }

    public long start(){
        return this.startTime = System.currentTimeMillis();
    }
    public long end(){
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }
}
