package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetValidChannelEqualMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidChannelEqualMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        int expected = 9;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.nextChannel();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(1);
        radio.prevChannel();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeEqualMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidVolumeEqualMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}