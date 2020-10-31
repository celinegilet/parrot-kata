package fr.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(12.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 1, 0, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(3.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 2, 0, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 0, 0, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(12.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, true);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(18.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        // Given
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);

        // When
        double speed = parrot.getSpeed();

        // Then
        assertThat(speed).isEqualTo(24.0);
    }

}
