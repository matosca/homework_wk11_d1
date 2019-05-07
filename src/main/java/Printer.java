public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public boolean print(int pages, int copies){
        int total = pages * copies;

        if (total > this.paper || total > this.toner) {
            return false;
        }

        this.paper -= total;
        this.toner -= total;
        return true;
    }

    public void fillPaper(int count){
        this.paper += count;
    }


    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }

}
