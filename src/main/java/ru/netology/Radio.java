package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int channelCount = 10;
    private int minChannel = 0;
    private int maxChannel = channelCount - 1;
    private int currentChannel = minChannel;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int channelCount) {
        if (channelCount >= 2) {
            this.channelCount = channelCount;
            maxChannel = this.channelCount - 1;
        }
    }

    public int getChannelCount() {
        return channelCount;
    }

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