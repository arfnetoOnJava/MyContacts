module MyContacts
{
    requires javafx.fxml;
    requires javafx.controls;
    requires java.xml;

    opens sample.datamodel to javafx.base;
    opens sample;

}