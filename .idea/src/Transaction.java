package Blockcain;

public class Transaction {
    private String[] s ;
    private String UID ;
    public boolean Vote ;


    public Transaction(String[] s) {
        this.s = s;
    }

    public String[] getS() {
        return s;
    }

    public void setS(String[] s) {
        this.s = s;
    }
}
