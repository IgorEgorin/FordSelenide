package testRun;

import FordSelenide.preconditionPackage.Precondition;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 13.06.2018.
 */
public class FiestaAllPhotosDisplayedOnTabTechnologyUnderTabComfortAndConvenience extends Precondition {


    @Test
    public void fiestaPhotoMultiMediaSyncTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoMultiMediaSyncTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoOnTimeInTheRightPlaceTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoOnTimeInTheRightPlaceTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaVideoWindShieldHeatingTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaVideoWindShieldHeatingTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoBackgroundInteriorLightingTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoBackgroundInteriorLightingTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoSetTheComfortTemperatureTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoSetTheComfortTemperatureTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoHeadlampsTurnOnThemselvesTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoHeadlampsTurnOnThemselvesTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoSideMirrorsWithElectricFoldingTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoSideMirrorsWithElectricFoldingTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoLightsTheWayToTheDoorOfTheHouseTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoLightsTheWayToTheDoorOfTheHouseTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoHeatedSeatsTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoHeatedSeatsTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

    @Test
    public void fiestaPhotoCarSharingTabTechnologyUnderTabComfortAndConvenience() {
        headerPopUpPassangerCar
                .goToFiestaPage()
                .openTabTechnologyUnderTabComfortAndConvenience();
        Assert.assertTrue(fiesta
                .getFiestaPhotoCarSharingTabTechnologyUnderTabComfortAndConvenience()
                .isDisplayed());
    }

}