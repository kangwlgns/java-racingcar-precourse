package view;

import controller.RaceControllerInterface;
import java.util.Arrays;
import java.util.Scanner;
import observer.Observer;
import service.RaceServiceInterface;

public class RaceView implements Observer, RaceViewInterface {

    private RaceServiceInterface raceServiceInterface;
    private RaceControllerInterface raceControllerInterface;

    @Override
    public void update() {

    }

    // 자동차 이름을 입력받는 메서드
    @Override
    public void userCarsInput() {
        // 안내문 출력
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");

        // 유저의 입력을 받고 token으로 쪼개기
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] cars = userInput.split(",");

        // Controller에게 유저의 입력을 전달
        raceControllerInterface.addCars(cars);
    }

    @Override
    public void userRoundsInput() {

    }

    @Override
    public void printProgress() {

    }

    @Override
    public void printProcess() {

    }

    @Override
    public void printResult() {

    }
}
