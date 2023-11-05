package lee.dev.programmablethermostat;

public class ThermostatDriver {
    
    // CLASS VARIABLES
    private String urlPath;
    private final TempDataHandler tempDataHandler;

    // CLASS INITIALIZER
    public ThermostatDriver(String urlPath){
        // URL PATH TO PASS TO THE TEMP DATA HANDLER
        this.urlPath = urlPath;
        
        // INSTANCE OF THE TEMP DATA HANDLER CLASS TO HANDLE 
        // DATA FROM THE API CALL
        this.tempDataHandler = new TempDataHandler(urlPath);
        
        // REQUEST THE DATA AND THEN CONVERT IT TO A DICTIONARY
        this.tempDataHandler.requestJsonData();
        this.tempDataHandler.convertJsonData();
    }

    // METHOD TO OUTPUT THE DISPLAY OF THE THERMOSTAT TO THE USER
    public void displayThermostat(){
        System.out.println("\nGood Afternoon!\n");
        System.out.println("Date: " + this.tempDataHandler.getDate());
        System.out.println("Time: " + this.tempDataHandler.getTime());
        System.out.println("UTC Date: " + this.tempDataHandler.getUtcDate());
        System.out.println("UTC Time: " + this.tempDataHandler.getUtcTime());
        System.out.println("Temperature: " + this.tempDataHandler.getTemperature());
        System.out.println("Humidity: " + this.tempDataHandler.getHumidity());
    }

    // GET/SET FOR THE URL
    public void setUrlPath(String newUrl){
        this.urlPath = newUrl;
    }

    public String getUrlPath(){
        return this.urlPath;
    }
}
