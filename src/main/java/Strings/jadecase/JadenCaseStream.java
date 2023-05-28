package Strings.jadecase;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 使用 stream 方式
 */
public class JadenCaseStream {

    public String toJadenCase(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }
        /**
         * 1. split 依據空白做分割
         * 2. map 分割後要轉成另一種資料，先把手字轉大寫再 + 回去
         * 3. collect 收集資料並再把空格補回
         */
        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

}