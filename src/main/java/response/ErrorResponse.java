package response;

public enum ErrorResponse {
    INPUT_BRIDE_SIZE_RANGE_ERROR("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    INPUT_MOVEMENT_ERROR("[ERROR] 이동 입력은 대문자 U 또는 대문자 D만 허용됩니다."),
    INPUT_EXITCODE_ERROR("[ERROR] 종료 선택 입력은 대문자 R 또는 대문자 Q만 허용됩니다."),
    ;

    private String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
