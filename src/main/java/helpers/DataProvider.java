package helpers;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

/**
 * Провайдер тестовых данных для параметризованных тестов.
 *
 * @author Yan
 */

public class DataProvider {


    public static Stream<Arguments> providerCheckingElements() {
        return Stream.of(
                Arguments.of("Смартфоны", "iphone", "Apple")
        );
    }
}

