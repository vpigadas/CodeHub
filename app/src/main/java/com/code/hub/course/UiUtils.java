package com.code.hub.course;


public final class UiUtils {

    public static int getChannelIconRes(String channelName) {
        int drawable = R.mipmap.ic_launcher_round;

        switch (channelName) {
            case "ΒΟΥΛΗ":
                drawable = R.drawable.ic_channel_vouli;
                break;
            case "ΕΡΤ1":
                drawable = R.drawable.ic_channel_ert1;
                break;
            case "ΕΡΤ2":
                drawable = R.drawable.ic_channel_ert2;
                break;
            case "ΕΡΤ3":
                drawable = R.drawable.ic_channel_ert3;
                break;
            case "ΕΡΤ HD":
                drawable = R.drawable.ic_channel_ert_hd;
                break;
            case "ANT1":
            case "ANT1 HD":
                drawable = R.drawable.ic_channel_ant1;
                break;
            case "ALPHA":
            case "ALPHA HD":
                drawable = R.drawable.ic_channel_alpha;
                break;
            case "STAR":
            case "STAR HD":
                drawable = R.drawable.ic_channel_star;
                break;
            case "ΣΚΑΪ":
            case "ΣΚΑΪ HD":
                drawable = R.drawable.ic_channel_skai;
                break;
            case "OPEN BEYOND":
            case "OPEN BEYOND HD":
                drawable = R.drawable.ic_channel_open;
                break;
            case "COSMOTE HISTORY HD":
                drawable = R.drawable.ic_channel_history;
                break;
            case "COSMOTE CINEMA 1HD":
                drawable = R.drawable.ic_channel_ote_cinema_1;
                break;
            case "COSMOTE CINEMA 2 HD":
                drawable = R.drawable.ic_channel_ote_cinema_2;
                break;
            case "COSMOTE CINEMA 3":
                drawable = R.drawable.ic_channel_ote_cinema_3;
                break;
            case "COSMOTE CINEMA 4HD":
                drawable = R.drawable.ic_channel_ote_cinema_4;
                break;
            case "Village Cinema HD":
                drawable = R.drawable.ic_channel_village;
                break;
            case "SundanceTV":
                drawable = R.drawable.ic_channel_sundande;
                break;
            case "FOX HD":
                drawable = R.drawable.ic_channel_fox;
                break;
            case "FOX Life HD":
                drawable = R.drawable.ic_channel_foxlife;
                break;
            case "E! HD":
                drawable = R.drawable.ic_channel_e;
                break;
            case "COSMOTE SPORT HIGHLIGHTS HD":
                drawable = R.mipmap.ic_launcher_round;
                break;
            case "COSMOTE SPORT 1HD":
                drawable = R.drawable.ic_channel_ote_sport_1;
                break;
            case "COSMOTE SPORT 2HD":
                drawable = R.drawable.ic_channel_ote_sport_2;
                break;
            case "COSMOTE SPORT 3HD":
                drawable = R.drawable.ic_channel_ote_sport_3;
                break;
            case "COSMOTE SPORT 4HD":
                drawable = R.drawable.ic_channel_ote_sport_4;
                break;
            case "COSMOTE SPORT 5HD":
                drawable = R.drawable.ic_channel_ote_sport_5;
                break;
            case "COSMOTE SPORT 6HD":
                drawable = R.drawable.ic_channel_ote_sport_6;
                break;
            case "COSMOTE SPORT 7HD":
                drawable = R.drawable.ic_channel_ote_sport_7;
                break;
            case "COSMOTE SPORT 8HD":
                drawable = R.drawable.ic_channel_ote_sport_8;
                break;
        }

        return drawable;
    }
}
