package org.example.java_api_test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ArrayApiTest {

    @Test
    @DisplayName("copyOfRangeWeeks 테스트")
    public void copyOfRangeWeeks() {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        String[] copyOfWeeks = Arrays.copyOf(weeks, weeks.length);
        assertThat(weeks).containsExactly(copyOfWeeks);
        String[] copyOfRangeWeeks = Arrays.copyOfRange(weeks, 0, weeks.length);
        assertThat(weeks).containsExactly(copyOfRangeWeeks);
    }
}
