package by.epam.task1.generator;

import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Random;


@SuppressWarnings("WeakerAccess")
public class RandomGenerator {

    @Getter
    private final Random random;

    public RandomGenerator(Random random) {
        this.random = random;
    }

    public String randomString(final int maxSize) {
        return randomString(0, maxSize);
    }

    public String randomString(final int minSize,
                               final int expectedMaxSize) {

        var maxSize = expectedMaxSize;
        if (maxSize > 10000) {
            maxSize = 10000;
        }

        return RandomStringUtils.randomAlphanumeric(
                random.nextInt(maxSize - minSize) + minSize);
    }

    private String randomStringAlphabetic(final int minSize,
                                          final int maxSize) {
        return RandomStringUtils.randomAlphabetic(
                random.nextInt(maxSize) + minSize);
    }

    private String randomStringAlphanumeric(final int minSize,
                                            final int maxSize) {
        return RandomStringUtils.randomAlphanumeric(
                random.nextInt(maxSize) + minSize);
    }

    private String randomStringAscii(final int minSize, final int maxSize) {
        return RandomStringUtils.randomAscii(
                random.nextInt(maxSize) + minSize);
    }


    public String randomString(final StringType stringType) {
        return randomString(0, Integer.MAX_VALUE, stringType);
    }

    public String randomString(final int maxSize, final StringType stringType) {
        return randomString(0, maxSize, stringType);
    }

    public String randomString(final int minSize,
                               final int maxSize,
                               final StringType stringType) {
        String result;
        switch (stringType) {
            case ALPHABETIC:
                result = randomStringAlphabetic(minSize, maxSize);
                break;

            case ALPHANUMBERIC:
                result = randomStringAlphanumeric(minSize, maxSize);
                break;

            case ASCII:
                result = randomStringAscii(minSize, maxSize);
                break;

            case WHOLE:
            default:
                result = randomString(minSize, maxSize);
                break;
        }
        return result;
    }

    public double randomDouble() {
        return random.nextInt() + random.nextDouble();
    }

    public double randomDouble(final int max) {
        return randomDouble(0, max);
    }

    public double randomDouble(final int min, final int max) {
        return random.nextInt(max - min) + min + random.nextDouble();
    }

    public int randomInt() {
        return random.nextInt();
    }

    public int randomInt(final int maxSize) {
        return randomInt(0, maxSize);
    }

    public int randomInt(final int minSize, final int maxSize) {
        return random.nextInt(maxSize - minSize) + minSize;
    }

    public long randomLong(final long maxSize) {
        return randomLong(0L, maxSize);
    }

    public long randomLong(final long minSize, final long maxSize) {
        return Math.abs((random.nextLong() % (maxSize - minSize)) + minSize);
    }

    public long randomLong() {
        return random.nextLong();
    }

    public LocalDate randomLocalDate() {
        return LocalDate.ofEpochDay(randomShort());
    }

    public short randomShort(short min, short max) {
        return (short) randomInt(min, max);
    }

    public short randomShort(short max) {
        return (short) randomInt(0, max);
    }

    public short randomShort() {
        return (short) randomInt(0, Short.MAX_VALUE);
    }

}
