package view;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<String> bridge, int index) {
        StringBuilder upBridge = new StringBuilder();
        StringBuilder downBridge = new StringBuilder();
        upBridge.append("[");
        downBridge.append("[");
        for (int i = 0; i < index; i++) {
            if (bridge.get(i).equals("U")) {
                upBridge.append(" O ");
                downBridge.append("   ");
                continue;
            }

            upBridge.append("   ");
            downBridge.append(" O ");
        }

        upBridge.append("]");
        downBridge.append("]");
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(List<String> bridge, boolean successOrNot, int trialCount) {
        System.out.println("최종 게임 결과");

        printMap(bridge,0);

        if (successOrNot) {
            printSuccessMessage(trialCount);
            return;
        }
        printFailureMessage(trialCount);
    }

    /**
     * Print Game Result Message
     */
    public void printSuccessMessage(int trial) {
        System.out.println("게임 성공 여부: 성공");
        System.out.println("총 시도한 횟수: "+ trial);
    }

    public void printFailureMessage(int trial) {
        System.out.println("게임 성공 여부: 실패");
        System.out.println("총 시도한 횟수: " + trial);
    }

    public void printGameStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
    }


    /**
     * Print User Input Request Message
     */
    public void printBridgeSizeRequestMessage() {
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void printMovementRequestMessage() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
    }

    public void printExitCodeRequestMessage() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }

}
