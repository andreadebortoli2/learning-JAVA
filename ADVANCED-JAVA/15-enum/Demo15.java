enum Status {

    Running(11), Failed(22), Pending(33), Success(44);

    private int code;

    private Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

public class Demo15 {
    public static void main(String[] args) {

        Status status = Status.Success;
        System.out.println(status);

        Status[] sl = Status.values();

        for (Status s : sl) {
            System.out.println(s + " : " + s.ordinal() + " : " + s.getCode());
        }

        switch (status) {
            case Running:
                System.out.println("status: " + status.getCode() + " message: All Good");
                break;
            case Failed:
                System.out.println("status: " + status.getCode() + " message: Try Again");
                break;
            case Pending:
                System.out.println("status: " + status.getCode() + " message: Please Wait");
                break;
            case Success:
                System.out.println("status: " + status.getCode() + " message: Done");
                break;
        }
    }
}
