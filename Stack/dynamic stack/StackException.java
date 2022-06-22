public class StackException extends Exception {

    String exception;

    StackException() {
    }

    StackException(String exception) {
        this.exception = exception;
        System.out.println(exception);
    }

}
