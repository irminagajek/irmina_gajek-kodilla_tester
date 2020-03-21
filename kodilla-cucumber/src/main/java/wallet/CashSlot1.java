package wallet;

public class CashSlot1 {
    private int contents;
    private String display;

      public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
