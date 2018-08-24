package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
        StringBuilder builder = new StringBuilder("Hello,");
        builder.append(" ");
        builder.append(friendName);
        builder.append("!");

        return builder.toString();
    }
}
