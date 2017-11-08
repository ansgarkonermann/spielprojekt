package org.test.uuidtest;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.NoArgGenerator;

import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class UuidTest {

    public static final int UUIDS_BETWEEN_CONSOLE_OUTPUT = 1000000;
    private static AtomicLong uuidCounter = new AtomicLong(0l);
    private static AtomicInteger secondsCounter = new AtomicInteger(0);
    private static AtomicReference<UUID> lastUuid = new AtomicReference<>();

//    private static ObjectOutputStream os;


    public static void main(String[] args) throws Exception {
//        os = new BufferedOutputStream(new FileOutputStream("C:\\Users\\ansgar\\UUIDS.DAT"), 8 * 1024 * 1024);
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int seconds = secondsCounter.getAndIncrement();
                long uuidCount = uuidCounter.get();
                System.out.println("Generated UUIDs: " + uuidCount + " in " + seconds + " seconds (" + (1.0d * uuidCount) / ( 1.0d * seconds) + " per second).");
            }
        }, 0l, 1000l);

//        TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
        NoArgGenerator generator = Generators.randomBasedGenerator();
        for (int i = 0; i < 500 * UUIDS_BETWEEN_CONSOLE_OUTPUT; i++ ){
            UUID uuid = generator.generate();
            long counter = UuidTest.uuidCounter.incrementAndGet();
            if (counter % UUIDS_BETWEEN_CONSOLE_OUTPUT == 0) {
                System.out.println(counter / UUIDS_BETWEEN_CONSOLE_OUTPUT + " x " + UUIDS_BETWEEN_CONSOLE_OUTPUT + " UUIDs generated (last one: " + uuid.toString() + ")");
            }
//            os.writeLong(uuid.getMostSignificantBits());
//            os.writeLong(uuid.getLeastSignificantBits());
        }
//        os.flush();
//        os.close();
    }
}
