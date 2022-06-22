public class QueueException extends Exception {

    String exception;

    QueueException() {
    }

    QueueException(String exception) {
        this.exception = exception;
        System.out.println(exception);
    }

}
