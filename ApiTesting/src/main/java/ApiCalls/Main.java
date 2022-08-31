package ApiCalls;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, UnirestException {
        // creating a ScheduledExecutorService object
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);

        for (int i = 1;i<21;i++) {
            scheduler.schedule(new Request(i), i*250L,
                    TimeUnit.MILLISECONDS);
        }

        scheduler.shutdown();

    }
}