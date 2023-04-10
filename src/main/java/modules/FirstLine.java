package modules;

//Здесь должна быть аннотация для создания из этого класса бина firstLine.
public class FirstLine {
    //Здесь должна быть аннотация для внедрения бина secondLine
    SecondLine nextLine;

    @Override
    public String toString() {
        return "Я помню чудное мгновенье:\n" + nextLine;
    }
}
