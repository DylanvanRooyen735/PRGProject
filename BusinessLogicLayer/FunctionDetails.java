package BusinessLogicLayer;

import java.io.IOException;
import java.util.ArrayList;

import DataAccessLayer.DataAccess;

public class FunctionDetails {
    private String Clientname;
    private String ClientSurname;
    private String FunctionType;
    private String FunctionDate;
    private String FunctionTime;
    private boolean FunctionDecorations;
    private int TotalAdults;
    private int TotalKids;
    private String FoodSelection;

    @Override
    public String toString() {
        return Clientname + ',' +
                ClientSurname + ',' +
                FunctionType + ',' +
                FunctionDate + ',' +
                FunctionTime + ',' +
                FunctionDecorations + ',' +
                TotalAdults + ',' +
                TotalKids + ',' +
                FoodSelection;
    }

    public String getStringForDisplay() {
        return  "Clientname='" + Clientname + '\'' + "\r\n" +
                "ClientSurname='" + ClientSurname + '\'' +"\r\n" +
                "FunctionType='" + FunctionType + '\'' +"\r\n" +
                "FunctionDate='" + FunctionDate + '\'' +"\r\n" +
                "FunctionTime='" + FunctionTime + '\'' +"\r\n" +
                "FunctionDecorations=" + FunctionDecorations +"\r\n" +
                "TotalAdults=" + TotalAdults +"\r\n" +
                "TotalKids=" + TotalKids +"\r\n" +
                "FoodSelection='" + FoodSelection + '\''+ "\r\n";
    }

    public FunctionDetails() {
    }

    public FunctionDetails(String clientname, String clientSurname, String functionType, String functionDate, String functionTime, boolean functionDecorations, int totalAdults, int totalKids, String foodSelection) {
        Clientname = clientname;
        ClientSurname = clientSurname;
        FunctionType = functionType;
        FunctionDate = functionDate;
        FunctionTime = functionTime;
        FunctionDecorations = functionDecorations;
        TotalAdults = totalAdults;
        TotalKids = totalKids;
        FoodSelection = foodSelection;
    }

    public void SaveClient() throws IOException {
        DataAccess da = new DataAccess();
        da.WriteFile(this.toString() + "\r\n", "UserChoosing.txt");
    }

    public void GetFunctions() throws IOException {
        DataAccess da = new DataAccess();
        ArrayList<String> values = da.ReadFile("UserChoosing.txt");
        for (int i = 0; i < values.stream().count(); i++) {
            String line = (String) values.get(i);
            String[] properties = line.split(",");
            FunctionDetails fd = new FunctionDetails(properties[0], properties[1], properties[2], properties[3], properties[4], Boolean.parseBoolean(properties[5]), Integer.parseInt(properties[6]), Integer.parseInt(properties[7]), properties[8]);
            System.out.println(fd.getStringForDisplay()+"\r\n");
        }
    }
} 