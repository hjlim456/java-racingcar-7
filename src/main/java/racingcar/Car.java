package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    public void randomlyMove(boolean if60PercentChance) {
        if (if60PercentChance) {
            this.position++;
        }
    }
    public int getPosition() {
        return position;
    }
}
