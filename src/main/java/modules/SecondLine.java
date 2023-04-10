package modules;

//Здесь должна быть аннотация для создания из этого класса бина secondLine.
public class SecondLine {
    ThirdLine thirdLine;

    //Здесь должна быть аннотация для внедрения бина thirdLine
    public SecondLine(ThirdLine thirdLine) {
        this.thirdLine = thirdLine;
    }

    @Override
    public String toString() {
        return "Передо мной явилась ты,\n" + thirdLine;
    }
}
