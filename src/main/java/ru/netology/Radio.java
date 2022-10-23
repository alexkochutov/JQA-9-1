package ru.netology;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public void setCurrentChannel(int channel) {
        if ((channel < minChannel) || (channel > maxChannel)) {
            return;
        } else {
            currentChannel = channel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel() {
        if (getCurrentChannel() == maxChannel) {
            setCurrentChannel(minChannel);
        } else {
            setCurrentChannel(getCurrentChannel() + 1);
        }
    }

    public void prevChannel() {
        if (getCurrentChannel() == minChannel) {
            setCurrentChannel(maxChannel);
        } else {
            setCurrentChannel(getCurrentChannel() - 1);
        }
    }

    public void setCurrentVolume(int volume) {
        if ((volume < minVolume) || (volume > maxVolume)) {
            return;
        } else {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (getCurrentVolume() == maxVolume) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() == minVolume) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }
}