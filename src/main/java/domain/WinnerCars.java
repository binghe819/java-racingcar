package domain;

import java.util.ArrayList;

public class WinnerCars {

    public ArrayList<Car> determineWinners(ArrayList<Car> cars) {
        int maxPosition = getMaxPosition(cars);

        return searchWinners(maxPosition, cars);
    }

    private int getMaxPosition(ArrayList<Car> cars) {
        int maxPosition = 0;

        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }

        return maxPosition;
    }

    private ArrayList<Car> searchWinners(int maxPosition, ArrayList<Car> cars) {
        ArrayList<Car> winnerList = new ArrayList<>();

        for (Car car : cars) {
            if (car.compareToPosition(maxPosition)) {
                winnerList.add(car);
            }
        }

        return winnerList;
    }
}
