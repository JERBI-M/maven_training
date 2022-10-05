package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void opAdd() {
        var sample = new Sample();
        int res = Sample.op(fr.lernejo.Sample.Operation.ADD, 1, 2);
        org.assertj.core.api.Assertions.assertThat(res)
            .isEqualTo(3);

    }

    @Test
    void opMultiply() {
        var sample = new Sample();
        int res = Sample.op(Sample.Operation.MULT, 1, 2);
        org.assertj.core.api.Assertions.assertThat(res)
            .isEqualTo(2);

    }

    @Test
    void factnegative() {
        var sample = new Sample();
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(-1))
            .withMessage("N should be positive");

    }

    @Test
    void factnzero() {
        var sample = new Sample();
        int res = Sample.fact(0);
        org.assertj.core.api.Assertions.assertThat(res)
            .isEqualTo(1);

    }

    @Test
    void fact_ok() {
        var sample = new Sample();
        int res = Sample.fact(2);
        org.assertj.core.api.Assertions.assertThat(res)
            .isEqualTo(2);

    }
}
