//package FordSelenide.Header;
//
//import com.codeborne.selenide.SelenideElement;
//
//import static com.codeborne.selenide.Selenide.$;
//
//public class HeaderPopUpCommercialVehicles {
//
//    private SelenideElement headerPopUpMenuCommercialVehicles;
//
//    private SelenideElement headerPopUpMenuCommercialVehiclesVans;
//    private SelenideElement headerPopUpMenuCommercialVehiclesVansTransitVanImg;
//    private SelenideElement headerPopUpMenuCommercialVehiclesVansTransitCustomImg;
//
//    private SelenideElement headerPopUpMenuCommercialVehiclesBus;
//    private SelenideElement headerPopUpMenuCommercialVehiclesBusPassengerBusImg;
//    private SelenideElement headerPopUpMenuCommercialVehiclesBusTourneoBusImg;
//    private SelenideElement headerPopUpMenuCommercialVehiclesBusNewTourneoCustomImg;
//
//    private SelenideElement headerPopUpMenuCommercialVehiclesChassisAddOns;
//    private SelenideElement headerPopUpMenuCommercialVehiclesChassisAddOnsChassisWithAddOnsImg;
//    private SelenideElement headerPopUpMenuCommercialVehiclesChassisAddOnsTransitChassisImg;
//
//    private SelenideElement headerPopUpMenuCommercialVehiclesSpecVersion;
//    private SelenideElement headerPopUpMenuCommercialVehiclesSpecVersionForBusinessImg;
//
//    private SelenideElement headerPopUpMenuCommercialVehiclesSpecialOffer;
//    private SelenideElement headerPopUpMenuCommercialVehiclesConfigurator;
//    private SelenideElement headerPopUpMenuCommercialVehiclesSearchAdealer;
//    private SelenideElement headerPopUpMenuCommercialVehiclesCreditCalc;
//    private SelenideElement headerPopUpMenuCommercialVehiclesAccessories;
//
//    public HeaderPopUpCommercialVehicles() {
//        this.headerPopUpMenuCommercialVehicles = $("[class=\"mainTopNav om_he_pv_li\"][href=\"/Commercialvehicles\"]");
//
//        this.headerPopUpMenuCommercialVehiclesVans = $("[rel=\"cvInnerWrap0\"]");
//        this.headerPopUpMenuCommercialVehiclesVansTransitVanImg = $("[alt=\"Transit фургон\"]");
//        this.headerPopUpMenuCommercialVehiclesVansTransitCustomImg = $("[alt=\"Transit Custom\"]");
//
//        this.headerPopUpMenuCommercialVehiclesBus = $("[rel=\"cvInnerWrap1\"]");
//        this.headerPopUpMenuCommercialVehiclesBusPassengerBusImg = $("[alt=\"Пассажирские Автобусы\"]");
//        this.headerPopUpMenuCommercialVehiclesBusTourneoBusImg = $("[alt=\"Tourneo Custom\"]");
//        this.headerPopUpMenuCommercialVehiclesBusNewTourneoCustomImg = $("[alt=\"Новый Tourneo Custom\"]");
//
//        this.headerPopUpMenuCommercialVehiclesChassisAddOns = $("[rel=\"cvInnerWrap2\"]");
//        this.headerPopUpMenuCommercialVehiclesChassisAddOnsChassisWithAddOnsImg = $("[alt=\"Шасси c надстройками\"]");
//        this.headerPopUpMenuCommercialVehiclesChassisAddOnsTransitChassisImg = $("[alt=\"Transit Шасси\"]");
//
//        this.headerPopUpMenuCommercialVehiclesSpecVersion = $("[rel=\"cvInnerWrap3\"]");
//        this.headerPopUpMenuCommercialVehiclesSpecVersionForBusinessImg = $("[alt=\"Спецверсии от сертифицированных кузовостроителей\"]");
//
//        this.headerPopUpMenuCommercialVehiclesSpecialOffer = $("[href=\"/SBE/SpecialOffers/SpecialOffer_Vehicles/SpecialOffer_PV\"] [class=\"normalHeading\"]");
//        this.headerPopUpMenuCommercialVehiclesConfigurator = $("[href=\"/CV-BuildandPrice\"] [class=\"normalHeading\"]");
//        this.headerPopUpMenuCommercialVehiclesSearchAdealer = $("[href=\"/CV-BuildandPrice\"] [class=\"normalHeading\"]");
//        this.headerPopUpMenuCommercialVehiclesCreditCalc = $("[href=\"/BuyingGuide/CreditCalculator\"]",1);
//        this.headerPopUpMenuCommercialVehiclesAccessories = $("[class=\"tertiary-link om_ca_tl_2\"]",1);
//    }
//}
