package org.example.java_api_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class StringApiTest {

    @Test
    @DisplayName("split 테스트")
    public void split() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");
        values = "1,2".split(",");
        assertThat(values).containsExactly("1","2");
    }

    @Test
    @DisplayName("substring 테스트")
    public void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

}