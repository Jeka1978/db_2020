package collections;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows

    @Scheduled(fixedDelay = 12)
    @Scheduled(fixedDelay = 12)
    @Scheduled(fixedDelay = 12)
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("arnold", "stallone", "chuck norris", "bruse lee"));


        String guyToRemove = "chuck norris";

        list.removeIf(next -> next.equals(guyToRemove));

        list.removeIf(s -> s.equals(guyToRemove));

        System.out.println(list);


        Cache<String, Integer> cache = CacheBuilder.newBuilder()
                .weakKeys()
                .softValues()
                .expireAfterAccess(2, TimeUnit.HOURS).maximumSize(100).expireAfterWrite(3, TimeUnit.DAYS).build();


        Integer integer = cache.get("Lena", () -> 12);





    }
}
