public class App {

    private enum FizzBuzzInfo {
        Fizz(3), Buzz(5), FizzBuzz(15);

        private final int num;

        FizzBuzzInfo(int num) {
            this.num = num;
        }

        private boolean judgeDevidedBy(int target) {
            return target % this.num == 0;
        }
    }

    private String result;
    public static void main(String[] args) {

        App app = new App();

        for (int i = 0; i < 101; i++) {
            app.createResultFizzBuzz(i).print();
        }
    }

    private void print() {
        System.out.println(this.result);
    }

    private App createResultFizzBuzz(int num) {

        FizzBuzzInfo info = FizzBuzzInfo.FizzBuzz;
        if (info.judgeDevidedBy(num)) {
            this.takeResult(info);
            return this;
        } 

        info = FizzBuzzInfo.Fizz;
        if (info.judgeDevidedBy(num)) {
            this.takeResult(info);
            return this;
        } 

        info = FizzBuzzInfo.Buzz;
        if (info.judgeDevidedBy(num)) {
            this.takeResult(info);
            return this;
        }
        this.result = "" + num;
        return this;
    }

    private void takeResult(FizzBuzzInfo fizzBuzz) {
        this.result = fizzBuzz.name();
    }
}
