package FordSelenide.sameElementForPassengerAndCommercialVehicles.sameElementForPassAndCommercVeh;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SameElementPassVehicles {

    private SelenideElement sameElemPassVehDownLoadBrochure;
    private SelenideElement sameElemPassVehFindADealer;

    private SelenideElement sameElemPassVehMainTabBlockLocator;

    private SelenideElement sameElemPassVehTabOverView;
    private SelenideElement sameElemPassVehTabDesign;
    private SelenideElement sameElemPassVehTabTechnology;
    private SelenideElement sameElemPassVehTabSpecification;
    private SelenideElement sameElemPassVehTabPrice;
    private SelenideElement sameElemPassVehTabWhiteAndBlack;
    private SelenideElement sameElemPassVehTabSmartCrossOver;
    private SelenideElement sameElemPassVehTabSmartTestDrive;

    private SelenideElement sameElemPassVehUnderTabBlockLocator;

    private SelenideElement sameElemPassVehUnderTabDesignOutView;
    private SelenideElement sameElemPassVehUnderTabDesignInterior;
    private SelenideElement sameElemPassVehUnderTabDesignColorBody;
    private SelenideElement sameElemPassVehUnderTabDesignAlloyWheels;
    private SelenideElement sameElemPassVehUnderTabDesignAccessories;

    private SelenideElement sameElemPassVehUnderTabTechnologyUnderTabComfortAndConvenience;
    private SelenideElement sameElemPassVehUnderTabTechnologyUnderTabHelpForDriver;
    private SelenideElement sameElemPassVehUnderTabTechnologyUnderTabProtectionAndSecurity;

    private SelenideElement sameElemPassVehPageUnderTabsIsLoaded;

    public SameElementPassVehicles() {
        this.sameElemPassVehDownLoadBrochure = $("[href=\"/SBE/Brochures/Brochures/CarsBrochures\"][class=\"tertiary-link om_pv_xd_tr\"]");
        this.sameElemPassVehFindADealer = $("[href=\"/SBE/ALT_DealerLocator\"][class=\"tertiary-link om_pv_xd_tr\"]");

        this.sameElemPassVehMainTabBlockLocator = $("[class=\"tabs\"]");

        this.sameElemPassVehTabOverView = sameElemPassVehMainTabBlockLocator.$(byText("Обзор"));
        this.sameElemPassVehTabDesign = sameElemPassVehMainTabBlockLocator.$(byText("Дизайн"));
        this.sameElemPassVehTabTechnology = sameElemPassVehMainTabBlockLocator.$(byText("Технологии"));
        this.sameElemPassVehTabSpecification = sameElemPassVehMainTabBlockLocator.$(byText("Спецификации"));
        this.sameElemPassVehTabPrice = sameElemPassVehMainTabBlockLocator.$(byText("Цены"));
        this.sameElemPassVehTabWhiteAndBlack = sameElemPassVehMainTabBlockLocator.$(byText("White & Black"));
        this.sameElemPassVehTabSmartCrossOver = sameElemPassVehMainTabBlockLocator.$(byText("Смарт-кроссовер"));
        this.sameElemPassVehTabSmartTestDrive = sameElemPassVehMainTabBlockLocator.$(byText("Тест-Драйв"));


        this.sameElemPassVehUnderTabBlockLocator = $("[class=\"sub-nav\"]");

        this.sameElemPassVehUnderTabDesignOutView = sameElemPassVehUnderTabBlockLocator.$(byText("Внешний вид"));
        this.sameElemPassVehUnderTabDesignInterior = sameElemPassVehUnderTabBlockLocator.$(byText("Интерьер"));
        this.sameElemPassVehUnderTabDesignColorBody = sameElemPassVehUnderTabBlockLocator.$(byText("Цвет Кузова"));
        this.sameElemPassVehUnderTabDesignAlloyWheels = sameElemPassVehUnderTabBlockLocator.$(byText("Диски"));
        this.sameElemPassVehUnderTabDesignAccessories = sameElemPassVehUnderTabBlockLocator.$(byText("Аксессуары"));
        this.sameElemPassVehUnderTabTechnologyUnderTabComfortAndConvenience = sameElemPassVehUnderTabBlockLocator.$(byText("Комфорт и удобство"));
        this.sameElemPassVehUnderTabTechnologyUnderTabHelpForDriver = sameElemPassVehUnderTabBlockLocator.$(byText("Помощь водителю"));
        this.sameElemPassVehUnderTabTechnologyUnderTabProtectionAndSecurity = sameElemPassVehUnderTabBlockLocator.$(byText("Защита и Безопасность"));

        this.sameElemPassVehPageUnderTabsIsLoaded = $("#primary-tab-content00");
    }

    public SelenideElement getSameElemPassVehDownLoadBrochure() {
        return sameElemPassVehDownLoadBrochure;
    }

    public SelenideElement getSameElemPassVehFindADealer() {
        return sameElemPassVehFindADealer;
    }

    public SelenideElement getSameElemPassVehTabOverView() {
        return sameElemPassVehTabOverView;
    }

    public SelenideElement getSameElemPassVehTabDesign() {
        return sameElemPassVehTabDesign;
    }

    public SelenideElement getSameElemPassVehTabTechnology() {
        return sameElemPassVehTabTechnology;
    }

    public SelenideElement getSameElemPassVehTabSpecification() {
        return sameElemPassVehTabSpecification;
    }

    public SelenideElement getSameElemPassVehTabPrice() {
        return sameElemPassVehTabPrice;
    }

    public SelenideElement getSameElemPassVehTabWhiteAndBlack() {
        return sameElemPassVehTabWhiteAndBlack;
    }

    public SelenideElement getSameElemPassVehTabSmartCrossOver() {
        return sameElemPassVehTabSmartCrossOver;
    }

    public SelenideElement getSameElemPassVehTabSmartTestDrive() {
        return sameElemPassVehTabSmartTestDrive;
    }

    public SelenideElement getSameElemPassVehUnderTabBlockLocator() {
        return sameElemPassVehUnderTabBlockLocator;
    }

    public SelenideElement getSameElemPassVehUnderTabDesignOutView() {
        return sameElemPassVehUnderTabDesignOutView;
    }

    public SelenideElement getSameElemPassVehUnderTabDesignInterior() {
        return sameElemPassVehUnderTabDesignInterior;
    }


    public void openTabTechnologyUnderTabComfortAndConvenience() {
        sameElemPassVehTabTechnology.click();
        sameElemPassVehUnderTabTechnologyUnderTabComfortAndConvenience.click();
        sameElemPassVehPageUnderTabsIsLoaded.isDisplayed();
    }
}
