public class Grade {
    private int[] grades;

    public Grade(){
        this.grades = new int[6];
    }

    private int grade(int score){
        if (score < 30)
            return 0;
        if (score < 35)
            return 1;
        if (score < 40)
            return 2;
        if (score <45)
            return 3;
        if (score <50)
            return 4;

        return 5;
    }

    public void add(int score){
        if (score < 0 || score > 60)
            return;

        int theGrade = grade(score);
        grades[theGrade] ++;
    }

    public void print(){
        System.out.println("Grade distribution: ");

        for (int i = grades.length - 1; i >= 0; i--){
            System.out.println(i + ": " + printStars(grades[i]));
        }

        System.out.println("Acdeptance percentage: " + acceptancePercentage());
    }

    private double acceptancePercentage() {
        double totalScore = 0;
        double failed = grades[0];
        for (int grade : grades) {
            totalScore += grade;
        }
        return 100 * (totalScore - failed) / totalScore;
    }

    private String printStars(int n){
        String starContainer = "";
        for (int i = 0; i < n; i++){
            starContainer += "*";
        }
        return starContainer;
    }


}
