package service;

import java.util.ArrayList;
import model.RaceModelInterface;
import observer.Observer;
import observer.Subject;

public class RaceService implements Subject, RaceServiceInterface {

    private RaceModelInterface race;

    @Override
    public int getNumberOfCars() {
        return 0;
    }

    @Override
    public int getNumberOfRounds() {
        return 0;
    }

    @Override
    public ArrayList<CarServiceInterface> getCars() {
        return null;
    }

    @Override
    public void addCars(String[] cars) {

    }

    @Override
    public void setNumberOfRounds(String rounds) throws IllegalArgumentException, NumberFormatException {
        // 수가 아닌 경우
        int numberOfRounds = Integer.parseInt(rounds);

        // 100보다 큰 입력이 들어온 경우
        if (numberOfRounds > 100) {
            throw new IllegalArgumentException();
        }

        race.setNumberOfRounds(numberOfRounds);
    }

    public boolean roundValidation() {
        return true;
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
