package com.ldg.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.sound.sampled.Line;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAndThen() {
        String[] arrays = {"小李飞刀,古龙,李寻欢", "天龙八部,金庸,乔峰", "笑傲江湖,金庸,令狐冲"};
        Consumer<String> workConsumer = (line) -> {
            String name = line.split(",")[0];
            System.out.println("作品名字:" + name);
        };
        Consumer<String> authorConsumer = (line) -> {
            String author = line.split(",")[1];
            System.out.println("作者:" + author);
        };
        Consumer<String> roleConsumer = (line) -> {
            String role = line.split(",")[2];
            System.out.println("主角:" + role);
            System.out.println();
        };
        //链式调用
        Arrays.stream(arrays).forEach(workConsumer.andThen(authorConsumer).andThen(roleConsumer));

    }
}
