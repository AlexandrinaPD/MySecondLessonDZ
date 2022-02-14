public class CountryTest {

    public static void main(String[] args) {


        Country myCountry = new Country();
        myCountry.name = "Ukrane";
        myCountry.capital = "Kyiv";
        myCountry.numberOfRegions = 25;
        myCountry.population = 44130000;

        System.out.printf("myCountry: name=%s, capital=%s, numberOfRegions=%d, population=%d\n", myCountry.name, myCountry.capital, myCountry.numberOfRegions, myCountry.population);


        Country herCountry = new Country();
        herCountry.name = "Poland";
        herCountry.capital = "Warsaw";
        herCountry.numberOfRegions = 16;
        herCountry.population = 38179800;

        System.out.printf("myCountry: name=%s, capital=%s, numberOfRegions=%d, population=%d\n", herCountry.name, herCountry.capital, herCountry.numberOfRegions, herCountry.population);


        Country hisCountry = new Country();
        hisCountry.name = "Armenia";
        hisCountry.capital = "Erevan";
        hisCountry.numberOfRegions = 11;
        hisCountry.population = 2986100;

        System.out.printf("myCountry: name=%s, capital=%s, numberOfRegions=%d, population=%d\n", hisCountry.name, hisCountry.capital, hisCountry.numberOfRegions, hisCountry.population);
    }
}
