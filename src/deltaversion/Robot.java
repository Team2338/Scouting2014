package deltaversion;

/**
 *
 * @author Patrick Ubelhor
 */

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Robot {
    
    private boolean isAutonomous;
    private boolean isAdding;
    private int highSuccessAuto;
    private int highSuccessTele;
    private int highFailureAuto;
    private int highFailureTele;
    private int lowSuccessAuto;
    private int lowSuccessTele;
    private int lowFailureAuto;
    private int lowFailureTele;
    private int trussSuccess;
    private int trussFailure;
    private int catchSuccess;
    private int mobility;
    private String teamNum;
    private String matchNum;
    
    public Robot() {
        isAutonomous = true;
        isAdding = true;
        highSuccessAuto = 0;
        highSuccessTele = 0;
        highFailureAuto = 0;
        highFailureTele = 0;
        lowSuccessAuto = 0;
        lowSuccessTele = 0;
        lowFailureAuto = 0;
        lowFailureTele = 0;
        trussSuccess = 0;
        trussFailure = 0;
        catchSuccess = 0;
        mobility = 0;
        teamNum = "0000";
        matchNum = "0";
    }
    
    public String getTeamNumber() {
        return teamNum;
    }
    
    public boolean getGameMode() {
        return isAutonomous;
    }
    
    public boolean getMathMode() {
        return isAdding;
    }
    
    public String getValue(String type) {
        int value;
        
        switch (type) {
            case "highSuccessAuto" :
                value = highSuccessAuto;
                break;
            case "highSuccessTele" :
                value = highSuccessTele;
                break;
            case "highFailureAuto" :
                value = highFailureAuto;
                break;
            case "highFailureTele" :
                value = highFailureTele;
                break;
            case "lowSuccessAuto" :
                value = lowSuccessAuto;
                break;
            case "lowSuccessTele" :
                value = lowSuccessTele;
                break;
            case "lowFailureAuto" :
                value = lowFailureAuto;
                break;
            case "lowFailureTele" :
                value = lowFailureTele;
                break;
            case "trussSuccess" :
                value = trussSuccess;
                break;
            case "trussFailure" :
                value = trussFailure;
                break;
            case "catchSuccess" :
                value = catchSuccess;
                break;
            case "mobility" :
                value = mobility;
                break;
            default :
                value = -1;
                break;
        }
        return Integer.toString(value);
        
    }
    
    public void setMatchNumber(String number) {
        matchNum = number;
    }
    
    public void setTeamNumber(String number) {
        teamNum = number;
    }
    
    public void setValue(String type) {
        switch (type) {
            case "highSuccess" :
                if (isAutonomous && isAdding) { highSuccessAuto++; }
                if (isAutonomous && !isAdding) { highSuccessAuto--; }
                if (!isAutonomous && isAdding) { highSuccessTele++; }
                if (!isAutonomous && !isAdding) { highSuccessTele--; }
                break;
            case "highFailure" :
                if (isAutonomous && isAdding) { highFailureAuto++; }
                if (isAutonomous && !isAdding) { highFailureAuto--; }
                if (!isAutonomous && isAdding) { highFailureTele++; }
                if (!isAutonomous && !isAdding) { highFailureTele--; }
                break;
            case "lowSuccess" :
                if (isAutonomous && isAdding) { lowSuccessAuto++; }
                if (isAutonomous && !isAdding) { lowSuccessAuto--; }
                if (!isAutonomous && isAdding) { lowSuccessTele++; }
                if (!isAutonomous && !isAdding) { lowSuccessTele--; }
                break;
            case "lowFailure" :
                if (isAutonomous && isAdding) { lowFailureAuto++; }
                if (isAutonomous && !isAdding) { lowFailureAuto--; }
                if (!isAutonomous && isAdding) { lowFailureTele++; }
                if (!isAutonomous && !isAdding) { lowFailureTele--; }
                break;
            case "trussSuccess" :
                if (!isAutonomous && isAdding) { trussSuccess++; }
                if (!isAutonomous && !isAdding) { trussSuccess--; }
                break;
            case "trussFailure" :
                if (!isAutonomous && isAdding) { trussFailure++; }
                if (!isAutonomous && !isAdding) { trussFailure--; }
                break;
            case "special" :
                if (isAdding && !isAutonomous) { catchSuccess++; }
                if (!isAdding && !isAutonomous) { catchSuccess--; }
                if (isAdding && isAutonomous) { mobility = 5; }
                if (!isAdding && isAutonomous) { mobility = 0; }
                break;
        }
    }
    
    public void changeGameMode() {
        isAutonomous = !isAutonomous;
    }
    
    public void changeMathMode() {
        isAdding = !isAdding;
    }
    
    public void resetData() {
        isAutonomous = true;
        isAdding = true;
        highSuccessAuto = 0;
        highSuccessTele = 0;
        highFailureAuto = 0;
        highFailureTele = 0;
        lowSuccessAuto = 0;
        lowSuccessTele = 0;
        lowFailureAuto = 0;
        lowFailureTele = 0;
        trussSuccess = 0;
        trussFailure = 0;
        catchSuccess = 0;
        mobility = 0;
        teamNum = "";
    }
    
    
    public void exportData(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            
            writer.append(matchNum + ',');
            writer.append(teamNum + ',');
            writer.append(Integer.toString(highFailureAuto) + ',');
            writer.append(Integer.toString(highSuccessAuto) + ',');
            writer.append(Integer.toString(highFailureTele) + ',');
            writer.append(Integer.toString(highSuccessTele) + ',');
            writer.append(Integer.toString(lowFailureAuto) + ',');
            writer.append(Integer.toString(lowSuccessAuto) + ',');
            writer.append(Integer.toString(lowFailureTele) + ',');
            writer.append(Integer.toString(lowSuccessTele) + ',');
            writer.append(Integer.toString(trussFailure) + ',');
            writer.append(Integer.toString(trussSuccess) + ',');
            writer.append(Integer.toString(catchSuccess) + ',');
            writer.append(Integer.toString(mobility));
            writer.append('\n');
            
            writer.flush();
            writer.close();
        }
        catch (IOException e)
            { e.printStackTrace(); }
        
    }
}