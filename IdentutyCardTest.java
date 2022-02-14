public class IdentutyCardTest {


    public static void main(String[] args) {

        IdentityCard myIdentityCard = new IdentityCard();
        myIdentityCard.passportSeries = "NK";
        myIdentityCard.holder = "Aleksandra Dehtiarova";
        myIdentityCard.dateOfIssue = 29_11_2012;
        myIdentityCard.passportNumber = 111111;

        System.out.printf("myIdentityCard: passportSeries=%s, passportNumber=%d, holder=%s, dateOfIssue=%d\n", myIdentityCard.passportSeries, myIdentityCard.passportNumber, myIdentityCard.holder, myIdentityCard.dateOfIssue);


        IdentityCard herIdentityCard = new IdentityCard();
        herIdentityCard.passportSeries = "CB";
        herIdentityCard.holder = "Irina Dehtiarova";
        herIdentityCard.dateOfIssue = 15_03_1982;
        herIdentityCard.passportNumber = 222222;

        System.out.printf("herIdentityCard: passportSeries=%s, passportNumber=%d, holder=%s, dateOfIssue=%d\n", herIdentityCard.passportSeries, herIdentityCard.passportNumber, herIdentityCard.holder, herIdentityCard.dateOfIssue);


        IdentityCard hisIdentityCard = new IdentityCard();
        hisIdentityCard.passportSeries = "RT";
        hisIdentityCard.holder = "Pavel Dehtiarov";
        hisIdentityCard.dateOfIssue = 18_12_1982;
        hisIdentityCard.passportNumber = 333333;

        System.out.printf("hisIdentityCard: passportSeries=%s, passportNumber=%d, holder=%s, dateOfIssue=%d\n", hisIdentityCard.passportSeries, hisIdentityCard.passportNumber, hisIdentityCard.holder, hisIdentityCard.dateOfIssue);

    }
}
