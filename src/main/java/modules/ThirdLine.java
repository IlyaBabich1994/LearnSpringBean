package modules;

//Здесь должна быть аннотация для создания из этого класса бина thirdLine.
public class ThirdLine {
    FourthLine fourthLine;

    //Здесь должна быть аннотация для внедрения бина fourthLine
    public void setFourthLine(FourthLine fourthLine) {
        this.fourthLine = fourthLine;
    }

    @Override
    public String toString() {
        return "Как мимолетное виденье,\n" + fourthLine;
    }
}
