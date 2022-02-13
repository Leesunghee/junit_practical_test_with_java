package com.himalaya.junit_practical_test_with_java.iloveyouboss;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class ScoreCollectionTest {

    @Test
    public void test() {
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        // given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // when
        int actualResult = collection.arithmeticMean();

        // then
        assertThat(actualResult).isEqualTo(6);

    }

}
