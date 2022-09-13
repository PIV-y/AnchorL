package AnchorLengthEst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SideEstimationTest {

    @Test
    void sectionAreaEqualPI4() {
        assertEquals(Math.PI*4,SideEstimation.SectionArea(4));
    }
    @Test
    void sectionAreaEqualZero() {
        assertEquals(0,SideEstimation.SectionArea(0));
    }
}