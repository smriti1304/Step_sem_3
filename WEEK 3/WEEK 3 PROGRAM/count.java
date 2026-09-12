class Applicant {

    static int totalApplicants = 0;

    Applicant() {
        totalApplicants++;
    }
}

public class count {
    public static void main(String[] args) {

        Applicant a1 = new Applicant();
        Applicant a2 = new Applicant();
        Applicant a3 = new Applicant();

        System.out.println("Total applicants: "
                           + Applicant.totalApplicants);
    }
}