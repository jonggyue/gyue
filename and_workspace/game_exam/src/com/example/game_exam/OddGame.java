package com.example.game_exam;

/**
 *
 * @author KOSTA 86기 김종규 Document : OddGame created on : 2014. 10. 8, 오후 7:27:55
 */
public class OddGame {

    public int cpuRandom() {
        int cpunum = (int) (Math.random() * 2 + 1);
        return cpunum;
    }

    public int calRate(int win, int total) {
        int rate = (int) (((double) win / total) * 100);
        return rate;

    }

    public String printGift(int rate) {
        String msg;
        if (rate == 100) {
            msg = "fuck";
        } else if (rate >= 90) {
            msg = "marcedes ㅊㅋ";
        } else if (rate >= 80) {
            msg = "hyundai";
        } else if (rate >= 70) {
            msg = "horse";
        } else {
            msg = "gg";
        }
        return msg;
    }
}
