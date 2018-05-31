package example;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

/**
 * @author Craftey
 */
public class GroupTest1 {

    @Test
    public void minimalTest() {
        assertThat(true).isFalse();
    }

}
