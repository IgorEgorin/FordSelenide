package FordSelenide.Header;

import FordSelenide.sameElementForPassengerAndCommercialVehicles.sameElementForPassAndCommercVeh.SameElementPassVehicles;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPopUpPassangerCar {

    private SelenideElement headerPopUpMenuPassCar;
    private SelenideElement headerPopUpMenuPassCarFiesta;
    private SelenideElement headerPopUpMenuPassCarFocus;
    private SelenideElement headerPopUpMenuPassCarMondeo;
    private SelenideElement headerPopUpMenuPassCarEcoSport;
    private SelenideElement headerPopUpMenuPassCarNewEcoSport;
    private SelenideElement headerPopUpMenuPassCarKuga;
    private SelenideElement headerPopUpMenuPassCarNewExplorer;
    private SelenideElement headerPopUpMenuPassCarFutureCars;


    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkFiesta;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkFocus;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkMondeo;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkEcoSport;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkNewEcoSport;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkKuga;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkNewExplorer;
    private SelenideElement headerPopUpMenuPassCarLearnMoreLinkFutureCars;


    private SelenideElement headerPopUpMenuPassCarImageLearnMoreFiesta;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreFocus;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreMondeo;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreEcoSport;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreNewEcoSport;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreKuga;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreNewExplorer;
    private SelenideElement headerPopUpMenuPassCarImageLearnMoreFutureCars;


    private SelenideElement headerPopUpMenuPassCarSpecialOffer;
    private SelenideElement headerPopUpMenuPassCarConfigurator;
    private SelenideElement headerPopUpMenuPassCarOrderAtestDrive;
    private SelenideElement headerPopUpMenuPassCarCreditCalc;
    private SelenideElement headerPopUpMenuPassCarAccessories;

    public HeaderPopUpPassangerCar() {
        this.headerPopUpMenuPassCar = $("[data-selenium=\"EP2_mainTopNav\"]");
        this.headerPopUpMenuPassCarFiesta = $("[rel=\"innerWrap0\"]");
        this.headerPopUpMenuPassCarFocus = $("[rel=\"innerWrap1\"]");
        this.headerPopUpMenuPassCarMondeo = $("[rel=\"innerWrap2\"]");
        this.headerPopUpMenuPassCarEcoSport = $("[rel=\"innerWrap3\"]");
        this.headerPopUpMenuPassCarNewEcoSport = $("[rel=\"innerWrap4\"]");
        this.headerPopUpMenuPassCarKuga = $("[rel=\"innerWrap5\"]");
        this.headerPopUpMenuPassCarNewExplorer = $("[rel=\"innerWrap6\"]");
        this.headerPopUpMenuPassCarFutureCars = $("[rel=\"innerWrap7\"]");

        this.headerPopUpMenuPassCarLearnMoreLinkFiesta = $("div[class=\"btnLink\"] a[href=\"/Cars/NewFiesta\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkFocus = $("div[class=\"btnLink\"] a[href=\"/Cars/NewFocus\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkMondeo = $("div[class=\"btnLink\"] a[href=\"/Cars/All-NewMondeo\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkEcoSport = $("div[class=\"btnLink\"] a[href=\"/Cars/EcoSport\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkNewEcoSport = $("div[class=\"btnLink\"] a[href=\"/Cars/NewEcoSport\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkKuga = $("div[class=\"btnLink\"] a[href=\"/Cars/All-NewKuga\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkNewExplorer = $("div[class=\"btnLink\"] a[href=\"/Cars/NewExplorerMCA\"]");
        this.headerPopUpMenuPassCarLearnMoreLinkFutureCars = $("div[class=\"btnLink\"] a[href=\"/Cars/FutureVehicles\"]");

        this.headerPopUpMenuPassCarImageLearnMoreFiesta = $("a[href=\"/Cars/NewFiesta\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreFocus = $("a[href=\"/Cars/NewFocus\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreMondeo = $("a[href=\"/Cars/All-NewMondeo\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreEcoSport = $("a[href=\"/Cars/EcoSport\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreNewEcoSport = $("a[href=\"/Cars/NewEcoSport\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreKuga = $("a[href=\"/Cars/All-NewKuga\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreNewExplorer = $("a[href=\"/Cars/NewExplorerMCA\"] img");
        this.headerPopUpMenuPassCarImageLearnMoreFutureCars = $("a[href=\"/Cars/FutureVehicles\"] img");

        this.headerPopUpMenuPassCarSpecialOffer = $("[href=\"/SBE/SpecialOffers/SpecialOffer_Vehicles/SpecialOffer_PV\"] [class=\"normalHeading\"]");
        this.headerPopUpMenuPassCarConfigurator = $("[href=\"/PV-BuildandPrice\"] [class=\"normalHeading\"]");
        this.headerPopUpMenuPassCarOrderAtestDrive = $("[href=\"/SBE/TestDrive\"] [class=\"normalHeading\"]");
        this.headerPopUpMenuPassCarCreditCalc = $("[data-nav=\"pv\"] [href=\"/BuyingGuide/CreditCalculator\"]:nth-of-type(1)");
        this.headerPopUpMenuPassCarAccessories = $(By.xpath("(//a[@href=\"http://www.accessories.ford.ru\"])[1]"));
    }

    public SameElementPassVehicles goToFiestaPage() {
        headerPopUpMenuPassCar.hover();
        headerPopUpMenuPassCarFiesta.click();
        return new SameElementPassVehicles();
    }
}
