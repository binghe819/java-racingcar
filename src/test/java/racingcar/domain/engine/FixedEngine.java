package racingcar.domain.engine;

public class FixedEngine implements Engine{
    private int num;

    public FixedEngine(int num) {
        this.num = num;
    }

    @Override
    public boolean isMove() {
        return num > MOVABLE_DIGIT;
    }
}
